package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "information", schema = "chaykovskiy_db", catalog = "")
public class Information {
    private Integer id;
    private Integer year;
    private String timeCode;

    public Information(Integer singId, Integer year, Integer timecode) {
    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "time_code")
    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Information that = (Information) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (timeCode != null ? !timeCode.equals(that.timeCode) : that.timeCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (timeCode != null ? timeCode.hashCode() : 0);
        return result;
    }
}
