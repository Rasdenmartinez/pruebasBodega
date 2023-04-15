package com.Bodega.service;

import com.Bodega.entity.Persona;
import com.Bodega.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public Optional<Persona> getPersona(Integer id){
        return personaRepository.findById(id);
    }

    public List<Persona> getPersonas(){
        return personaRepository.findAll();
    }

    public Persona insertarPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public void eliminar(Integer id){
        personaRepository.deleteById(id);
    }

    public Persona actualizar(Persona persona){
        return personaRepository.save(persona);
    }



}
