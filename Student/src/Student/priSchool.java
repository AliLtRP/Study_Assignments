package Student;

import java.util.ArrayList;

public class priSchool extends Student{
	
	protected static ArrayList<String> arrayPri = new ArrayList<>();
	
	public priSchool(String name, int stage) {
		this.name = name;
		this.stage = stage;
	}
	
	@Override
	boolean stageUp() {
		// TODO Auto-generated method stub
		final int getS = this.getStage();
		if (getS < 6) {
			this.setStage(1+getS);
			return true;
		} else if(getS == 6) {
			this.stageOver(getS);
		}
		return false;
	}

	@Override
	boolean stageOver(int year) {
		// TODO Auto-generated method stub
		if (year >= 6) {
			secSchool.arraySec.add(this.getName());
			for (int i=0; i <arrayPri.size(); i++) {
				if ( arrayPri.get(i) == this.name) {
					arrayPri.set(i, null);
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
		arrayPri.add(name);
		this.name = name;
	}
	
}
