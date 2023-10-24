package Interface;

public class Test03 implements Printable01, Showable01 {

	@Override
	public void print() {
			System.out.println("Hello.....");
	}
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.print();
	}
}

interface Printable01 {
	void print();
}

interface Showable01 {
	void print();
}