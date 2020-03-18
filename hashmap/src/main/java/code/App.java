package code;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        //HashMap<String, String> map = new HashMap<String, String>();
        App map = new App();
        map.put("李","李");
        map.put("周","周");
        map.put("吴","吴");
        map.put("郑","郑");
        map.put("code","深入学习hashmap的原理");
        //System.out.println(map.get("code"));
    }

    public static void put(String key,String value) {
        System.out.printf("key:%s  -----  hash值:%s  -----  存储的位置:%s\n",key,key.hashCode(),Math.abs(key.hashCode()%16));//数组初始化默认16的存储单元
    }

}
