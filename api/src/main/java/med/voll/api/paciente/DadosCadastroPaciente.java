package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String idade, String altura, String peso, PlanoDeSaude planoDeSaude, DadosEndereco dadosEndereco, String sintomas) {
}
