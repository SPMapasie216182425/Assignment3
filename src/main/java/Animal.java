public class Animal {

    private String name;
    private String color;
    private double height;
    private String food;
    private int age;

    public Animal(){}

    public Animal(String name, String color, double height, int age){
        this.name = name;
        this.color = color;
        this.height = height;
        this.age = age;
    }
    //Getters
    public String getName(){
      return name;
    }
    public String getColor(){
        return color;
    }
    public Double getHeight(){
        return height;
    }
    public int getAge(){
        return age;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String Behaviour(){
        return "I am a dog";

    }

    public String getFood(){
        return food;
    }


    public String setFood(String foo){//Food method
       return this.food = foo;
    }


    @Override
    public String toString() {
        return "Animal{" + "The animal name is'" + name + '\'' + " the color is '" + color + '\'' +
                " the height is " + height + " and the age is " + age + '}';
    }






}
