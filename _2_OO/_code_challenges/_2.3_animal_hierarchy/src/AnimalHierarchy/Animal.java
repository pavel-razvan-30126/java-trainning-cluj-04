package AnimalHierarchy;

public abstract class Animal {

    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    protected abstract void eat();

    protected void walk() {
        System.out.println("This animal has " + this.legs + " legs");
    }

}
