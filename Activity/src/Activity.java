import java.util.Arrays;

public class Activity {
	public  double SI(double p,double n,double r){
        return p*n*r/100;
    }
    public  double Discount(double price,double DiscountPercent){
        return price + (price/DiscountPercent*0.01);
    }
    public  int minArray(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    
}