package com.mergingtonhigh.schoolmanagement.application.dtos;

import com.mergingtonhigh.schoolmanagement.domain.valueobjects.DifficultyLevel;
import java.util.List;

/**
 * DTO for activity data transfer.
 */
public record ActivityDTO(
    String name,
    String description,
    String schedule,
    ScheduleDetailsDTO scheduleDetails,
    int maxParticipants,
    List<String> participants,
    int currentParticipantCount,
    DifficultyLevel difficultyLevel
) {
    public record ScheduleDetailsDTO(
        List<String> days,
        String startTime,
        String endTime
    ) {}
}