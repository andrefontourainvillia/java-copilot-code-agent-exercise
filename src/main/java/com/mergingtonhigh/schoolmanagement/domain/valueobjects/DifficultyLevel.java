package com.mergingtonhigh.schoolmanagement.domain.valueobjects;

/**
 * Enum representing the difficulty level of an activity.
 * Activities without a specified difficulty level are considered suitable for all levels.
 */
public enum DifficultyLevel {
    BEGINNER("Iniciante"),
    INTERMEDIATE("Intermediário"), 
    ADVANCED("Avançado");
    
    private final String displayName;
    
    DifficultyLevel(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    /**
     * Get DifficultyLevel from display name.
     */
    public static DifficultyLevel fromDisplayName(String displayName) {
        for (DifficultyLevel level : values()) {
            if (level.getDisplayName().equals(displayName)) {
                return level;
            }
        }
        throw new IllegalArgumentException("Invalid difficulty level: " + displayName);
    }
}