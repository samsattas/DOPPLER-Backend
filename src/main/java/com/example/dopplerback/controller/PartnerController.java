package com.example.dopplerback.controller;

import com.example.dopplerback.entity.Partner;
import com.example.dopplerback.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/partners")
public class PartnerController {
    @Autowired
    private PartnerService partnerService;

    @GetMapping
    public List<Partner> getAll(){
        return partnerService.getAll();
    }

    @GetMapping("/{partnerId}")
    public Optional<Partner> getById(@PathVariable("partnerId") Long partnerId){
        return partnerService.getById(partnerId);
    }

    @PostMapping
    public void post(@RequestBody Partner partner){
        partnerService.save(partner);
    }

    @DeleteMapping("/{partnerId}")
    public void delete(@PathVariable("partnerId") Long partnerId){
        partnerService.delete(partnerId);
    }
}
