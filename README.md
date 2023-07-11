# ORUS_prueba

Este es un repositorio de prueba para el curso de Git y GitHub de ORUS.

## Descripción

En este repositorio se encuentran los archivos y carpetas que se han creado durante el curso, así como los ejercicios propuestos.

## Instalación

Para clonar este repositorio, debes tener instalado Git en tu computadora y ejecutar el siguiente comando en la terminal:
- git clone "https://github.com/JJAR140201/ORUS_prueba"

## Uso

Puedes usar este repositorio para practicar los comandos básicos de Git y GitHub, como `git add`, `git commit`, `git push`, `git pull`, etc.

También puedes modificar los archivos y carpetas según tus preferencias y crear nuevas ramas para experimentar con diferentes versiones.

## Contribución

Si quieres contribuir a este repositorio, puedes hacer un fork y enviar un pull request con tus cambios. Asegúrate de seguir las buenas prácticas de código y documentación.

## Creacion base de datos supermercado_prueba

1). Primero de debe crear la base de datos con el script
- CREATE DATABASE supermercado_prueba;

2). Segundo debes de crear las tablas para las base de datos, las tablas son FRUTAS y PEDIDOS
- CREATE TABLE Frutas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(255),
    cantidad INT,
    precio DECIMAL(10,2),
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME
);

- CREATE TABLE Pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    lista_frutas TEXT,
    valor_total DECIMAL(10,2),
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    FOREIGN KEY (id) REFERENCES Frutas(id)
);

3). Insertamos 20 tipos diferente de frutas en la tabla FRUTAS
- INSERT INTO Frutas (tipo, cantidad, precio, fecha_creacion, fecha_actualizacion)
VALUES
('Manzana', 100, 0.5, NOW(), NOW()),
('Pera', 200, 0.6, NOW(), NOW()),
('Fresa', 150, 0.7, NOW(), NOW()),
('Plátano', 120, 0.4, NOW(), NOW()),
('Naranja', 300, 0.3, NOW(), NOW()),
('Mango', 250, 0.8, NOW(), NOW()),
('Piña', 100, 1.0, NOW(), NOW()),
('Melón', 50, 1.2, NOW(), NOW()),
('Sandía', 40, 1.5, NOW(), NOW()),
('Papaya', 60, 1.3, NOW(), NOW()),
('Ciruela', 80, 0.9, NOW(), NOW()),
('Durazno', 90, 1.1, NOW(), NOW()),
('Uva', 400, 0.2, NOW(), NOW()),
('Limón', 500, 0.1, NOW(), NOW()),
('Kiwi', 70, 1.4, NOW(), NOW()),
('Granada', 30, 2.0, NOW(), NOW()),
('Coco', 20, 2.5, NOW(), NOW()),
('Aguacate', 10, 3.0, NOW(), NOW()),
('Mandarina',350 ,0.25 ,NOW() ,NOW() ),
('Lima' ,450 ,0.15 ,NOW() ,NOW() );
