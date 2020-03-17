package code.node;

public class Node {
    private int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    //链表：是一种物理存储单元上非连续、非顺序的存储结构
    //特点：插入删除时间复杂度O(1)，查找遍历O(N) 特点：插入删除快，查找慢
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(15);
        Node node2 = new Node(23);
        head.next = node1;
        node1.next = node2;
        System.out.println(head.data);
    }
}
