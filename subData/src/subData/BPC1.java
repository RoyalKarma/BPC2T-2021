package subData;


public class BPC1 implements P�edm�t {
	
	
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
			System.out.println(getName() + " | Gratulujeme, z�skal jste z�po�et");
			return true;
		}
		else {
		System.out.println(getName() + " | Nez�skal jste z�po�et");
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
