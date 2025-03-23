package ObservePattern;

public class Investor implements Observe {
	private String name;
	
	public Investor(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String titleNotification) {
		// TODO Auto-generated method stub
		System.out.println("Nhận được thông báo cổ phiếu mới: " + titleNotification);
	}
}
