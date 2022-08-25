package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("-------------------------------");// Single level inheritance, Mammal class inherited properties from Animal class. 
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("-------------------------------");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		

		System.out.println("-------------------------------");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("-------------------------------");// Multilevel inheritance, Dog class inherited properties from Mammal and Animal Class.
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("-------------------------------");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("-------------------------------");//Hierarchical level inheritance, BullDog class inherited properties from multiple classes.
		BullDog bulldog = new BullDog();
		bulldog.bullDogInfo();
		bulldog.dogInfo();
		bulldog.mammalInfo();
		bulldog.animalInfo();

		System.out.println("-------------------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("-------------------------------");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
