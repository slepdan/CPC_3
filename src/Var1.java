import com.sun.javafx.scene.NodeHelper;
import ex_3.Node;

import java.util.Scanner;

public class Var1 {
    static Scanner sc;
    public static Node createHead(int count) {
        Node head = new Node(sc.nextInt(), null);
        Node ref = head;
        for (int i = 1; i < count; i++) {
            ref.next = new Node(sc.nextInt(), null);
            ref = ref.next;
        }
        return head;
    }
    public static void  printList(Node head) {
        Node ref = head;
        while (ref!=null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }
    public static void exOne(Node head) {
        Node ref
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("count");
        int count = sc.nextInt();
        System.out.println("Input values");
        Node head = createHead(count);
        printList(head);
    }
}
