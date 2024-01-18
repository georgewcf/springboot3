package med.voll.api.dto.medico;

import med.voll.api.model.Medico;

public record DadosMedicos(String nome, String email, String crm, Especialidade especialidade) {

    public DadosMedicos (Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
