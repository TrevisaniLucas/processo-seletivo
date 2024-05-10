import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class candidatura {
    
        

    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de n°" + (indice+1) + "é" + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi" + candidato);
        }
    }

    static void selecaoCandidatos() {
         
        // Array com a lista de candidatos

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
   
        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salário" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "Foi selecionada para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        
        }

        
    } 
    
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;

        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
            
        }while(continuarTentando && tentativasRealizadas<3);
    }

        //método auxiliar
        static boolean atender() {
            return new Random().nextInt(3)==1;	
        }
        
    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}


    
    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
         else {
            System.out.println("Aguardar demais candidatos");
         }

            
        
            
        
    }
}
