package com.Company.Company.service.serviceimpl;

import com.Company.Company.company.Company;
import com.Company.Company.companydto.CompanyDTO;
import com.Company.Company.repository.CompanyRepository;
import com.Company.Company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company addCompany(CompanyDTO companyDTO) {
       Company company = mapToCompanyEntity(companyDTO);
       return companyRepository.save(company);

    }

    private Company mapToCompanyEntity(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setCompanyName(companyDTO.getCompanyName());
        company.setCompanyCode(companyDTO.getCompanyCode());
        company.setEmail(companyDTO.getEmail());
        company.setStrength(companyDTO.getStrength());
        company.setWebSiteURL(companyDTO.getWebSiteURL());
        return company;
    }

    @Override
    public Company updateCompany(Long id, CompanyDTO companyDTO) {
        Company company = mapToCompanyEntity(companyDTO);
        if (companyRepository.existsById(id)) {
            company.setId(id);
            return companyRepository.save(company);
        } else {
            throw new RuntimeException("Company not found with id: " + id);
        }
    }

    @Override
    public void deleteCompany(Long id) {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
        } else {
            throw new RuntimeException("Company not found with id: " + id);
        }
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found with id: " + id));
    }

    @Override
    public List<Company> getCompanyByCompanyCode(String companyCode) {
     return  companyRepository.findByCompanyCode(companyCode);

    }
}

