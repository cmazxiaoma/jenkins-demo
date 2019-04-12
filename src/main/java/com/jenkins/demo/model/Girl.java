package com.jenkins.demo.model;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/29 13:25
 */
@Table(name = "tbl_girl")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;

    private String cupSize;

    private Integer hash;

    public Girl(String name, Integer age, String cupSize) {
        this.name = name;
        this.age = age;
        this.cupSize = cupSize;
        this.hash = this.hashCode();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Girl girl = (Girl) o;

        if (!id.equals(girl.id)) return false;
        if (!name.equals(girl.name)) return false;
        if (!age.equals(girl.age)) return false;
        if (!cupSize.equals(girl.cupSize)) return false;
        return hash.equals(girl.hash);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        result = 31 * result + cupSize.hashCode();
        return result;
    }
}
