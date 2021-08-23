package fitnessTracker;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

public class TestFitness {
	public static void main(String[] args) {
		Session session = HibernateUtil1.getSessionFactory().openSession();
		session.beginTransaction();

		AppointmentEntity appoint1 = new AppointmentEntity();
		appoint1.setAppointmentDate(new Date());

		AppointmentEntity appoint2 = new AppointmentEntity();
		appoint2.setAppointmentDate(new Date());

		AppointmentEntity appoint3 = new AppointmentEntity();
		appoint3.setAppointmentDate(new Date());

		AppointmentEntity appoint4 = new AppointmentEntity();
		appoint4.setAppointmentDate(new Date());

		TrainerEntity trainer1 = new TrainerEntity();
		trainer1.setTrainerName("Ashok");
		trainer1.setTrainerGender('M');
		trainer1.setTrainerMobileNumber(6655774433L);
		trainer1.setTrainerFees(500);

		TrainerEntity trainer2 = new TrainerEntity();
		trainer2.setTrainerName("Neela");
		trainer2.setTrainerGender('F');
		trainer2.setTrainerMobileNumber(8844332211L);
		trainer2.setTrainerFees(600);

		UserEntity user1 = new UserEntity();
		user1.setUserName("Ishika");
		user1.setUserMobileNumber(8855663399L);
		user1.setUserGender('F');
		user1.setUserDob(new Date());
		user1.setUserAddress("Nashik");

		UserEntity user2 = new UserEntity();
		user2.setUserName("Seema");
		user2.setUserMobileNumber(8748063399L);
		user2.setUserGender('F');
		user2.setUserDob(new Date());
		user2.setUserAddress("Mumbai");

		UserEntity user3 = new UserEntity();
		user3.setUserName("Rohan");
		user3.setUserMobileNumber(7230663399L);
		user3.setUserGender('M');
		user3.setUserDob(new Date());
		user3.setUserAddress("Pune");

		Set<AppointmentEntity> appointmentOfUser1 = new HashSet<AppointmentEntity>();
		appointmentOfUser1.add(appoint1);
		appointmentOfUser1.add(appoint3);

		Set<AppointmentEntity> appointmentOfUser2 = new HashSet<AppointmentEntity>();
		appointmentOfUser2.add(appoint2);

		Set<AppointmentEntity> appointmentOfUser3 = new HashSet<AppointmentEntity>();
		appointmentOfUser3.add(appoint4);

		Set<AppointmentEntity> appointmentOfTrainer1 = new HashSet<AppointmentEntity>();
		appointmentOfTrainer1.add(appoint1);
		appointmentOfTrainer1.add(appoint2);

		Set<AppointmentEntity> appointmentOfTrainer2 = new HashSet<AppointmentEntity>();
		appointmentOfTrainer2.add(appoint3);
		appointmentOfTrainer2.add(appoint4);

		user1.setAppId(appointmentOfUser1);
		user2.setAppId(appointmentOfUser2);
		user3.setAppId(appointmentOfUser3);
		trainer1.setAppId(appointmentOfTrainer1);
		trainer2.setAppId(appointmentOfTrainer2);

		session.save(trainer1);
		session.save(trainer2);
		session.save(user1);
		session.save(user2);
		session.save(user3);

		session.getTransaction().commit();
		HibernateUtil1.shutdown();
	}

}
