package code;

public class HelloWorld {
    //定义类属性：常量、变量、成员属性
    private Object object = new Object();
    private static int i = 0;
    private static String s = "hello world";

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        int result = helloWorld.add();
        System.out.println(result);
    }

    /**
     * 定义一个方法 局部变量
     *
     * @return
     */
    private int add() {
        int a = 1;
        int b = 2;
        int c = (a + b) * 100;
        return c;
    }
}
