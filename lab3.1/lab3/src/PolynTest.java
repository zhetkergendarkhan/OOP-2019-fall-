
public class PolynTest {
	public static void main(String[] args) {
		int[] test=new int[5];
		test[0]=1;
		test[1]=2;
		test[2]=3;
		test[3]=4;
		test[4]=5;
		Polynomial p=new Polynomial(test);
		System.out.println(p);
		System.out.println(p.value(2));
		System.out.println(p.derivative());

				
		
	}

}
