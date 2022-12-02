package co.unicauca.parcialasaeindie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<DocenteRepository, Integer> {
}
