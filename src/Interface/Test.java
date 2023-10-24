package Interface;

public class Test implements printable{

	@Override
	public void print() {
		System.out.println("Hello....");
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.print();
	}
}
interface printable{
	void print();
}