package Interface;

public class Test01 {
	public static void main(String[] args) {
		Drwable d = new Circle();
		d.draw();
	}
}

interface Drwable {
	void draw();
}

class Reactangle implements Drwable {

	@Override
	public void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle implements Drwable {

	@Override
	public void draw() {
		System.out.println("drawing circle...");
	}
}