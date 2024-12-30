
package com.example.services;

import com.example.entididades.Tareas;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


public interface TareaServicio {    
    
    //Para manejar los datos
    public List<Tareas> listaDeTareas();
    
    //Para guardar datos
    public void guardar(Tareas tarea);
    
    //Para borrar datos
    public void borrar(Tareas tareas);
    
    //Para traer por prioridad
    public List<Tareas> prioridades(String a);
    
    //Para devolver una tarea por su id
    public Tareas id_tarea(Tareas tareas);
    
    //
    public List<Tareas> fechaActual(Tareas tarea,LocalDate fechaActual);
}
