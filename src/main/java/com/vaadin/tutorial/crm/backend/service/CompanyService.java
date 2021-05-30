package com.vaadin.tutorial.crm.backend.service;

import com.vaadin.tutorial.crm.backend.entity.Company;
import com.vaadin.tutorial.crm.backend.repository.CompanyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vahid
 * "Good Thoughts, Good Words, Good Deeds. --Zarathustra"
 */

@Service
@Slf4j
public class CompanyService {
    private CompanyRepository companyRepository;

    public CompanyService(final CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
