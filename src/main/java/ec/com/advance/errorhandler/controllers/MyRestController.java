package ec.com.advance.errorhandler.controllers;

import ec.com.advance.errorhandler.model.Model;
import ec.com.advance.errorhandler.services.Retriever;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private Retriever retriever;

    public MyRestController(Retriever retriever) {
        this.retriever = retriever;
    }

    @PostMapping(value = "/retrieve", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> retrieve(@RequestBody Model model) {
        return new ResponseEntity<>(retriever.retrieve(model), HttpStatus.OK);
    }
}
