package med.voll.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import med.voll.api.endereco.Endereco;

@Entity(name ="paciente")
@Table(name = "pacientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(of = "id")

public class Paciente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String idade;

    private String altura;

    private String peso;

    @Embedded
    private Endereco endereco;

    @Enumerated(EnumType.STRING)
    private PlanoDeSaude planoDeSaude;

    private String sintomas;

    public Paciente(DadosCadastroPaciente dados){
        this.nome = dados.nome();
        this.idade = dados.idade();
        this.altura = dados.altura();
        this.peso = dados.peso();
        this.endereco = new Endereco(dados.endereco());
        this.planoDeSaude = dados.planoDeSaude();
        this.sintomas = dados.sintomas();

    }


}
