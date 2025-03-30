package dev.calishu.jobapi.database.management;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Entity @Data
@Table(name="job_titles")
public class JobTitles {
    @Id @GeneratedValue
    private Integer id;
    @Column private String name;
    @Column private Boolean available;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Boolean getAvailability() { return available; }
    public void setAvailability(Boolean available) { this.available = available; }
}