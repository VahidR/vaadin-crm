package com.vaadin.tutorial.crm.backend.repository;

import com.vaadin.tutorial.crm.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vahid
 * "Good Thoughts, Good Words, Good Deeds. --Zarathustra"
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
