package pl.globallogic.intermediate.zad40;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println("Base burger: " + this.name + " - " + this.meat + " on a " + this.breadRollType + " roll - Price: $" + this.price);

        if (this.addition1Name != null) {
            System.out.println("Added " + this.addition1Name + " for an extra $" + this.addition1Price);
            totalPrice += this.addition1Price;
        }
        if (this.addition2Name != null) {
            System.out.println("Added " + this.addition2Name + " for an extra $" + this.addition2Price);
            totalPrice += this.addition2Price;
        }
        if (this.addition3Name != null) {
            System.out.println("Added " + this.addition3Name + " for an extra $" + this.addition3Price);
            totalPrice += this.addition3Price;
        }
        if (this.addition4Name != null) {
            System.out.println("Added " + this.addition4Name + " for an extra $" + this.addition4Price);
            totalPrice += this.addition4Price;
        }

        return totalPrice;
    }
}

class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }
}

class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            System.out.println("Added " + this.healthyExtra1Name + " for an extra $" + this.healthyExtra1Price);
            totalPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("Added " + this.healthyExtra2Name + " for an extra $" + this.healthyExtra2Price);
            totalPrice += this.healthyExtra2Price;
        }

        return totalPrice;
    }
}

