public class PrimeNumbers {

    public static void primeNumbers(){
        for (int num = 2; num < 10000; num++){
            boolean isPrime = true;

            for (int div = 2; div * div <= num; div++){
                if(num % div == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("is Prime");
            }
            else {
                System.out.println("Not Prime");
            }
        }
    }

}
