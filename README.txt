"GDT" es una plicaci�n web desarrollada con SpringBoot en NetBeans
que act�a como gestor de tareas, la pagina al inicio muestra 3 tablas
de html, a medida que se a�adan tareas se estar�n llenando. La 
aplicaci�n utiliza HTML para la interfaz de usuario y se conecta 
a una base de datos relacional mediante JPA (MySQL)

Base de datos:

1ra tabla tareas:
atributos

id_tareas INT NOT NULL PRIMARY KEY AUTO_INCREMENT

titulo VARCHAR<15> NOT NULL

notas longtext
 
prioridad TINYINT<1>

fecha_limite DATE

