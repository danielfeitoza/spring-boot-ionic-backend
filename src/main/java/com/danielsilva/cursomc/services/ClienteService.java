package com.danielsilva.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielsilva.cursomc.domain.Cliente;
import com.danielsilva.cursomc.repositories.ClienteRepository;
import com.danielsilva.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id" + id + ", Tipo: " + Cliente.class.getName() );
		}
		
		return obj;
	}
}
