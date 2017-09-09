package com.gametime.data;

/**
 * Created by dave on 2/12/2017.
 */
public class TeamDataVO {

    Integer id;
    Integer divisionId;
    String logo;
    String locale;
    String localeShort;

    public Integer getId() {
        return id;
    }
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

    public String getLocaleShort() { return localeShort; }
    public void setLocaleShort(String newValue) { this.localeShort = newValue; }
}
