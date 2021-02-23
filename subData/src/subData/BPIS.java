package subData;

public class BPIS implements Pøedmìt {

	private int points;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "BPIS";
	}

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return points;
	}

	@Override
	public boolean getPass() {
		if (points > minPoints) {
			System.out.println(getName() + " | Gratulujeme, získal jsté zápoèet");
			return true;
		} else {
			System.out.println(getName() + " | Nezískal jste zápoèet");
			return false;
		}

	}
	public void setPoints(int points) {
	
			this.points = points;
			
		
	}	
	
}