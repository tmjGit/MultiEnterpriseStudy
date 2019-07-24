package li.tmj.multienterprise;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;

@Named //(value ="test")
@SessionScoped
public class PersonController implements Serializable{
	private static final long serialVersionUID = 9028481340738774662L;
    private String output = "hello world";

    @PostConstruct
    public void init() {
    	output = "Running JSF "+FacesContext.class.getPackage().getImplementationVersion();
    }
    
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}