package com.example.nba.service;

import com.example.nba.Dto.DataDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class ExternalPlayerService {

    private RestTemplate restTemplate = new RestTemplate();
    @Value("${external.api.url}")
    private String externalApiUrl = new String();

    //Generar constructores
    public ExternalPlayerService() {
    }

    public ExternalPlayerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

    }

    //obtener el servicio de la api externa y retornar el resultado de la llamada, retorna un objeto json en forma de lista de jugadores de la api externa
    public DataDto getExternalPlayers(String player) {
        return restTemplate.getForObject(externalApiUrl+player, DataDto.class);
    }

}
