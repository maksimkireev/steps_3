package com.example.steps_3;

public class User {

    private int number_steps,distance,calories,activity_time,
            total_steps,calories_burned,total_driving_time,target_on_day;

    public User(int number_steps,int distance,int calories,int activity_time,
                int total_steps,int calories_burned,int total_driving_time,int target_on_day){
        this.number_steps=number_steps;
        this.distance=distance;
        this.calories=calories;
        this.activity_time=activity_time;
        this.total_steps=total_steps;
        this.calories_burned=calories_burned;
        this.total_driving_time=total_driving_time;
        this.target_on_day=target_on_day;

    }

    public int getNumber_steps() {
        return number_steps;
    }

    public void setNumber_steps(int number_steps) {
        this.number_steps = number_steps;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getActivity_time() {
        return activity_time;
    }

    public void setActivity_time(int activity_time) {
        this.activity_time = activity_time;
    }

    public int getTotal_steps() {
        return total_steps;
    }

    public void setTotal_steps(int total_steps) {
        this.total_steps = total_steps;
    }

    public int getCalories_burned() {
        return calories_burned;
    }

    public void setCalories_burned(int calories_burned) {
        this.calories_burned = calories_burned;
    }

    public int getTotal_driving_time() {
        return total_driving_time;
    }

    public void setTotal_driving_time(int total_driving_time) {
        this.total_driving_time = total_driving_time;
    }

    public int getTarget_on_day() {
        return target_on_day;
    }

    public void setTarget_on_day(int target_on_day) {
        this.target_on_day = target_on_day;
    }
}
