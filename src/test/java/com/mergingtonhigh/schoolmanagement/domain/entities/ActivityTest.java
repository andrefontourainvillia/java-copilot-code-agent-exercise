package com.mergingtonhigh.schoolmanagement.domain.entities;

import com.mergingtonhigh.schoolmanagement.domain.valueobjects.Email;
import com.mergingtonhigh.schoolmanagement.domain.valueobjects.ScheduleDetails;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Activity domain entity.
 */
class ActivityTest {
    
    @Test
    void shouldCreateActivityWithValidData() {
        // Arrange
        ScheduleDetails schedule = new ScheduleDetails(
            List.of("Monday", "Wednesday"), 
            LocalTime.of(15, 30), 
            LocalTime.of(17, 0)
        );
        
        // Act
        Activity activity = new Activity(
            "Chess Club",
            "Learn chess strategies",
            "Mon/Wed 3:30-5:00 PM",
            schedule,
            12
        );
        
        // Assert
        assertEquals("Chess Club", activity.getName());
        assertEquals("Learn chess strategies", activity.getDescription());
        assertEquals(12, activity.getMaxParticipants());
        assertEquals(0, activity.getCurrentParticipantCount());
        assertTrue(activity.canAddParticipant());
    }
    
    @Test
    void shouldThrowExceptionWhenNameIsNull() {
        // Arrange
        ScheduleDetails schedule = new ScheduleDetails(
            List.of("Monday"), 
            LocalTime.of(15, 30), 
            LocalTime.of(17, 0)
        );
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> 
            new Activity(null, "Description", "Schedule", schedule, 12)
        );
    }
    
    @Test
    void shouldAddParticipantSuccessfully() {
        // Arrange
        Activity activity = createTestActivity();
        Email studentEmail = new Email("student@mergington.edu");
        
        // Act
        activity.addParticipant(studentEmail);
        
        // Assert
        assertEquals(1, activity.getCurrentParticipantCount());
        assertTrue(activity.isParticipantRegistered(studentEmail));
    }
    
    @Test
    void shouldThrowExceptionWhenAddingDuplicateParticipant() {
        // Arrange
        Activity activity = createTestActivity();
        Email studentEmail = new Email("student@mergington.edu");
        activity.addParticipant(studentEmail);
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> 
            activity.addParticipant(studentEmail)
        );
    }
    
    @Test
    void shouldRemoveParticipantSuccessfully() {
        // Arrange
        Activity activity = createTestActivity();
        Email studentEmail = new Email("student@mergington.edu");
        activity.addParticipant(studentEmail);
        
        // Act
        activity.removeParticipant(studentEmail);
        
        // Assert
        assertEquals(0, activity.getCurrentParticipantCount());
        assertFalse(activity.isParticipantRegistered(studentEmail));
    }
    
    @Test
    void shouldThrowExceptionWhenRemovingNonExistentParticipant() {
        // Arrange
        Activity activity = createTestActivity();
        Email studentEmail = new Email("student@mergington.edu");
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> 
            activity.removeParticipant(studentEmail)
        );
    }
    
    @Test
    void shouldCreateMangaManiacsActivityWithValidData() {
        // Arrange
        ScheduleDetails schedule = new ScheduleDetails(
            List.of("Tuesday"), 
            LocalTime.of(19, 0), 
            LocalTime.of(20, 0)
        );
        
        // Act
        Activity mangaActivity = new Activity(
            "Manga Maniacs",
            "🌸 Mergulhe no universo épico dos mangás japoneses! Descubra mundos fantásticos repletos de ninjas corajosos, piratas aventureiros, super-heróis com poderes únicos e romances emocionantes que vão fazer seu coração disparar. Dos clássicos atemporais aos lançamentos mais quentes, vamos explorar as páginas que definiram gerações e criaram fenômenos culturais globais. Prepare-se para discussões intensas, teorias malucas e descobrir seu próximo mangá favorito! ⚡🗾",
            "Tuesdays, 7:00 PM - 8:00 PM",
            schedule,
            15
        );
        
        // Assert
        assertEquals("Manga Maniacs", mangaActivity.getName());
        assertEquals("🌸 Mergulhe no universo épico dos mangás japoneses! Descubra mundos fantásticos repletos de ninjas corajosos, piratas aventureiros, super-heróis com poderes únicos e romances emocionantes que vão fazer seu coração disparar. Dos clássicos atemporais aos lançamentos mais quentes, vamos explorar as páginas que definiram gerações e criaram fenômenos culturais globais. Prepare-se para discussões intensas, teorias malucas e descobrir seu próximo mangá favorito! ⚡🗾", mangaActivity.getDescription());
        assertEquals(15, mangaActivity.getMaxParticipants());
        assertEquals(0, mangaActivity.getCurrentParticipantCount());
        assertTrue(mangaActivity.canAddParticipant());
        assertEquals(List.of("Tuesday"), mangaActivity.getScheduleDetails().days());
        assertEquals(LocalTime.of(19, 0), mangaActivity.getScheduleDetails().startTime());
        assertEquals(LocalTime.of(20, 0), mangaActivity.getScheduleDetails().endTime());
    }
    
    private Activity createTestActivity() {
        ScheduleDetails schedule = new ScheduleDetails(
            List.of("Monday"), 
            LocalTime.of(15, 30), 
            LocalTime.of(17, 0)
        );
        
        return new Activity(
            "Test Activity",
            "Test Description",
            "Mon 3:30-5:00 PM",
            schedule,
            12
        );
    }
}