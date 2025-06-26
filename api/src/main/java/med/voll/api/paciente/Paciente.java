package med.voll.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import med.voll.api.endereco.Endereco;

@Entity(name ="paciente")
@Table(name = "pacientes")

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

public Paciente(){}


    public Paciente(DadosCadastroPaciente dados){
        this.nome = dados.nome();
        this.idade = dados.idade();
        this.altura = dados.altura();
        this.peso = dados.peso();
        this.endereco = new Endereco(dados.endereco());
        this.planoDeSaude = dados.planoDeSaude();
        this.sintomas = dados.sintomas();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}
