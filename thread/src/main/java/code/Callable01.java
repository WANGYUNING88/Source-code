package code;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable01 implements Callable<String> {
    public String call() throws Exception {
        return "实现Callable<V>接口";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask(new Callable01());
        new Thread(task).start();
        System.out.println(task.get());
    }
}
