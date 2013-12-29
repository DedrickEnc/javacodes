/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pac;

/**
 *
 * @author IMA7
 */
  
import java.io.IOException;
import java.io.Serializable; 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "pprBean", eager = true)
@SessionScoped  
public class PPRBean implements Serializable {  
  FacesContext context = FacesContext.getCurrentInstance();
    private String firstname;  
      
    public String getFirstname() {  
        return firstname;  
    }  
  
    public void setFirstname(String firstname) {  
        this.firstname = firstname;  
    } 
    
    public void redirect() throws IOException{
        System.out.println("**************************");
        context.getExternalContext().redirect("/pages/exemples.xhtml");        
    }
        
} 