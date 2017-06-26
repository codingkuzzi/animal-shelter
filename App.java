import java.io.Console;
import java.util.List;
import java.util.ArrayList;
public class App {
 public static void main(String[] args) {
   Console myConsole = System.console();
   Animal cat = new Animal("Cat", 3, "Persian", "Red", "Extra", 40);
   Animal dog = new Animal("Dog", 5, "Yorkie", "Brown", "Small", 70);
   Animal fish = new Animal("Fish", 1, "Gold Fish", "Yellow", "Medium", 30);
   Animal bird = new Animal("Bird", 2, "Parrot", "Blue", "Extra small", 40);

   List<Animal> allAnimals = new ArrayList<Animal>();
   allAnimals.add(cat);
   allAnimals.add(dog);
   allAnimals.add(fish);
   allAnimals.add(bird);

   /*Animal cat = new Animal();
    cat.mSpecies = "Cat";
    cat.mAge = 3;
    cat.mBreed = "Persian";
    cat.mColor = "Red";
    cat.mSize = "Extra";
    cat.mPrice = 40;

    Animal dog = new Animal();
    dog.mSpecies = "Dog";
    dog.mAge = 5;
    dog.mBreed = "Yorkie";
    dog.mColor = "Brown";
    dog.mSize = "Small" ;
    dog.mPrice = 70;

    Animal fish = new Animal();
    fish.mSpecies = "Fish";
    fish.mAge = 1;
    fish.mBreed = "Gold Fish";
    fish.mColor = "Yellow";
    fish.mSize = "Medium";
    fish.mPrice = 30;

    Animal bird = new Animal();
    bird.mSpecies = "Bird";
    bird.mAge = 2;
    bird.mBreed = "Parrot";
    bird.mColor = "Blue";
    bird.mSize = "Extra small";
    bird.mPrice = 40;
    */
    //Animal[] allAnimals = {cat, dog, fish, bird};
    boolean programRunning = true;
    while(programRunning){
      System.out.println("Welcome to our animal shelter. What would you like to do? Enter one of the following options: All Animals, Search Price and Age, Add Animal or Exit");


      String navigationChoice = myConsole.readLine();

      if (navigationChoice.equals("All Animals")){
       for ( Animal individualAnimal : allAnimals ) {
           System.out.println( "----------------------" );
           System.out.println( individualAnimal.mSpecies );
           System.out.println( individualAnimal.mAge );
           System.out.println( individualAnimal.mBreed );
           System.out.println( individualAnimal.mColor );
           System.out.println( individualAnimal.mSize );
           System.out.println( individualAnimal.mPrice );
       }
      } else if (navigationChoice.equals("Search Price and Age")){
      System.out.println("What is your maximum budget for an animal ?");
      String stringUserMaxBudget = myConsole.readLine();
      int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
      System.out.println("What age do you prefer for your animal ?");
      String stringUserMaxAge = myConsole.readLine();
      int userMaxAge = Integer.parseInt(stringUserMaxAge);
      System.out.println("Alright, here's what we have in your price range:");
       for ( Animal individualAnimal : allAnimals ) {
          Boolean animalIsAdopted = individualAnimal.isAdopted();
          System.out.println(animalIsAdopted);
        if (individualAnimal.worthBuying(userMaxBudget) && individualAnimal.agePet(userMaxAge)){
          System.out.println( "----------------------" );
          System.out.println( individualAnimal.mSpecies );
          System.out.println( individualAnimal.mAge );
          System.out.println( individualAnimal.mBreed );
          System.out.println( individualAnimal.mColor );
          System.out.println( individualAnimal.mSize );
          System.out.println( individualAnimal.mPrice );
        }
       }
     } else if (navigationChoice.equals("Add Animal")){
          System.out.println("Alright, let's add an animal! What type is your animal ?");
          String userAnimalSpeci = myConsole.readLine();
          System.out.println("Great! What age is the animal?");
          Integer userAnimalAge = Integer.parseInt(myConsole.readLine());
          System.out.println("Got it! What size is it?");
          String userAnimalSize = myConsole.readLine();
          System.out.println("Got it! What breed is it?");
          String userAnimalBreed = myConsole.readLine();
          System.out.println("Got it! What color is it?");
          String userAnimalColor = myConsole.readLine();
          System.out.println("Finally, what's its price?");
          Integer userAnimalPrice = Integer.parseInt(myConsole.readLine());
          Animal userAnimal = new Animal(userAnimalSpeci, userAnimalAge, userAnimalSize, userAnimalBreed, userAnimalColor, userAnimalPrice);
          allAnimals.add(userAnimal);
          System.out.println("Alright, here's your new Animal:");
          System.out.println( "----------------------" );
          System.out.println( userAnimal.mSpecies );
          System.out.println( userAnimal.mAge );
          System.out.println( userAnimal.mBreed );
          System.out.println( userAnimal.mColor );
          System.out.println( userAnimal.mSize );
          System.out.println( userAnimal.mPrice );
      } else if (navigationChoice.equals("Exit")){
      programRunning = false;

     } else {
      System.out.println("I'm sorry, we don't recognize your input");
     }
   }
  }
}
