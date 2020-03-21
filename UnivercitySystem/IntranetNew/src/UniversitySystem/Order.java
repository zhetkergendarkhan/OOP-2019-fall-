package UniversitySystem;

public class Order implements java.lang.Comparable<Order>, Cloneable{
	
	private int orderNum;
	private String order;
	private boolean isDone;
	
	public Order(int orderNum, String order, boolean isDone) {
		super();
		this.orderNum = orderNum;
		this.order = order;
		this.isDone = isDone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isDone ? 1231 : 1237);
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + orderNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (isDone != other.isDone)
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (orderNum != other.orderNum)
			return false;
		return true;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "Order [orderNum=" + orderNum + ", order=" + order + ", isDone=" + isDone + "]";
	}

	@Override
	public int compareTo(Order o) {
		if (this.orderNum > o.orderNum)
			return 1;
		if (this.orderNum < o.orderNum)
			return -1;
		return 0;
	}
	
	
}
