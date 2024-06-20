package com.example.cross_prog_2.contact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ContactRepository extends CrudRepository<Contact, ContactId>, ContactRepositoryCustom {
}