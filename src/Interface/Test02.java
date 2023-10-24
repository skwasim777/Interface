package Interface;

public class Test02 {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("Rate fo interest is = " + b.getRateOfInterset() + "%");
		b = new HDFC();
		System.out.println("Rate fo interest is = " + b.getRateOfInterset() + "%");
	}
}

interface Bank {
	float getRateOfInterset();
}

class SBI implements Bank {

	@Override
	public float getRateOfInterset() {

		return 10;
	}

}

class HDFC implements Bank {

	@Override
	public float getRateOfInterset() {

		return 12;
	}

}