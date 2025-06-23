package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        String idade,
        @NotNull
        String altura,
        @NotNull
        String peso,
        @NotNull
        PlanoDeSaude planoDeSaude,

        @NotNull @Valid DadosEndereco endereco,
        @NotBlank String sintomas) {
}
