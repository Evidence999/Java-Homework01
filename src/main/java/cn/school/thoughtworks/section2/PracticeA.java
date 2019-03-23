package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        Integer Const = new Integer(1);
        for (int i =0; i<collection1.size(); ++i){
            if (result.containsKey(collection1.get(i))){
                Integer count = result.get(collection1.get(i)) + Const;
                result.put(collection1.get(i),count);
            }
            else {
                result.put(collection1.get(i),Const);
            }
        }
        return result;
    }
}
