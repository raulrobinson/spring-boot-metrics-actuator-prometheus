package co.com.telefonica.ws.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ************************************
 * **** NO BORRAR, NO MODIFICAR!!! ****
 * ************************************
 * SWAGGER OPENAPI TELEFONICA - MOVISTAR.
 * Author: Microservices Governance
 * By: Arquitectura - @Telefonica 2023
 * Version: 2.0.0
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor()
@Configuration
@ConfigurationProperties(prefix = "swagger.properties")
public class TelcoSwaggerProperties {
	private String projectName;
	private String projectShortDescription;
	private String developerName;
	private String developerMail;
	private String projectTosMsg;
	private String projectTosLink;
	private String projectLicenceMsg;
	private String projectLicenceLink;
	private String organizationUrl;
}
