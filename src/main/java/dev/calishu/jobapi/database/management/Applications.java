package dev.calishu.jobapi.database.management;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Entity @Data
@Table(name="applications")
public class Applications {
    @Id @GeneratedValue
    private Integer id;
    @Column private String name;
    @Column private String birthday;
    @Column private String email;
    @Column private String phoneNumber;
    @Column private String address;

    // Base64 Encoded
    @Column private String coverLetter;
    @Column private String resumee;
    @Column private String certifications;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBirthday() { return birthday; }
    public void setBirthday() { this.birthday = birthday; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCoverLetter() { return coverLetter; }
    public void setCoverLetter(String coverLetter) { this.coverLetter = coverLetter; }

    public String getResumee() { return resumee; }
    public void setResumee(String resumee) { this.resumee = resumee; }

    public String getCertifications() { return certifications; }
    public void setCertifications(String certifications) { this.certifications = certifications; }
}