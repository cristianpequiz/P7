
package com.example.entididades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.sql.Date;
import lombok.Data;

@Data    //nos ahorramos hacer los getters and setters
@Entity    //para señalar que esta clase es una entidad
@Table(name="tareas")   //marcamos la tabla que se utilizara
public class Tareas implements Serializable{    //implementammos Serializable  es para que la clase se pueda serializar y deserializar, lo que puede ser útil y en varias situaciones, como almacenar objetos en caché ditribuida o en una base de datos utilizando frameworks de mapeo objeto-racional
      
    private static final long serialVersionUID=1L;    //Ese un numero de versión único asociado a cada clase serializable. Se utiliza para indentificar la versión de la clase cuando se serializa un objeto. Cuando se desearilza un objeto, se berifica si el serialVersionUID del Objeto coincide con el serialVersionUID de la clase en el momento de la deserialización
    
    
    @Id    // para marcar el id en la entidad
    @GeneratedValue(strategy=GenerationType.IDENTITY)   //en esta linea esperamos que creé un id distinto ala hora de agregar y actualizar la base de datos
    private Long id_tareas;
    
    @NotEmpty  
    private String titulo;

    @NotEmpty
    private String prioridad;
    
    private String notas;
    
    @Column(name = "fecha_limite")
    private Date fechaLimite;
}


