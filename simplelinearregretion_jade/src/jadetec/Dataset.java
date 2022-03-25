package jadetec;

public class Dataset {
public int n =9;

    public int[][] matrizdatset = new int[9][9];
    public int x[] = {23, 26, 30, 34, 43, 48, 52, 57, 58};
    public int y[] = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
    public void datos(int valor) {

        int n=9;

        for (int i =0;i<n;i++){
            for (int j=0;j<2;j++){
                if (j==0) {
                    matrizdatset[i][j]=x[i];
                }
                else{
                    matrizdatset[i][j]=y[i];
                }
            }
        }
        System.out.printf("x    y\n");

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 2; ++j) {
                System.out.printf("%d \t", matrizdatset[i][j]);
            }
            System.out.printf("\n");
        }
        sumatorias p = new sumatorias();

        System.out.printf("\nB0 = %.4f",p.b0(matrizdatset));
        System.out.printf("\nB1 = %.4f",p.b1(matrizdatset));

        System.out.printf("\nyhat es igual a %.4f",p.yhat(matrizdatset, valor));
    }
}
