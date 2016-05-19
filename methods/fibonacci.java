package Chapter2;

public class fibonacci {

	public static void main(String[] args) {
		int a = 0;

		int b = 1;

		for (int i = 0;i<46;i++){

		a = a+b;
		System.out.print(a + " ");
		b = a-b;

		}

	}

}


