package curso.util;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(){
        this.name="";
        this.age=0;
        this.height=0;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return(this.name);
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return(this.age);
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return(this.height);
    }
}
