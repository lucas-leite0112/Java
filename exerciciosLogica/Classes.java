public class Classes {
    public static void main(String[] args){
        Carro carro1 = new Carro("corsa");
        carro1.acelerar();

    }

    static class Carro{
        String modelo;
        public Carro(String modelo){
            this.modelo = modelo;
        }
        public String acelerar(){
            System.out.println("Acelerando o "+this.modelo+"...");
            return "oi";
        }
    }
}
