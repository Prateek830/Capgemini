package com.cap.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cap.spring.Dao.TraineeDao;
import com.cap.spring.model.Trainee;

@Service
@Transactional
public class TraineeService {
	
	@Autowired
	private TraineeDao traineeDao;
	
	public Trainee addTrainee(Trainee t) {
		return traineeDao.save(t);
	}
	
	public List<Trainee> retrieve(){
		List<Trainee> ts = new ArrayList<Trainee>();
		for(Trainee t : traineeDao.findAll()) {
			ts.add(t);
		}
		return ts;
	}
	
	public void deleteTrainee(int traineeid) {
		traineeDao.deleteById(traineeid);
	}
	
	public Trainee editTrainee (int traineeid) {
		return traineeDao.getOne(traineeid);
	}
	
	

}
