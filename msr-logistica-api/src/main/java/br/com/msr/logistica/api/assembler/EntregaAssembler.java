package br.com.msr.logistica.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.msr.logistica.api.model.dto.EntregaDTO;
import br.com.msr.logistica.api.model.form.EntregaForm;
import br.com.msr.logistica.domain.model.Entrega;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EntregaAssembler {
	
	private ModelMapper modelMapper;
	
	public EntregaDTO toModel(Entrega  entrega) {
		return modelMapper.map(entrega, EntregaDTO.class);
	}
	
	public List<EntregaDTO> toCollectionModel (List<Entrega> entregas){
		return entregas.stream().map(this::toModel).collect(Collectors.toList());
	}
	
	public Entrega toEntity(EntregaForm entregaForm) {
		return modelMapper.map(entregaForm,Entrega.class);
		
	}

}
