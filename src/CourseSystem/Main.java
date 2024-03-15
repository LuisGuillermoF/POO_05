package CourseSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //POINT #3 Course management system
        CourseSystem courseSystem = new CourseSystem();
        Course course = new Course();

        String option = null;

        do {
            try {
                System.out.println("""
                        1. Admin courses.
                        2. Admin Students.
                        3. EXIT.
                        Select an option:
                        """);
                option = scanner.nextLine();

                switch (option){
                    case "1":
                        String option2 = null;
                        do {
                            System.out.println("""
                                        Administrate courses:
                                        1. Create a course.
                                        2. Search a course by its code.
                                        3. Show current courses.
                                        4. Exit.
                                        """);
                            option2 = scanner.nextLine();
                            switch (option2){
                                case "1":
                                    courseSystem.addCourse(scanner);
                                    break;
                                case "2":
                                    System.out.println("Type the code of the course.");
                                    String code = scanner.next();
                                    System.out.println(courseSystem.findCode(code).toString());
                                    break;
                                case "3":
                                    courseSystem.showCourses();
                                    break;
                                case "4":
                                    System.out.println("Closing the administration menu...");
                                    break;

                            }
                        } while (!option2.equals("4"));
                        break;
                    case "2":
                        String option3 = null;
                            do {
                                System.out.println("""
                                    Administrate students:
                                    1. Add student
                                    2. Remove student
                                    3. Show students
                                    4. Exit
                                    """);
                                option3 = scanner.next();
                                switch (option3){
                                    case "1":
                                        if(!courseSystem.showCourses()){
                                            break;
                                        }
                                        System.out.println("Type the code of the course you want to add the student");
                                        String code = scanner.next();

                                        course = courseSystem.findCode(code);
                                        if (course == null){
                                            System.out.println("Course was not found!");
                                        } else {
                                            course.addStudent(scanner);
                                        }
                                        break;
                                    case "2":
                                        if(!courseSystem.showCourses()){
                                            break;
                                        }
                                        System.out.println("Type the code of the course you want to remove the student");
                                         code = scanner.next();

                                        course = courseSystem.findCode(code);
                                        if (course == null) {
                                            System.out.println("Course was not found!");
                                        } else {
                                            course.removeStudent(scanner);
                                        }
                                        break;
                                    case "3":
                                        course.showStudents();
                                        break;
                                    case "4":
                                        System.out.println("Closing the administration menu...");
                                        break;
                                    default:
                                        System.out.println("Please insert a valid value!");
                                        break;
                                }
                            }while (!option3.equals("4"));
                        break;
                    case "3":
                        System.out.println("Thanks for using your Course management system");
                        break;
                }

            }catch (Exception e){
                System.out.println("Please type a valid value!" + e);
            }

        }while (!option.equals("3"));
    }
}
