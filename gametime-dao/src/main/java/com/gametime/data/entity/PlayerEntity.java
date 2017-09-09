package com.gametime.data.entity;

import com.gametime.common.Player;
import com.gametime.data.PlayerDataVO;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by dave on 2/11/2017.
 */
@Entity
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name ="team_id")
    private Integer teamId;

    @Column(name ="first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastName;

    @Column(name ="height")
    private String height;

    @Column(name ="weight")
    private String weight;

    @Column(name ="birth_date")
    private Date dateOfBirth;

    @Column(name ="agility")
    private int agility;

    @Column(name ="charisma")
    private int charisma;

    @Column(name ="desire")
    private int desire;

    @Column(name ="ego")
    private int ego;

    @Column(name ="endurance")
    private int endurance;

    @Column(name ="energy")
    private int energy;

    @Column(name ="handle")
    private int handle;

    @Column(name ="health")
    private int health;

    @Column(name ="intelligence")
    private int intelligence;

    @Column(name ="luck")
    private int luck;

    @Column(name ="person")
    private int person;

    @Column(name ="shot_selection")
    private int shotSelection;

    @Column(name ="shot_skill")
    private int shotSkill;

    @Column(name ="size")
    private int size;

    @Column(name ="speed")
    private int speed;

    @Column(name ="strength")
    private int strength;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getHeight() { return height; }
    public void setHeight(String height) { this.height = height; }

    public String getWeight() { return weight; }
    public void setWeight(String weight) { this.weight = weight; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public int getAgility() { return agility; }
    public void setAgility(int agility) { this.agility = agility; }

    public int getCharisma() { return charisma; }
    public void setCharisma(int charisma) { this.charisma = charisma; }

    public int getDesire() { return desire; }
    public void setDesire(int desire) { this.desire = desire; }

    public int getEgo() { return ego; }
    public void setEgo(int ego) { this.ego = ego; }

    public int getEndurance() { return endurance; }
    public void setEndurance(int endurance) { this.endurance = endurance; }

    public int getEnergy() { return energy; }
    public void setEnergy(int energy) { this.energy = energy; }

    public int getHandle() { return handle; }
    public void setHandle(int handle) { this.handle = handle; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getIntelligence() { return intelligence; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public int getLuck() { return luck; }
    public void setLuck(int luck) { this.luck = luck; }

    public int getPerson() { return person; }
    public void setPerson(int person) { this.person = person; }

    public int getShotSelection() { return shotSelection; }
    public void setShotSelection(int shotSelection) { this.shotSelection = shotSelection; }

    public int getShotSkill() { return shotSkill; }
    public void setShotSkill(int shotSkill) { this.shotSkill = shotSkill; }

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public Integer getTeamId() { return teamId; }
    public void setTeamId(Integer teamId) { this.teamId = teamId; }

    public PlayerDataVO toDataVO() {
        PlayerDataVO vo = new PlayerDataVO();
        vo.setId(id);
        vo.setFirstName(firstName);
        vo.setLastName(lastName);
        vo.setHeight(height);
        vo.setWeight(weight);
        vo.setTeamId(teamId);
        vo.setDateOfBirth(dateOfBirth);

        vo.setAgility(agility);
        vo.setCharisma(charisma);
        vo.setDesire(desire);
        vo.setEgo(ego);
        vo.setEndurance(endurance);
        vo.setEnergy(energy);
        vo.setHandle(handle);
        vo.setHealth(health);
        vo.setIntelligence(intelligence);
        vo.setLuck(luck);
        vo.setPerson(person);
        vo.setShotSelection(shotSelection);
        vo.setShotSkill(shotSkill);
        vo.setSize(size);
        vo.setSpeed(speed);
        vo.setStrength(strength);
        return vo;
    }

    public PlayerEntity() {

    }

    public PlayerEntity(Player p) {
        id = p.getId();
        teamId = p.getTeamId();

        if(p.getPerson() != null) {
            firstName = p.getPerson().getFirstName();
            lastName = p.getPerson().getLastName();
            height = p.getPerson().getHeight();
            weight = p.getPerson().getWeight();
            if (p.getPerson().getDateOfBirth() != null) {
                dateOfBirth = new Date(p.getPerson().getDateOfBirth().getTimeInMillis());
            }
        }

        if(p.getAttributes() != null) {
            agility = p.getAttributes().getAgility();
            charisma = p.getAttributes().getCharisma();
            desire = p.getAttributes().getDesire();
            ego = p.getAttributes().getEgo();
            endurance = p.getAttributes().getEndurance();
            energy = p.getAttributes().getEnergy();
            handle = p.getAttributes().getHandle();
            health = p.getAttributes().getHealth();
            intelligence = p.getAttributes().getIntelligence();
            luck = p.getAttributes().getLuck();
            person = p.getAttributes().getPerson();
            shotSelection = p.getAttributes().getShotSelection();
            shotSkill = p.getAttributes().getShotSkill();
            size = p.getAttributes().getSize();
            speed = p.getAttributes().getSpeed();
            strength = p.getAttributes().getStrength();
        }


    }


}
