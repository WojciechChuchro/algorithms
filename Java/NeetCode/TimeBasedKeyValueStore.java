package Java.NeetCode;

import javafx.util.Pair;

import java.util.*;

public class TimeBasedKeyValueStore {

        HashMap<String, List<Pair<Integer, String>>> map = new HashMap();

        public TimeMap() {}

        public void set(String key, String value, int timestamp) {
            if(map.containsKey(key)) {
                map.get(key).add(new Pair<Integer, String>(timestamp, value));
            } else {
                List<Pair<Integer, String>> newList = new ArrayList();
                newList.add(new Pair<Integer, String>(timestamp, value));
                map.put(key, newList);
            }
        }

        public String get(String key, int timestamp) {
            List<Pair<Integer, String>> list = map.get(key);
            if(list == null) return "";
            String res = "";
            int l = 0;
            int r = list.size()-1;

            while(l <= r) {
                int m  = (r - l)/2 + l;
                Pair<Integer, String> p=list.get(m);
                System.out.println("MID: "+m);
                String val = p.getValue();
                int k = p.getKey();

                if(k <= timestamp) {
                    res = val;
                    l = m+1;
                } else {
                    r = m-1;
                }
            }
            return res;
    }
}
