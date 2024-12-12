import java.util.Scanner;
public class casestudy {

    static String[][] nameStudent = new String[100][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n======= STUDENT ACHIEVEMENT DATA =======");
            System.out.println("\nMENU");
            System.out.println("1. Enter Achievement Data");
            System.out.println("2. Show All Achievements");
            System.out.println("3. Achievement Analysis by Type");
            System.out.println("4. Exit Program");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    inputAchievement();
                    break;
                case 2:
                    ShowAllAchievements();
                    break;
                case 3:
                    AchievementAnalysisbyType();
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    static void inputAchievement() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nameStudent.length; i++) {
            if (nameStudent[i][0] == null) {
                System.out.print("Name of Student: ");
                nameStudent[i][0] = sc.nextLine();

                System.out.print("NIM of Student: ");
                long nim = sc.nextLong();
                nameStudent[i][1] = String.valueOf(nim);
                sc.nextLine();

                System.out.print("Achievement Type: ");
                nameStudent[i][2] = sc.nextLine();

                while (true) {
                    System.out.print("Level of Achievement (Local/National/International): ");
                    String level = sc.nextLine();
                    if (level.equalsIgnoreCase("Local") || level.equalsIgnoreCase("National")
                            || level.equalsIgnoreCase("International")) {
                        nameStudent[i][3] = level;
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter again.");
                    }
                }

                while (true) {
                    System.out.print("Enter Year (2010 - 2024): ");
                    int year = sc.nextInt();
                    if (year >= 2010 && year <= 2024) {
                        nameStudent[i][4] = String.valueOf(year);
                        System.out.println("Achievement data saved successfully!!!");
                        break;
                    } else {
                        System.out.println("Invalid year. Please enter again.");
                    }
                }
                break;
            }
        }
    }

    static void ShowAllAchievements() {
        System.out.println("=== All Achievements ===");
        boolean hasData = false;

        for (int i = 0; i < nameStudent.length; i++) {
            if (nameStudent[i][0] != null) {
                hasData = true; 
                System.out.println("Student " + (i + 1) + ":");
                System.out.println("Name: " + nameStudent[i][0]);
                System.out.println("NIM: " + nameStudent[i][1]);
                System.out.println("Achievement Type: " + nameStudent[i][2]);
                System.out.println("Level of Achievement: " + nameStudent[i][3]);
                System.out.println("Year of Achievement: " + nameStudent[i][4]);
                System.out.println("-----------------------------");
            }
        }
        if (!hasData) {
            System.out.println("\nNo achievement data available.");
        }
    }

    static void AchievementAnalysisbyType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter achievement type : ");
        String achievementType = sc.nextLine();
        System.out.println("=== ANALYST OF ACHIEVEMENT ===");
        Boolean found = false;

        for (int i = 0; i < nameStudent.length; i++) {
            if (nameStudent[i][0] != null && nameStudent[i][2].equalsIgnoreCase(achievementType)) {
                System.out.print("name : " + nameStudent[i][0] + " | ");
                System.out.print("NIM : " + nameStudent[i][1] + " | ");
                System.out.print("Level : " + nameStudent[i][3] + " | ");
                System.out.print("Year : " + nameStudent[i][4] + " | ");
                System.out.println();
                found = true;
                }
            } 
            if (!found) {
                System.out.println("\nAchievement Type cannot found");
            }
        }
    }