package br.com.msr.logistica.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msr.logistica.model.Cliente;

@RestController
public class ClienteController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/clientes")
	public List<Cliente> lista(){			
		return entityManager.createQuery("from Cliente",Cliente.class).getResultList();
	}

}
