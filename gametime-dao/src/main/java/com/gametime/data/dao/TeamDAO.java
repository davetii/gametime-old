package com.gametime.data.dao;


import com.gametime.data.entity.TeamEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
public interface TeamDAO extends CrudRepository<TeamEntity, Long> {
    List<TeamEntity> getTeamsByDivisionId(int id);
}
