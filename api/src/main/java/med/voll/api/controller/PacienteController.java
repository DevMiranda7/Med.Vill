package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.paciente.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){
        pacienteRepository.save(new Paciente(dados));

    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = {"nome","idade"}) Pageable paginacao ){
        return pacienteRepository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);

    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarPaciente dadosAtualizarPaciente){
        Paciente paciente = pacienteRepository.getReferenceById(dadosAtualizarPaciente.id());
        paciente.atualizarPaciente(dadosAtualizarPaciente);
    }

    @DeleteMapping("/{idPaciente}")
    @Transactional
    public void excluir(@PathVariable Long idPaciente){
        Paciente paciente = pacienteRepository.getReferenceById(idPaciente);
        paciente.excluirPaciente();
    }

}
