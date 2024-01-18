package med.voll.api.dto.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.dto.endereco.DadosEndereco;

public record DadosCadastroMedico(@NotNull @NotBlank String nome,
                                  @NotBlank
                                @Email String email,
                                  @NotBlank
                                @Pattern(regexp = "\\d{4,6}")
                                String crm,

                                  @NotBlank
                                String telefone,

                                  @NotNull
                                Especialidade especialidade,
                                  @NotNull
                                @Valid
                                DadosEndereco endereco) {
}
