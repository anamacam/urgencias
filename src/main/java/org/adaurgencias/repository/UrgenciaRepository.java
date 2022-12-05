package org.adaurgencias.repository;

import org.adaurgencias.entity.Urgencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrgenciaRepository extends JpaRepository<Urgencia, Integer> {
}
