package io.github.lilylemonoh.springintrojavaoop.chapter3.reference;

public class CallByReference2 {
    public static void main(String[] args) {
        Animal ref_a = new Animal();
        Animal ref_b = ref_a;

        System.out.println("ref_a = " + ref_a); // 실행할 때마다 다르다.
        System.out.println("ref_b = " + ref_b); // 바로 위와 같은 값이 출력된다.
    }
}
