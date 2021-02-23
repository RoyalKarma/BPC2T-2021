package subData;

public class BPC2 implements P�edm�t {

	private int projectPoints;
	private int midtermPoints;
	private int finaltestPoints;


	@Override
	public String getName() {

		return "BPC2";
	}

	@Override
	public int getPoints() {

		return projectPoints + midtermPoints + finaltestPoints;
	}

	@Override
	public boolean getPass() {
		if (projectPoints + midtermPoints + finaltestPoints > minPoints) {
			System.out.println( getName() +" | Gratulujeme, z�skal jst� z�po�et");
			return true;
		} else {
			System.out.println( getName() +" | Nez�skal jste z�po�et");
			return false;
		}
	}

	public void setProjectPoints(int points) {
		
			projectPoints = points;

		

	}

	public void setMidtermPoints(int points) {
		
		midtermPoints = points;

		
	}

	public void setFinaltestPoints(int points) {
		
			finaltestPoints = points;

		
	}
}
