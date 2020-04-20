package com.example.SpringExample.SpringDataJPA;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table(name = "universities")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Column(name = "accreditation_level")
    private int accreditationLevel;

    @Column(name = "faculties_count")
    private int facultiesCount;

    @Column(name = "students_count")
    private int studentsCount;
    private String address;

    public University() {
    }

    public University(String name, int accreditationLevel, int facultiesCount, int studentsCount, String address) {
        this.name = name;
        this.accreditationLevel = accreditationLevel;
        this.facultiesCount = facultiesCount;
        this.studentsCount = studentsCount;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccreditationLevel() {
        return accreditationLevel;
    }

    public void setAccreditationLevel(int accreditationLevel) {
        this.accreditationLevel = accreditationLevel;
    }

    public int getFacultiesCount() {
        return facultiesCount;
    }

    public void setFacultiesCount(int facultiesCount) {
        this.facultiesCount = facultiesCount;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accreditationLevel=" + accreditationLevel +
                ", facultiesCount=" + facultiesCount +
                ", studentsCount=" + studentsCount +
                ", address='" + address + '\'' +
                '}';
    }
}
