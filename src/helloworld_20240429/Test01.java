/*
 연습으로 만든 자바파일
 2024-04-29
 만든이 : 홍길동
 */


package helloworld_20240429;

public class Test01 {

	public static void main(String[] args) {
		 
        // 정수 변수 x를 선언
		int X; // 메모리(ram)에 4byte 공간이 하나 생성됨-> 이름이 x 로
       X = 10; // 위에서 선언한 정수 변수 x에 정수값 10이 저장됨-> x의 초기값은
       int y = 10;
       int z;
       
       // int x, y, z; // 한번에 3개의 정수변수를 선언
       
       // int x; // 이미 선언한 변수를 다시 선언하는 것은 불가
       X = 100;
       int a = 100; // 정수 변수a를 선언과 동시에 100으로 초기화 10이다-> x를 초기화햇다
       
       z = a + y;
       
       System.out.println("저의 수학 점수는" + a + "점 입니다!");
       
	}

}
