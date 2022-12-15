package Student;

import java.util.ArrayList;

public class secSchool extends Student{
	
	public static ArrayList<String> arraySec = new ArrayList<>();

	@Override
	boolean stageUp() {
		// TODO Auto-generated method stub
		final int getS = this.getStage();
		if (getS < 3) {
			this.setStage(1+getS);
			return true;
		} else if(getS == 3) {
			this.stageOver(getS);
		}
		return false;
	}

	@Override
	boolean stageOver(int year) {
		// TODO Auto-generated method stub
		highSchool.arrayHigh.add(this.getName());
		if (year >= 3) {
			uni.arrayUni.add(this.getName());
			for (int i=0; i <arraySec.size(); i++) {
				if ( arraySec.get(i) == this.name) {
					arraySec.set(i, null);
				}
			}
			this.name = null;
			this.stage = 0;
			return true;
		}
		return false;
	}

	@Override
	void setName(String name) {
		// TODO Auto-generated method stub
		arraySec.add(name);
		this.name = name;
	}
	
}
