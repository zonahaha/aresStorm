package com.basic.core.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * locate com.basic.util
 * Created by 79875 on 2017/9/25.
 */
public class AresUtils {
    public static <K, V> HashMap<V, List<K>> reverseMap(Map<K, V> map) {
        HashMap<V, List<K>> rtn = new HashMap<V, List<K>>();
        if (map == null) {
            return rtn;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V val = entry.getValue();
            List<K> list = rtn.get(val);
            if (list == null) {
                list = new ArrayList<K>();
                rtn.put(entry.getValue(), list);
            }
            list.add(key);
        }
        return rtn;
    }

}