import java.io.Console;
public class App {
 public static void main(String[] args) {
   Console myConsole = System.console();

   Animal cat = new Animal();
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

    Animal[] allAnimals = {cat, dog, fish, bird};
    System.out.println("What is your maximum budget for an animal ?");
    String stringUserMaxBudget = myConsole.readLine();
    int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
    System.out.println("What age do you prefer for your animal ?");
    String stringUserMaxAge = myConsole.readLine();
    int userMaxAge = Integer.parseInt(stringUserMaxAge);
    System.out.println("Alright, here's what we have in your price range:");



    for ( Animal individualAnimal : allAnimals ) {
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
    }
 }
