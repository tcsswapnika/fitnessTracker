package fitnessTracker;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AppointmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appId;
	private Date appointmentDate;

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public UserEntity getUserId() {
		return userId;
	}

	public void setUserId(UserEntity userId) {
		this.userId = userId;
	}

	public TrainerEntity getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(TrainerEntity trainerId) {
		this.trainerId = trainerId;
	}

	@ManyToOne
	private UserEntity userId;
	@ManyToOne
	private TrainerEntity trainerId;

}
