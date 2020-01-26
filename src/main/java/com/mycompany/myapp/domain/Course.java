package com.mycompany.myapp.domain;

import jdk.jfr.DataAmount;
import lombok.Data;

/* In Course we used Lombok for mapping */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name ="course")
@Data

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, columnDefinition = "bigint")
    private long id;

    @Column(name ="course_name", nullable = false, length = 100, columnDefinition = "nvarchar")
    private String courseName;

    @Column(name ="course_content", nullable = false, length = 30, columnDefinition = "nvarchar")
    private String courseContent;

    @Column(name ="course_location", nullable = false, length = 200, columnDefinition = "nvarchar")
    private String courseLocation;

    @Column(name ="teacher_id", nullable = false,  columnDefinition = "bigint")
    private String teacherId;
}
