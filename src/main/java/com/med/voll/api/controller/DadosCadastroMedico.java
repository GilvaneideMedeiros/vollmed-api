package com.med.voll.api.controller;

import com.med.voll.api.endereco.DadosEndereco;
import com.med.voll.api.medico.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {

}
