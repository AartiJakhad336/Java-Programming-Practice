//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    void insertAtStart(int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
//
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//
//        list.insertAtStart(30);
//        list.insertAtStart(20);
//        list.insertAtStart(10);
//
//        list.display();
//    }
//}
