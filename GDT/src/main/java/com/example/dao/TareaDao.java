  
package com.example.dao;


import com.example.entididades.Tareas;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface TareaDao extends CrudRepository<Tareas,Long> {
    public List<Tareas> findByPrioridadOrderByTituloAsc(String prioridad);
    public List<Tareas> findByOrderByTituloAsc();
    public List<Tareas> findByFechaLimite(LocalDate fechaLimite);
}