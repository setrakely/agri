package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domaine.Vparcelle;
import com.example.demo.repositories.VparcelleRepository;

@Service
public class VparcelleService {
    @Autowired
    private VparcelleRepository vparcelleRepository;

    public List<Vparcelle> getAllVparcelles() {
        return vparcelleRepository.findAll();
    }

    public List<Vparcelle> getParcellesByNomCulture(String nomCulture) {
        return vparcelleRepository.findByNomCulture(nomCulture);
    }

    public List<Vparcelle> getParcellesByNomParcelle(String nomParcelle) {
        return vparcelleRepository.findByNomParcelle(nomParcelle);
    }
}