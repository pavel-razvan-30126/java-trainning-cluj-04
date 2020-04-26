package AnimalHierarchy;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
    }

    @Override
    protected void walk() {
        System.out.println("Fish can't walk and don't have legs");
    }

    @Override
    protected void eat() {

        System.out.println("Fish eats");

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {

        System.out.println("Fish plays");

    }
}
