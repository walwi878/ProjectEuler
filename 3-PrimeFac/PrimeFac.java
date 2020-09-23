import static java.lang.Math.*;

public class PrimeFac {   
    public static void main(String[] args){

        double num = 600851475143L;

        for (int divisor = 2; divisor <= sqrt(num); divisor++){
            for(double j = num/2; j>sqrt(num); j--){ //for each divisor , see if divisor 
                if (divisor*j==num){
                    System.out.println(divisor);
                }
            }
        }
    }
}