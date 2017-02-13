package com.gametime.data.dao;

import com.gametime.data.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by dave on 2/11/2017.
 */
public interface PlayerDAO extends CrudRepository<PlayerEntity, Long> {
    List<PlayerEntity> findByLastName(String lastName);
    List<PlayerEntity> findByTeamId(Long teamId);
}
