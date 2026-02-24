# Prácticas de Programación en Java

Este repositorio contiene una serie de ejercicios prácticos diseñados para aprender los fundamentos de la programación en Java, desde el manejo de variables hasta estructuras de control de flujo.

---

## 🔷 Parte 1 — Variables, Lectura de Datos y Condicionales

> **Conceptos que se aplican:** tipos de datos, declaración de variables, lectura por teclado (`Scanner`), estructuras `if`, `if-else` y condicionales múltiples.

---

### Ejercicio 1 — 🎬 Cine Municipal

**Enunciado**

Un cine local desea automatizar la venta de entradas. El sistema debe solicitar la **edad del cliente** y mostrar por pantalla la **categoría** y el **precio de la entrada** según la siguiente clasificación:

| Categoría     | Rango de edad     | Precio    |
|---------------|-------------------|-----------|
| Niño          | De 3 a 10 años    | Bs. 15    |
| Joven         | De 11 a 17 años   | Bs. 20    |
| Adulto        | De 18 a 59 años   | Bs. 25    |
| Adulto mayor  | 60 años o más     | Bs. 12    |

**El programa debe mostrar:**
- La categoría del cliente
- El monto a pagar

**Ejemplo de ejecución:**
```
Ingrese la edad del cliente: 65
Categoría: Adulto mayor
Precio de la entrada: Bs. 12
```

---

### Ejercicio 2 — 💪 Gimnasio FitLife

**Enunciado**

Un gimnasio ofrece distintos planes según el **turno** que el cliente desea asistir. El sistema debe solicitar el número de turno y mostrar el nombre del plan, el horario y el precio mensual:

| Opción | Plan        | Horario          | Precio mensual |
|--------|-------------|------------------|----------------|
| 1      | Matutino    | 06:00 a 09:00    | Bs. 120        |
| 2      | Mediodía    | 12:00 a 14:00    | Bs. 100        |
| 3      | Vespertino  | 17:00 a 19:00    | Bs. 130        |
| 4      | Nocturno    | 20:00 a 22:00    | Bs. 90         |

Si el número ingresado no corresponde a ningún turno, el sistema debe indicar que la opción no es válida.

**Ejemplo de ejecución:**
```
Ingrese el número de turno (1-4): 3
Plan: Vespertino
Horario: 17:00 a 19:00
Precio mensual: Bs. 130
```

---

### Ejercicio 3 — 💊 Farmacia San Juan

**Enunciado**

Una farmacia aplica descuentos en la compra de medicamentos según el **monto total** de la compra. El sistema debe solicitar el monto ingresado por el cliente y mostrar el descuento aplicado y el total final a pagar:

| Monto de compra         | Descuento |
|-------------------------|-----------|
| Menos de Bs. 50         | Sin descuento |
| De Bs. 50 a Bs. 99      | 5%        |
| De Bs. 100 a Bs. 199    | 10%       |
| Bs. 200 o más           | 15%       |

**El programa debe mostrar:**
- El monto original
- El porcentaje de descuento aplicado
- El monto del descuento en Bs.
- El total a pagar

**Ejemplo de ejecución:**
```
Ingrese el monto de la compra: 120.50
Descuento aplicado: 10%
Descuento en Bs.: 12.05
Total a pagar: Bs. 108.45
```

---

### Ejercicio 4 — 🛵 Servicio de Delivery

**Enunciado**

Una aplicación de delivery cobra el envío según la **distancia en kilómetros** al domicilio del cliente. El sistema solicita el nombre del cliente y la distancia, y muestra el costo del envío y el tiempo estimado de entrega:

| Distancia         | Costo de envío | Tiempo estimado |
|-------------------|----------------|-----------------|
| Hasta 2 km        | Bs. 5          | 15 minutos      |
| De 2 a 5 km       | Bs. 10         | 30 minutos      |
| De 5 a 10 km      | Bs. 18         | 50 minutos      |
| Más de 10 km      | Bs. 25         | 90 minutos      |

**Ejemplo de ejecución:**
```
Ingrese el nombre del cliente: María
Ingrese la distancia en km: 7.3
Cliente: María
Costo de envío: Bs. 18
Tiempo estimado: 50 minutos
```

---

### Ejercicio 5 — 🚗 Instituto de Manejo

**Enunciado**

Un instituto de conducción asigna a sus alumnos a distintos cursos según el **puntaje obtenido en un examen teórico** (de 0 a 100). El sistema solicita el nombre del alumno y su puntaje, e informa el curso asignado, el horario y si debe rendir recuperatorio:

| Puntaje       | Resultado            | Horario                          |
|---------------|----------------------|----------------------------------|
| De 0 a 39     | Reprobado            | Recuperatorio: sábados 08:00–10:00 |
| De 40 a 59    | Curso Básico         | Lunes y miércoles 09:00–11:00    |
| De 60 a 79    | Curso Intermedio     | Martes y jueves 14:00–16:00      |
| De 80 a 100   | Curso Avanzado       | Viernes 10:00–13:00              |

**Ejemplo de ejecución:**
```
Ingrese el nombre del alumno: Carlos
Ingrese el puntaje obtenido: 72
Alumno: Carlos
Curso asignado: Curso Intermedio
Horario: Martes y jueves de 14:00 a 16:00
```

---
### Ejercicio 6 — 📦 Sistema de Importación Aduanera
**Enunciado**

Una aduana clasifica las importaciones según el tipo de producto para aplicar aranceles. El sistema debe solicitar el costo del producto y su categoría (1: Alimentos, 2: Electrónicos).
* **Alimentos:** Pagan un 5% de arancel.
* **Electrónicos:** Pagan un 15%, pero si el costo supera los Bs. 3500, el arancel sube al 20%.

**Ejemplo de ejecución:**
```
Ingrese el costo del producto: 4000
Ingrese la categoría (1-Alimentos, 2-Electrónicos): 2
Impuesto aplicado: 20%
Monto de impuesto: Bs. 800
Total a pagar: Bs. 4800
```
---

### Ejercicio 7 — 🎢 Parque de Diversiones "Extreme"
**Enunciado**

El parque tiene restricciones estrictas por seguridad y edad. El sistema debe pedir la edad y la estatura del visitante para determinar su acceso:
* **Menor de 7 años:** No puede ingresar.
* **De 7 a 12 años:** Solo si mide más de 1.40m (Plan Infantil - Bs. 30).
* **Mayores de 12 años:** Acceso total (Plan Adulto - Bs. 60).
* **Día especial:** Si es "Miércoles", los adultos tienen un 20% de descuento.

**Ejemplo de ejecución:**
```
Edad: 15
Estatura: 1.70
Día: Miércoles
Resultado: Acceso Autorizado (Plan Adulto)
Monto: Bs. 48.0
```

---

### Ejercicio 8 — 🏦 Pre-aprobación de Crédito 
**Enunciado**

Un banco evalúa créditos según el ingreso mensual y la edad. El sistema debe pedir la edad, el ingreso y el monto de la cuota que el cliente desea pagar.
* **Requisito 1:** Edad entre 18 y 60 años.
* **Requisito 2:** El ingreso debe ser al menos el triple de la cuota.
* **Requisito 3:** Si tiene deudas previas (S/N), el ingreso debe ser el cuádruple de la cuota.

**Ejemplo de ejecución:**
```
Ingreso: 9000 
Cuota deseada: 250
¿Tiene deudas? (S/N): S

Resultado: CRÉDITO RECHAZADO (El ingreso debe ser de al menos 10000 para este caso).
```
---

### Ejercicio 9 — 🏨 Hotel "Vista al Mar"
**Enunciado**

El costo de la habitación varía según la temporada y la cantidad de personas. El sistema solicita el tipo de temporada (1: Alta, 2: Baja) y el número de huéspedes.
* **Temporada Alta:** Bs. 400 por noche. Si son más de 4 personas, hay un recargo del 20%.
* **Temporada Baja:** Bs. 250 por noche. Si son más de 4 personas, hay un descuento del 10%.

**Ejemplo de ejecución:**
```
Temporada (1-Alta, 2-Baja): 1
Huéspedes: 5
Costo base: Bs. 400
Recargo: Bs. 80
Total por noche: Bs. 480
```

---

### Ejercicio 10 — ⚡ Consumo Eléctrico Domiciliario
**Enunciado**

La empresa eléctrica cobra por tramos de consumo (kWh). El sistema pide el consumo del mes:
* **0 - 100 kWh:** Bs. 0.80 por cada kWh.
* **101 - 300 kWh:** Bs. 1.20 por cada kWh adicional.
* **Más de 300 kWh:** Bs. 2.00 por cada kWh adicional.
Adicionalmente, si el usuario vive en zona **"Rural"**, recibe un subsidio del 15% sobre el total.

**Ejemplo de ejecución:**

```
Consumo (kWh): 150
Zona (Urbana/Rural): Rural

Total a pagar: Bs. 119.0
```



---

## 🔶 Parte 2 — Bucles, Operadores, Acumuladores y Contadores

> **Conceptos que se aplican:** bucles `while` `do-while` y `for`, operadores aritméticos, acumuladores, contadores, condición de corte, resumen final.

---

### Ejercicio 1 — ☕ Cafetería Escolar

**Enunciado**

La cafetería de una escuela quiere registrar las ventas del día. El sistema debe solicitar repetidamente el **nombre del producto** y su **precio**. La carga de datos continúa hasta que el operador ingrese la palabra `FIN` en lugar del nombre del producto.

**Al finalizar el programa debe mostrar:**
- La cantidad total de productos vendidos
- El monto total recaudado en el día
- El precio promedio por producto

**Ejemplo de ejecución:**
```
Ingrese el nombre del producto (o FIN para terminar): Café
Ingrese el precio: 8.50
Ingrese el nombre del producto (o FIN para terminar): Sándwich
Ingrese el precio: 15.00
Ingrese el nombre del producto (o FIN para terminar): Jugo
Ingrese el precio: 10.00
Ingrese el nombre del producto (o FIN para terminar): FIN
-------------------------------
Productos vendidos: 3
Total recaudado: Bs. 33.50
Precio promedio: Bs. 11.17
```

---

### Ejercicio 2 — 📝 Control de Notas

**Enunciado**

Un profesor necesita un sistema para registrar las notas de sus alumnos. El programa debe solicitar el **nombre del alumno** y su **nota** (de 0 a 100) de forma continua. La carga finaliza cuando se ingresa `FIN` como nombre.

**Al finalizar el programa debe mostrar:**
- Total de alumnos cargados
- Cantidad de alumnos aprobados (nota ≥ 60)
- Cantidad de alumnos reprobados (nota < 60)
- Nota promedio del grupo

**Ejemplo de ejecución:**
```
Ingrese el nombre del alumno (o FIN para terminar): Ana
Ingrese la nota: 75
Ingrese el nombre del alumno (o FIN para terminar): Luis
Ingrese la nota: 45
Ingrese el nombre del alumno (o FIN para terminar): FIN
-------------------------------
Total de alumnos: 2
Aprobados: 1
Reprobados: 1
Promedio del grupo: 60.00
```

---

### Ejercicio 3 — 🛒 Supermercado El Ahorro

**Enunciado**

La caja registradora de un supermercado necesita calcular el total de una compra. El sistema debe solicitar el **nombre del producto**, su **precio unitario** y la **cantidad** adquirida para cada ítem. La carga continúa hasta que el cajero ingrese `FIN`.

Al finalizar, si el subtotal supera los **Bs. 200**, se aplica un descuento del **8%** sobre el total.

**El programa debe mostrar:**
- Subtotal sin descuento
- Descuento aplicado (si corresponde)
- Total final a pagar

**Ejemplo de ejecución:**
```
Ingrese el nombre del producto (o FIN para terminar): Arroz
Ingrese el precio unitario: 12.00
Ingrese la cantidad: 3
Ingrese el nombre del producto (o FIN para terminar): Aceite
Ingrese el precio unitario: 25.50
Ingrese la cantidad: 2
Ingrese el nombre del producto (o FIN para terminar): FIN
-------------------------------
Subtotal: Bs. 87.00
Sin descuento (monto menor a Bs. 200)
Total a pagar: Bs. 87.00
```

---

### Ejercicio 4 — 🌡️ Registro de Temperatura

**Enunciado**

Una estación meteorológica registra la temperatura de cada hora durante un día completo (**24 lecturas**). El sistema solicita la temperatura correspondiente a cada hora en forma secuencial.

**Al finalizar las 24 lecturas debe mostrar:**
- La temperatura máxima registrada
- La temperatura mínima registrada
- La temperatura promedio del día
- La cantidad de horas en que la temperatura superó los 30°C

**Ejemplo de ejecución:**
```
Ingrese la temperatura de la hora 1: 18.5
Ingrese la temperatura de la hora 2: 20.0
...
Ingrese la temperatura de la hora 24: 22.3
-------------------------------
Temperatura máxima: 34.2°C
Temperatura mínima: 15.8°C
Temperatura promedio: 25.4°C
Horas con temperatura mayor a 30°C: 5
```

---

### Ejercicio 5 — ✈️ Agencia de Viajes

**Enunciado**

Una agencia de viajes necesita registrar las reservas del día. El sistema solicita para cada cliente: su **nombre**, el **destino** y el **tipo de paquete**. La carga continúa hasta ingresar `FIN` como nombre del cliente.

Los paquetes disponibles son:

| Tipo | Descripción                    | Precio base | Descuento |
|------|--------------------------------|-------------|-----------|
| A    | Solo transporte                | Bs. 350     | Sin descuento |
| B    | Transporte + hotel             | Bs. 620     | 5%        |
| C    | Paquete completo todo incluido | Bs. 950     | 12%       |

**Al finalizar el programa debe mostrar:**
- Cantidad de reservas por cada tipo de paquete
- Ingreso total generado por cada tipo
- El ingreso total del día entre todos los paquetes

**Ejemplo de ejecución:**
```
Ingrese el nombre del cliente (o FIN para terminar): Pedro
Ingrese el destino: Santa Cruz
Ingrese el tipo de paquete (A/B/C): B
Monto a pagar: Bs. 589.00

Ingrese el nombre del cliente (o FIN para terminar): Laura
Ingrese el destino: Cochabamba
Ingrese el tipo de paquete (A/B/C): A
Monto a pagar: Bs. 350.00

Ingrese el nombre del cliente (o FIN para terminar): FIN
-------------------------------
Paquete A — Reservas: 1 | Total: Bs. 350.00
Paquete B — Reservas: 1 | Total: Bs. 589.00
Paquete C — Reservas: 0 | Total: Bs. 0.00
-------------------------------
Ingreso total del día: Bs. 939.00
```

---

### Ejercicio 6 — 🏫 Registro de Notas "Final Pro"
**Enunciado**
Un profesor desea registrar a sus alumnos. Por cada uno pide: Nombre y Nota Final (0-100). 
El proceso termina cuando el nombre sea "FIN".

**Al finalizar, informar:**
1. Cantidad de alumnos Aprobados (Nota >= 51).
2. Cantidad de alumnos Reprobados.
3. El nombre del alumno con la nota más alta.

**Ejemplo de ejecución:**
```
Nombre: Ana | Nota: 95
Nombre: Juan | Nota: 40
Nombre: FIN
--- Estadísticas ---
Aprobados: 1 | Reprobados: 1 | Mejor alumno: Ana
```

---
### Ejercicio 7 — 🌡️ Monitoreo de Procesos Industriales
**Enunciado**

Un técnico debe registrar 5 lecturas de temperatura de un horno durante una hora.

**Al finalizar, informar:**
1. La temperatura más alta registrada.
2. La temperatura más baja registrada.
3. ¿Hubo alguna temperatura que superó los 100°C?.

**Ejemplo de ejecución:**
```
Lectura 1: 85
Lectura 2: 105
Lectura 3: 90
Lectura 4: ...
....

Temp. Máxima: 105°C
Temp. Mínima: 85°C
Alerta: SI
```

---
## 💡 Recomendaciones para el estudiante

- Leer el enunciado completo antes de escribir código.
- Identificar primero qué **datos se ingresan** y qué **datos se muestran**.
- Declarar todas las variables necesarias antes de comenzar la lógica.
- Probar el programa con distintos valores, incluyendo casos límite.


---
**Profesor:** Renato Apaza T.  
**Materia:** Taller de Programación II


