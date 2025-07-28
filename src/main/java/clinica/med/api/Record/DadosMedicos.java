package clinica.med.api.Record;

public record DadosMedicos(String nome, String cpf, String telefone,String crm, String email, EspecialidadeEnum especialidade) {
    @Override
    public String toString(){
        return "DadosMedicos{" +
        "nome=" + nome + ", " +
        "cpf=" + cpf + ", " +
        "CRM=" + crm + ", " +
        "telefone=" + telefone + ", " +
        "email=" + email + ", " +
        "especialidade=" + especialidade + 
        "}";
    }
}
