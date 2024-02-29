package com.example.relationship.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import com.example.relationship.model.Freelancer;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Job {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int jid;
private String jName;
private int age;
@OneToMany(targetEntity = Freelancer.class, cascade = CascadeType.ALL)
@JoinColumn(name = "pro_id")
private List<Freelancer> pro;

public Job(int jid, String jName, int age) {
this.jid = jid;
this.jName = jName;
this.age = age;
}

public int getJid() {
return jid;
}

public void setjid(int jid) {
this.jid = jid;
}

public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}

public String getjName() {
return jName;
}

public void setfName(String jName) {
this.jName = jName;
}

public List<Freelancer> getPro() {
return pro;
}

public void setPro(List<Freelancer> pro) {
this.pro = pro;
}

}