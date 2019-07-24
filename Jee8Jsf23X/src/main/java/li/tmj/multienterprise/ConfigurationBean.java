package li.tmj.multienterprise;

import javax.faces.annotation.FacesConfig;

/** 
 * Needed for CDI with this JSF-Version.
 * When useing bean-discovery-mode="annotated", it's needed on every Bean!
 * This also activates JSF, so with this, a faces.config.xml is not needed.
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
public class ConfigurationBean { }