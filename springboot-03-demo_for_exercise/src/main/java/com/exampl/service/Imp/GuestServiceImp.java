package com.exampl.service.Imp;

import com.exampl.dao.GuestDao;
import com.exampl.domain.Guest;
import com.exampl.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {


    @Autowired
    private GuestDao guestDao;


    @Override
    public List<Guest> reList() {
        return guestDao.reList();   //返回所有嘉宾的信息
    }

    @Override
    public void addGuest(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void updateGuest(Guest guest) {
        guestDao.updateGuest(guest);
    }

    @Override
    public void deleteGuest(String uname) {
        guestDao.delteGuest(uname);
    }
}
