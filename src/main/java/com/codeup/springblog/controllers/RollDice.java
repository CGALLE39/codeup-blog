package com.codeup.springblog.controllers;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RollDice {
@RequestMapping(path ="/roll-dice/{n}", method = RequestMethod.GET)
    @ResponseBody
    public String randomRoll(@PathVariable int n) {
    Random randoNumVar = new Random();
    int randomRoll = randoNumVar.nextInt(6) + 1;
    if (n == randomRoll) {
        return "YOU WIN ";
    } else {
        return "<h1>YOU SUCK</h1>";
    }
}


}
