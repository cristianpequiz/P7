
package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.TareaDao;
import com.example.entididades.Tareas;
import java.time.LocalDate;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TareaServicioImp implements TareaServicio{

    @Autowired
    public TareaDao tareaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Tareas> listaDeTareas() {
        return (List<Tareas>) tareaDao.findByOrderByTituloAsc();
    }

    @Override
    @Transactional
    public void guardar(Tareas tareas) {
        tareaDao.save(tareas);
    }

    @Override
    public void borrar(Tareas tareas) {
        tareaDao.delete(tareas);
    }

    @Override
    public List<Tareas> prioridades(String a) {
        return (List<Tareas>) tareaDao.findByPrioridadOrderByTituloAsc(a);
    }

    @Override
    public Tareas id_tarea(Tareas tareas) {
        return tareaDao.findById(tareas.getId_tareas()).orElse(null);
    } 

    @Override
    public List<Tareas> fechaActual(Tareas tarea, LocalDate fechaActual) {
        return (List<Tareas>) tareaDao.findByFechaLimite(fechaActual);
    }

    

   
    
    
}