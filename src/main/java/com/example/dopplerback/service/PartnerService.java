package com.example.dopplerback.service;

import com.example.dopplerback.entity.Partner;
import com.example.dopplerback.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartnerService {
    @Autowired
    PartnerRepository partnerRepository;

    public List<Partner> getAll(){
        return partnerRepository.findAll();
    }

    public Optional<Partner> getById(Long id){
        return partnerRepository.findById(id);
    }

    public void save(Partner partner){
        partnerRepository.save(partner);
    }

    public void delete(Long id){
        partnerRepository.deleteById(id);
    }
}
