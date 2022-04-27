package aula;

public class ImprimeIdade {

    public static void main(String[] args) {
        int idade = 40;
        String nome = "Alexandre";
        double altura = 1.83;        
        double peso = 50.25;
        double imc = (peso)/(altura * altura);

        if(idade >= 40) {
            
            if(imc < 22) {
                System.out.println(nome+" Seu IMC: "+imc+"fique atento com sua alimentação, você está subnutrido");
            }
            else if(imc > 22 && imc <= 30) {
                System.out.println(nome+" Seu IMC: "+imc+" Seu peso está Normal!");
            }            
            else if(imc > 30 ) {
                System.out.println(nome+" Seu IMC é: "+imc+ " Você está com Obesidade");
            }              
        }       
        else{
            System.out.println(nome+" Seu IMC é: "+imc+ " Você está com Obesidade");
        }
        
    }
}
