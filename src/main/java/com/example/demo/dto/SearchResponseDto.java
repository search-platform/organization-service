package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
//@Builder
public class SearchResponseDto {

    private SearchResponseType type;
    private Long countryId;
    private String countryName;
    private Long orgId;
    private String orgName;
    private String orgLogoUrl;
    private Long contactId;
    private String value;

    public SearchResponseDto() {
    }

    public SearchResponseDto(String type) {
        this.type = SearchResponseType.valueOf(type);
    }

    public SearchResponseDto(int type) {
        this.type = SearchResponseType.valueOf("type");
    }

//    public SearchResponseDto(SearchResponseType type, Long countryId, String countryName, Long orgId, String orgName, String orgLogoUrl, Long contactId, String value) {
//        this.type = type;
//        this.countryId = countryId;
//        this.countryName = countryName;
//        this.orgId = orgId;
//        this.orgName = orgName;
//        this.orgLogoUrl = orgLogoUrl;
//        this.contactId = contactId;
//        this.value = value;
//    }
}
