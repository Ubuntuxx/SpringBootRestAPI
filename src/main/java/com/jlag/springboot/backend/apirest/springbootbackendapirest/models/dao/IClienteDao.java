package com.jlag.springboot.backend.apirest.springbootbackendapirest.models.dao;

import com.jlag.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
