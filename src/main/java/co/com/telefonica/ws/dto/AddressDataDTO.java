package co.com.telefonica.ws.dto;

import lombok.Data;

@Data
public class AddressDataDTO {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoDataDTO geo;
}
