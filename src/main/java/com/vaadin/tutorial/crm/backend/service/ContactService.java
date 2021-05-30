package com.vaadin.tutorial.crm.backend.service;

import com.vaadin.tutorial.crm.backend.entity.Contact;
import com.vaadin.tutorial.crm.backend.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vahid
 * "Good Thoughts, Good Words, Good Deeds. --Zarathustra"
 */

@Service
@Slf4j
public class ContactService {
    private ContactRepository contactRepository;

    public ContactService(final ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    public Long count() {
        return contactRepository.count();
    }

    public void delete(final Contact contact) {
        contactRepository.delete(contact);
    }

    public void save(final Contact contact) {
        if (null == contact) {
            log.error("Contact is null. Can not save it!");
            return;
        }
        contactRepository.save(contact);
    }

}
