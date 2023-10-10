package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class WizardCourseKey implements Serializable {

    @Column(name = "wizard_id")
    private Long wizardId;

    @Column(name = "course_id")
    private Long courseId;

    public WizardCourseKey(){}

    public Long getWizardId() {
        return wizardId;
    }

    public void setWizardId(Long wizardId) {
        this.wizardId = wizardId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
