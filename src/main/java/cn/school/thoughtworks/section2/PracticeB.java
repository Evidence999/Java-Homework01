package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.Integer;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i<collection1.size(); ++i) {
            String temp = collection1.get(i);
            Integer Const = new Integer(1);
            if (collection1.get(i).length() > 1){
                temp = temp.substring(0,1);
                Const = Integer.valueOf(collection1.get(i).substring(2));
            }
            if (result.containsKey(temp)){
                Integer count = result.get(temp) + Const;
                result.put(temp,count);
            }
            else {
               result.put(temp,Const);
            }

        }
        return result;
    }
}
