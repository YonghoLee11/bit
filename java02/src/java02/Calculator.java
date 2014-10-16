// 역할: 계산기 역할을 수행한다.
package java02;

public class Calculator {
  // 클래스 멤버만 접근 가능하도록 제한한다.
  private int result;
  
  // 단, 결과를 알 수 있도록 메서드 제공
  // 내부 변수의 값을 리턴하는 메서드는 get이라는 접두어를 붙인다.
  // => getter 메서드
  int getResult() {
    return this.result;
  }
  
  void plus(int value) {
    this.result += value;
  }
  
  static void minus(Calculator that,int value) {
	  that.result -= value;
  }
  
  static void multiple(Calculator that,int value) {
	  that.result *= value;
  }
  
  void divide(int value) {
	  this.result /= value;
  }
}