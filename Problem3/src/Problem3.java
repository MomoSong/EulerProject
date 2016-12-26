/**
 * Created by johnm on 2016-12-20.+
 * <p>
 * Problem 3
 * 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
 * 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
 * 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
 */

/*
1. 에라토스네테스의 체로 목표수의 sqrt보다 작은 소수들을 구한다.
2. 소수 목록 중 큰수부터 목표수와 %==0이 되는 소수를 구한다.
* ArrayList를 이용해 구하기
*/

public class Problem3 {
    public static void main(String[] args) {
        long targetNum = 600_851_475_143L;
        //long t1 = 13195L;
        getFactor(targetNum);

    }

    //구글 참고했지만 이해를 못해서 하나씩 나오는 수로 소인수분해 하려고 했는데 의외로 답이 구해짐. 4시간 동안...
    static void getFactor(long targetNum) {
        long k = targetNum;

        for (long i = 2; i < k; i++) {
            if (k % i == 0) {
                System.out.print("k%i :::   " + k + "  %  " + i);
                k /= i;
                System.out.printf(" = %d%n", k);
            }
        }
    }

//실패
  /*  static int biggestFactor(long divisor, long targetNum) {
        long tNum = targetNum;
        long divNum = divisor;
        int nFactor = 0;

        for (long i = divNum; i >= 2; i--) {
            System.out.println(i);
            if (targetNum % i == 0) {
                for (long j = i / 2; j >= 2; j--) {
                    System.out.println(j);
                    if (i % j == 0) break;
                }
                nFactor = i;
            } else {
                continue;
            }
        }
        System.out.println("result of operation : " + nFactor);

        return nFactor;
    }


//에라토스테네스의 체 실패. ArrayList에 Long이 안들어감
    static ArrayList findPrimeNum(long range) {
        //int nSqrt = (int) Math.sqrt(range);

        ArrayList pList = new ArrayList<Boolean>();

        for (int i = 0; i * i < range; i++) {
            pList.add(i, true);
        }
        System.out.println(pList);

        for (int i = 2; i * i < pList.size(); i++) {
            for (int j = i + i; i * i < pList.size(); j += i) {
                pList.set(j, false);
            }
        }

        return pList;
    }*/

}
