# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto corregido y listo para compilar.

---

```
Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación o descripciones sin código, genera los archivos
correspondientes sin aplicar análisis de compilación
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: src/main/java/com/fintech/loanservice/domain/Loan.java ===
package com.fintech.loanservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String applicantName;
    private Double amount;
    private String status;

    public Loan() {}

    public Loan(String applicantName, Double amount, String status) {
        this.applicantName = applicantName;
        this.amount = amount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public Double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// === ARCHIVO: src/main/java/com/fintech/loanservice/application/LoanService.java ===
package com.fintech.loanservice.application;

import com.fintech.loanservice.domain.Loan;
import com.fintech.loanservice.infrastructure.LoanRepository;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Flux<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Mono<Loan> getLoanById(Long id) {
        return loanRepository.findById(id);
    }

    public Mono<Loan> createLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public Mono<Loan> updateLoanStatus(Long id, String status) {
        return loanRepository.findById(id)
               .flatMap(loan -> {
                    loan.setStatus(status);
                    return loanRepository.save(loan);
                });
    }
}

// === ARCHIVO: src/main/java/com/fintech/loanservice/infrastructure/LoanRepository.java ===
package com.fintech.loanservice.infrastructure;

import com.fintech.loanservice.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    Flux<Loan> findAll();
    Mono<Loan> findById(Long id);
    Mono<Loan> save(Loan loan);
}

// === ARCHIVO: src/main/java/com/fintech/loanservice/infrastructure/LoanController.java ===
package com.fintech.loanservice.infrastructure;

import com.fintech.loanservice.application.LoanService;
import com.fintech.loanservice.domain.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping
    public Flux<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Loan>> getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id)
               .map(loan -> new ResponseEntity<>(loan, HttpStatus.OK))
               .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Mono<Loan> createLoan(@RequestBody Loan loan) {
        return loanService.createLoan(loan);
    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<Loan>> updateLoanStatus(@PathVariable Long id, @RequestParam String status) {
        return loanService.updateLoanStatus(id, status)
               .map(loan -> new ResponseEntity<>(loan, HttpStatus.OK))
               .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}

// === ARCHIVO: src/test/java/com/fintech/loanservice/LoanServiceTest.java ===
package com.fintech.loanservice;

import com.fintech.loanservice.application.LoanService;
import com.fintech.loanservice.domain.Loan;
import com.fintech.loanservice.infrastructure.LoanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import static org.mockito.Mockito.*;

public class LoanServiceTest {
    private LoanService loanService;
    private LoanRepository loanRepository;

    @BeforeEach
    public void setUp() {
        loanRepository = Mockito.mock(LoanRepository.class);
        loanService = new LoanService(loanRepository);
    }

    @Test
    public void testGetAllLoans() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        Flux<Loan> loanFlux = Flux.just(loan);
        when(loanRepository.findAll()).thenReturn(loanFlux);

        StepVerifier.create(loanService.getAllLoans())
               .expectNext(loan)
               .verifyComplete();
    }

    @Test
    public void testCreateLoan() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        when(loanRepository.save(loan)).thenReturn(Mono.just(loan));

        StepVerifier.create(loanService.createLoan(loan))
               .expectNext(loan)
               .verifyComplete();
    }

    @Test
    public void testUpdateLoanStatus() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        when(loanRepository.findById(1L)).thenReturn(Mono.just(loan));
        when(loanRepository.save(loan)).thenReturn(Mono.just(loan));

        StepVerifier.create(loanService.updateLoanStatus(1L, "Approved"))
               .expectNext(loan)
               .verifyComplete();
    }
}

// === ARCHIVO: src/test/java/com/fintech/loanservice/LoanControllerTest.java ===
package com.fintech.loanservice;

import com.fintech.loanservice.application.LoanService;
import com.fintech.loanservice.domain.Loan;
import com.fintech.loanservice.infrastructure.LoanController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import static org.mockito.Mockito.*;

@WebFluxTest(LoanController.class)
public class LoanControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private LoanService loanService;

    @BeforeEach
    public void setUp() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        when(loanService.getAllLoans()).thenReturn(Flux.just(loan));
        when(loanService.getLoanById(1L)).thenReturn(Mono.just(loan));
        when(loanService.createLoan(loan)).thenReturn(Mono.just(loan));
        when(loanService.updateLoanStatus(1L, "Approved")).thenReturn(Mono.just(loan));
    }

    @Test
    public void testGetAllLoans() {
        webTestClient.get().uri("/api/loans")
               .accept(MediaType.APPLICATION_JSON)
               .exchange()
               .expectStatus().isOk()
               .expectBodyList(Loan.class).hasSize(1);
    }

    @Test
    public void testGetLoanById() {
        webTestClient.get().uri("/api/loans/1")
               .accept(MediaType.APPLICATION_JSON)
               .exchange()
               .expectStatus().isOk()
               .expectBody(Loan.class);
    }

    @Test
    public void testCreateLoan() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        webTestClient.post().uri("/api/loans")
               .contentType(MediaType.APPLICATION_JSON)
               .bodyValue(loan)
               .exchange()
               .expectStatus().isCreated()
               .expectBody(Loan.class);
    }

    @Test
    public void testUpdateLoanStatus() {
        webTestClient.put().uri("/api/loans/1?status=Approved")
               .accept(MediaType.APPLICATION_JSON)
               .exchange()
               .expectStatus().isOk()
               .expectBody(Loan.class);
    }
}

// === ARCHIVO: src/test/resources/features/loan.feature ===
Feature: Gestión de préstamos

  Scenario: Crear una solicitud de préstamo
    Given que no hay solicitudes de préstamo
    When se crea una solicitud de préstamo con el nombre "John Doe", la cantidad 1000.0 y el estado "Pending"
    Then la solicitud de préstamo debe ser creada con el estado "Pending"

  Scenario: Obtener todas las solicitudes de préstamo
    Given que hay una solicitud de préstamo con el nombre "John Doe", la cantidad 1000.0 y el estado "Pending"
    When se solicitan todas las solicitudes de préstamo
    Then se deben obtener todas las solicitudes de préstamo

  Scenario: Actualizar el estado de una solicitud de préstamo
    Given que hay una solicitud de préstamo con el nombre "John Doe", la cantidad 1000.0 y el estado "Pending"
    When se actualiza el estado de la solicitud de préstamo a "Approved"
    Then la solicitud de préstamo debe tener el estado "Approved"

// === ARCHIVO: src/main/resources/application.yml ===
server:
  port: 8080

spring:
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password:
    driver-class-name: org.h2.Driver
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    show-sql: true
    properties:
      hibernate:
        format_sql: true

management:
  endpoints:
    web:
      exposure:
        include: "*"

```
