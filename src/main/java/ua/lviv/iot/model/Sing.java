package ua.lviv.iot.model;


import javax.persistence.*;

@Entity
@Table(name = "sing", schema = "chaykovskiy_db", catalog = "")
public class Sing {
    private Integer id;
    private String dcbl;
    private String name;

    public Sing(Integer id) {
        this.id = id;
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
    @Column(name = "dcbl")
    public String getDcbl() {
        return dcbl;
    }

    public void setDcbl(String dcbl) {
        this.dcbl = dcbl;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sing that = (Sing) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dcbl != null ? !dcbl.equals(that.dcbl) : that.dcbl != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dcbl != null ? dcbl.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
