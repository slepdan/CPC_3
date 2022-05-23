class Node {
    public int value;
    public Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class Node_3 {
    public static Node createHead(int n){
        Node head = new Node(0,null);
        Node tail = head;
        for (int i = 1; i < n; i++){
            tail.next = new Node(i, null);
            tail = tail.next;
        }
        return head;
    }
    public static void ListtoString(Node head){
        Node ref = head;
        while (ref!=null){
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
    public static void main(String[] args) {
        Node head = createHead(10);
        ListtoString(head);
    }
}