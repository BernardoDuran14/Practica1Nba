package com.example.nba.controller;

import com.example.nba.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/{player}")
    public ResponseEntity<?> getPlayers(@PathVariable String player) {
        return ResponseEntity.ok(playerService.getPlayers(player));
    }

}
