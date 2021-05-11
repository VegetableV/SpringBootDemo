package com.hxy.service;

import com.hxy.domain.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> reList();

    void addGuest(Guest guest);

    void updateGuest(Guest guest);
    void deleteGuest(String uname);
}
