package ch04;

import java.util.Scanner;

public class ExtendedSwitchExam3 {

   public static void main(String[] args) {
      // return을 이용해서 계산기를 만들어보자.
      // 1.더하기, 2.빼기, 3.곱하기, 4.나누기, 5. 나머지
      // static int plus(int x, int y)
      // int z =0;
      // z=x+y;
      // return z;
      boolean run = true; // while문을 작동시키기 위한 코드
      int x = 0; // 키보드로 입력받을 정수 1
      int y = 0; // 키보드로 입력받을 정수 2
      int z = 0; // 계산 값
      int z1 = 0; // 나머지 값
      Scanner input = new Scanner(System.in);
      
      System.out.println("  이 계산기는 정수만 입력이 가능하며, 소수점 아래자리는 표기되지 않습니다. ");
      while (run) { // run = true 이면 계속 작동,
         System.out.println("===========================================================");
         System.out.println("1.더하기            2. 빼기");
         System.out.println("3.곱하기            4. 나누기(나머지포함)");
         System.out.println("5.계산기 종료.");
         System.out.println("번호를 입력하세요(1~5) : >>>");
         int num = input.nextInt(); // 키보드로 메뉴의 번호를 입력받음.

         switch (num) { // 입력받은 숫자에 따라 실행.

         case 1:
            System.out.println("더할 두 정수를 입력해주세요. : ");
            x = input.nextInt();  
            y = input.nextInt(); 
            z = plus(x, y); // plus메서드를 호출
            System.out.printf("%d + %d = %d 입니다. \n", x, y, z); // plus메서드에서 처리 한다음 메인 메서드에서 출력.
            break ;

         case 2:
            System.out.println("뺄 두 정수를 입력해주세요 : ");
            x = input.nextInt();
            y = input.nextInt();
            z = minus(x, y); // minus 메서드를 호출
            System.out.printf("%d - %d = %d 입니다. \n", x, y, z);
            break ;
            
         case 3:
            System.out.println("곱할 두 정수를 입력해주세요 : ");
            x = input.nextInt();
            y = input.nextInt();
            z = multi(x, y); // 곱하기 메서드를 호출
            System.out.printf("%d X %d = %d 입니다. \n", x, y, z);
            break ;
            
         case 4:
            System.out.println("두 정수를 나눈 값의 몫과 나머지를 구하는 계산기 입니다.");
            System.out.println("나눌 두 정수를 입력해주세요 : ");
            x = input.nextInt();
            y = input.nextInt();
            z = devide(x, y); // 나누기 메서드 호출
            z1 = rem(x, y); // 나머지 구하는 메서드 호출 
            System.out.printf("%d와 %d를 나눈 값의 몫은 = %d 이며, 나머지는 %d입니다. ", x, y, z, z1);
            break ;
            
         case 5:
            System.out.println("계산기를 종료합니다. ");
            run = false ; // run을 false 변경하여 while문 종료
            break;
            
         default :
            System.out.println("번호를 다시 입력해주세요.");
               

         } // switch문 종료

      } // while문 종료

   } // 메인 메서드 종료

   static int plus(int x, int y) { // x + y = z

      int z = 0;
      z = x + y;
      return z;

   } // plus 메서드 종료

   static int minus(int x, int y) { // x - y = z

      int z = 0;
      z = x - y;
      return z;

   } // minus 메서드 종료

   static int multi(int x, int y) { // x * y = z

      int z = 0;
      z = x * y;
      return z;

   } // 곱하기 메서드 종료

   static int devide(int x, int y) { // x / y = z

      int z = 0;
      z = x / y;
      return z;

   } // 나누기 메서드 종료

   static int rem(int x, int y) { // x % y = z1

      int z1 = 0;
      z1 = x % y;
      return z1;

   } // 나머지 메서드 종료

} // class 메서드 종료
