package homeWorkClass;

public class EducationManager {
	public void addToTrainig(Education education) {
		System.out.println("Eğitim eklendi " + education.name);
	}
	
	public void deletToTrainig(Education education) {
		System.out.println("Eğitim silindi " + education.name);
	}
}
