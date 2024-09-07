package com.example.serving_web_content.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 20, message = "Имя должно содержать от 2 до 20 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-ЯёЁ]+$", message = "Имя должно содержать только буквы")
    private String first_name;

    @NotBlank(message = "Фамилия не должна быть пустой")
    @Size(min = 2, max = 20, message = "Фамилия должна содержать от 2 до 20 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-ЯёЁ]+$", message = "Фамилия должна содержать только буквы")
    private String last_name;

    @NotBlank(message = "Номер телефона не должен быть пустым")
    @Pattern(regexp = "^\\d{11}$", message = "Номер телефона должен содержать 11 цифр")
    private String phone;

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone() {
        return phone;
    }

    public Booking(){

    }

    public Booking(String first_name, String last_name, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
    }
}
