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