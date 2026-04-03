class Node {
    int val;
    Node next;

    Node() {}

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(); // dummy node
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node temp = head.next;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head.next;
        head.next = n;
        size++;
    }

    public void addAtTail(int val) {
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        Node n = new Node(val);
        n.next = temp.next;
        temp.next = n;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */