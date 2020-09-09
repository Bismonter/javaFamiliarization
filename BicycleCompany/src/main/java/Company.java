/* Имеется некоторая компания, которая продает велосипеды. 
  Недавно в продажу поступили новые велосипеды. Нужно добавить из в класс Велосипеды
  и вывести то что ввели*/
public class Company {
	public Company() {
	}

	public static void main(String[] args) {
		Bicycle firstBicycle = new Bicycle();
		firstBicycle.newBicycle("CrossBike", "Mountain", "Aluminium", "Green", 3680.0F);
		Bicycle secondBicycle = new Bicycle();
		secondBicycle.newBicycle("Ardis X-Cross", "Mountain", "Aluminium", "Gray", 2648.0F);
		System.out.println("________________");
		System.out.println("    First bicycle:");
		firstBicycle.showInfoAboutBicycle();
		System.out.println("    Second bicycle:");
		secondBicycle.showInfoAboutBicycle();
	}
}
