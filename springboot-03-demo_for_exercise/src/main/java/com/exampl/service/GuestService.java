package com.exampl.service;

import com.exampl.domain.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> reList();

    void addGuest(Guest guest);

    void updateGuest(Guest guest);
    void deleteGuest(String uname);
}
