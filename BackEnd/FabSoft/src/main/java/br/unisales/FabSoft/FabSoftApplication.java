package br.unisales.FabSoft;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class FabSoftApplication {

    public static void main(String[] args) {
        SpringApplication.run(FabSoftApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API da Fabrica de Software")
                        .version("1.0.0")
                        .description("API de criação do banco de dados e envio e E-mail")
                );
    }

}

