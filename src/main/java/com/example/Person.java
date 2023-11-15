package main.java.com.example;

public class Person {
    private int age;
    private String sex;
    private double height;
    private String name;
    private double weight;

    public Person(int age, String sex, double height, String name, double weight){
        this.age=age;
        this.sex=sex;
        this.height=height;
        this.name=name;
        this.weight=weight;
    }
    public int getAge(){
        return this.age;
    }
    public String getSex(){
        return this.sex;
    }
    public double getHeight(){
        return this.height;
    }
    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
}
