package co.develhope.swagger2.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The DefaultController class that is a REST controller
 * mapped by default at localhost:5050
 * with an only method that is sayWelcomeMessage()
 */
@RestController
public class DefaultController {
    @GetMapping("")
    @ApiOperation(value = "Says Welcome Message", notes = "Prints a welcome message for someone who visits localhost:5050")
    public String sayWelcomeMessage(){
        return "Welcome to localhost:5050!";
    }
}