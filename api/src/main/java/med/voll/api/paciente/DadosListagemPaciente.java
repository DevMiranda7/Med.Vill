package med.voll.api.paciente;

public record DadosListagemPaciente(Long id, boolean ativo, String nome, String idade, String altura, String peso, String sintomas, PlanoDeSaude planoDeSaude) {


    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getId(),paciente.getAtivo(),paciente.getNome(), paciente.getIdade(), paciente.getAltura(), paciente.getPeso(), paciente.getSintomas(),paciente.getPlanoDeSaude());
    }


}
