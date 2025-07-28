package clinica.med.api.Record;

public record DadosPacientes(String nome, String cpf, String telefone, String email) {
    @Override
    public String toString(){
        return "DadosMedicos{" +
        "nome=" + nome + ", " +
        "cpf=" + cpf + ", " +
        "telefone=" + telefone + ", " +
        "email=" + email + ", " +
        "}";
    }

}
