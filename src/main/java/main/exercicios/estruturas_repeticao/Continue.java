package main.exercicios.estruturas_repeticao;

public class Continue {
    public static void main(String [] args){
        double totalValue  = 10;
        double portionValue = 0;
        /***
         * The continue statement ignore te rest of the code inside the loop, so the println will be execute only when portionValue > 10
         */
        for(int  portion = (int) totalValue; portion >= 1; portion--){
            portionValue++;
            if(portionValue < totalValue){
                continue;
            }
            System.out.println("Portion Value: " + portionValue);
        }
    }
}
