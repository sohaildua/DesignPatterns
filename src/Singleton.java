
/* 
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance
 	while providing a global access point to this instance.
 */

/* 
 * Issues
 * 1.Ensure that a class has just a single instance
 * 2.Provide a global access point to that instance.
 */

/*Real-World Analogy
 The government is an excellent example of the Singleton pattern. A country can have only one official government.
 Regardless of the personal identities of the individuals who form governments, 
 the title, “The Government of X”, is a global point of access that identifies the group of people in charge.
*/

public class Singleton {

	private static Singleton instance;
	public String value;

	private Singleton(String value) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.value = value;
	}

	public static Singleton getInstance(String value) {
		
		if(instance == null) {
			instance = new Singleton(value);
		}
		return instance;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
	                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
	                "RESULT:" + "\n");
	        Singleton singleton = Singleton.getInstance("FOO");
	        Singleton anotherSingleton = Singleton.getInstance("BAR");
	        System.out.println(singleton.value);
	        System.out.println(anotherSingleton.value);
	    }

	}


