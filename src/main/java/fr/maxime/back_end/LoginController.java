package fr.maxime.back_end;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @GetMapping
    public String login() {
        return "coucou";
    }

    @PostMapping
    public Map<String, String> login(@RequestBody LoginRequest loginRequest) {
        Map<String, String> response = new HashMap<>();

        // Vérification des informations de connexion (simulée ici)
        if ("user".equals(loginRequest.getUsername()) && "password".equals(loginRequest.getPassword())) {
            response.put("username", loginRequest.getUsername());
            response.put("password", loginRequest.getPassword());
        } else {
            response.put("error", "Invalid credentials");
        }

        return response;  // Retourne un objet JSON
    }
}
