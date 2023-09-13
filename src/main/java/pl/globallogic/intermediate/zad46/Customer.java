package pl.globallogic.intermediate.zad46;

import java.util.ArrayList;

class Customer {
    private final String name;
    private final ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}

class Branch {
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
        }
    }

    public void addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
        }
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}

class Bank {
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        this.branches = new ArrayList<>();
    }

    public void addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
        }
    }

    public void addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.newCustomer(customerName, initialTransaction);
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, transaction);
        }
    }

    public void listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            for (Customer customer : customers) {
                System.out.println("Customer: " + customer.getName());
                if (printTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (double transaction : transactions) {
                        System.out.println("[" + (transactions.indexOf(transaction) + 1) + "] Amount " + transaction);
                    }
                }
            }
        }
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
}