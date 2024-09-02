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
        return "unicode" + i + "char=" + c;
    }


@GetMapping("char/{c}")
    public String charToUnicode(@PathVariable char c){
        int unicode = (int)c;
        return "char " + c + "unicode: " + unicode;
}

    @GetMapping("/sequence")
    public List<Character> getCharacterSequence(
            @RequestParam char startChar,
            @RequestParam int count) {
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            characters.add((char) (startChar + i));
        }

        return characters;
    }

}
