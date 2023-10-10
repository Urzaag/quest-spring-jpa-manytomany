package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.*;

@Entity
public class WizardCourse {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @EmbeddedId
    WizardCourseKey id;

    @ManyToOne
    @JoinColumn(name = "wizard_id")
    private Wizard wizard;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private Integer presence;

    public WizardCourse() {
    }

    public WizardCourseKey getId() {
        return id;
    }

    public void setId(WizardCourseKey id) {
        this.id = id;
    }

    //    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Wizard getWizard() {
        return wizard;
    }

    public void setWizard(Wizard wizard) {
        this.wizard = wizard;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }
}
