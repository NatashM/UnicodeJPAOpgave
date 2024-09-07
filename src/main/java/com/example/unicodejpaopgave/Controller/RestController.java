package com.example.unicodejpaopgave.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i){
        char c = (char)i;
        return "Unicode " + i + "Char " + c;
    }


@GetMapping("char/{c}")
    public String charToUnicode(@PathVariable char c){
        int unicode = (int)c;
        return "char " + c + "unicode: " + unicode;
}

    @GetMapping("/order")
    public List<Character> getCharacterOrder(
            @RequestParam char startChar,
            @RequestParam int count) {
        List<Character> letters = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            letters.add((char) (startChar + i));
        }

        return letters;
    }

}
