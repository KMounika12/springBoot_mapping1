package text.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import text.com.Entity.Story;

@Repository
	public interface StoryRepository extends JpaRepository<Story, Integer>
	{
	}

