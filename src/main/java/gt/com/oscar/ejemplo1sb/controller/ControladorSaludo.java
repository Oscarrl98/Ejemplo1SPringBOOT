package gt.com.oscar.ejemplo1sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorSaludo {

    @GetMapping("/saludar")
    public String saludarUsuario(@RequestParam String name) {
        return "HOla " + name.toUpperCase();
    }
}
