import java.util.*;


public class Thanos extends Hero {

    public Thanos(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
    	 // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
Hero  widow = new Hero("Black Widow", 34);
Hero  captain  = new Hero("Captain America", 100);
Hero  vision = new Hero("Vision", 3);
Hero  iron  = new Hero(" Iron Man", 48 );
Hero  scarlet  = new Hero("Scarlet Witch", 29);
Hero  thor = new Hero("Thor", 1500);
Hero  hulk = new Hero("Hulk", 49);
Hero  doctor  = new Hero("Doctor Strange", 42);



        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
    	heroes.add(widow);
    	heroes.add(captain);
    	heroes.add(vision);
    	heroes.add(iron);
    	heroes.add(scarlet);
    	heroes.add(thor);
    	heroes.add(hulk);
    	heroes.add(doctor);
    	
    	  // TODO 5 : Keep only the half of the list
    	   heroes.remove(1);
    	   heroes.remove(2);
    	   heroes.remove(3);
    	   heroes.remove(4);

        // TODO 3 : It's Thor birthday, now he's 1501
    hulk.setAge(1501);
    System.out.println(hulk.getAge());

        // TODO 4 : Shuffle the heroes list
    Collections.shuffle(heroes);
    System.out.println(heroes);
   

    // shuffle again, different result
    Collections.shuffle(heroes);
    System.out.println(heroes);
    
    
 // TODO 6 : Loop throught the list and display the name of the remaining heroes

    for (Hero hero : heroes) {
	System.out.println(hero.getName());
}
      
 
	}
}
