import java.util.Scanner;

/**
 * Created by johnm on 2016-12-20.
 * <p>
 * <p>
 * Problem2
 * 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
 * <p>
 */

public class Problem2 {
    public static void main(String[] args) {
        fibonacci();
        System.out.println();
    }

    //재귀가 아닌 피보나치
    static void fibonacci() {
        final int MAX = 4_000_000;
        int a = 1;
        int b = 2;
        int c = 0;
        long sum = 2; //2가 제외되므로 합계에 미리 2추가

        // 2가 결과에서 제외되서 짝수 2부터 출력
        System.out.print(b + ", ");
        while (c <= 4000000) {
            c = a + b;

            //짝수이면 출력하고 합계에 더하기
            if (c % 2 == 0) {
                sum += c;
                System.out.print(c + ", ");
            }
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println(sum);
    }
}

