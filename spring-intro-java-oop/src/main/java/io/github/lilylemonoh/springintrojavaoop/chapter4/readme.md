# 04 자바가 확장한 객체 지향

## 01 abstract 키워드 - 추상 메서드와 추상 클래스
* 추상 메서드 : 선언부만 존재하는 메서드
* 상위 타입의 인스턴스를 만들지 못하게 하면서 하위 타입에 구현을 강제함

## 02 생성자
* 객체 생성자 메서드
* 클래스를 만들고 아무런 생성자를 만들지 않으면 자바 컴파일러가 기본 생성자를 만들어 준다.
* 필요하다면 인자를 갖는 생성자를 더 만들 수 있다.
* 인자가 있는 생성자를 하나라도 만든다면 자바 컴파일러는 기본 생성자를 만들어주지 않는다.

## 03 클래스 생성 시의 실행 블록, static 블록
* 클래스가 스태틱 영역에 배치될 때 실행되는 코드 블록이 static 블록이다.
```java
public class 동물 {
    static {
        System.out.println("동물 클래스 레디 온!");
    }
}
```
* 동물 객체를 생성하는 메인 메서드를 실행하면 콘솔창에서 메시지를 확인할 수 있다.
* 동물 클래스의 인스턴스를 여러 개 만들어도 동물 클래스의 static 블록은 단 한 번만 실행된다.

* 클래스 정보는 해당 클래스가 코드에서 맨 처음 사용될 때 T 메모리의 스태틱 영역에 로딩되며, 
* 이때 단 한번 해당 클래스의 static 블록이 실행된다.
* 프로그램이 실행될 때 바로 클래스들의 정보를 static 영역에 로딩하지 않는 이유는 메모리 사용을 최대한 늦추기 위해서다.

## 04 final 키워드

### final과 클래스
클래스에 final이 붙으면 상속 불가

### final과 변수
변수에 final이 붙으면 변경 불가능한 상수(최초 한 번만 초기화)

### final과 메서드
메서드가 final이면 오버라이딩 불가

## 05 instance 연산자
만들어진 객체가 특정 클래스의 인스턴스인지 물어보는 연산자

## 06 package 키워드
네임스페이스(이름공간)을 만들어주는 역할

## 07 interface 키워드와 implements 키워드
* 인터페이스는 public 추상 메서드와 public 정적 상수만 가질 수 있다.
* 메서드에 public, abstract, 속성에 public, static, final을 붙이지 않아도 자동으로 자바가 알아서 붙여준다.
* 자바 8부터는 디폴트 메서드라고 하는 객체 구상 메서드와 정적 추상 메서드를 지원한다.

## 08 this 키워드
객체가 자기 자신을 지칭할 때 쓰는 키워드다.
* 지역변수와 속성(객체 변수, 정적 변수)의 이름이 같은 경우 지역 변수가 우선한다.
* 객체 변수와 이름이 같은 지역변수가 있는 경우 객체 변수를 사용하려면 this 사용
* 정적 변수와 이름이 같은 지역변수가 있는 경우 클래스명을 접두사로 사용

## 09 super 키워드
* 단일 상속만을 지원하는 자바에서 super는 바로 위 상위 클래스의 인스턴스를 지칭
* super.super 형태로 상위의 상위 클래스의 인스턴스에는 접근 불가

## 10 예비 고수를 위한 한마디
* 객체 메서드를 호출할 때 스택 정보를 보면 객체명.객체메서드명()이 아닌 클래스명.객체 메서드명()임을 확인할 수 있다.
* JVM은 지능적으로 객체 멤버 메서드를 스태틱 영역에 단 하나만 보유한다.
* 그리고 눈에 보이지는 않지만 메서드를 호출할 때 객체 자신을 나타내는 this 객체 참조 변수를 넘긴다.

## 11 정리 - 자바 키워드와 OOP 확장
* 객체 지향 확장 지원 키워드 : abstract, enum, final, implements, instanceof, interface, super, this
