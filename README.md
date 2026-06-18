# Implementación de un microservicio con BDD, TDD y DDD

El equipo de desarrollo de una fintech necesita implementar un microservicio que maneje las solicitudes de préstamo. El sistema debe permitir a los usuarios solicitar préstamos, verificar su elegibilidad y recibir una respuesta. Se espera que el microservicio sea robusto, escalable y fácil de mantener. El equipo ha decidido utilizar las metodologías BDD, TDD y DDD para garantizar la calidad y la alineación con las necesidades del negocio.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Metodologías de desarrollo: BDD, TDD, DDD |
| **Nivel** | junior-l3 |
| **Tipo** | practical |
| **Tiempo estimado** | 8-10 horas |

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

### Fase 1: Definición de las reglas de negocio y requisitos

**Objetivo:** Identificar y documentar las reglas de negocio y los requisitos funcionales del microservicio.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica las reglas de negocio y los requisitos funcionales para el proceso de solicitud de préstamo.
- Documenta los criterios de elegibilidad para los préstamos.
- Define los casos de uso y las historias de usuario para el microservicio.

**Entregable:** Documento con las reglas de negocio, requisitos funcionales y casos de uso.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo se relacionan las reglas de negocio con las historias de usuario.
- Considera los diferentes escenarios y casos de uso para el proceso de solicitud de préstamo.

</details>

### Fase 2: Diseño del modelo de dominio

**Objetivo:** Diseñar el modelo de dominio para el microservicio utilizando DDD.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseña el modelo de dominio para el microservicio de solicitud de préstamo.
- Identifica las entidades, agregados y valoraciones del dominio.
- Define las relaciones entre las entidades y los agregados.

**Entregable:** Diagrama del modelo de dominio y documentación.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo las entidades y agregados se relacionan en el dominio.
- Considera las invariantes y las reglas de negocio que deben aplicarse en el modelo de dominio.

</details>

### Fase 3: Implementación con TDD

**Objetivo:** Implementar el microservicio utilizando TDD para garantizar la calidad del código.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Escribe pruebas unitarias para las funcionalidades del microservicio utilizando TDD.
- Implementa las funcionalidades del microservicio para pasar las pruebas unitarias.
- Asegura que el código cumpla con los estándares de calidad y sea mantenible.

**Entregable:** Código del microservicio con pruebas unitarias y documentación.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo escribir pruebas unitarias que cubran todos los casos de uso y escenarios.
- Considera las mejores prácticas para escribir código mantenible y escalable.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el modelo de dominio y cómo se relaciona con las reglas de negocio?
- **paraQueSirve**: ¿Para qué sirven las pruebas unitarias en el proceso de desarrollo del microservicio?
- **comoSeUsa**: ¿Cómo se utiliza TDD para implementar el microservicio?
- **erroresComunes**: ¿Cuáles son los errores comunes al diseñar el modelo de dominio y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación del microservicio utilizando TDD y cómo se pueden justificar?

## Criterios de Evaluacion

- Documento con las reglas de negocio, requisitos funcionales y casos de uso.
- Diagrama del modelo de dominio y documentación.
- Código del microservicio con pruebas unitarias y documentación.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
