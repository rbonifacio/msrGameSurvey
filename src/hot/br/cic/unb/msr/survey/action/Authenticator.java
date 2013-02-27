package br.cic.unb.msr.survey.action;

import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

import br.cic.unb.msr.survey.model.User;

@Name("authenticator")
public class Authenticator
{
    @Logger private Log log;

    @In private Identity identity;
    
    @In private Credentials credentials;

    @In private EntityManager entityManager;
    
    @Out(required=false, scope=ScopeType.SESSION) 
    private User loggedUser;
    
    public boolean authenticate()
    {
        log.info("authenticating {0}", credentials.getUsername());
       
        List<User> users = entityManager.createQuery("from User u where u.login = :pLogin").setParameter("pLogin", credentials.getUsername()).getResultList();
        
        if(users.size() == 1 && users.get(0).getPassword().equals(credentials.getPassword())) {
        	loggedUser = users.get(0);
        	identity.addRole("user");
            return true;
        }
        return false;
    }

}
