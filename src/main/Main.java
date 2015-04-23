// @wolfram77
package main;

// required modules
import java.util.*;



public class Main {
    
    public static void main(String[] args) {
        mapSpeed();
        listSpeed();
        arraySpeed();
    }
    
    public static void mapSpeed() {
        Map<Integer, Integer> map = new HashMap<>();
        long start = System.nanoTime();
        for(int i=0; i<10000; i++) {
            map.put(i, i+1);
        }
        long end = System.nanoTime();
        System.out.println("map: "+((end-start)*Math.pow(10, -6))+"ms");
    }
    
    public static void listSpeed() {
        List<Object> list = new ArrayList<>();
        long start = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list.add(new org.data.json.ParseToken(null, i));
        }
        long end = System.nanoTime();
        System.out.println("list: "+((end-start)*Math.pow(10, -6))+"ms");
    }
    
    public static void arraySpeed() {
        Object[] array = new Object[10000];
        long start = System.nanoTime();
        for(int i=0; i<10000; i++) {
            array[i] = new org.data.json.ParseToken(null, i);
        }
        long end = System.nanoTime();
        System.out.println("array: "+((end-start)*Math.pow(10, -6))+"ms");
    }
}
