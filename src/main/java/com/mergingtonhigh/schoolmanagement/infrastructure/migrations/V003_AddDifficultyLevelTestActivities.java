package com.mergingtonhigh.schoolmanagement.infrastructure.migrations;

import java.time.LocalTime;
import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mergingtonhigh.schoolmanagement.domain.entities.Activity;
import com.mergingtonhigh.schoolmanagement.domain.valueobjects.DifficultyLevel;
import com.mergingtonhigh.schoolmanagement.domain.valueobjects.ScheduleDetails;

import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;

/**
 * Adds activities with different difficulty levels to test the feature.
 */
@ChangeUnit(id = "add-difficulty-level-test-activities", order = "003", author = "Andre Fontoura")
public class V003_AddDifficultyLevelTestActivities {

    private final MongoTemplate mongoTemplate;

    public V003_AddDifficultyLevelTestActivities(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Execution
    public void addDifficultyLevelTestActivities() {
        
        // Check if activities already exist to avoid duplicates
        if (!activityExists("Advanced Coding Challenge") && !activityExists("Beginner Art Workshop")) {
            
            // Create Advanced Coding Challenge (Advanced level)
            Activity advancedCoding = new Activity(
                "Advanced Coding Challenge",
                "🚀 Mergulhe em desafios de programação complexos! Resolva problemas algorítmicos avançados, trabalhe com estruturas de dados sofisticadas e desenvolva soluções otimizadas. Para estudantes que já dominam o básico e querem elevar suas habilidades de programação ao próximo nível.",
                "Fridays, 4:00 PM - 6:00 PM",
                new ScheduleDetails(List.of("Friday"), LocalTime.of(16, 0), LocalTime.of(18, 0)),
                8,
                DifficultyLevel.ADVANCED
            );
            advancedCoding.setParticipants(List.of());
            mongoTemplate.save(advancedCoding);
            
            // Create Beginner Art Workshop (Beginner level)
            Activity beginnerArt = new Activity(
                "Beginner Art Workshop",
                "🎨 Descubra o artista que há em você! Aprenda técnicas básicas de desenho, pintura e escultura em um ambiente acolhedor e encorajador. Perfeito para iniciantes que querem explorar sua criatividade sem pressão.",
                "Wednesdays, 3:30 PM - 5:00 PM",
                new ScheduleDetails(List.of("Wednesday"), LocalTime.of(15, 30), LocalTime.of(17, 0)),
                12,
                DifficultyLevel.BEGINNER
            );
            beginnerArt.setParticipants(List.of());
            mongoTemplate.save(beginnerArt);
            
            // Create Intermediate Math Club (Intermediate level)  
            Activity intermediateMath = new Activity(
                "Intermediate Math Club",
                "📐 Aprofunde seus conhecimentos matemáticos! Explore conceitos de álgebra avançada, geometria e introdução ao cálculo. Ideal para estudantes que já têm uma base sólida e querem expandir seus horizontes matemáticos.",
                "Tuesdays, 4:00 PM - 5:30 PM",
                new ScheduleDetails(List.of("Tuesday"), LocalTime.of(16, 0), LocalTime.of(17, 30)),
                10,
                DifficultyLevel.INTERMEDIATE
            );
            intermediateMath.setParticipants(List.of());
            mongoTemplate.save(intermediateMath);
        }
    }

    private boolean activityExists(String activityName) {
        Query query = new Query(Criteria.where("name").is(activityName));
        return mongoTemplate.count(query, Activity.class) > 0;
    }

    @RollbackExecution
    public void rollback() {
        // Remove the test activities
        mongoTemplate.remove(new Query(Criteria.where("name").is("Advanced Coding Challenge")), Activity.class);
        mongoTemplate.remove(new Query(Criteria.where("name").is("Beginner Art Workshop")), Activity.class);
        mongoTemplate.remove(new Query(Criteria.where("name").is("Intermediate Math Club")), Activity.class);
    }
}