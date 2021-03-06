/* 캡슐화(encapsulation)?
 - 클래스를 정의한 의도와 다르게 변수나 메서드를 사용할 경우
   오류가 발생하게 된다
   1) 변수에 무효한 값을 넣는다거나,
   2) 내부에서 호출할 메서드를 외부에서 직접 호출한다거나,
   등
 - => 클래스 작성자가 의도한 대로만 사용하도록 접근을 제한하는 문법.
 - => 최소한의 안전장치!
 - 문법:
   [접근 제어자(access modifier)] 타입 변수명;
   [접근 제어자(access modifier)] 리턴타입 메서드명(...){...}
 - 접근제어자:
   1) private => 클래스 멤버만 접근 가능
   2) protected => 같은 패키지의 클래스에 접근 가능. 자식 클래스 접근 가능.
   3) (default) => 같은 패키지의 클래스만 접근 가능.
   4) public => 모두 접근 가능
 */
package java02;

import java.util.Scanner;

// 주제: Calculator의 기능을 이용하여 다음 계산을 수행하라!
//  단, 계산은 순차적으로 실행하라.(즉, 연산자 우선순위 적용하지 말라!)
// 10 + 2 * 7 - 4 / 2 = ? 

// 단계6: result 변수의 외부 접근 차단 => 캡슐화  
public class test01 {
  
  public static void main(String[] args) {
    //10 + 2 * 7 - 4 / 2 = ? 
    // 클래스 변수나 인스턴스 변수는 자동 초기화 된다.
    // 따라서 다음과 같이 별도로 초기화 할 필요는 없다.
    //Calculator.result = 0; 
	  
	 Calculator c1 = new Calculator(); 
    
    c1.plus(10); 
    
    System.out.println("결과는 = " + c1.getResult());
  }

}