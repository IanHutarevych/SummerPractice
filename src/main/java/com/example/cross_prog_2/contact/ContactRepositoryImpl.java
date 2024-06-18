package com.example.cross_prog_2.contact;

import io.github.wimdeblauwe.jpearl.UniqueIdGenerator;

import java.util.UUID;

public class ContactRepositoryImpl implements ContactRepositoryCustom {
    private final UniqueIdGenerator<UUID> generator;

    public ContactRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    @Override
    public ContactId nextId() {
        return new ContactId(generator.getNextUniqueId());
    }
}