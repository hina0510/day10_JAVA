package dto;

/*
	컨트롤러 역할을 하며 데이터에 직접 접근하지ㅣ 않ㄴ는다
	데이터에 접근하고자 하는 경우 TestClass를 통해 접근
	TestClass는 Service를 담당하고 Service는 연산담당 
 */
public class MainClass02 {
public static void main(String[] args) {
	TestClass02 t = new TestClass02();
	t.display();
	
}
}
