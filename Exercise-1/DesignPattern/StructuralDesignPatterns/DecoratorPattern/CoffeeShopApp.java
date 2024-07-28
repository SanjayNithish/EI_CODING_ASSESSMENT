package DesignPattern.StructuralDesignPatterns.DecoratorPattern;

// Component interface
interface CoffeeOrder {
    double getCost();
    String getDescription();
}

// Concrete Component
class SimpleCoffee implements CoffeeOrder {
    @Override
    public double getCost() {
        return 2.99;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}

// Decorator interface
abstract class CoffeeDecorator implements CoffeeOrder {
    protected CoffeeOrder decoratedCoffee;

    public CoffeeDecorator(CoffeeOrder decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}

// Concrete Decorators
class Milk extends CoffeeDecorator {
    public Milk(CoffeeOrder decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}

class Whip extends CoffeeDecorator {
    public Whip(CoffeeOrder decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip";
    }
}

// Usage example
public class CoffeeShopApp {
    public static void main(String[] args) {
        CoffeeOrder order = new SimpleCoffee();
        System.out.println(order.getDescription() + ": $" + order.getCost());

        order = new Milk(order);
        System.out.println(order.getDescription() + ": $" + order.getCost());

        order = new Whip(order);
        System.out.println(order.getDescription() + ": $" + order.getCost());
    }
}


