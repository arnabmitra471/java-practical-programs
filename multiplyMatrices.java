import java.util.*;
class MultiplyMatrices
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the first matrix: ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of columns in the first matrix: ");
        int cols1 = sc.nextInt();
        System.out.println("Enter the number of rows in the second matrix: ");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of columns in the second matrix: ");
        int cols2 = sc.nextInt();
        int i,j,k,prod_rows,prod_cols;
        if(cols1 != rows2)
        {
            System.out.println("The number of columns in mat1 and the number of rows in mat2 must be equal");
            System.exit(1);
        }
        int mat1[][] = new int[rows1][cols1];
        for(i=0;i<rows1;i++)
        {
            for(j=0;j<cols1;j++)
                mat1[i][j] = sc.nextInt();
        }
        int mat2[][] = new int[rows2][cols2];
        for(i=0;i<rows2;i++)
        {
            for(j=0;j<cols2;j++)
                mat2[i][j] = sc.nextInt();
        }
        prod_rows = rows1;
        prod_cols = cols2;
        int prod_mat[][] = new int[prod_rows][prod_cols];
        for(i=0;i<prod_rows;i++)
        {
            for(j=0;j<prod_cols;j++)
            {
                prod_mat[i][j] = 0;
                for(k=0;k<prod_cols;k++)
                {
                    prod_mat[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("The elements of the product matrix are: ");
        for(i=0;i<prod_rows;i++)
        {
            for(j=0;j<prod_cols;j++)
            {
                System.out.print("\t"+prod_mat[i][j]);
            }
            System.out.println();
        }
    }
}