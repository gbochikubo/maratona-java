package main.exercicios.estruturas_repeticao;

public class While {
    public static void main(String [] args){
        int count = 5;

        /***
         * The do makes sure to execute the function at least one time, even if the condition of the while was not satisfied
         */
        do{
            System.out.println("This will be print at least one time");
            ++count;
        }
        while(count<10);
    }
}
