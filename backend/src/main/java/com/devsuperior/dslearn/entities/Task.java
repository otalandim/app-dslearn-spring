package com.devsuperior.dslearn.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "tb_task")
public class Task extends Lesson {

    private String description;
    private Integer questionCount;
    private Integer approveCount;
    private Double weight;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;

    public Task () {
    }

    public Task (Long id, String title, Integer position, Section section, String description, Integer questionCount, Integer approveCount, Double weight, Instant dueDate) {
        super(id, title, position, section);
        this.description = description;
        this.questionCount = questionCount;
        this.approveCount = approveCount;
        this.weight = weight;
        this.dueDate = dueDate;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public Integer getQuestionCount () {
        return questionCount;
    }

    public void setQuestionCount (Integer questionCount) {
        this.questionCount = questionCount;
    }

    public Integer getApproveCount () {
        return approveCount;
    }

    public void setApproveCount (Integer approveCount) {
        this.approveCount = approveCount;
    }

    public Double getWeight () {
        return weight;
    }

    public void setWeight (Double weight) {
        this.weight = weight;
    }

    public Instant getDueDate () {
        return dueDate;
    }

    public void setDueDate (Instant dueDate) {
        this.dueDate = dueDate;
    }
}
