
public class AnimalApp {

	public AnimalApp() {
		
	}
	public static void main(String[] args) {

		Animal a = new Animal();
		a.getEat();
		a.getSleep();

		Cat c = new Cat();
		c.getEat();
		c.getSleep();
		c.getPurr();

		Bird b = new Bird();
		b.getEat();
		b.getSleep();
		b.getChirp();
		
		Penguin p = new Penguin();
	    p.getEat();
		p.getSleep();
		p.getWalk();
		p.getChirp();
		

		}

}
