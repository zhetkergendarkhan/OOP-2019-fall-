
public class Polynomial {
	int[] coef;
	public Polynomial(int[] coef) {
		this.coef=coef;
	}
	public String toString() {
		String ans=""+coef[0];
		for(int i=1;i<coef.length;i++) {
			ans+="+"+coef[i]+"*x^"+i;
		}
		return ans;
	}
	public double value(int x) {
		double ans=0;
		for(int i=0;i<coef.length;i++) {
			ans+=coef[i]*(Math.pow(x, i));
		}
		return ans;
	}
	public String derivative() {
		String ans=""+coef[1];
		for(int i=2;i<coef.length;i++) {
			ans+="+"+i+"*"+coef[i]+"*x^"+(i-1);
		}
		return ans;
	}
	
	

}
