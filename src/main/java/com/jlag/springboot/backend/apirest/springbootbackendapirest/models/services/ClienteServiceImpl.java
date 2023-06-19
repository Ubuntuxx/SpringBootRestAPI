package com.jlag.springboot.backend.apirest.springbootbackendapirest.models.services;

import com.jlag.springboot.backend.apirest.springbootbackendapirest.models.dao.IClienteDao;
import com.jlag.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
}
