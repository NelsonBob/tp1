public class FizzBuzz {
    public  static String generateFizzBuzz(int number) throws Exception {
        if (number<0){
            throw new Exception("pas de FizzBuzz de nombre negative");
        }
        String chaine ="";
        for (int i=1;i<=number;i++){
            if (i%3==0&&i%5==0){
                chaine=chaine+"FizzBuzz";
            }else {
                if (i%3!=0&&i%5!=0){
                    chaine = chaine + i+"";
                }else {
                    if (i%3==0){
                        chaine=chaine + "Fizz";
                    } if (i%5==0){
                        chaine=chaine + "Buzz";
                    }
                }
            }
        }
        return chaine;
    }
    public static String generateFizzBuzz(int a , int b,int number ) throws Exception{
        if(number<0){
            throw new Exception("Cannot fizzbuzz negative numbers");
        }
        if(a==1 || b==1){
            throw new Exception("Divisor cannot be 1");
        }
        if(a<0 || b<0){
            throw new Exception("Divisor cannot be negative");
        }
        if(!isPremier(a)||!isPremier(b)){
            throw new Exception("Divisor must be a prime");
        }
        if(a==b){
            throw new Exception("Divisors must be distinct");
        }
        String chaine ="";
        for (int i=1;i<=number;i++){
            if(i%a==0&&i%b==0){
                chaine = chaine + "FizzBuzz ";
            }else{
                if(i%a!=0&&i%b!=0){
                    chaine = chaine+i+" ";
                }else
                {
                    if (i%a==0){
                        chaine = chaine + "Fizz ";
                    }if (i%b==0){
                    chaine = chaine + "Buzz ";
                }
                }
            }

        }

        return chaine;
    }

    public static boolean isPremier(int n) {
        boolean isPremier = true;
        if (n < 0) {
            isPremier = false;
        } else if (n != 0 && n != 1) {
            for (int i = 2; i <= n/2; i++) {
                if (n != i && n % i == 0) {
                    isPremier = false;
                    break;
                }
            }
        }
        return isPremier;
    }
}
