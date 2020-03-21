package Task1;

public class Test {

	public static void main(String[] args) {
		
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0);
		Circuit c = new Resistor(6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0);
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f);
		circuit.applyPotentialDiff(10);
		
		System.out.println("Total current of the circuit: " + circuit.getCurrent());
		System.out.println("Total resistance of the circuit: " + String.format("%.2f", circuit.getResistance()));
		System.out.println("Total power of the circuit: " + circuit.getPower());
		
	}

}
