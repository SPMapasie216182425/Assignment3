public class TestAnimal {

    public static void main(String[] args) {

        Animal ani1 = new Dog("Spotty", "Black", 1.1, 3, "Bobtail");
        Animal ani2 = new Cat("Trixi", "White", 1.3, 2, "Cat snacks");
        Animal ani3 = new Dog("Bullet", "Brown", 1.5, 4, "Beef Sticks");
        Animal ani4 = new Cat("Pepper", "BlackWhite", 1.6, 1, "Live Rats");
        Animal ani5 = new Dog("Bruno", "Black", 1.6, 6, "Bones");

        System.out.println(ani1+"\n"+ani2+"\n"+ani3+"\n"+ani4+"\n"+ani5.toString());

    }

}
