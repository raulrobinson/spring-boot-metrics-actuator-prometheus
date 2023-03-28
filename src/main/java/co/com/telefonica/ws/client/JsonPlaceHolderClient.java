package co.com.telefonica.ws.client;

import co.com.telefonica.ws.dto.JsonPlaceHolderDataDTO;
import co.com.telefonica.ws.util.TelcoConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "json-place-holder", url = TelcoConstants.URL_JSON_PLACE_HOLDER)
public interface JsonPlaceHolderClient {

    @RequestMapping(path = "/users", method = RequestMethod.GET, produces = "application/json")
    List<JsonPlaceHolderDataDTO> getJsonPlaceAllUsers();

    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET, produces = "application/json")
    JsonPlaceHolderDataDTO getJsonPlaceById(
            @PathVariable(name = "id") String id);

    @RequestMapping(path = "/users?username={username}", method = RequestMethod.GET, produces = "application/json")
    Object getJsonPlaceByUsername(
            @PathVariable(name = "username") String username);

}
