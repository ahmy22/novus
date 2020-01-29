package novus;

public class matrices {
	
	static int size = 4;
	
	static void multiply(int matrix1[][], int matrix2 [][], int result[][]) {
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				result[i][j] = 0;
				for (int k = 0; k < size; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		
		int matrix1[][] = { {1,1,1,1},
							{2,2,2,2},
							{3,3,3,3},
							{4,4,4,4} };
		
		int matrix2[][] = { {4,4,4,4},
							{3,3,3,3},
							{2,2,2,2},
							{1,1,1,1} };
		
		int result[][] = new int[size][size];
		matrices.multiply(matrix1, matrix2, result);
		
		for (int x = 0; x < size; x++) {
			System.out.print("{ ");
			for (int y = 0; y < size; y++) {
				System.out.print(result[x][y] + " ");
			}
			System.out.print("}");
			System.out.println();
			
		}
		
	}

}
