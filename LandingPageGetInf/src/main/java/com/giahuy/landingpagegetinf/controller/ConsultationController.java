package com.giahuy.landingpagegetinf.controller;

import com.giahuy.landingpagegetinf.dto.ConsultationRequestsDTO;

import java.util.List;

public interface ConsultationController {
    public ConsultationRequestsDTO createConsultationRequests(ConsultationRequestsDTO consultationRequestsDTO);
    public List<ConsultationRequestsDTO> showAllConsultationRequests();
}
