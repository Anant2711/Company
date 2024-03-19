package com.Company.Company.Mapper;


import com.Company.Company.company.Company;
import com.Company.Company.companydto.CompanyDTO;

import java.util.List;
import java.util.Set;

public interface CompanyMapper {

    CompanyDTO getCompanyDTO(Company entity);

    List<CompanyDTO> getCompanyDTOList(List<Company> entityList);

    Set<CompanyDTO> getCompanyDTOSet(Set<Company> entitySet);

    Company getCompany(CompanyDTO dto);
}
