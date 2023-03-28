package co.com.telefonica.ws.controller;

import co.com.telefonica.ws.businesslogic.JsonPlaceHolderService;
import co.com.telefonica.ws.dto.TelcoResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "${controller.properties.base-path}", produces = MediaType.APPLICATION_JSON_VALUE)
public class TelcoController {

    private final JsonPlaceHolderService jsonPlaceHolderService;

    public TelcoController(JsonPlaceHolderService jsonPlaceHolderService) {
        this.jsonPlaceHolderService = jsonPlaceHolderService;
    }

    @GetMapping(path = "/users/all")
    public TelcoResponseDTO getAllObjects(){
        return jsonPlaceHolderService.getJsonPlaceAllUsers();
    }

    @GetMapping(path = "/users/id/{id}")
    public TelcoResponseDTO getJsonPlaceById(
            @PathVariable(name = "id") String id
    ){
        return jsonPlaceHolderService.getJsonPlaceById(id);
    }

    @GetMapping(path = "/users/username/{username}")
    public Object getJsonPlaceByUsername(
            @PathVariable(name = "username") String username
    ){
        return jsonPlaceHolderService.getJsonPlaceByUsername(username);
    }
}
