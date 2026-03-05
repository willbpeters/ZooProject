public class LinkedList{
    
    private class Node{

        public Animal data;  //identifes animal stored in node
        public Node next;  //pointer to next next node

        //constructor to create node
        public Node(Animal animal){
            this.data = animal;
            this.next = null;
        }

        //constructor to create node and links it to existing node
        public Node(Animal animal, Node next){
            this.data = animal;
            this.next = next;
        }
    }//end Node class

    private Node head;  //pointer to first node
    private Node tail;  //pointer to last node

    //creates empty linked list
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    //returns text about me
    public String About(){
        return "Crated by William Peters for CSC130 Zoo Project";
    }

    //adds head to list
    public void AddHead(Animal animal){
        Node newNode = new Node(animal, this.head);

        if(this.IsEmpty()){
            //if so, set tail and head to new node
            this.tail = newNode;
            this.head = newNode;
        }else{
            //if not empty, set next node to current head and set the head to the new node
            newNode.next = this.head;
            this.head = newNode;
        }
    }
    //add tail to end of list
    public void AddTail(Animal animal){
        Node newNode = new Node(animal);
        //checks if list is empty
        if(this.IsEmpty()){
            //if so, set tail and head to new node
            this.tail = newNode;
            this.head = newNode; 
        }else{
            //if not empty, set next node to current tail and set the tail to the new node
            this.tail.next = newNode; 
            this.tail = newNode;
        }
    }
    
    //checks if list is empty
    public boolean IsEmpty(){
        return (this.head == null);
    }

    //removes head of the list
    public Animal RemoveHead(){
        //checks if list is empty
        if(this.IsEmpty()){
            return null;
        }else if(this.head == this.tail){
            //save data in the head node
            Animal result = this.head.data;
            //if there is only one node, set both head and tail to null
            this.head = null;
            this.tail = null;
            return result;
        }else{
            //save data in the head node
            Animal result = this.head.data;
            //set head to next node
            this.head = this.head.next;
            //output data from removed head node
            return result;
        }
    }

    //compiles the list of animmals in the linked list
    public String ToList(){
        String result = "";
        Node current = this.head; //starts at head

        while(current != null){
            result += current.data.description() + "\n"; 
            current = current.next;
        }

        return result;
    }

}//end LinkedList class