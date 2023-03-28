package co.com.telefonica.ws.businesslogic;

import co.com.telefonica.ws.dto.TelcoResponseDTO;

public interface JsonPlaceHolderService {
    TelcoResponseDTO getJsonPlaceAllUsers();
    TelcoResponseDTO getJsonPlaceById(String id);
    Object getJsonPlaceByUsername(String username);
}
