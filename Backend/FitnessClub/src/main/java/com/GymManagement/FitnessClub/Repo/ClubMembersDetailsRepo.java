package com.GymManagement.FitnessClub.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.GymManagement.FitnessClub.EntityMongoDb.ClubMemberDetails;

public interface ClubMembersDetailsRepo extends MongoRepository<ClubMemberDetails, Integer>{

}
