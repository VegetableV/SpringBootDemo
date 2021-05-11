package com.hxy.service.Imp;

import com.hxy.dao.GuestDao;
import com.hxy.domain.Guest;
import com.hxy.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {


    @Autowired
    private GuestDao dao;


    @Override
    public List<Guest> reList() {
        return dao.reList();   //返回所有嘉宾的信息
    }

    @Override
    public void addGuest(Guest guest) {
//        guestDao.add(guest);
    }

    @Override
    public void updateGuest(Guest guest) {
//        guestDao.updateGuest(guest);
    }

    @Override
    public void deleteGuest(String uname) {
//        guestDao.delteGuest(uname);
    }
}
