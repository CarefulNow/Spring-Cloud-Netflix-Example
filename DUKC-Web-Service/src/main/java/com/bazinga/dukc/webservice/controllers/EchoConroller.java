package com.bazinga.dukc.webservice.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by bazinga on 7/2/17.
 */
@RestController
@RequestMapping("/test")
public class EchoConroller {
    @RequestMapping(value = "/echo", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public String doEcho(@RequestBody String name) {
        return "Hello " + name + "!";
    }
}
