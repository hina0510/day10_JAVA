package constructor;

class TestClass01{
	// 생성자는 반환타입이 없으며 클래스 이름과 동일하게 만들어야 한다
	public TestClass01() {
		System.out.println("기본 생성자 실행");
	}
}

public class MainClass01 {
public static void main(String[] args) {
	/*
		생성자
		하나의 메소드로 특정 변수를 초기화하는 목적으로 사용한다
		객체를 만들면 자동으로 호출되는 메소드다
	 */
	TestClass01 t = new TestClass01();
	
	
	
}
}
