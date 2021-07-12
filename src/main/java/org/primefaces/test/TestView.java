package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private int numberOfNotif;
    private String severity;

    @PostConstruct  
    public void init() {
        numberOfNotif = 0;
    }

    public int getNumberOfNotif() {
        return numberOfNotif;
    }

    public void setNumberOfNotif(int numberOfNotif) {
        this.numberOfNotif = numberOfNotif;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void updateData() {
        numberOfNotif++;
        severity = new String[] {
                "WARNING", "DANGER", "INFO"
        }[new Random().nextInt(3)].toLowerCase(Locale.ROOT);
    }

}
