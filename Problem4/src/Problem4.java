/**
 * Created by johnm on 2016-12-20.
 *
 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
 *
 * 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
 *
 * 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
 *
 *
 */

// 숫자 m을 String으로 변환후 if 구문에서 조건을 줄일 수가 없어서 하드코딩.....

public class Problem4 {
    public static void main(String[] args){
        int m = 0;
        String s;
        boolean check = false;

        bbong : for(int i=999; i>=800; i--){
            for(int j=999; j>=800; j--){
                m = i*j;
                s = Integer.toString(m);

                if(s.charAt(0)==s.charAt(5) && s.charAt(1)==s.charAt(4) && s.charAt(2)==s.charAt(3)){
                    System.out.println(m +", "+ i +", "+ j);
                    break bbong;
                }






            }
        }
    }
}
