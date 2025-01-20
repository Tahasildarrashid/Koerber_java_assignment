package day9.src_day9;

import java.util.*;
public class E_FactoryMethodsInCollectionAPI {
    private static void print(final List<String> list){
        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    private static void myLogic( final  List<String> list2) {
        list2.add(0,"raj");
    }

    public static void main(String[] args) {
        //how to create unmodificatiale collection
//        List<String > list=new ArrayList<>();
//        list.add("foo");
//        list.add("bar");
//        List<String> list2=Collections.unmodifiableList(list);


//        Map<String, Integer> map=new HashMap<>();
//        map.put("amit",90);
//        map.put("ekta",88);
//        map.put("raj", 77);
//        Map<String, Integer> map2=Collections.unmodifiableMap(map);

        //how to create unmodifiable map in java 8

//        Map<String, Integer> map=Map.of("amit",90,"ekta",88,"raj",77);
//        map.forEach((name, marks)-> System.out.println(name+" : "+ marks));

        //Map.of vs Map.ofEntries

//        Map<String, Integer> map=Map.of("amit",90,"ekta",88,"raj",77);
//
//        Map.Entry<String, Integer> e1=Map.entry("amit",90);
//        Map.Entry<String, Integer> e2=Map.entry("sumit",97);
//        Map.Entry<String, Integer> e3=Map.entry("kapil",70);

        // Map<String, Integer> map2=Map.ofEntries(e1, e2,e3);

        //  Map<String, Integer> map2=Map.ofEntries(Map.entry("amit",90), Map.entry("sumit",97),Map.entry("kapil",70));

//        print(list2);
//        list2.add("java");
//        myLogic(list2);
    }
}