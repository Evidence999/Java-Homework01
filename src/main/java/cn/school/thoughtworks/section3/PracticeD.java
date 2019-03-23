package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        for (int i = 0; i<collectionA.size(); ++i) {
            String temp = collectionA.get(i);
            Integer Const = new Integer(1);
            if (collectionA.get(i).length() > 1){
                temp = temp.substring(0,1);
                Const = Integer.valueOf(collectionA.get(i).substring(2));
            }
            if (collection3.containsKey(temp)){
                Integer count = collection3.get(temp) + Const;
                collection3.put(temp,count);
            }
            else {
               collection3.put(temp,Const);
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
