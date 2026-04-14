package com.example.schedule2.service;

import com.example.schedule2.dto.CreateScheduleRequest;
import com.example.schedule2.dto.CreateScheduleResponse;
import com.example.schedule2.entity.Schedule;
import com.example.schedule2.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Transactional
    public CreateScheduleResponse save(CreateScheduleRequest request) {
        Schedule schedule = new Schedule(request.getTitle(),request.getContents(),request.getAuthor(),request.getPassword());
        Schedule savedSchedule = scheduleRepository.save(schedule);
        return new CreateScheduleResponse(savedSchedule);
    }
}
