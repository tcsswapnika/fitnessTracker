package fitnessTracker;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TrainerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainerId;
	private String trainerName;
	private Long trainerMobileNumber;
	private char trainerGender;
	private int trainerFees;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Trainer_Id")
	private Set<AppointmentEntity> appId;

	public Set<AppointmentEntity> getAppId() {
		return appId;
	}

	public void setAppId(Set<AppointmentEntity> appId) {
		this.appId = appId;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Long getTrainerMobileNumber() {
		return trainerMobileNumber;
	}

	public void setTrainerMobileNumber(Long trainerMobileNumber) {
		this.trainerMobileNumber = trainerMobileNumber;
	}

	public char getTrainerGender() {
		return trainerGender;
	}

	public void setTrainerGender(char trainerGender) {
		this.trainerGender = trainerGender;
	}

	public int getTrainerFees() {
		return trainerFees;
	}

	public void setTrainerFees(int trainerFees) {
		this.trainerFees = trainerFees;
	}

}
