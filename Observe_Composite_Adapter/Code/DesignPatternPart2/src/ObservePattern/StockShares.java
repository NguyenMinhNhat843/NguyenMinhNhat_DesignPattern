package ObservePattern;

import java.util.ArrayList;
import java.util.List;

public class StockShares implements Subject{
	private String nameStockShare;
	private List<Observe> lstInvestor = new ArrayList<Observe>();

	public StockShares(String nameStockShare) {
		// TODO Auto-generated constructor stub
		this.nameStockShare = nameStockShare;
	}
	
	@Override
	public void attach(Observe observe) {
		// TODO Auto-generated method stub
		lstInvestor.add(observe);
	}

	@Override
	public void detach(Observe observe) {
		// TODO Auto-generated method stub
		lstInvestor.remove(observe);
	}

	@Override
	public void notify(String titleNotify) {
		// TODO Auto-generated method stub
		for(Observe o : lstInvestor) {
			o.update(titleNotify);
		}
	}
}
