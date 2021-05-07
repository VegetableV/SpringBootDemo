package com.hxy.dao;

import com.hxy.domain.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {
    static List<Guest> guests = new ArrayList<>();
    static {
        guests.add(new Guest(1,"黄晓明","店长"));
        guests.add(new Guest(2,"秦海璐","财务"));
        guests.add(new Guest(3,"林大厨","主厨"));
        guests.add(new Guest(4,"王俊凯","跑堂"));
        guests.add(new Guest(5,"杨紫","茶水小妹"));

    }

    public List<Guest> reList(){
        return guests;
    }

    public void add(Guest guest){
        guests.add(guest);
    }

    public Guest get(String name){
        for (Guest guest:guests){
            if (guest.getUname().equals(name))
            return guest;
        }
        return new Guest();
    }

    public void updateGuest(Guest newGuest){
        Guest oldGuest=get(newGuest.getUname());
        //System.out.println(oldGuest.getUname());
        oldGuest.setRole(newGuest.getRole());
    }

    public void delteGuest(String uname){
        guests.remove(get(uname));

    }


}
