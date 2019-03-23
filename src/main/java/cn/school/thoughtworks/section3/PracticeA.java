package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = collectionA;
        List<String> collection2 = object.get("value");
        Integer Const = new Integer(1);
        for (int i=0; i<collection2.size(); ++i){
            if(result.containsKey(collection2.get(i))){
                result.put(collection2.get(i), Const);
            }
        }
        return result;
    }
}
