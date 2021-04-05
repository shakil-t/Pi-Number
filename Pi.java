/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

/**
 *
 * @author shakil
 */
public class Pi {

    /**
     * @param args the command line arguments
     */
public static void division(double d1, double d2){
        long[] array=new long[10];
        for(int i=0;i<array.length;i++){
            long q=0;
            //q stands for quotient;
            while(d1>=d2){
                d1=d1-d2;
                q++;
            }
            array[i]=q;
            d1=d1*10;
        }
        System.out.print(array[0]+".");
        for(int i=1;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        long s=100000000;
        //s stands for the number of points in the square;
        long c=0;
        //c stands for the number of points in the circle;
        double r=1;
        //r stands for radius of the circle;
        for(long i=0;i<100000000;i++){
            double x=Math.random()*2;
            double y=Math.random()*2;
            double distance=Math.pow(x-1, 2)+Math.pow(y-1, 2);
            if(distance<r){
                c++;
            }
        }
        c=c*4;
        division(c,s);
}
}
