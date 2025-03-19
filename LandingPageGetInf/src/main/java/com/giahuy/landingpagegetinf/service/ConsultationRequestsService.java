package com.giahuy.landingpagegetinf.service;

import com.giahuy.landingpagegetinf.dto.ConsultationRequestsDTO;

import java.util.List;

public interface ConsultationRequestsService {
    public ConsultationRequestsDTO createConsultationRequests(ConsultationRequestsDTO consultationRequestsDTO);
    public List<ConsultationRequestsDTO> showAllConsultationRequests();
}
