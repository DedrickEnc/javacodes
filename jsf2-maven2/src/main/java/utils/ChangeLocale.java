/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author IMA7
 */
@ManagedBean
@SessionScoped
public class ChangeLocale implements Serializable {

    private String locale = "fr";

    public ChangeLocale() {
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String setFrenchLocale() {
        locale = "fr";
        return null;
    }

    public String setEnglishLocale() {
        locale = "en";
        return null;
    }
}
