package org.travelforge.jvue;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebserviceController {

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/ping",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public String ping() {
        return "OK";
    }
}
