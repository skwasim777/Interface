package Interface;

public class InterfaceInheritence implements Showable02 {

	@Override
	public void print() {
		System.out.println("Printable.....");
	}

	@Override
	public void show() {
		System.out.println("Showable.....");
	}

	public static void main(String[] args) {
		InterfaceInheritence i = new InterfaceInheritence();
		i.show();
		i.print();
	}
}

interface Printable02 {
	void print();
}

interface Showable02 extends Printable02 {
	void show();
}