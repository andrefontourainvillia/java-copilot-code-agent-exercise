package com.mergingtonhigh.schoolmanagement.infrastructure.migrations;

import java.time.LocalTime;
import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mergingtonhigh.schoolmanagement.domain.entities.Activity;
import com.mergingtonhigh.schoolmanagement.domain.valueobjects.ScheduleDetails;

import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;

/**
 * Adds the Manga Maniacs club to the extracurricular activities system.
 * This migration creates a new activity focused on Japanese manga culture.
 */
@ChangeUnit(id = "add-manga-maniacs-activity", order = "002", author = "Andre Fontoura")
public class V002_AddMangaManiacsActivity {

    private final MongoTemplate mongoTemplate;

    public V002_AddMangaManiacsActivity(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Execution
    public void addMangaManiacsActivity() {
        // Check if activity already exists to avoid duplicates
        Query existingQuery = new Query(Criteria.where("name").is("Manga Maniacs"));
        if (mongoTemplate.count(existingQuery, Activity.class) == 0) {
            
            // Create Manga Maniacs activity with engaging description
            Activity mangaManiacs = new Activity(
                    "Manga Maniacs",
                    "🌸 Mergulhe no universo épico dos mangás japoneses! Descubra mundos fantásticos repletos de ninjas corajosos, piratas aventureiros, super-heróis com poderes únicos e romances emocionantes que vão fazer seu coração disparar. Dos clássicos atemporais aos lançamentos mais quentes, vamos explorar as páginas que definiram gerações e criaram fenômenos culturais globais. Prepare-se para discussões intensas, teorias malucas e descobrir seu próximo mangá favorito! ⚡🗾",
                    "Tuesdays, 7:00 PM - 8:00 PM",
                    new ScheduleDetails(List.of("Tuesday"), LocalTime.of(19, 0), LocalTime.of(20, 0)),
                    15);
            
            mangaManiacs.setParticipants(List.of());
            mongoTemplate.save(mangaManiacs);
        }
    }

    @RollbackExecution
    public void rollback() {
        // Remove the Manga Maniacs activity
        mongoTemplate.remove(new Query(Criteria.where("name").is("Manga Maniacs")), Activity.class);
    }
}