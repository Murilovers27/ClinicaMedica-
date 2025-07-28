package clinica.med.api.Record;

public record EnderecoEnum(String rua, String numero, String bairro, String cidade, String estado) {
    @Override
    public String toString() {
        return "EnderecoEnum{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}


