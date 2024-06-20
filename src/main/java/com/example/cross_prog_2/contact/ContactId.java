package com.example.cross_prog_2.contact;

import io.github.wimdeblauwe.jpearl.AbstractEntityId;

import java.io.Serializable;
import java.util.UUID;

public class ContactId extends AbstractEntityId<UUID> implements Serializable {

   /**
   * Default constructor for JPA
   */
   protected ContactId() {
   }

   public ContactId(UUID id) {
       super(id);
   }
}