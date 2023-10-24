package Interface;

public class MultipleInheritence implements Printable, Showable {

	@Override
	public void show() {
			System.out.println("Welcome");
	}

	@Override
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		MultipleInheritence m = new MultipleInheritence();
		m.show();
		m.print();
	}
}

interface Printable {
	void print();
}

interface Showable {
	void show();
}
