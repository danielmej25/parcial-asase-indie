package co.unicauca.parcialasaeindie.repository;

import co.unicauca.parcialasaeindie.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer> {
}
