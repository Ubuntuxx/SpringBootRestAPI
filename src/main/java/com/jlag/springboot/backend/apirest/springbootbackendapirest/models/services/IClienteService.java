package com.jlag.springboot.backend.apirest.springbootbackendapirest.models.services;

import com.jlag.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
