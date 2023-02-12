package Pacote02;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        /*c1.setModelo("BIC");
        c1.setPonta(0.5f);
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());*/
        c1.status();
        Caneta c2 = new Caneta("kkk", "Laranja", 1.5f);
        c2.status();
    }
}
