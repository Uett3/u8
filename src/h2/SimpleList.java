package h2;

public class SimpleList {
    public Node head;

    public SimpleList(){

        head = new Node(Integer.MIN_VALUE);
        head.next = null;

    }

    public Node getFirst(){
        return head.next;
    }

    public Node getLast(){

        if(head.next == null){
            return null;


        }

        Node activeNode;
        activeNode = head;

        while (true) {

            if (activeNode.next == null) {
                return activeNode;
            }
            activeNode = activeNode.next;
        }

    }

    public void append(int newValue) {
        Node lastNode;

        if(getLast() == null){
            lastNode = head;
        } else {
            lastNode = getLast();
        }



        Node newNode = new Node(newValue);

        lastNode.next = newNode;


    }

    public Node findFirst(int value){

        int vaaalue;
        vaaalue = value;
        Node activeNode;
        activeNode = head;

        while (true) {

            if (activeNode.value == vaaalue){
                return activeNode;
            }
            if (activeNode.next == null) {
                return null;
            }
            activeNode = activeNode.next;
        }
    }

    private Node findVORFirst(int value){

        int vaaalue;
        vaaalue = value;
        Node activeNode;
        activeNode = head;

        while (true) {

            if (activeNode.next.value == vaaalue){
                return activeNode;
            }
            if (activeNode.next == null) {
                return null;
            }
            activeNode = activeNode.next;
        }
    }

    public boolean insertAfter(int preValue, int newValue){

        if(findFirst(preValue) == null){
            return false;
        }

        Node preNode;
        preNode = findFirst(preValue);

        Node newNode = new Node(newValue);

        newNode.next = preNode.next;
        preNode.next = newNode;


        return true;
    }

    public boolean delete(int value){


        //Head!!!!! nicht löschen
        if(findFirst(value) == null){
            return false;
        }

        if(value == Integer.MIN_VALUE){
            return false;
        }







        Node preNode;
        preNode = findVORFirst(value);
        preNode.next = preNode.next.next;

        return true;
    }



/*
    public void printAll() {
        Node current = head.next; // ersten echten Knoten überspringen

        if (current == null) {
            System.out.println("Liste ist leer.");
            return;
        }

        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }

        System.out.println(); // Zeilenumbruch am Ende
    }

 */




}
