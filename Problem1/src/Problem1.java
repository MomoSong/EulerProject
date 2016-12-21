import java.util.Scanner;

/**
 * Created by johnm on 2016-12-20.
 *
 * problem1
 * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
 * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
 */

public class Problem1 {
    public static void main(String[] args) {

        //FactorTest 객체 생성후 합 구하기
        FactorTest ft = new FactorTest(1000, 3, 5);
        System.out.println(ft.calcFactorSum());

    }
}


class FactorTest {
    int numRange;
    int sum;
    int factor1;
    int factor2;

    //생성자로 Main에서 넘어온 X, A, B초기화 -> numRange, factor1, factor2에 저장
    FactorTest(int numScope, int factor1, int factor2) {
        this.numRange = numScope;
        this.factor1 = factor1;
        this.factor2 = factor2;
        this.sum = 0;
    }

    FactorTest() {
        this(1000, 3, 5);
    }


    //factor1, factor2 배수 합 구해서 리턴
    int calcFactorSum() {
        for (int i = 1; i < numRange; i++) {
            if ((i % factor1 == 0) || (i % factor2 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
}

