package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Nicolas Palacios",12,24,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void deadRegistryResult() {
        Person person = new Person("Mayer Candelo",123456,20,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void invalideAgeRegistryResult() {

        Person person = new Person("Juan Baez",38297,15,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


    @Test
    public void underRageRegistryResult() {
        Person person = new Person("Jimena Hernandez",988765,-32,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void duplicatedRegistryResult() {

        Person person = new Person("Llanero",12,24,Gender.MALE,true);
        registry.registerVoter(person);
        Person person1 = new Person("Patas",12,24,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
}