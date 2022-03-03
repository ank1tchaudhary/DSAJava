package org.dsa.interview.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTraining {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Ankit");
        map.put(2,"Kumar");
        map.put(3,"Chaudhary");

        map.entrySet().stream().forEach(obj -> System.out.println(obj.getKey()+" "+obj.getValue()));

        List<String> strings = new ArrayList<>();
        strings.add("Ankit");
        strings.add("Kumar");
        strings.add("Kumar");
        strings.add("Chaudhary");

        strings.stream().distinct().forEach(System.out::println);
//                .filter(e-> e.startsWith("A") || e.startsWith("K")).collect(Collectors.toMap(key -> key,value -> value,(old,newv) -> newv)).forEach((key,value) -> System.out.println(key+" "+value));

    int[] arr= new int[-1];

    }
}
