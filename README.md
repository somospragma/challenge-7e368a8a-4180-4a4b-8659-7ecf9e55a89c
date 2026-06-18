# Implementación de un microservicio con BDD, TDD y DDD

El sistema de una empresa fintech necesita un nuevo microservicio para gestionar las solicitudes de préstamos. Este microservicio debe ser robusto, escalable y fácil de mantener. Necesitamos implementar este microservicio utilizando las metodologías BDD, TDD y DDD para asegurar que el código sea de alta calidad y que los requisitos del negocio sean bien entendidos y documentados.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Metodologías de desarrollo: BDD, TDD, DDD |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 5-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del dominio y requisitos del negocio

**Objetivo:** Identificar y documentar los requisitos del negocio y las reglas del dominio para el microservicio de gestión de préstamos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los principales actores y sus interacciones con el sistema.
- Define las reglas de negocio y los estados posibles de una solicitud de préstamo.
- Documenta los casos de uso y las historias de usuario relevantes.

**Entregable:** Documentación de los requisitos del negocio y las reglas del dominio.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en los diferentes estados que puede tener una solicitud de préstamo (pendiente, aprobada, rechazada, etc.)
- Considera los diferentes actores que interactúan con el sistema (cliente, administrador, etc.)

</details>

### Fase 2: Implementación de pruebas con BDD

**Objetivo:** Implementar pruebas de comportamiento utilizando BDD para validar los requisitos del negocio.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Escribe pruebas de comportamiento que cubran los casos de uso identificados en la fase anterior.
- Asegúrate de que las pruebas sean legibles y comprensibles para los no técnicos.
- Valida que las pruebas se ejecuten correctamente y que los resultados sean los esperados.

**Entregable:** Pruebas de comportamiento implementadas y ejecutadas con éxito.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza un lenguaje de especificación de comportamiento para escribir las pruebas.
- Asegúrate de que las pruebas reflejen los requisitos del negocio de manera clara y concisa.

</details>

### Fase 3: Implementación de pruebas con TDD

**Objetivo:** Implementar pruebas unitarias utilizando TDD para garantizar la calidad del código.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Escribe pruebas unitarias para las funcionalidades clave del microservicio.
- Implementa el código necesario para hacer pasar las pruebas.
- Asegúrate de que el código sea sencillo y fácil de mantener.

**Entregable:** Pruebas unitarias implementadas y ejecutadas con éxito.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza un enfoque de desarrollo guiado por pruebas para escribir el código.
- Asegúrate de que las pruebas cubran todos los casos de uso y edge cases relevantes.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es BDD y cómo se aplica en este reto?
- **paraQueSirve**: ¿Para qué sirve TDD en el desarrollo de este microservicio?
- **comoSeUsa**: ¿Cómo se usa DDD para modelar el dominio del microservicio de gestión de préstamos?
- **erroresComunes**: ¿Qué errores comunes pueden ocurrir al implementar pruebas con BDD y TDD?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica la implementación de este microservicio utilizando BDD, TDD y DDD?

## Criterios de Evaluacion

- Documentación clara y completa de los requisitos del negocio y las reglas del dominio.
- Pruebas de comportamiento implementadas y ejecutadas con éxito.
- Pruebas unitarias implementadas y ejecutadas con éxito.
- Código sencillo y fácil de mantener.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
