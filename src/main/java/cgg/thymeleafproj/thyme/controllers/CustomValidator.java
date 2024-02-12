package cgg.thymeleafproj.thyme.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cgg.thymeleafproj.thyme.entities.LoginObj;
import jakarta.validation.Valid;

@RestController
public class CustomValidator {
    @PostMapping("/loginurl")
    public ResponseEntity<LoginObj> logindata(@Valid @RequestBody LoginObj login) {

        return ResponseEntity.ok((login));

    }

}
