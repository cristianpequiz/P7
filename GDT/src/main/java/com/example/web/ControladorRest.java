  
package com.example.web;

import com.example.entididades.Tareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.services.TareaServicio;
import java.time.LocalDate;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ControladorRest {
    
    //Hacemos la inyección de dependencia
    @Autowired
    private TareaServicio tareaServicio;
    
    //Metodo para iniciar en el menu
    @GetMapping("/")
    public String menu(Model model, Tareas tarea){
        List<Tareas> tareas = tareaServicio.listaDeTareas();
        model.addAttribute("tareas",tareas);
        
        List<Tareas> tareasP = tareaServicio.prioridades("1");
        model.addAttribute("tareasP",tareasP);
        
        LocalDate fechaActual = LocalDate.now();
        List<Tareas> tareasH = tareaServicio.fechaActual(tarea, fechaActual);
        model.addAttribute("tareasH",tareasH);
    return "menu";
    }
    
    //Metodo para dirigirse a una pagina que agregara tareas
    @GetMapping("/agregar")
    public String agregar(Tareas tareas){
    return "pag1";
    }
     
    //Metodo para guardar un dato o guardar el cambio de un dato
    @PostMapping("/salvar")
    public String salvar(Tareas tareas){
    tareaServicio.guardar(tareas);
    return "redirect:/";
    }
    
    //Metodo para volver al menu
    @GetMapping("/volver")
    public String volver(){
    return "redirect:/";
    }
    
    //Metodo para borrar tareas desde el menu
    @GetMapping("/borrar")
    public String borrar(Tareas tareas){
    tareaServicio.borrar(tareas);
    return "redirect:/";
    }
    
    //Metodo para ver mas informacion de la tarea agregada
    @GetMapping("verT")
    public String verT(Model model,Tareas tareas){
        Tareas tarea=tareaServicio.id_tarea(tareas);
        model.addAttribute("tarea",tarea);
    return "verT";
    }
    
    //Metodo para borrar prioridad
    @GetMapping("/borrarP")
    public String borrarP(Tareas tareas){
        tareaServicio.borrar(tareas);
    return "redirect:/";
    }
    
    //Metodo para ver mas informacion de la tarea prioridad agregada
    @GetMapping("verTP")
    public String verTP(Model model,Tareas tareas){
        Tareas tarea=tareaServicio.id_tarea(tareas);
        model.addAttribute("tarea",tarea);
    return "verT"; 
    }
}