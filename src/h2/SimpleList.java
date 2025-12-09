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



        Node activeNode;
        activeNode = head;

        while (true) {

            if (activeNode.next == null) {
                return activeNode;
            }
            activeNode = activeNode.next;
        }


        //return null;
    }

    public void append(int newValue) {
        Node lastNode;
        lastNode = getLast();

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

    public Node findVORFirst(int value){

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

        preNode.next = newNode;

        return true;
    }

    public boolean delete(int value){

        if(findVORFirst(value) == null){
            return false;
        }

        Node preNode;
        preNode = findVORFirst(value);
        preNode.next = preNode.next.next;

        return true;
    }
}
