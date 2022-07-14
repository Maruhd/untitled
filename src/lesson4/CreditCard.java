package lesson4;

public class CreditCard {
    public static void main(String args[]){

        sum(1, 2, 3);
        sum(1, 2, 3, 4, 5, 6, 7);
        sum(59, 41);
        sum(100, 85);
    }
    static void sum(int ...nuns){
        int result = 0;
        for(int n: nuns)
            result += n;
        System.out.println(result);
    }
   }
