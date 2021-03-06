package br.com.msr.logistica.domain.service;

import org.springframework.stereotype.Service;

import br.com.msr.logistica.domain.exception.EntidadeNaoEncontradaException;
import br.com.msr.logistica.domain.exception.NegocioException;
import br.com.msr.logistica.domain.model.Entrega;
import br.com.msr.logistica.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar (Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}

}
