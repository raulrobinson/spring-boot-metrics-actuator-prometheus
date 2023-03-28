package co.com.telefonica.ws.dto;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;

@Data
public class JsonPlaceHolderDataDTO {
    @Id
    private int id;
    private String name;
    private String username;
    private String email;
    private AddressDataDTO address;
    private String phone;
    private String website;
    private CompanyDataDTO company;
}
