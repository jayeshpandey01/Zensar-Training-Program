

public class Practice_04 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // do while loop
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 11);


        // array
        int[] marks = {10, 20, 30, 40, 50};
        System.out.println("Length of the array: " + marks.length);
        for (int j = 0; j < marks.length; j++) {
            System.out.print(marks[j] + " ");
        }
        System.out.println();
        // for each loop
        for (int mark : marks) {
            System.out.print(mark + " ");
        }   

        // 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Length of the matrix: " + matrix.length);
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[j].length; k++) {
                System.out.print(matrix[j][k] + " ");
            }
            System.out.println();
        }
    }    
}
