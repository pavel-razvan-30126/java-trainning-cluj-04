package AnimalHierarchy;

public class Main {

    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.play();
        d.setName("Fish1");
        System.out.println(d.getName());
        d.walk();
        System.out.println("..................");

        c.eat();
        c.play();
        c.setName("Cat1");
        System.out.println(c.getName());
        c.walk();
        System.out.println("..................");

        a.eat();
        a.walk();
        System.out.println("..................");

        e.eat();
        e.walk();
        System.out.println("..................");

        p.play();
        p.setName("Cat1");
        System.out.println(p.getName());
        System.out.println("..................");

    }
}
