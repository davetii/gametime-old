package com.gametime.data.entity;

import com.gametime.data.TeamDataVO;

import javax.persistence.*;


/**
 * Created by dave on 2/12/2017.
 */
@Entity
public class TeamEntity {

    @Id
    Integer id;

    @Column(name ="division_id")
    Integer divisionId;

    @Column(name ="logo")
    String logo;

    @Column(name ="locale")
    String locale;

    @Column(name ="locale_short")
    String localeShort;

    public Integer getId() { return id; }
    public void setId(Integer newValue) {
        this.id = newValue;
    }

    public Integer getDivisionId() {
        return divisionId;
    }
    public void setDivisionId(Integer newValue) {
        this.divisionId = newValue;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String newValue) {
        this.logo = newValue;
    }

    public String getLocale() {
        return locale;
    }
    public void setLocale(String newValue) {
        this.locale = newValue;
    }

    public String getLocaleShort() { return this.localeShort; }
    public void setLocaleShort(String newValue) { this.localeShort = newValue; }

    public TeamDataVO toDataVO() {
        TeamDataVO t = new TeamDataVO();
        t.setDivisionId(divisionId);
        t.setId(id);
        t.setLocale(locale);
        t.setLocaleShort(localeShort);
        t.setLogo(logo);
        return t;
    }
}
