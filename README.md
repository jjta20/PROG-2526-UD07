# 🧬 Unidad 7: Herencia (POO) - Soluciones

¡Hola de nuevo, futuros desarrolladores! 👋 

Bienvenidos al repositorio con las **soluciones a las actividades de la Unidad 7**. 

Si en el tema anterior aprendimos a crear nuestros propios objetos, en este vamos un paso más allá. Descubriremos cómo la **Herencia** nos permite reutilizar código, crear jerarquías (como en la vida real) y hacer que nuestros programas sean mucho más escalables y profesionales.

---

## 🎯 ¿Qué conceptos ponemos en práctica aquí?

En estos ejercicios aplicamos la teoría vista en clase para dominar la jerarquía de clases en Java:

*   👨‍👦 **Subclase y Superclase** (Uso de la palabra reservada `extends`).
*   🛡️ **Visibilidad `protected`** (El término medio entre `private` y `public` pensado para la herencia).
*   🔄 **Sobrescritura de métodos (*Overriding*)** (Uso de la anotación `@Override`).
*   🪄 **Selección dinámica de métodos** (La magia del polimorfismo: ejecutar distintas versiones de un método según el objeto referenciado).
*   🔼 **Uso de `super` y `super()`** (Para acceder a atributos/métodos del padre y llamar a sus constructores).
*   👑 **La clase `Object`** (La madre de todas las clases y la reimplementación de `toString()` y `equals()`).
*   👻 **Clases y métodos abstractos (`abstract`)** (Crear moldes genéricos que obligan a sus hijos a implementar los detalles).

---

## 🚀 Índice de Actividades

A continuación, tenéis el resumen de los ejercicios resueltos que encontraréis organizados por paquetes en este proyecto:

| Ejercicio / Paquete | Temática | Conceptos Clave Trabajados |
| :---: | :--- | :--- |
| **0** | 🏢 **La Empresa (Persona, Empleado, Cliente)** | Primera jerarquía. Uso de `super()` en constructores, visibilidad `protected`, sobrescritura del método `mostrarDatos()` y prueba de la **selección dinámica de métodos**. |
| **1 y 2** | ⏱️ **Control del Tiempo (`Hora` y `HoraExacta`)** | Herencia práctica. Reutilización de código con `super.inc()`, sobrescritura del método `toString()` y control de rangos (0-23h, 0-59m, 0-59s). |
| **3** | ⚖️ **Comparando Horas** | Sobrescritura profunda del método `equals()` heredado de `Object` (¡cuidado con el *cast* de objetos!). |
| **4 y 5** | 🎹 **La Banda de Música (`Instrumento` y `Piano`)** | Creación de una clase **abstracta** (`Instrumento`) con un método abstracto (`interpretar()`). Obligación de implementar detalles en la clase hija (`Piano`). Uso de **tipos enumerados** para las notas musicales. |

---

## 🛠️ ¿Cómo usar este repositorio?

1. **Pelea con el código:** Como os digo siempre, la herencia se entiende programando. Cread vuestras clases `extends` e intentad deducir por qué el compilador se queja antes de mirar la solución. 🥊
2. **Entiende el polimorfismo:** Cuando miréis el `Main.java` de los ejercicios, fijaos muy bien en cómo una variable de tipo *Padre* puede guardar un objeto de tipo *Hijo*. ¡Esa es la clave del tema!
3. **Clona o descarga:** Clonar el proyecto a vuestro IDE y jugad con él. ¿Qué pasa si le quitamos el `@Override` a un método? ¿Y si intentamos hacer un `new` de una clase abstracta? Probadlo y veréis el error.

> **💡 Consejo del profe:** 
> *Acostumbraros a generar siempre los métodos `toString()` y `equals()`. Os salvarán la vida muchas veces a la hora de comprobar si vuestro código funciona correctamente. ¡Cualquier duda, la vemos en clase!*

---
*Profe: Javier Torre Antúnez | IES Newton-Salas* 🏫