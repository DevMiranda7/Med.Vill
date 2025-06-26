package med.voll.api.paciente;

public record DadosListagemPaciente(String nome, String idade, String altura, String peso, String sintomas) {


    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getIdade(), paciente.getAltura(), paciente.getPeso(), paciente.getSintomas());
    }


}
