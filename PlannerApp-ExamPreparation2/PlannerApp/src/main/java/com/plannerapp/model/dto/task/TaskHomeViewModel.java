package com.plannerapp.model.dto.task;

import java.util.ArrayList;
import java.util.List;

public class TaskHomeViewModel {

    private List<TaskDTO> assignedTasks;
    private List<TaskDTO> availableTasks;
    private int availableSize;;

    public TaskHomeViewModel() {
        this(new ArrayList<>(), new ArrayList<>());
    }

    public TaskHomeViewModel(List<TaskDTO> assignedTasks, List<TaskDTO> availableTasks) {
        this.assignedTasks = assignedTasks;
        this.availableTasks = availableTasks;
        this.availableSize = availableTasks.size();
    }

    public List<TaskDTO> getAssignedTasks() {
        return assignedTasks;
    }

    public void setAssignedTasks(List<TaskDTO> assignedTasksToMe) {
        this.assignedTasks = assignedTasks;
    }

    public List<TaskDTO> getAvailableTasks() {
        return availableTasks;
    }

    public void setAvailableTasks(List<TaskDTO> availableTasks) {
        this.availableTasks = availableTasks;
    }

    public int getAvailableSize() {
        return availableSize;
    }

    public void setAvailableSize(int availableSize) {
        this.availableSize = availableSize;
    }
}
