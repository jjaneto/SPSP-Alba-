package jmetal.problems.SPSP;

import jmetal.problems.SPSP.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author joaqu
 */
public class Task implements Comparable<Task>{

    private double start;
    private double end;
    private int id;
    private double duration;
    private double effort;
    private ArrayList<Integer> requiredSkills;
    //private ArrayList<Integer> antecessores;
    
    public Task(int id) {
        requiredSkills = new ArrayList<>();
        this.id = id;
        this.end = -1;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public ArrayList<Integer> getRequiredSkills() {
        return requiredSkills;
    }

    public void addRequiredSkill(int skill){
        this.requiredSkills.add(skill);
    }
    
    public void setRequiredSkills(ArrayList<Integer> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public double getEffort() {
        return effort;
    }

    public void setEffort(double effort) {
        this.effort = effort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public void sortRequiredSkills(){
        Collections.sort(requiredSkills);
    }

    @Override
    public int compareTo(Task o) {
        return getId() - o.getId();
    }
    
}