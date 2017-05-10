package pandaroux.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pandaroux.Entity.Lecture;
import pandaroux.Repository.LectureRepository;

@Service
public class LectureService {

    @Autowired
    private LectureRepository lectureRepository;


    public void save(Lecture lecture) {
        lectureRepository.save(lecture);
    }

}
