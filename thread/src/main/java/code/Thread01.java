package code;

public class Thread01 extends Thread{
    @Override
    public void run() {
        System.out.println("继承Thread类");
    }

    public static void main(String[] args) {
        new Thread01().run();//❌ 方法级别的调用
        new Thread01().start();//✔ 通过start方法启动线程
    }
}
