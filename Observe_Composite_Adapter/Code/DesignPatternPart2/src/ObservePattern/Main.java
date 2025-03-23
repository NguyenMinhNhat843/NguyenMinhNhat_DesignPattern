package ObservePattern;

public class Main {
	public static void main(String[] args) {
		StockShares stockShare = new StockShares("FPT");
		
		Investor i1 = new Investor("Nguyễn Minh Nhật");
		Investor i2 = new Investor("Nguyễn Nhật Minh");
		Investor i3 = new Investor("Nguyễn Văn A");
		
		// Theo dõi cổ phiếu
		stockShare.attach(i1);
		stockShare.attach(i2);
		stockShare.attach(i3);
		
		// Thông báo mới
		stockShare.notify("Cổ phiếu tăng giá");
	}
}
