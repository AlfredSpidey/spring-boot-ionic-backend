package com.alfredo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredo.cursomc.domain.Pedido;
import com.alfredo.cursomc.repositories.PedidoRepository;
import com.alfredo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
