/**
 * Created by johnm on 2016-12-26.
 * <p>
 * 1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
 * 1^2 + 2^2 + ... + 10^2 = 385 (
 * 1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * 따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
 * 그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
 */

/*
1. Math.pow를 사용해 제곱의 합과 합의 제곱 구하기
2. 빼기
*/

public class Problem6 {
    public static void main(String[] args) {
        int nSquareOfSum = squareOfSum(100);
        int nSumOfsquare = sumOfSquare(100);

        System.out.printf("%d  -  %d  =  %d%n" ,nSquareOfSum, nSumOfsquare, nSquareOfSum - nSumOfsquare);

    }

    static int squareOfSum(int range) {
        int sum = 0;
        for(int i=1; i<=range; i++){
            sum += i;
        }
        sum = (int)Math.pow(sum, 2);

        return sum;
    }

    static int sumOfSquare(int range) {
        int sum = 0;
        for(int i=1; i<=range; i++){
            sum += (int)Math.pow(i, 2);
        }

        return sum;
    }
}
