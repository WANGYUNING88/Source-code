package code.array;

public class Array {
    //数组：采用一段连续的存储单元来存储数据；
    //特点：指定下标o(1)删除插入o(n) 数组：查询快 ，插入慢
    public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        integers[0] = 0;
        integers[1] = 1;
        integers[2] = 2;
        System.out.printf("输出下标%d的值：%d",1,integers[1]);
    }
}
