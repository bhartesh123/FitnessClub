package com.GymManagement.FitnessClub.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.GymManagement.FitnessClub.EntityMongoDb.ClubMemberDetails;
import com.GymManagement.FitnessClub.EntityMongoDb.ExpertCoaches;

public interface ExpertCoachesRepo extends MongoRepository<ExpertCoaches, Integer>{

}
