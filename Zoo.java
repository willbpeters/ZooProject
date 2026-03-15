
/*
CSC130 Zoo Project
William Peters
*/

public class Zoo {
    // Private fields
    private LinkedList animals;
    private LinkedList feedingQueue;

    //constructor
    public Zoo(){
        this.animals = new LinkedList();
    }

    //methods

    //adds an animal to the zoo
    public void add(Animal animal){
        this.animals.AddTail(animal);
    }
    //outputs the list of animals in the zoo as a string
    public String ToList(){
        return this.animals.ToList();
    }
    //duplicated the animal list into the feeding queue
    public void startFeeding(){
        this.feedingQueue = this.animals.Duplicate();
    }
    //duplicated the animal list into the feeding queue but only with animals of a certain category
    public void startFeeding(Category category){
        this.feedingQueue = this.animals.Duplicate(category);
    }
    //takes off head of feeding queue and returns it
    public Animal feedNext(){
        return this.feedingQueue.RemoveHead();
    }
    //checks if the feeding queue is empty
    public boolean doneFeeding(){
        return (this.feedingQueue == null || this.feedingQueue.IsEmpty());
    }
}
