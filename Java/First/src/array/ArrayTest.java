package array;

public class ArrayTest {

	public static void main(String[] args) {
//		int[] studentIDs = new int[10];
//		int[] studentIDs = new int[] {101,102,103};
//		int[] studentIDs = new int[3] {101,102,103}; // 에러 확인
//		int[] studentIDs = {101,102,103};

		int[] studentIDs;
		studentIDs = new int[] {101,102,103};
        System.out.println(studentIDs[0]);
        
        studentIDs[0] = 10;
        System.out.println(studentIDs[0]);
				
	}

}
