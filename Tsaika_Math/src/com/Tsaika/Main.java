package com.Tsaika;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    /*public static double[][] multiplyByMatrix(double[][] m1, double[][] m2) {
        int m1ColLength = m1[0].length; // m1 columns length
        int m2RowLength = m2.length;    // m2 rows length
        if(m1ColLength != m2RowLength) return null; // matrix multiplication is not possible
        int mRRowLength = m1.length;    // m result rows length
        int mRColLength = m2[0].length; // m result columns length
        double[][] mResult = new double[mRRowLength][mRColLength];
        for(int i = 0; i < mRRowLength; i++) {         // rows from m1
            for(int j = 0; j < mRColLength; j++) {     // columns from m2
                for(int k = 0; k < m1ColLength; k++) { // columns from m1
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mResult;
    }

    public static String toString(double[][] m) {
        String result = "";
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                result += String.format("%11.2f", m[i][j]);
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        // #1
        double[][] multiplicand = new double[][] {
                {3, -1, 2},
                {2,  0, 1},
                {1,  2, 1}
        };
        double[][] multiplier = new double[][] {
                {2, -1, 1},
                {0, -2, 3},
                {3,  0, 1}
        };
        System.out.println("#1\n" + toString(multiplyByMatrix(multiplicand, multiplier)));
        // #2
        multiplicand = new double[][] {
                {1, 2, 0},
                {-1, 3, 1},
                {2, -2, 1}
        };
        multiplier = new double[][] {
                {2},
                {-1},
                {1}
        };
        System.out.println("#2\n" + toString(multiplyByMatrix(multiplicand, multiplier)));
        // #3
        multiplicand = new double[][] {
                {1, 2, -1},
                {0,  1, 0}
        };
        multiplier = new double[][] {
                {1, 1, 0, 0},
                {0, 2, 1, 1},
                {1, 1, 2, 2}
        };
        System.out.println("#3\n" + toString(multiplyByMatrix(multiplicand, multiplier)));
    }*/


    /*Scanner in = new Scanner(System.in);
    System.out.print("Number1: ");
    int num1 = in.nextInt();
    System.out.print("Number2: ");
    int num2 = in.nextInt();

}
int[] [] nums=new int[][]
        {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
int[] [] nums2=new int[][]
        {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
for (int i=0;i<nums.length;i++){
    for (int j=0;j<nums[1].length;j++){
        System.out.printf("%d",nums[i][j]);
        System.out.printf("%d",nums2[i][j]);
    }
    System.out.println(nums [1] + nums2 [1]);
}*/
    /*public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int order=3;
        int[][] matrix=new int[3][3];
        System.out.println("Enter the elements of 3x3 matrix");
        int i,j;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                try{
                    matrix[i][j]=Integer.parseInt(br.readLine());
                }
                catch(Exception e){
                    System.out.println("An error occured. Please retry");
                    return;
                }
            }
        }
        int determinant,x,y,z;
        x=(matrix[0][0] * (matrix[1][1] * matrix[2][2]
                - matrix[1][2] * matrix[2][1]));
        y=(matrix[0][1] * (matrix[1][0] * matrix[2][2]
                - matrix[1][2] * matrix[2][0]));
        z=(matrix[0][2] * (matrix[1][0] * matrix[2][1]
                - matrix[1][1] * matrix[2][0]));
        determinant= x - y + z;
        System.out.println("The modulus of the given matrix is "+ determinant);

    }*/
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.print("Выберите действие: 1/Сложение 2/Вычитание 3/Умножение \n");
        int otvet = entry.nextInt();
        if (otvet == 1) {
            System.out.print("Введите значения для первой матрицы:\n");
            int num1 = entry.nextInt();
            int num2 = entry.nextInt();
            int num3 = entry.nextInt();
            int num4 = entry.nextInt();
            int num5 = entry.nextInt();
            int num6 = entry.nextInt();
            int num7 = entry.nextInt();
            int num8 = entry.nextInt();
            int num9 = entry.nextInt();
            int[][] nums = new int[][]
                    {
                            {num1, num2, num3},
                            {num4, num5, num6},
                            {num7, num8, num9}
                    };
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.printf("%d ", nums[i][j]);
                }
                System.out.println();
            }
            System.out.print("Введите значения для второй матрицы:\n");
            int num11 = entry.nextInt();
            int num22 = entry.nextInt();
            int num33 = entry.nextInt();
            int num44 = entry.nextInt();
            int num55 = entry.nextInt();
            int num66 = entry.nextInt();
            int num77 = entry.nextInt();
            int num88 = entry.nextInt();
            int num99 = entry.nextInt();
            int[][] nums21 = new int[][]
                    {
                            {num11, num22, num33},
                            {num44, num55, num66},
                            {num77, num88, num99}
                    };
            for (int i = 0; i < nums21.length; i++) {
                for (int j = 0; j < nums21[i].length; j++) {
                    System.out.printf("%d ", nums21[i][j]);
                }
                System.out.println();
            }
            System.out.println("Ответ равен:");
            int[][] otveti = new int[][]
                    {
                            {num1 + num11, num2 + num22, num3 + num33},
                            {num4 + num44, num5 + num55, num6 + num66},
                            {num7 + num77, num8 + num88, num9 + num99}
                    };
            for (int i = 0; i < otveti.length; i++) {
                for (int j = 0; j < otveti[i].length; j++) {
                    System.out.printf("%d ", otveti[i][j]);
                }
                System.out.println();
            }
        /*    if (otvet == 2) {
                System.out.print("Введите значения для первой матрицы:\n");
                int nums1 = entry.nextInt();
                int nums2 = entry.nextInt();
                int nums3 = entry.nextInt();
                int nums4 = entry.nextInt();
                int nums5 = entry.nextInt();
                int nums6 = entry.nextInt();
                int nums7 = entry.nextInt();
                int nums8 = entry.nextInt();
                int nums9 = entry.nextInt();
                int[][] nums228 = new int[][]
                        {
                                {nums1, nums2, nums3},
                                {nums4, nums5, nums6},
                                {nums7, nums8, nums9}
                        };
                for (int i = 0; i < nums228.length; i++) {
                    for (int j = 0; j < nums228[i].length; j++) {
                        System.out.printf("%d ", nums228[i][j]);
                    }
                    System.out.println();
                }
                System.out.print("Введите значения для второй матрицы:\n");
                int num113 = entry.nextInt();
                int num223 = entry.nextInt();
                int num333 = entry.nextInt();
                int num443 = entry.nextInt();
                int num553 = entry.nextInt();
                int num663 = entry.nextInt();
                int num773 = entry.nextInt();
                int num883 = entry.nextInt();
                int num993 = entry.nextInt();
                int[][] nums31 = new int[][]
                        {
                                {num113, num223, num333},
                                {num443, num553, num663},
                                {num773, num883, num993}
                        };
                for (int i = 0; i < nums31.length; i++) {
                    for (int j = 0; j < nums31[i].length; j++) {
                        System.out.printf("%d ", nums31[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("Ответ равен:");
                int[][] otveti1 = new int[][]
                        {
                                {nums1 - num113, nums2 - num223, nums3 - num333},
                                {nums4 - num443, nums5 - num553, nums6 - num663},
                                {nums7 - num773, nums8 - num883, nums9 - num993}
                        };
                for (int i = 0; i < otveti1.length; i++) {
                    for (int j = 0; j < otveti1[i].length; j++) {
                        System.out.printf("%d ", otveti1[i][j]);
                    }
                    System.out.println();
                }

            }*/
        } else if (otvet == 2) {
            System.out.print("Введите значения для первой матрицы:\n");
            int nums1 = entry.nextInt();
            int nums2 = entry.nextInt();
            int nums3 = entry.nextInt();
            int nums4 = entry.nextInt();
            int nums5 = entry.nextInt();
            int nums6 = entry.nextInt();
            int nums7 = entry.nextInt();
            int nums8 = entry.nextInt();
            int nums9 = entry.nextInt();
            int[][] nums228 = new int[][]
                    {
                            {nums1, nums2, nums3},
                            {nums4, nums5, nums6},
                            {nums7, nums8, nums9}
                    };
            for (int i = 0; i < nums228.length; i++) {
                for (int j = 0; j < nums228[i].length; j++) {
                    System.out.printf("%d ", nums228[i][j]);
                }
                System.out.println();
            }
            System.out.print("Введите значения для второй матрицы:\n");
            int num113 = entry.nextInt();
            int num223 = entry.nextInt();
            int num333 = entry.nextInt();
            int num443 = entry.nextInt();
            int num553 = entry.nextInt();
            int num663 = entry.nextInt();
            int num773 = entry.nextInt();
            int num883 = entry.nextInt();
            int num993 = entry.nextInt();
            int[][] nums31 = new int[][]
                    {
                            {num113, num223, num333},
                            {num443, num553, num663},
                            {num773, num883, num993}
                    };
            for (int i = 0; i < nums31.length; i++) {
                for (int j = 0; j < nums31[i].length; j++) {
                    System.out.printf("%d ", nums31[i][j]);
                }
                System.out.println();
            }
            System.out.println("Ответ равен:");
            int[][] otveti1 = new int[][]
                    {
                            {nums1 - num113, nums2 - num223, nums3 - num333},
                            {nums4 - num443, nums5 - num553, nums6 - num663},
                            {nums7 - num773, nums8 - num883, nums9 - num993}
                    };
            for (int i = 0; i < otveti1.length; i++) {
                for (int j = 0; j < otveti1[i].length; j++) {
                    System.out.printf("%d ", otveti1[i][j]);
                }
                System.out.println();
            }
        } else if (otvet == 3) {
            System.out.print("Введите значения для первой матрицы:\n");
            int numb1 = entry.nextInt();
            int numb2 = entry.nextInt();
            int numb3 = entry.nextInt();
            int numb4 = entry.nextInt();
            int numb5 = entry.nextInt();
            int numb6 = entry.nextInt();
            int numb7 = entry.nextInt();
            int numb8 = entry.nextInt();
            int numb9 = entry.nextInt();
            int[][] numb228 = new int[][]
                    {
                            {numb1, numb2, numb3},
                            {numb4, numb5, numb6},
                            {numb7, numb8, numb9}
                    };
            for (int i = 0; i < numb228.length; i++) {
                for (int j = 0; j < numb228[i].length; j++) {
                    System.out.printf("%d ", numb228[i][j]);
                }
                System.out.println();
            }
            System.out.print("Введите значения для второй матрицы:\n");
            int numb113 = entry.nextInt();
            int numb223 = entry.nextInt();
            int numb333 = entry.nextInt();
            int numb443 = entry.nextInt();
            int numb553 = entry.nextInt();
            int numb663 = entry.nextInt();
            int numb773 = entry.nextInt();
            int numb883 = entry.nextInt();
            int numb993 = entry.nextInt();
            int[][] numb31 = new int[][]
                    {
                            {numb113, numb223, numb333},
                            {numb443, numb553, numb663},
                            {numb773, numb883, numb993}
                    };
            for (int i = 0; i < numb31.length; i++) {
                for (int j = 0; j < numb31[i].length; j++) {
                    System.out.printf("%d ", numb31[i][j]);
                }
                System.out.println();
            }
            System.out.println("Ответ равен:");
            int[][] otveti1 = new int[][]
                    {
                            {numb1 * numb113, numb2 * numb223, numb3 * numb333},
                            {numb4 * numb443, numb5 * numb553, numb6 * numb663},
                            {numb7 * numb773, numb8 * numb883, numb9 * numb993}
                    };
            for (int i = 0; i < otveti1.length; i++) {
                for (int j = 0; j < otveti1[i].length; j++) {
                    System.out.printf("%d ", otveti1[i][j]);
                }
                System.out.println();
            }
        }
    }
}