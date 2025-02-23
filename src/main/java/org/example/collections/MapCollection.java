package org.example.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {

    public static void main(String[] args) {

        // key, value
        // lock up based on key
        // it is used to do lockup and fetch data based on key
        // Insertion order is not maintainer
        Map<String, String> map = new HashMap<>();
        /***
         *
         * 10 ---> [Mohit, ]
         *
         *
         */

        map.put("10", "Mohit");
        map.put("20", "Karan");
        map.put("30", "Aman");

        map.put("10", "Mohit1234"); // no it's a update of value at key 10

        if(map.containsKey("10")) { // fast
            System.out.println("Yes 10 is present");
        }

        map.remove("10");

        String data = map.get("10");

        String notPresent = map.get("Not_present"); // null value

        map.containsValue("Mohit"); // it's not fast  O(N)

        String itWillBeNonNull = map.getOrDefault("10", "FREE_TIER");

//        String license = null;
//        if(map.containsKey("10")) {
//            license = map.get("10");
//        } else  {
//            license = "FREE_TIER";
//        }

        //ll1 + ll2 + ll3

        /**
         *
         *  Input:
         *
         *  Table1: AL1 - MSQL
         *  customer_id, name, phone
         *  1,           Mohit, 727423
         *  .....
         *
         *  Table2: AL2 - POSTGRES
         *  customer_id, address, block
         *  1,           sdkfjs,   akshfakf
         *  ...
         *
         *  Table3: AL3 - txt
         *  customer_id, role, department
         *
         *  Output:
         *
         *  Table 4: (Master Record)
         *  customer_id, name, phone, address, block, role, department
         */

        // key, value
        // lock up based on key
        // it is used to do lockup and fetch data based on key
        // Increasing order based on key

        // I've Not used it...

        Map<String, String> map1 = new TreeMap<>(); // internal AVL, Red Black Tree
        // in-order processing


        // key, value
        // lock up based on key
        // it is used to do lockup and fetch data based on key
        // insertion order is maintained
        // it is good if you want to compare data (transfer from different sources) with different microservices
        Map<String, String> map2 = new LinkedHashMap<>();

        /**
         * MC1 ===> PostgreSql
         *   {
         *       "key1": "value",
         *       "key2": "value"
         *   }
         *
         *
         * MC2 ==> PostgreSql + ThirdParty
         *
         *
         * {
         *     "key2": "value"
         *     "key1": "value"
         * }
         *
         *
         * Caching: Key Value DB  (30 min)
         *
         *  customer_id:user_id:widget_id = { HashMap }
         *
         *  customer update: HM = {data}
         *
         *  if customer update === data in cache:
         *      skip the update
         *
         *
         *
         *
         *  110 == { likes = [video], commets: []  }
         *  111 == { likes = [video],  }
         *
         *
         */
    }
}
