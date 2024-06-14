public class array {
    public static void main(String[] args) {
        int[] numeros = {9,10,12,25,2};
        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;
        
        for(int i =0; i<numeros.length; i++){
            if(numeros[i]>maior){
                maior = numeros[i];
            }
            if(numeros[i]<menor){
                menor = numeros[i];
            }
            soma+=numeros[i];
        }
        System.out.println("O maior número é:"+maior);
        System.out.println("o menor é:"+menor);
        System.out.println("a média dos números é:"+soma/numeros.length);
    }
}
