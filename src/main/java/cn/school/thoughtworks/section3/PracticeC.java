package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        Integer Const = new Integer(1);
        for (int i =0; i<collectionA.size(); ++i){
            if (collection3.containsKey(collectionA.get(i))){
                Integer count = collection3.get(collectionA.get(i)) + Const;
                collection3.put(collectionA.get(i),count);
            }
            else {
                collection3.put(collectionA.get(i),Const);
            }
        }

        Map<String, Integer> result = collection3;

        List<String> collection2 = object.get("value");
        for (int i=0; i<collection2.size(); ++i){
            if(result.containsKey(collection2.get(i))){
                Integer Origin = result.get(collection2.get(i));
                Integer count = Origin - Origin/3;
                result.put(collection2.get(i), count);
            }
        }

        return result;
    }
}
