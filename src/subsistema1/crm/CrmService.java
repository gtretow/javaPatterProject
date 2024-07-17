package subsistema1.crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado) {
        System.out.println("Cliente salvo com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Estado: " + estado);
    }
}
