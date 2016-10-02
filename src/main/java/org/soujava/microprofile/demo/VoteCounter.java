package org.soujava.microprofile.demo;


import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class VoteCounter {

    private static final String YES = "yes";

    private final AtomicInteger yes = new AtomicInteger();

    private final AtomicInteger no = new AtomicInteger();


    public void vote(String vote) {
        if (YES.equals(vote)) {
            voteYes();
        } else {
            voteNo();
        }
    }


    private void voteYes() {
        yes.incrementAndGet();
    }


    private void voteNo() {
        no.incrementAndGet();
    }

    public Map<String, Integer> getResult() {
        Map<String, Integer> votes = new HashMap<>();
        votes.put(YES, yes.get());
        votes.put("no", no.get());
        return votes;
    }


    @Override
    public String toString() {
        return "VoteCounter{" +
                "yes=" + yes +
                ", no=" + no +
                '}';
    }
}
