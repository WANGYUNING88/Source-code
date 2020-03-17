package code;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name","王余柠");
        map.put("code","深入学习hashmap的原理");
        System.out.println(map.get("code"));
    }
}
