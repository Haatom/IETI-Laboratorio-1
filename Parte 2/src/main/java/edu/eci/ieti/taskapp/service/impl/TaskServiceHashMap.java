package edu.eci.ieti.taskapp.service.impl;

import edu.eci.ieti.taskapp.entities.Task;
import edu.eci.ieti.taskapp.service.TaskService;
import edu.eci.ieti.taskapp.service.TaskServiceException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TaskServiceHashMap implements TaskService {
    private final ConcurrentHashMap<String, Task> tasks = new ConcurrentHashMap<>();

    @Override
    public Task create(Task task) {
        tasks.putIfAbsent(task.getId(),task);
        return task;
    }

    @Override
    public Task findById(String id) throws TaskServiceException {
        Optional<Task> optionalTask = Optional.ofNullable( tasks.get(id));
        optionalTask.orElseThrow( ()-> new TaskServiceException(TaskServiceException.NOT_EXISTS));
        return optionalTask.get();
    }

    @Override
    public List<Task> getAll() {
        List<Task> allTasks = new ArrayList<>();
        for( String key : tasks.keySet()){
            allTasks.add(tasks.get(key));
        }
        return allTasks;
    }

    @Override
    public boolean deleteById(String id) throws TaskServiceException {
        if ( !tasks.containsKey(id)) throw new TaskServiceException(TaskServiceException.NOT_EXISTS);
        tasks.remove(id);
        return false;
    }

    @Override
    public Task update(Task newTask, String id) throws TaskServiceException {
        if ( !tasks.containsKey(id)) throw new TaskServiceException(TaskServiceException.NOT_EXISTS);
        return tasks.replace(id, newTask);
    }
}
