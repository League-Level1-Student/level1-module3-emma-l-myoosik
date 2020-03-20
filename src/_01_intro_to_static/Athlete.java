package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    static int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
 
    }
    
    public static int bibNumber() {
    	bibNumber++;
    	return bibNumber;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete athlete1 = new Athlete("JM", 54);
    	Athlete athlete2 = new Athlete("JK", 57);
    	
    	
        //print their names, bibNumbers, and the location of their race. 
    	System.out.println(athlete1.name + ", " + Athlete.bibNumber() + ", " + Athlete.raceLocation);
    	System.out.println(athlete2.name + ", " + Athlete.bibNumber() + ", " + Athlete.raceLocation);
    }
}
