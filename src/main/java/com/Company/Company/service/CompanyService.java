package com.Company.Company.service;

import com.Company.Company.company.Company;
import com.Company.Company.companydto.CompanyDTO;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    Company addCompany(CompanyDTO companyDTO);

    Company updateCompany(Long id, CompanyDTO companyDTO);

    void deleteCompany(Long id);

    Company getCompanyById(Long id);

    List<Company> getCompanyByCompanyCode(String companyCode);
}
