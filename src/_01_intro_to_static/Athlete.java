package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete one= new Athlete("bob",8);
    	Athlete two= new Athlete("kevin",10);
        //print their names, bibNumbers, and the location of their race. 
    	System.out.println(one.name);
    	System.out.println(one.bibNumber);
    	System.out.println(one.raceLocation);
    	
    	System.out.println(two.name);
    	System.out.println(two.bibNumber);
    	System.out.println(two.raceLocation);
    	
    	
    }
}