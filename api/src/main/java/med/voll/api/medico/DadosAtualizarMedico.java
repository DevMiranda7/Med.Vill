package med.voll.api.medico;


import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.NotNull;

import med.voll.api.endereco.DadosEndereco;


public record DadosAtualizarMedico(
        @NotNull
        Long id,

        String nome,

        @Email
        String email,

        String telefone,

        DadosEndereco endereco
) {
}
