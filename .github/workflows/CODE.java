package MARHS;
import java.lang.Math;

class value {
   //abs function
        public int  abs(int val){return Math.abs(val);}
        public float abs(float val){return Math.abs(val);}
        public double abs(double val){return Math.abs(val);}
        public long abs(long val){return Math.abs(val);}
    //acos fuction 
        // public int  acos(int val){return Math.acos(val);}
        // public float acos(float val){return Math.acos(val);}
        // public double acos(double val){return Math.acos(val);}
        // public long acos(long val){return Math.acos(val);}
    
}
public class CODE {
    public static void main(String[] args) {
     int intval =1203;
     float floatval=(float) 1203.132;
     double doubleval=1203.13;
     long longval=1203;

    value obj =new  value();
System.out.println(  " abslolute value is " + obj.abs(intval)+
                  "\n abslolute value is "  + obj.abs(floatval) 
                + "\n abslolute value is " + obj.abs(doubleval) 
                + "\n abslolute value is "  + obj.abs(longval) 
                 );
/* System.out.println(  " acos value is " + obj.acos(intval)+
                  "\n acos value is "  + obj.acos(floatval) 
                + "\n acos value is " + obj.acos(doubleval) 
                + "\n acos value is "  + obj.acos(longval) 
                 ); */



    }
}
