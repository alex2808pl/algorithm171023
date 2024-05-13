package lesson_14;

import java.util.HashSet;

public class SimpleHash {

    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        System.out.println("Hash str = "+str1.hashCode());

        Cat cat = new Cat("Вася", 5);
        System.out.println("Hash Cat = "+cat.hashCode());

        HashSet<Integer> hashSet = new HashSet<>(8);
        Integer val1 = 50;
        System.out.println("Hash = "+val1.hashCode());
        hashSet.add(val1);   
        hashSet.add(70);  
        hashSet.add(76); 
        hashSet.add(85); 
        System.out.println(hashSet);
    }



}
