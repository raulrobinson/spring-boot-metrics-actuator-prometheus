package co.com.telefonica.ws.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TelcoResponseDTO {
    private Long code;
    private String message;
    private Object serviceResponse;
}
