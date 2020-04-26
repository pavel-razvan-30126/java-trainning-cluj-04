package AnimalHierarchy;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat( String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
        this.name="";
    }


    @Override
    protected void eat() {
        System.out.println("Cat eats");
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

        System.out.println("Play with cat");

    }
}
