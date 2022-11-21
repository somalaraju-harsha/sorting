public class pattren {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {


            //pattren for I
            for (int j = 0; j < n; j++) {
                if ((i == 0) || (i == n - 1) || (j == (n - 1) / 2)) {
                    System.out.print("I");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //pattren for N
            for (int j = 0; j < n; j++) {
                if ((i == j) || (j == 0) || (j == n - 1)) {
                    System.out.print("N");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            //pattren for E
            for (int j = 0; j < n; j++) {
                if ((i == 0) || (j == 0) || (i == n - 1) || (i == (n - 1) / 2)) {
                    System.out.print("E");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            //pattren for U
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i < n - 1) || (j == n - 1 && i < n - 1) || (i == n - 1 && j > 0 && j < n - 1)) {
                    System.out.print("U");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            //pattren for R
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j < n - 1) || (j == 0) || (i == (n - 1) / 2 && j < n - 1) || (j == n - 1 && i > 0 && i < (n - 1) / 2) ||
                        (i == j && i >= (n - 1) / 2)) {
                    System.out.print("R");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            //pattren for O
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i > 0 && i < n - 1) || (j == n - 1 && i > 0 && i < n - 1) || (i == n - 1 && j > 0 && j < n - 1) || (i == 0 && j > 0 && j < n - 1)) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            //pattren for N
            for (int j = 0; j < n; j++) {
                if ((i == j) || (j == 0) || (j == n - 1)) {
                    System.out.print("N");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            System.out.println();
        }
        System.out.println();

//        1111
//        2222
//        3333
//        4444

        for (int i = 1; i <= 4; i++)
        {
            for (int j=1;j<=4;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //home
        int m=14;
        for (int i = 0; i <= m-1; i++)
        {
            for (int j=0;j<=m-1;j++)
            {
                if((i==0 || i==m-1 || j==0 || j==m-1) || (i+j<=(m-1)/2) || (j-i>=(m-1)/2) ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //v full
        int p=15;
        for (int i = 0; i <= p-1; i++)
        {
            for (int j=0;j<=p-1;j++)
            {
                if((i+j>=p-1 + (p-1)/2 )|| (i-j>=(p-1)/2)  )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //E full
        int q=14;
        for (int i = 0; i <= q-1; i++)
        {
            for (int j=0;j<=q-1;j++)
            {
                if((i==0) || i==q-1 || (i+j<=(q-1)/2 )|| (i-j>=(q-1)/2)  )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}