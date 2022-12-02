package co.unicauca.parcialasaeindie.repository;

import co.unicauca.parcialasaeindie.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer> {
}
