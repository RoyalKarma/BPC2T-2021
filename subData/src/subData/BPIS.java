package subData;

public class BPIS implements P�edm�t {

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
			System.out.println(getName() + " | Gratulujeme, z�skal jst� z�po�et");
			return true;
		} else {
			System.out.println(getName() + " | Nez�skal jste z�po�et");
			return false;
		}

	}
	public void setPoints(int points) {
	
			this.points = points;
			
		
	}	
	
}