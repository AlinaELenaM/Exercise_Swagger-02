package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    /**
     * Welcome math message that prints on the localhost:5050/math the welcome string
     * @return the welcome message as a string
     */
    @GetMapping("")
    @ApiOperation(value = "Says Welcome Message",
                  notes = "Prints a welcome message for someone who visits localhost:5050/math")
    public String welcomeMathMsg(){
        return "Welcome to Math Controller!";
    }
    /**
     * Get the arithmetic operation info, in this case the division
     * @return a new arithmetic operation(division) with all the details
     */
    @GetMapping("division-info")
    @ApiOperation(value = "Get arithmetic operation info",
                  notes = "Prints the details of the division")

    public ArithmeticOperation getArithmeticOperationInfo(){
        return new ArithmeticOperation("division",2,
                "a division is a process of splitting a specific amount into equal parts",
                new String[]{"Identity property","Zero Property","Dividing a Number by Itself"});
    }
    /**
     * Gets the multiplication of 2 numbers
     * @param nr1 the first number
     * @param nr2 the second number
     * @return the multiplication result
     */
    @GetMapping("multiplication")
    @ApiOperation(value = "Get multiplication",
                  notes = "Returns the multiplication result of 2 numbers")
    public Integer getMultiplication(@ApiParam(value = "first number") @RequestParam("nr1") Integer nr1,
                                     @ApiParam(value = "second number") @RequestParam("nr2") Integer nr2){
        return nr1 * nr2;
    }

    /**
     * Get the square of the integer number n.
     * @param n the number
     * @return the square operation
     */
    @GetMapping(value = "square/{n}")
    @ApiOperation(value = "Get square",
                  notes = "Returns the square of a number")
    public Integer getSquare(@ApiParam(value = "the number") @PathVariable Integer n){
        return n * n;
    }
}
