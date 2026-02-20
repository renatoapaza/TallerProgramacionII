# Guía Rápida de Git y GitHub

## Objetivo de la clase

- Entender qué es Git
- Crear un repositorio
- Realizar commits
- Subir cambios a GitHub

## ¿Qué es Git?

Git es un sistema de control de versiones que permite guardar el historial de cambios de un proyecto.

Con Git podemos:
- Registrar cambios
- Volver a versiones anteriores
- Trabajar de forma profesional

## ¿Qué es GitHub?

GitHub es una plataforma en línea que permite:

- Almacenar repositorios Git en la nube
- Compartir código
- Entregar tareas
- Gestionar proyectos
- Colaborar en equipo

## Instalación

### Instalar Git
Descargar desde:
https://git-scm.com/

### Verificar instalación

```bash
git --version
```
### Configuración inicial (solo una vez)
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu_correo@ejemplo.com"
```

## Flujo Básico de Trabajo

### 1. Clonar repositorio
```bash
git clone https://github.com/usuario/repositorio.git
```

### 2. Ver estado del proyecto
```bash
git status
```
### 3. Agregar cambios
```bash
git add .
```
Agregar archivo específico:

```bash
git add README.md
```

### 4. Crear un commit
```bash
git commit -m "Descripción clara del cambio realizado"
```
Ejemplo:
```bash
git commit -m "Se agrega Archivo de información del proyecto"
```

### 5. Subir cambios a GitHub
```bash
git push origin main
```



## Buenas Prácticas de Commit
- Escribir mensajes claros
- Un commit por cambio lógico
- No subir código que no compile
- No subir archivos innecesarios

## Estructura Recomendada del Repositorio

```bash
/Taller-Programacion-II
│
├── /Practica1
├── /Practica2
├── /Parcial1
├── /ProyectoFinal
└── README.md
```
