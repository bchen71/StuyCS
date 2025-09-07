public class Tester{
    public static boolean isPrime(int x){
    for(int i = 2; i <= (x - 1); i++){
        if(x % i == 0){
            return false;
        }
    }
    return true;
}

public static int nthPrime(int n){
    int prime = 1;
    int current_num = 4;
    if(n == 0){
        return 2;
    }
    if(n == 1){
        return 3;
    }
    while(prime != n){
        current_num++;
        if(isPrime(current_num)){
            prime++;
        }
    }
    return current_num;
}

    public static void main(String[] args){
        int[] array_input = {7, 0, 1, 3, 4, 5, 6, 7, 99, 619, 999};
        int[] expected = {19, 2, 3, 7, 11, 13, 17, 19, 541, 4583, 7919};
        for(int i = 0; i < array_input.length; i++){
            int prime_num = nthPrime(array_input[i]);
            int real_prime = expected[i];
            if(prime_num == real_prime){
                System.out.println("pass on index " + i);
            }
            else{
                System.out.println("fail expected " + real_prime + " but value returned was " + prime_num);
            }
        }
    }
}