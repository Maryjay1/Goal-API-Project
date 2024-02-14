package com.goaltracking.demo.model;

import java.util.List;

public interface GoalRepository {
    List<Goal> getAllGoals();
    Goal getGoalById(String id);
    void addGoal(Goal goal);
    void updateGoal(Goal goal);
    void deleteGoal(String id);
}
