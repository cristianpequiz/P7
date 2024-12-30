"GDT" es una plicación web desarrollada con SpringBoot en NetBeans
que actúa como gestor de tareas, la pagina al inicio muestra 3 tablas
de html, a medida que se añadan tareas se estarán llenando. La 
aplicación utiliza HTML para la interfaz de usuario y se conecta 
a una base de datos relacional mediante JPA (MySQL)

Base de datos:

1ra tabla tareas:
atributos

id_tareas INT NOT NULL PRIMARY KEY AUTO_INCREMENT

titulo VARCHAR<15> NOT NULL

notas longtext
 
prioridad TINYINT<1>

fecha_limite DATE

