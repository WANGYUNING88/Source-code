package code;

public class App2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new code.HashMap<String, String>();
        map.put("钱","钱");
        map.put("李","李");
        map.put("周","周");
        map.put("孙","孙");
        map.put("余","余");
        map.put("周","周");
        map.put("吴","吴");
        map.put("郑","郑");
        map.put("code","深入学习hashmap的原理");
        map.put("code1","深入学习hashmap的原理");
        map.put("code17","深入学习hashmap的原理");
        System.out.println(map.get("code"));
        System.out.println(map.get("周"));
        System.out.println(map.get("1"));
    }

    public static void put(String key,String value) {
        System.out.printf("key:%s  -----  hash值:%s  -----  存储的位置:%s\n",key,key.hashCode(),Math.abs(key.hashCode()%16));//数组初始化默认16的存储单元
    }

}
