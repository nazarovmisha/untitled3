package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeveloperInteraction {
    private Developer developer;
@Autowired(required = false)
    public void run(){
        System.out.println(developer.getCode());
    }

}
