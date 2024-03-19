package com.Company.Company.repository;

import com.Company.Company.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    List<Company> findByCompanyCode(String companyCode);
}
