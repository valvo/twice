package de.convamo.hibernate.twice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by valeriusv on 29.02.16.
 */
@Entity
public class Metadata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Metadata{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
