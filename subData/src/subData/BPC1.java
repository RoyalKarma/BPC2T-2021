package subData;


public class BPC1 implements Pøedmìt {
	
	
	public int lecturePoints;
	public int testPoints;
	
	

	@Override
	public String getName() {
		
		return "BPC1";
	}

	@Override
	public int getPoints() {
		
		return lecturePoints + testPoints;
	}

	@Override
	public boolean getPass() 
	{
		if(lecturePoints + testPoints >= minPoints ) {
			System.out.println(getName() + " | Gratulujeme, získal jste zápoèet");
			return true;
		}
		else {
		System.out.println(getName() + " | Nezískal jste zápoèet");
		return false;
		}
	}
	
	public void setLecturePoints(int points) {
		
			lecturePoints += points;
			
		
	}

	public void setTestPoints(int points) {
		
			testPoints = points;
			
		
	}

}
