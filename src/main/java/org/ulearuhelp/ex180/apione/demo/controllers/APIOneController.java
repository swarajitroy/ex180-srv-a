package org.ulearuhelp.ex180.apione.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIOneController {

   
   @RequestMapping(value= "/vessels", method = RequestMethod.GET)
   public ResponseEntity<String> getVesselDetails() {
      return new ResponseEntity<>("Hello World Emma Maersk", HttpStatus.OK);
   }
    
}
