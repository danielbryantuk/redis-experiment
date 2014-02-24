package uk.co.taidev.redisexperiment.model;

import java.util.Date;
import java.util.Set;

/**
 * Meeting
 */
public class Meeting {

    private Long id;
    private String location;
    private Date date;
    private Set<Long> participantIds;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Long> getParticipantIds() {
        return participantIds;
    }

    public void setParticipantIds(Set<Long> participantIds) {
        this.participantIds = participantIds;
    }
}
