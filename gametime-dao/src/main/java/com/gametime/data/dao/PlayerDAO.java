package com.gametime.data.dao;

import com.gametime.data.dto.PlayerData;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by dave on 2/11/2017.
 */
public interface PlayerDAO extends CrudRepository<PlayerData, Long> {
    List<PlayerData> findByLastName(String lastName);
}
