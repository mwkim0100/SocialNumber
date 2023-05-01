package SocialNumber;

import java.util.Scanner;

/*
 * 사용자에게
 * 주민번호 7자리 문자열 입력받아
 * 입력 예) 020427-3
 * 출력 예) 02년생 04월 27일 남성
 * 입력 예) 990427-2
 * 출력 예) 99년생 04월 27일 남성
 *
 *
 *
 * #올바른 형식의 주민번호인지 확인
 */
public class SocialNumber {

    public void regisNum() {
        do {
            //주민번호를 문자열로 입력받기
            Scanner scanner = new Scanner(System.in);
            System.out.println("주민번호를 입력하세요");
            String str = scanner.nextLine();
            if((str.length() == 8) && (str.charAt(6) == '-')) {
                //주민번호를 '-'을 기준으로 '-'앞은 front '-'뒤는 back으로 나누기
                String front = str.substring(0,6);
                String back = str.substring(7);
                //주민번호에서 년,월,일,성별을 정수로 구별하기
                int year = Integer.parseInt(front.substring(0,2));
                int month = Integer.parseInt(front.substring(2,4));
                int date = Integer.parseInt(front.substring(4,6));
                int gender = Integer.parseInt(back);
                if((year >= 0) && (year <=23)) {
                    if(gender == 3) {
                        System.out.println(year+"년생 "+month+"월 "+date+"일 "+"남성");
                    }
                    if(gender == 4) {
                        System.out.println(year+"년생 "+month+"월 "+date+"일 "+"여성");
                    }
                    if((gender !=4) && (gender !=3)) {
                        System.out.println("잘못된 입력입니다.");
                        continue;
                    }
                }
                if((year <=99) && (year >23)) {
                    if(gender == 1) {
                        System.out.println(year+"년생 "+month+"월 "+date+"일 "+"남성");
                    }
                    if(gender == 2) {
                        System.out.println(year+"년생 "+month+"월 "+date+"일 "+"여성");
                    }
                    if((gender !=1) && (gender !=2)) {
                        System.out.println("잘못된 입력입니다.");
                        continue;

                    }
                }
                if(year>=100) {
                    System.out.println("잘못된 입력 입니다.");
                    continue;
                }
            }else {
                System.out.println("잘못된 입력 입니다.");
                continue;
            }
        }while(true);

    }
    public static void main(String[] args) {
        SocialNumber social = new SocialNumber();
        social.regisNum();

    }
}
