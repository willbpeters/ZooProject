
/*
CSC130 Zoo Project
William Peters
*/

public class Animal {
    // Private fields
    private int id;
    private String name;
    private String species;
    private String category;
    private String diet;
    private int cost;

    // Constructor
    public Animal(int id, String name, String species, String category, String diet, int cost){
        this.id       = id;
        this.name     = name;
        this.species  = species;
        this.category = category;
        this.diet     = diet;
        this.cost     = cost;
    }
 
    // returns the animals nickname + its species as a string
    public String nickname(){
        return this.name + " the " + this.species;
    }

    //returns full sentence describing animal
    public String description(){
        return "The " + this.species.toLowerCase() + " named " + this.name + " is a " + this.category + " whose " + this.diet + " diet costs $" + this.cost + " dollars a month.";
    }

    @Override
    public String toString() {
        return nickname();
    }
}//end class