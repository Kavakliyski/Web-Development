package com.example.SofiaKnightsWeb.Player;

import javax.persistence.*;


@Entity
@Table(name = "sofiaknights")
public class Player{

//    @GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String first_name;
    private String sur_name;
    private String last_name;
    private String position;
    private String dob;
    private Long play_number;


    public Player() {
    }

    public Player(Long id, String name, String sur_name, String last_name, String position, String dob, Long play_number) {
        this.id = id;
        this.first_name = name;
        this.sur_name = sur_name;
        this.last_name = last_name;
        this.position = position;
        this.dob = dob;
        this.play_number = play_number;
    }

    public Player(String name, String sur_name, String last_name, String position, String dob, Long play_number) {
        this.first_name = name;
        this.sur_name = sur_name;
        this.last_name = last_name;
        this.position = position;
        this.dob = dob;
        this.play_number = play_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Long getPlay_number() {
        return play_number;
    }

    public void setPlay_number(Long play_number) {
        this.play_number = play_number;
    }

    public String getSur_name() {
        return sur_name;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", sur_name='" + sur_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", position='" + position + '\'' +
                ", dob='" + dob + '\'' +
                ", play_number=" + play_number +
                '}';
    }
}
