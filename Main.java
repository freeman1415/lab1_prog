public class Main{
    public static void main(String[] args) {
        int[] c = new int [9];
        for(int i=0;i<9;i++){
            c[i]=2*i+3;
        }
        double[] x = new double [15];
        double min = -6;
        double max = 9;
        for (int i=0;i<15;i++){
            x[i]=min+Math.random()*(max-min);
        }
        double[][] c1 = new double[10][15];
        for (int i=0; i<9 ;i++){
            for (int j=0; j<15 ;j++){
                if (c[i] == 9){
                    c1[i][j]= Math.pow(Math.pow((x[j]-1)/Math.PI,2)*(Math.exp(x[j])-1)*(Math.cos(Math.pow(2*x[j],2))-Math.PI) , 2);
                }
                else if(c[i]==3 || c[i]==15 || c[i]==17 || c[i]==19 || c[i]==21){
                    c1[i][j]=Math.cos(Math.atan(1/Math.exp(Math.abs(x[j]))));
                }
                else{
                    c1[i][j]=Math.sin(Math.cos(Math.asin((x[j]+1.5)/15)));
                }
            }
        }
        for (int i=0; i<9 ;i++) {
            for (int j = 0; j < 15; j++) {
                String s = String.format("%.2f", c1[i][j]);
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}