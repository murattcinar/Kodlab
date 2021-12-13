package homeWorkClass;

public class Main {

	public static void main(String[] args) {
		
		Education educationFirts = new Education(1, "C# + Angular", "2 ay sürecek","Engin DEMİROĞ");
		
		Education educationSecond = new Education();
		educationSecond.id = 2;
		educationSecond.name = "Java + React";
		educationSecond.detail = "Gerçek hayatla ilişkilendirilmiş programlamaya giriş";
		educationSecond.instructor = "Engin DEMİROĞ";
		
		Education[] educations = {educationFirts,educationSecond};
		
		for (Education edu : educations) {
			System.out.print(edu.id + ". ");
			System.out.print(edu.name + ", ");
			System.out.print(edu.detail + ". ");
			System.out.print("Eğitmen: " + edu.instructor + " ");
			System.out.println();
		}
		
		EducationManager educationManager = new EducationManager();
		educationManager.addToTrainig(educationFirts);
		educationManager.deletToTrainig(educationSecond);
	}
}
