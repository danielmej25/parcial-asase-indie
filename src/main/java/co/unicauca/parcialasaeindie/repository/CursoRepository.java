package co.unicauca.parcialasaeindie.repository;

import co.unicauca.parcialasaeindie.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
