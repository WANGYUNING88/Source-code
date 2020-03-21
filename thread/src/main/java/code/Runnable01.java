package code;

public class Runnable01 implements Runnable{
    public void run() {
        System.out.println("实现Runnable接口");
    }

    public static void main(String[] args) {
        new Thread(new Runnable01()).start();
    }
}
