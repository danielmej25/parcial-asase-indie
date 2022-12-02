package co.unicauca.parcialasaeindie.repository;

import co.unicauca.parcialasaeindie.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
