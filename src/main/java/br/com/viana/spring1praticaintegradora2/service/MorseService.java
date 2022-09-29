package br.com.viana.spring1praticaintegradora2.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MorseService {

    private final Map<String, Character> dicionario = new HashMap<>() {{
        put(".-", 'A');
        put("-...", 'B');
        put("-.-.", 'C');
        put("-..", 'D');
        put(".", 'E');
        put("..-.", 'F');
        put("--.", 'G');
        put("....", 'H');
        put("..", 'I');
        put(".---", 'J');
        put("-.-", 'K');
        put(".-..", 'L');
        put("--", 'M');
        put("-.", 'N');
        put("---", 'O');
        put(".--.", 'P');
        put("--.-", 'Q');
        put(".-.", 'R');
        put("...", 'S');
        put("-", 'T');
        put("..-", 'U');
        put("...-", 'V');
        put(".--", 'W');
        put("-..-", 'X');
        put("-.--", 'Y');
        put("--..", 'Z');

        put(".----", '1');
        put("..---", '2');
        put("...--", '3');
        put("....-", '4');
        put(".....", '5');
        put("-....", '6');
        put("--...", '7');
        put("---..", '8');
        put("----.", '9');
        put("-----", '0');

        put("..--..", '?');
        put("-.-.--", '!');
        put(".-.-.-", '.');
        put("--..--", ',');
    }};

    public String getMorseToPortuguese(String valor) {
        String portuguese = "";

        String morseCharacter = "";
        int countSpace = 0;
        for(int i = 0; i < valor.length(); i++){
            if(valor.charAt(i) == '.' || valor.charAt(i) == '-'){
                morseCharacter += valor.charAt(i);
            }

            if(valor.charAt(i) == ' ' || i  == valor.length()-1){
                countSpace++;
                if(!morseCharacter.isEmpty()) {
                    portuguese += this.dicionario.get(morseCharacter);
                    morseCharacter = "";
                    countSpace = 0;
                }
            }

            if(countSpace == 3) {
                portuguese += " ";
                countSpace = 0;
            }
        }

        return portuguese;

    }
}
