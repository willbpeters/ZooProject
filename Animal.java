
/*
CSC130 Zoo Project
William Peters
*/

public class Animal {
    // Private fields
    private int id;
    private String name;
    private String species;
    private Category category; //using enum
    private Diet diet; //using enum
    private int cost;

    // Constructor
    public Animal(int id, String name, String species, Category category, Diet diet, int cost){
        this.id       = id;
        this.name     = name;
        this.species  = species;
        this.category = category;
        this.diet     = diet;
        this.cost     = cost;
    }
 
    //getter
    public Category getCategory(){ //Could be replaced with a boolean method that checks catgory if this needed to be more secure, not neccesary for this project though
        return this.category;
    }
    // returns the animals nickname + its species as a string
    public String nickname(){
        return this.name + " the " + this.species;
    }

    //returns full sentence describing animal
    public String description(){
        return "The " + this.species.toLowerCase() + " named " + this.name + " is a " + this.categoryToString() + " whose " + this.dietToString() + " diet costs $" + this.cost + " dollars a month.";
    }

    private String categoryToString(){
        switch(this.category){
            case BUG:
                return "bug";
            case BIRD:
                return "bird";
            case AQUATIC:
                return "aquatic";
            case MAMMAL:
                return "mammal";
            case ECTOTHERM:
                return "ectotherm";
            default:
                return "other";
        }
    }

    private String dietToString(){
        switch(this.diet){
            case HERBIVORE:
                return "herbivore";
            case CARNIVORE:
                return "carnivore";
            case OMNIVORE:
                return "omnivore";
            default:
                return "other";
        }
    }

    @Override
    public String toString() {
        return nickname();
    }
}//end class