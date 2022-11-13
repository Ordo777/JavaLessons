package JavaLessons;
import JavaLessons.Human1;
public class Human {
	 int age = 20;
	 double weight;
	 
	 public static void main(String[] args) {
		 Human human = new Human ();
		 human.buyBread();
		 human.buyMIlk();
		 
	 }
	 
void buyBread() {
  System.out.println("buy Bred");
}
void buyMIlk() {
	  System.out.println("buy Milk");
	}
void birthday() {
	  System.out.println("buy Bred");
	}
/* class Vyvod 
 {
	 System.out.println(Human1.age);
 }*/
}
