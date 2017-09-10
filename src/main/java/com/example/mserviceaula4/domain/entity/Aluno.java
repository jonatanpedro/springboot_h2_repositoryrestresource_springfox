package com.example.mserviceaula4.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@XmlRootElement
@Entity
public class Aluno {

    @Id @GeneratedValue
    private Integer id;
    private String nome;
    private Integer matricula;
    private String email;
    private Date dtNascimento;

}
