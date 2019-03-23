package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new ArrayList<>();
        List<String> temp = collection2.get("value");
        for (int i=0; i<collection1.size(); ++i){
            if (temp.contains(collection1.get(i))) {
                result.add(collection1.get(i));
            }
        }
        return result;
    }
}
