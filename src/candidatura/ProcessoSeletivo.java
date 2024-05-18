package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    static List<String> selecionados = new ArrayList<>();
    static int candidatosSelecionados = 0;
    public static void main(String[] args) {
        System.out.println("PROCESSO SELETIVO");
        selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        System.out.println("Imprimindo a lista de candidatos selecionados: ");
        for(String candidato: selecionados){
            System.out.println("Candidato selecionado: " + candidato);
        }
    }

    static void selecaoCandidatos(){
        //Array com a lista de candidatos
        String [] candidatos = {"SAMUEL", "RICARDO", "VICTOR", "MARIA", "FERNANDA", "INGRID", "MIGUEL", "NICOLE", "ROBERTA", "KAMILE"};

        int candidatoAtual = 0;

        double salarioBase=2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário R$" + salarioPretendido);
            if(salarioPretendido <= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                selecionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    //Método que simula o valor pretendido
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADOS DOS DEMAIS CANDIDATOS");
        }
    }
}

