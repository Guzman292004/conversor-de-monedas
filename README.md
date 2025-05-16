
#  Conversor de Monedas

## Descripción

Este proyecto es un **conversor de monedas** desarrollado en **Java** utilizando **Spring Boot** y ejecutado desde la consola. Consume datos de tipos de cambio actualizados desde la API pública [ExchangeRate-API](https://www.exchangerate-api.com/) y permite convertir entre distintas monedas latinoamericanas y el dólar estadounidense.

##  Objetivo del desafío

Desarrollar una aplicación de consola que:
- Consuma datos de una API externa.
- Analice y procese una respuesta JSON.
- Realice conversiones entre diferentes monedas.
- Interactúe con el usuario a través de un menú amigable.
- Demuestre conocimientos en programación orientada a objetos, manejo de HTTP y diseño de aplicaciones modulares.

##  Tecnologías utilizadas

- **Java 17+**
- **Spring Boot**
- **HttpClient (java.net.http)**
- **Librerías estándar de Java (no se usó Gson, se utilizó `jackson-databind` incluido por Spring Boot)**
- **Maven** (para gestión de dependencias)
- **IDE: IntelliJ IDEA / Eclipse**

## Monedas disponibles

El conversor soporta conversiones entre las siguientes monedas:

| Código | Moneda               |
|--------|----------------------|
| USD    | Dólar estadounidense |
| ARS    | Peso argentino       |
| BRL    | Real brasileño       |
| COP    | Peso colombiano      |
| MXN    | Peso mexicano        |

##  Cómo usar

1. **Clona este repositorio**:

```bash
git clone https://github.com/tuusuario/conversor-monedas.git
cd conversor-monedas
```

2. **Agrega tu API Key en el archivo `application.properties`**:

```properties
exchange.rate.api.key=TU_API_KEY_AQUÍ
```

3. **Ejecuta el proyecto**:

```bash
mvn clean install
mvn spring-boot:run
```

4. **Sigue las instrucciones en pantalla**:

```
*******************************************
Sea bienvenido/a al Conversor de Moneda =]

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
...
9) Salir

Elija una opción válida:
*******************************************
```

##  Estructura del proyecto

```bash
src/
└── main/
    ├── java/
    │   └── com/tuusuario/conversor/
    │       ├── Conversor.java
    │       ├── ConversorDeMonedasApplication.java
    │       ├── ExchangeRateService.java
    │       └── ExchangeRateResponse.java
    └── resources/
        └── application.properties
```

## Ejemplo de uso

```
Ingrese el monto a convertir: 100
Resultado: 100 USD = 17000 ARS
```

##  Notas
- No se usaron librerías externas como Gson ya que **Spring Boot incluye soporte para JSON con Jackson**.

## Autor

-  Brandon Guzman  
