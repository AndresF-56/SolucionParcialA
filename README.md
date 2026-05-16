# Segundo Parcial Práctico – Programación I
## Versión A
**Lenguaje:** Java  
**Modalidad:** Individual  
**Tipo de evaluación:** Práctica en laboratorio  
**Temas a evaluar:** Arreglos, ciclos, condicionales, validaciones, lógica de programación

---

## Indicaciones generales

Lea cuidadosamente cada punto antes de empezar.

En este parcial usted deberá resolver problemas de programación en **Java**, utilizando únicamente los conocimientos trabajados en clase.  
Para el desarrollo de este parcial:

- Debe trabajar desde consola.
- Debe solicitar los datos al usuario.
- Debe usar **arreglos** para almacenar información.
- Debe usar estructuras **condicionales** y **ciclos**.
- **No debe usar clases creadas por usted**, herencia, objetos, listas dinámicas ni funciones personalizadas.
- Puede usar `Scanner` para capturar datos.
- El programa debe compilar y ejecutarse correctamente.

---

# Gestión de parqueadero

El parqueadero de la universidad necesita registrar vehículos y asignar espacios de acuerdo con el tipo de vehículo.

Construya un programa que permita:

1. Solicitar la cantidad de espacios del parqueadero.
2. Crear arreglos para almacenar:
   - número del espacio
   - tipo permitido (`carro` o `moto`)
   - estado del espacio (`disponible` u `ocupado`)
3. Registrar la información inicial de cada espacio.
4. Solicitar la cantidad de vehículos que desean ingresar.
5. Para cada vehículo registrar:
   - placa
   - tipo de vehículo
   - nombre del propietario
6. Buscar un espacio disponible compatible con el tipo de vehículo.
7. Si existe espacio adecuado, asignarlo y cambiar su estado a ocupado.
8. Si no existe espacio adecuado, informar que no se pudo asignar.

### Al final el sistema debe mostrar
- listado de espacios con su estado final
- cuántos espacios quedaron disponibles
- cuántos carros fueron asignados correctamente
- cuántas motos fueron asignadas correctamente
- cuántos vehículos no pudieron ingresar

### Restricciones
- No se permite asignar una moto en un espacio para carro ni un carro en un espacio para moto.
- Toda la lógica debe resolverse con arreglos, ciclos y condicionales.

### Lo que se evaluará
- Manejo de arreglos
- Búsqueda dentro de arreglos
- Actualización de estados
- Lógica de asignación
- Claridad del algoritmo implementado
  
---

# Criterios generales de evaluación

Se tendrá en cuenta:

- Comprensión del problema
- Uso correcto de arreglos
- Aplicación adecuada de ciclos
- Aplicación adecuada de condicionales
- Organización del código
- Funcionamiento correcto
- Claridad en la salida de resultados

---

# Entregable

Debe entregar un proyecto en Java con la solución completa.

---

**Nota:** Antes de programar, piense. Después de programar, vuelva a pensar. Muchas tragedias en Java nacen por exceso de confianza.
