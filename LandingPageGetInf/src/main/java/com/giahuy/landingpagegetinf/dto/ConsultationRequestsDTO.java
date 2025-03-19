package com.giahuy.landingpagegetinf.dto;

import com.giahuy.landingpagegetinf.inquiryDescriptionEnum.InquiryDescription;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultationRequestsDTO {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private InquiryDescription inquiryDescription;


    public ConsultationRequestsDTO() {

    }

    public ConsultationRequestsDTO(int id, String fullName, String email, String phone, String address, InquiryDescription inquiryDescription) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.inquiryDescription = inquiryDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InquiryDescription getInquiryDescription() {
        return inquiryDescription;
    }

    public void setInquiryDescription(InquiryDescription inquiryDescription) {
        this.inquiryDescription = inquiryDescription;
    }
}
