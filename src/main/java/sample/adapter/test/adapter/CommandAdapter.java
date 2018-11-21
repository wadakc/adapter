package sample.adapter.test.adapter;


import org.springframework.stereotype.Component;

@Component
public class CommandAdapter {


    public String echo(){
        return "Library build safely !";
    }
}
