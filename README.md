# Foro Hub

Foro Hub es una aplicación de foro donde los usuarios pueden registrarse, iniciar sesión, crear y responder publicaciones, así como interactuar con otros usuarios.

## Funcionalidades

- **Registro de Usuarios**: Permite que los usuarios se registren en el foro.
- **Autenticación**: Implementa la funcionalidad de inicio de sesión para los usuarios.
- **Creación de Publicaciones**: Permite a los usuarios crear nuevas publicaciones en el foro.
- **Responder a Publicaciones**: Permite a los usuarios responder a las publicaciones existentes.
- **Interacción**: Posibilidad de "me gusta" o "votar" en publicaciones y respuestas.
- **Visualización de Publicaciones**: Mostrar todas las publicaciones y sus respuestas.

## Requisitos Previos

- Java Development Kit (JDK) 8 o superior.
- Maven.
- Acceso a Internet.

## Instalación y Configuración

1. Clona el repositorio:
    ```bash
    git clone https://github.com/tu_usuario/foro-hub.git
    cd foro-hub
    ```

2. Importa el proyecto en tu IDE preferido.

3. Ejecuta la aplicación desde tu IDE o usando Maven:
    ```bash
    mvn spring-boot:run
    ```

## Uso

1. Ejecuta la aplicación.
2. Realiza una solicitud POST a `/api/users/register` para registrar un nuevo usuario.
3. Utiliza las credenciales para iniciar sesión y acceder a las funcionalidades del foro.

## Ejemplo de Código

```java
@RestController
@RequestMapping("/api/posts")
public class PostController {
    // Implementación del controlador
}
