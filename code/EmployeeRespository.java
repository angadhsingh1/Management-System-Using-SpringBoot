package com.example.demo;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRespository {

    @Cacheable("Employee")


    public Employee getEmployeeByName(String name) {
        simulateSlowService();
        return new Employee(name, "this is an example role");
//        return findEmployeeInSlowSource(name);
    }


    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
    /*
    private Employee findEmployeeInSlowSource(String name) {


        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "This is a book name";
    }
     */

}
