package com.example.hashmap.collision;

import java.util.Map;

class Emp{
    int id;


    public Emp(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1; // This will cause a collision for all Emp objects
    }

   /* @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Emp emp = (Emp) obj;
        return id == emp.id && name.equals(emp.name);
    }*/
}
public class HashMapCollision {
    public static void main(String ar[]){
        Map<Emp,String> map = new java.util.HashMap<>();
        map.put(new Emp(1), "John");
        map.put(new Emp(1), "Avinash");
        map.put(new Emp(1), "Doe");
        map.put(null, "Java");
        map.put(null, "Spring");
     for(Map.Entry<Emp,String> m:map.entrySet()){
         System.out.println(m.getKey().id + " " + m.getValue());
     }
    }

}
