package com.giahuy.landingpagegetinf.mapping;

import com.giahuy.landingpagegetinf.dto.ConsultationRequestsDTO;
import com.giahuy.landingpagegetinf.entity.ConsultationRequests;

public class ConsultationRequestMapping {

    public static ConsultationRequestsDTO getToDTO(ConsultationRequests entity) {
        return new ConsultationRequestsDTO(
                entity.getId(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getAddress(),
                entity.getInquiryDescription()
        );
    }
    public static ConsultationRequests getFromEntity(ConsultationRequestsDTO dto) {
        return new ConsultationRequests(
                dto.getId(),
                dto.getFullName(),
                dto.getEmail(),
                dto.getPhone(),
                dto.getAddress(),
                dto.getInquiryDescription()
        );
    }
}
