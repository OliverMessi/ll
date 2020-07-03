package com.wdm.lifestyle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "update_records")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class UpdateRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "time_stamp")
    String timeStamp;
    String content;
    @Column(name = "create_time")
    String createTime;
    @Column(name = "commit_persion")
    String commitPersion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public String getCommitPersion() {
        return commitPersion;
    }

    public void setCommitPersion(String commitPersion) {
        this.commitPersion = commitPersion;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
