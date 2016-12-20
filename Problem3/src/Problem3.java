/**
 * Created by johnm on 2016-12-20.+
 *
 * Problem 3
 * 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
 * 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
 * 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
 */

포기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 다음기회에!
/*
public class Problem3 {
    public static void main(String[] args){
        //15의 소인수 구하기
        long N = 600851475143L;
        System.out.println(Math.sqrt(N));

        int[] prime = getPrime();

        for(int i=0; i<prime.length; i++){
            System.out.println(prime[i] +",");
        }



    }

  //소수 정리에 의하여 어떤 수 n은 sqrt(n)보다 작은 인수를 가진다.
    /*
    public static boolean PrimeFac(){
        int n = 13195;
        int div = 1;

        n%div+1 == 0;
    }
    */

    //sqrt보다 작은 소수의 목록 구하기
    //에라토스테네스의 체
    public static int[] getPrime(){
        int[] prime = new int[100];
        int n = 2;

        for(int i=0; i<prime.length; i++){
            prime[i] = i+2;
        }

        while(i<prime.length){
            for(int j=0; j<prime.length; j++){
                if(prime[j]%i)
            }
        }



        return prime;

    }



}
*/