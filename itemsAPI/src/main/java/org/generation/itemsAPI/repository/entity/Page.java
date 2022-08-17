package org.generation.itemsAPI.repository.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import ;import java.util.Date;

@Entity
@table(name="group")
public class group {
private Integer groupid;
private String groupName;
private String groupDetails;
private String admin;
private Date groupJoinedDate;
private String groupLeftDate;

    public group(Integer groupid, String groupName, String groupDetails, String admin, Date groupJoinedDate, String groupLeftDate) {
        this.groupid = groupid;
        this.groupName = groupName;
        this.groupDetails = groupDetails;
        this.admin = admin;
        this.groupJoinedDate = groupJoinedDate;
        this.groupLeftDate = groupLeftDate;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDetails() {
        return groupDetails;
    }

    public void setGroupDetails(String groupDetails) {
        this.groupDetails = groupDetails;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public Date getGroupJoinedDate() {
        return groupJoinedDate;
    }

    public void setGroupJoinedDate(Date groupJoinedDate) {
        this.groupJoinedDate = groupJoinedDate;
    }

    public String getGroupLeftDate() {
        return groupLeftDate;
    }

    public void setGroupLeftDate(String groupLeftDate) {
        this.groupLeftDate = groupLeftDate;
    }

    @Override
    public String toString() {
        return "group{" +
                "groupid=" + groupid +
                ", groupName='" + groupName + '\'' +
                ", groupDetails='" + groupDetails + '\'' +
                ", admin='" + admin + '\'' +
                ", groupJoinedDate=" + groupJoinedDate +
                ", groupLeftDate='" + groupLeftDate + '\'' +
                '}';
    }
}
