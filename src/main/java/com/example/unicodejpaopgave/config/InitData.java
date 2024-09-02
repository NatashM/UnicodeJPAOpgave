package com.example.unicodejpaopgave.config;

import com.example.unicodejpaopgave.Model.Unicode;
import com.example.unicodejpaopgave.Repository.UniCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UniCodeRepository uniCodeRepository;


    @Override
    public void run(String... args) throws Exception {
        Set<Character> characters = Set.of('a', 'b', 'c', '$');

        for (Character character : characters) {
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) character);
            unicode.setLetter(character);
            unicode.setName("Letter " + character);
            unicode.setDescription("Description of " + character);

            uniCodeRepository.save(unicode);
        }
    }
    }


