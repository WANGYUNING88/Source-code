package code;

import java.util.ArrayList;
import java.util.List;

public class HeapOom {
    byte[] b = new byte[1024*100];

    public static void main(String[] args) throws InterruptedException {
        List<HeapOom> all = new ArrayList<HeapOom>();
        while (true){
            all.add(new HeapOom());
            Thread.sleep(10);
        }
    }
}
