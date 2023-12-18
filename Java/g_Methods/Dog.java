package Java.g_Methods;

public class Dog {
    // Dog Attributes
    private String breed;
    private int age;
    private String petName;
    private double weight;

    // Dog Behaviors
    public Dog(String aBreed, int aAge, String aPetName, double aWeight){
        breed = aBreed;
        age = aAge;
        petName = aPetName;
        weight = aWeight;
    }

    // Dog Bark
    public void bark(){
        System.out.println("Woof Woof");
    }

    // Dog Eating
    public void eat(double foodAmt){
        weight = weight + foodAmt;
    }

    public String toString(){
        return petName + " is a " + breed + " that is " + age + 
                " years old, and weighs " + weight + " pounds.";
    }   
}
