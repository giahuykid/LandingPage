package com.giahuy.landingpagegetinf.controller.impl;

import com.giahuy.landingpagegetinf.controller.ConsultationController;
import com.giahuy.landingpagegetinf.dto.ConsultationRequestsDTO;
import com.giahuy.landingpagegetinf.service.ConsultationRequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
public class ConsultationControllerImpl implements ConsultationController {
    @Autowired
    private ConsultationRequestsService service;
    @Override
    @PostMapping("/createConsultation")
    public ConsultationRequestsDTO createConsultationRequests(@RequestBody ConsultationRequestsDTO consultationRequestsDTO) {
        return service.createConsultationRequests(consultationRequestsDTO);
    }
    @GetMapping("/ShowAllConsultation")
    @Override
    public List<ConsultationRequestsDTO> showAllConsultationRequests() {
        return service.showAllConsultationRequests();
    }

}
