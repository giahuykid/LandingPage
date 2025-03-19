package com.giahuy.landingpagegetinf.service.impl;

import com.giahuy.landingpagegetinf.dto.ConsultationRequestsDTO;
import com.giahuy.landingpagegetinf.entity.ConsultationRequests;
import com.giahuy.landingpagegetinf.inquiryDescriptionEnum.InquiryDescription;
import com.giahuy.landingpagegetinf.mapping.ConsultationRequestMapping;
import com.giahuy.landingpagegetinf.repository.ConsultationRequestsRepository;
import com.giahuy.landingpagegetinf.service.ConsultationRequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultationRequestsServiceImpl implements ConsultationRequestsService {
    @Autowired
    private ConsultationRequestsRepository consultationRequestsRepository;

    @Override
    public ConsultationRequestsDTO createConsultationRequests(ConsultationRequestsDTO consultationRequestsDTO) {
        consultationRequestsDTO.setInquiryDescription(InquiryDescription.consultationrequestcoursejava);
      ConsultationRequests consultationRequests= ConsultationRequestMapping.getFromEntity(consultationRequestsDTO);
      consultationRequestsRepository.save(consultationRequests);
      return ConsultationRequestMapping.getToDTO(consultationRequests);
    }

    @Override
    public List<ConsultationRequestsDTO> showAllConsultationRequests() {
    List<ConsultationRequests> consultationRequestsList = consultationRequestsRepository.findAll();
    List<ConsultationRequestsDTO> consultationRequestsDTOList = new ArrayList<>();
    for (ConsultationRequests consultationRequests : consultationRequestsList) {
        if (consultationRequests.getInquiryDescription().equals(InquiryDescription.consultationrequestcoursejava) ) {
            consultationRequestsDTOList.add(ConsultationRequestMapping.getToDTO(consultationRequests));
        }
    }
        return consultationRequestsDTOList;
    }
}
