package com.gametime.data.entity;

import com.gametime.data.TeamDataVO;

import javax.persistence.*;


/**
 * Created by dave on 2/12/2017.
 */
@Entity
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name ="division_id")
    Integer divisionId;

    @Column(name ="logo")
    String logo;

    @Column(name ="locale")
    String locale;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDivisionId() {
        return divisionId;
    }
    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLocale() {
        return locale;
    }
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public TeamDataVO toDataVO() {
        TeamDataVO t = new TeamDataVO();
        t.setDivisionId(divisionId);
        t.setId(id);
        t.setLocale(locale);
        t.setLogo(logo);
        return t;
    }
}
