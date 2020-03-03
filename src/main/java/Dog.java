public class Dog extends Animal {


    public Dog(){
        super();
    }

    public Dog(String name, String color, double height, int age, String food){

        super(name, color, height, age);

    }

    public void colorOfDog(String color){
        setColor(color);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
