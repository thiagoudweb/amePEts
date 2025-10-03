package com.amepets.demo.service;

import com.amepets.demo.model.adotanteEntity;
import com.amepets.demo.repository.AdotanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AdotanteService {

    @Autowired
    private AdotanteRepository adotanteRepository;

    public List<adotanteEntity> findAll() {
        return adotanteRepository.findAll();
    }

    public Optional<adotanteEntity> findById(Long id) {
        return adotanteRepository.findById(id);
    }

    public Optional<adotanteEntity> findByEmail(String email) {
        return adotanteRepository.findByEmail(email);
    }

    public adotanteEntity save(adotanteEntity adotante) {
        return adotanteRepository.save(adotante);
    }

    public void deleteById(Long id) {
        adotanteRepository.deleteById(id);
    }
}
