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


    public CreateScheduleResponse save(CreateScheduleRequest request) {
        Schedule schedule = new Schedule(request.getContents());
        Schedule savedSchedule = scheduleRepository.save(schedule);
        return new CreateScheduleResponse(
                savedSchedule.getId(),
                savedSchedule.getContent()
        );
    }
}
