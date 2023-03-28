package co.com.telefonica.ws.businesslogic.impl;

import co.com.telefonica.ws.businesslogic.JsonPlaceHolderService;
import co.com.telefonica.ws.client.JsonPlaceHolderClient;
import co.com.telefonica.ws.dto.JsonPlaceHolderDataDTO;
import co.com.telefonica.ws.dto.TelcoResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class JsonPlaceHolderServiceImpl implements JsonPlaceHolderService {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public JsonPlaceHolderServiceImpl(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    @Override
    public TelcoResponseDTO getJsonPlaceAllUsers() {
        var req = jsonPlaceHolderClient.getJsonPlaceAllUsers();
        var res = new ArrayList<List<JsonPlaceHolderDataDTO>>();
        res.add(req);
        if (req == null) {
            return TelcoResponseDTO.builder()
                    .code(404L)
                    .message("404 Holders not Found")
                    .serviceResponse(null)
                    .build();
        }
        return TelcoResponseDTO.builder()
                .code(200L)
                .message("200 OK")
                .serviceResponse(res)
                .build();
    }

    @Override
    public TelcoResponseDTO getJsonPlaceById(String id) {
        var req = jsonPlaceHolderClient.getJsonPlaceById(id);
        if (req == null) {
            return TelcoResponseDTO.builder()
                    .code(404L)
                    .message("404 Holders not Found")
                    .serviceResponse(null)
                    .build();
        }
        var res = new JsonPlaceHolderDataDTO();
        res.setId(req.getId());
        res.setName(req.getName());
        res.setUsername(req.getUsername());
        res.setEmail(req.getEmail());
        res.setAddress(req.getAddress());
        res.setPhone(req.getPhone());
        res.setWebsite(req.getWebsite());
        res.setCompany(req.getCompany());
        return TelcoResponseDTO.builder()
                .code(200L)
                .message("200 OK")
                .serviceResponse(res)
                .build();
    }

    @Override
    public Object getJsonPlaceByUsername(String username) {
        var req = jsonPlaceHolderClient.getJsonPlaceByUsername(username);
        if (req == null) {
            return TelcoResponseDTO.builder()
                    .code(404L)
                    .message("404 Holders not Found")
                    .serviceResponse(null)
                    .build();
        }
        return TelcoResponseDTO.builder()
                .code(200L)
                .message("200 OK")
                .serviceResponse(req)
                .build();
    }
}
