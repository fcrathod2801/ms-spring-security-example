package com.example.hashmap.collision;

class Stud implements Cloneable{
    private int id;
    private String name;
    public Stud(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class StudentExample {
    public static void main(String ar[]){
        Stud s1 = new Stud(1, "John");
        try {
            Stud s2 = (Stud) s1.clone();
            System.out.println("Cloning successful");
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
