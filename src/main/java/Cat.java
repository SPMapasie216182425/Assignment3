public class Cat extends Animal{



    public Cat(){
        super();
    }

    public Cat(String name, String color, double height, int age, String food){
        super(name, color, height, age);

    }


    public String Speak(){
        return"Meooowww";
    }

    public void foodForCat(String food){
        setFood(food);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
