package negatifdegerhesapla;
import java.util.Scanner;
import java.math.*;

public class NegatifDegerHesapla {
    public static void main(String[] args) {
        int n=1,sayi;
        double ort=0,total=0;
        
        Scanner input=new Scanner(System.in);
        
        
        for(int i=1;i<=n;i++){
            System.out.println("Sayi giriniz");
            sayi=input.nextInt();
            if(sayi%2==0){
                if(sayi%4==0){
                    total+=sayi;
                    n+=1;
                    ort=total/(n-1);
                    System.out.println("ortalama:"+ort);       
                }
            }
            else{
                break;
            }
        }
    }
    
}
