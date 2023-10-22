package com.plannerapp.init;

import com.plannerapp.model.entity.Priority;
import com.plannerapp.model.enums.PriorityName;
import com.plannerapp.repo.PriorityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PriorityInit implements CommandLineRunner {

    private final PriorityRepository priorityRepository;

    public PriorityInit(PriorityRepository priorityRepository1) {
        this.priorityRepository = priorityRepository1;
    }

    @Override
    public void run(String... args) {
        boolean hasPriorities = priorityRepository.count() > 0;

        if (!hasPriorities) {
            List<Priority> priorities = new ArrayList<>();

            Arrays.stream(PriorityName.values())
                    .forEach(priorityName -> {
                        Priority priority = new Priority();
                        priority.setName(priorityName);
                        priorities.add(priority);
                    });

            priorityRepository.saveAll(priorities);
        }
    }
}
