package br.com.msr.logistica.api.model.form;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteIdForm {
	
	@NotNull
	private Long id;

}
