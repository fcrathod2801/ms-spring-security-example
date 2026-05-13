package com.example.hashmap.collision;

class AA{
    private static AA ob;
    private AA(){
        System.out.println("Constructor called");
    }
    public static AA getInstamce(){
        if(ob==null){
            ob = new AA();
        }
        return ob;

    }
}
public class SingletonClassExample {
    public static void main(String ar[]){
        AA a1 = AA.getInstamce();
        AA a2 = AA.getInstamce();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}
