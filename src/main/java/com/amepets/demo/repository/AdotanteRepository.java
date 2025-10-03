package com.amepets.demo.repository;

import com.amepets.demo.model.adotanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AdotanteRepository extends JpaRepository<adotanteEntity, Long> {
    Optional<adotanteEntity> findByEmail(String email);
    Optional<adotanteEntity> findByCpf(String cpf);
    Optional<adotanteEntity> findByTelefone(String telefone);
}
