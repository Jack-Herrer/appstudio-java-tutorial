class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private String gender;
    
   // Constructor of the class...
   public Person(String aName, int anAge,String aGender) {
      name = aName;
      age  = anAge;
	  gender = aGender;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
	  commentAboutAge();
	  commentAboutAge();
	  System.out.println("I am a " + gender);
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
	  if (age > 60) {
		  System.out.println("old person");
	  }
		  
      if (age == 5) {
         System.out.println("time to start school");
      }
   }

public void growOlder() {
      age = age + 1;
   }
   
public void growOlderBy(int number) {
      age = age + number;
   }

public void giveKnighthood() {
      name = "Sir " + name;
   }   
   
}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();
	  
	  wp.giveKnighthood();
	  wp.growOlder();
	  ls.growOlderBy(10);
	  
	  ls.talk();
      wp.talk();
	  System.out.println(ls.age);
   }

}
