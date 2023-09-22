package com.example.nba.service;

import com.example.nba.Dto.DataDto;
import com.example.nba.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private ExternalPlayerService externalPlayerService;

    @Autowired
    private PlayerRepository playerRepository;

    public DataDto getPlayers(String player) {
        return externalPlayerService.getExternalPlayers(player);
    }

    //public Player MaptoDto
}

