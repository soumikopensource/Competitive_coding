import java.util.Scanner;

public class matrix {


    public static void main(String_compe[] args) {
        //define a matrix
        System.out.println("print a matrix");
        int[][] matrix = {{2, 3, 4}, {5, 6, 7}, {2, 9, 20}};

        //print the matrix

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println("");
        }


        //print a matrix in snake pattern
        for (int i = 0; i < matrix.length; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; ++j) {
                    System.out.print(matrix[i][j] + " ");

                }

            } else {
                for (int k = (matrix[i].length) - 1; k > -1; --k) {
                    System.out.print(matrix[i][k] + " ");

                }
            }
            System.out.println("");



        }

        //finding transpose of a matrix
        System.out.println("transpose");
        int[][] temp = new int[8][8];

        //finding transpose of a matrix of auxiliary space=o(1)
        //time complexity o(r*c) times
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = i + 1; j < matrix[i].length; ++j) {
                temp[i][j] = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp[i][j];


            }
        }


        for (int i = 0; i < matrix.length; ++i) {
            for (int k = 0; k<matrix[i].length; ++k) {
                System.out.println(matrix[i][k]+" ");

            }

            }


        //rotate matrix by 90 degree  counter clock wise
        // first we have to take the transpose and then reverse each column












        //search in row wise and column wise  if sorted
        byte [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("enter the number you want to search ");
        Scanner sc=new Scanner(System.in);
        byte num=sc.nextByte();
        int i=0,j= arr.length-1;
        while(i< arr.length && j>=0){
            if(arr[i][j]==num){
                System.out.println("found");
            }

            if(arr[i][j]>num)
                j--;
            else
                i++;



        }
        System.out.println("number not found");// condition i==n or j==-1

        //print the boundary values
        int [][] temp1=new int[10][10];

        for(int m=0;m< matrix.length;++m) {
            if (m == 0 || m == (matrix.length - 1)) {

                for (int a = 0; a < matrix[m].length; ++a) {

                    //copy  the values from the original array
                    temp1[m][a] = matrix[m][a];

                }


            } else {

                for (int a = 0; a < matrix[m].length; ++a){
                    if(a==0 || a==matrix.length-1){
                        temp1[m][a]=matrix[m][a];
                    }

                }



            }


        }
        //final result boundary values print
        for (int r = 0; r< matrix.length; ++r) {
            for (int c = 0; c < matrix[r].length; ++c) {
                System.out.print(temp1[r][c] + " ");

            }
            System.out.println("");
        }



// print spiral values of a matrix




    }
}

