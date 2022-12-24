package Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		priSchool p = null;
		secSchool s = null ;
		highSchool h = null;
		uni u = null;
		
		priSchool[] arr = new priSchool[3];
		secSchool[] arr1 = new secSchool[2];
		highSchool[] arr2 = new highSchool[2];
		uni[] arr3 = new uni[2];
		
//		arr[0] = new priSchool("ali", 3);
//		arr[1] = new priSchool("ahmed", 6);
//		arr[2] = new priSchool("hadi", 4);
		
//		arr1[0] = new secSchool("ali", 3);
//		arr1[1] = new secSchool("ahmed", 2);
		
//		arr2[0] = new highSchool("ali", 3);
//		arr2[1] = new highSchool("ahmed", 2);
		
		arr3[0] = new uni("ali", 4);
		arr3[1] = new uni("ahmed", 2);
		
		for (int i=0; i<arr3.length; i++) {
			arr3[i].stageUp();
			System.out.println(arr3[i].name);
			System.out.println(arr3[i].stage);
			
		}
		System.out.println(u.arrayUni);
	}

}
