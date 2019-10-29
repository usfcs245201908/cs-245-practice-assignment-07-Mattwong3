public class LinkedList<T> implements List<T> {

        Node head;
        int size;
        public class Node{

            T data;
            Node next;
            public Node(T s){
                data = s;
                next = null;
            }
            public void setNext(Node n) {
                next = n;
            }



        }

    public LinkedList(){

       head = null;
       size = 0;

    }

    public void add(T item){
        Node prev = head;
        if(head == null){
            Node current = new Node(item);
            head = current;

            ++size;
        }
        else{
            while(prev.next != null){
                prev = prev.next;
            }
            Node current = new Node(item);
            prev.setNext(current);
            ++size;
        }



    }
    public void add(int pos, T item){
        if(pos>size || pos<0){

        }

        if(pos==0){
            Node current = new Node(item);
            current.setNext(head);
            head = current;
        }
        else{
            Node current = new Node(item);
            Node prev = head;
            for(int i = 0;i<pos - 1;i++){
                prev =prev.next;
            }
            current.next = prev.next;
            prev.next = current;
            ++size;

        }



    }
    public T get(int pos){
        Node prev = head;
        for(int i = 0;i<pos-1;i++){
            prev = prev.next;
        }
        return prev.data;
    }


    public T remove(int pos){
        if(pos> size-1 || pos<0){
            //throw new Exception();
        }
        if(pos==0 ){
            Node temp = head;

            head = head.next;
            --size;

           return temp.data;
        }
        else{
            Node prev =head;
            for(int i = 0; i < pos-1; i++){
                Node temp = prev.next;
                prev.next = temp.next;
                --size;
              return temp.data;
            }

        }
        return null;

    }
    public int size(){

        return 0;
    }
}
