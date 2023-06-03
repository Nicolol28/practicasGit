package PracticaWeb.Nicolas;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NicolasApplicationTests {

	@Test
	void contextLoads() {
	}

}
/*
 * <!DOCTYPE html> <html lang="es"> <head> <meta charset="UTF-8"> <meta
 * name="viewport" content="width=device-width, initial-scale=1.0">
 * <title>Iniciar sesión</title> <link rel="stylesheet" href="/css/styles2.css">
 * </head> <body> <div class="container"> <form action="#"
 * th:action="@{newCliente}" th:object="${cliente}" method="post"> <h1>Iniciar
 * sesión</h1> <input type="text" th:field="#{mail}"
 * placeholder="Correo electrónico" required> <input type="password"
 * th:field="#{contraseña}" placeholder="Contraseña" required> <button
 * type="submit">Iniciar sesión</button> <p class="signup-link">¿No tienes una
 * cuenta? <a href="#">Registrarse</a></p> </form> </div> </body> </html>
 */