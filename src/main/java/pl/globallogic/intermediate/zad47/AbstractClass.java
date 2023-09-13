package pl.globallogic.intermediate.zad47;

import java.util.List;

abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}

interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}

class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // The item already exists
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = root;
        ListItem parentItem = null;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // Item found, perform removal
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null && item.previous() == null) {
            // Removing a leaf node
            if (parent != null) {
                if (parent.next() == item) {
                    parent.setNext(null);
                } else {
                    parent.setPrevious(null);
                }
            } else {
                root = null;
            }
        } else if (item.next() == null) {
            // Removing a node with one child (left)
            if (parent != null) {
                if (parent.next() == item) {
                    parent.setNext(item.previous());
                } else {
                    parent.setPrevious(item.previous());
                }
            } else {
                root = item.previous();
            }
        } else if (item.previous() == null) {
            // Removing a node with one child (right)
            if (parent != null) {
                if (parent.next() == item) {
                    parent.setNext(item.next());
                } else {
                    parent.setPrevious(item.next());
                }
            } else {
                root = item.next();
            }
        } else {
            // Removing a node with two children
            ListItem current = item.previous();
            ListItem rightParent = item;
            while (current.next() != null) {
                rightParent = current;
                current = current.next();
            }
            item.setValue(current.getValue());
            if (rightParent.next() == current) {
                rightParent.setNext(current.previous());
            } else {
                rightParent.setPrevious(current.previous());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}

class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // The item already exists
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = root;
        ListItem parentItem = null;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // Item found, perform removal
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null && item.previous() == null) {
            // Removing a leaf node
            if (parent != null) {
                if (parent.next() == item) {
                    parent.setNext(null);
                } else {
                    parent.setPrevious(null);
                }
            } else {
                root = null;
            }
        } else if (item.next() == null) {
            // Removing a node with one child (left)
            if (parent != null) {
                if (parent.next() == item) {
                    parent.setNext(item.previous());
                } else {
                    parent.setPrevious(item.previous());
                }
            } else {
                root = item.previous();
            }
        } else if (item.previous() == null) {
            // Removing a node with one child (right)
            if (parent != null) {
                if (parent.next() == item) {
                    parent.setNext(item.next());
                } else {
                    parent.setPrevious(item.next());
                }
            } else {
                root = item.next();
            }
        } else {
            // Removing a node with two children
            ListItem current = item.previous();
            ListItem rightParent = item;
            while (current.next() != null) {
                rightParent = current;
                current = current.next();
            }
            item.setValue(current.getValue());
            if (rightParent.next() == current) {
                rightParent.setNext(current.previous());
            } else {
                rightParent.setPrevious(current.previous());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
