package candidatura;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("PROCESSO SELETIVO");
        analisarCandidato(2000.20);
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
