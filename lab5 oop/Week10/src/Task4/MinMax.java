package Task4;

public class MinMax implements Calculatable{
	
	static class Value{
		private int min;
		private int max;
		
		public int getMax() {
			return max;
		}
		
		public int getMin() {
			return min;
		}
		
		public void setMin(int min) {
			this.min = min;
		}
		
		public void setMax(int max) {
			this.max = max;
		}
		
		public String toString() {
			return "Min: " + min + " Max: " + max;
		}
	}

	public int getMin(int a, int b) {
		if (a < b)
			return a;
		return b;
	}

	public int getMax(int a, int b) {
		if (a > b)
			return a;
		return b;
	}
	
	static Value minmax (int [] values) {
		Value value = new Value();
		value.setMax(values[0]);
		value.setMin(values[0]);
		for (int temp : values) {
			if (temp > value.getMax())
				value.setMax(temp);
			if (temp < value.getMin())
				value.setMin(temp);
		}
		return value;
	}
}
