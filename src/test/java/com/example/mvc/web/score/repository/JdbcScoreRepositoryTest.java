package com.example.mvc.web.score.repository;

import com.example.mvc.web.score.domain.Score;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JdbcScoreRepositoryTest {

    @Autowired
    @Qualifier("jr")
    private ScoreRepository repository;

    @Test
    void saveTest(){

        Score score = new Score();
        score.setName("말고기");
        score.setKor(78);
        score.setEng(89);
        score.setMath(99);
        score.calcTotalAvg();

        repository.save(score);

    }

    @Test
    void removeTest(){
        repository.remove(1);
    }

}