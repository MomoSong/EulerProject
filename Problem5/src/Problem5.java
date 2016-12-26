/**
 * Created by johnm on 2016-12-26.
 * <p>
 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
 * 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 */

/*
1~20사이의 소수를 구한뒤 최소 공배수를 계산하고
그 최소 공배수를 2배, 3배,...n배 해나가면서 나머지수와 모드 연산이 0이되는 지금을 구해야함.

1. 1~n사이의 소수를 구한다. 에라토스테네스의 체
2. 그 소수 배열을 온전히 만든다. (군데 군데 0을 제거) (ArrayList보다는 배열을 우선 연습하기)
3. 소수들의 최소 공배수를 구한다. (그냥 곱하기)
4. 공배수가 나머지 수들과 모드 0인지 알아보고 아니라면 공배수의 2배.. 3배..n배로 다시 계산
5. 최초로 모든 수들과 모드 0이 되는 수가 답.
 */

public class Problem5 {
    public static void main(String[] args) {
        int[] foundAr = findPrimeAr(20);
        int[] primeAr = makePrimeAr(foundAr);
        int primeLCM = primeLCM(primeAr);
        long LCM = checkModop(primeLCM, 20);
        System.out.println("final LCM : " + LCM);

    }

    // 1.에라토스테네스의 체, 소수가 아닌 index는 0으로 초기화, 20칸 배열 리턴
    static int[] findPrimeAr(int rangeNum) {
        if (rangeNum <= 1) return null;

        int[] tmpAr = new int[rangeNum + 1];
        for (int i = 0; i < rangeNum + 1; i++) {
            tmpAr[i] = i;
        }

        tmpAr[1] = 0; //숫자 1은 소수가 아니므로 미리 초기화
        for (int i = 2; i * i < tmpAr.length; i++) {
            for (int j = i + i; j < tmpAr.length; j += i) {
                tmpAr[j] = 0;
            }
        }
        return tmpAr;
    }

    // 2. getPrimeAr(ar)로 부터 온 배열에 0인 부분을 제거한 후 리턴
    static int[] makePrimeAr(int[] taskAr) {
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < taskAr.length; i++) {
            if (taskAr[i] == 0) continue;
            else counter1++;
        }
        int[] primeAr = new int[counter1];

        for (int i = 0; i < taskAr.length; i++) {
            if (taskAr[i] != 0) {
                primeAr[counter2++] = taskAr[i];
            }
        }
        return primeAr;
    }

    //3. 배열안의 소수들 곱해서 소수들의 LCM 리턴
    static int primeLCM(int[] materialAr) {
        int primeLCM = 1;
        for (int i = 0; i < materialAr.length; i++) {
            primeLCM *= materialAr[i];
        }
        return primeLCM;
    }

    //4. LCM의 배수들과 나머지 수들의 Mod 연산 0이 되는 수 찾기
    static long checkModop(int LCM, int range) {
        long tmpLCM = (long) LCM;
        long timesLCM = tmpLCM;
        System.out.println("in checkModop tmpLCM : " + tmpLCM);
        int whCounter = 2;

        while (whCounter < range) {
            if (tmpLCM % whCounter != 0) {
                whCounter = 1;
                tmpLCM += timesLCM;
                System.out.println("if Count : " + whCounter + ",,, " + tmpLCM);
            } else {
                whCounter++;
                System.out.println("else Count :" + whCounter + ",,," + tmpLCM);
            }
        }
        return tmpLCM;
    }

}


