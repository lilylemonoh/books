package io.github.lilylemonoh.springintrojavaoop.chapter3.inheritance03;

public class Penguin extends Animal {
    public String habitat;

    public void showHabitat(){
        System.out.printf("%s는 %s에 살아\n", name, habitat);
    }
}
