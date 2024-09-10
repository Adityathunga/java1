import java.util.Scanner;
public class J1{
    public static void main(String[] args){
    int N =Integer.parseInt(args[0]);
    int[][] matrix1=new int[N][N];
    int[][] matrix2=new int[N][N];
    int[][] summatrix=new int[N][N];
    int i,j;
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter element of first matrix");
    for(i=0;i<N;i++){
        for(j=0;j<N;j++){
            matrix1[i][j]=scanner.nextInt();
        }
    }
    System.out.println("enter elemnt of second matrix");
    for(i=0;i<N;i++){
         for(j=0;j<N;j++){
             matrix2[i][j]=scanner.nextInt();
        }
     }
     System.out.println("the sum of two matrix");
     for(i=0;i<N;i++){
          for(j=0;j<N;j++){
               summatrix[i][j]=matrix1[i][j]+matrix2[i][j];
          }
      }
     System.out.println("sum of two matrix is");
       for(i=0;i<N;i++){
          for(j=0;j<N;j++){
              System.out.print(summatrix[i][j]+" ");
          }
          System.out.println();
}
}
} 