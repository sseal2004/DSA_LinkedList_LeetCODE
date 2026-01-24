class MyLinkedList {
    class Node {
        int val;
        Node next,prev;
        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
        Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    private Node head;
    int size=0;

    public MyLinkedList() {
        head=new Node(0);
        size=0;
    }
    
    public int get(int index) {
        if(index<0||index>=size)return -1;

        Node temp =head.next;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
      addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
       addAtIndex(size,val);
    }
    
     public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
        size++;
    }
    public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) return;

    Node temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;
    }

    Node toDelete = temp.next;
    temp.next = toDelete.next;

    if (toDelete.next != null) {
        toDelete.next.prev = temp;
    }

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