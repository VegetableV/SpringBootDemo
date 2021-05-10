package com.hxy.dao;

import com.hxy.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestDao extends JpaRepository<Guest,Long> {

}
