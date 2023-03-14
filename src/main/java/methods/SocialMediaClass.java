package methods;

public class SocialMediaClass {

        String username;
        String password;
        String email;
        String firstName;
        String lastName;
        int age;

        public void setUsername(String username) {
            boolean isValidName = username != null && username.length() > 16 && username.trim().length() != 0;

            if (isValidName) {
                System.out.println(" Success. Your username is valid");
                this.username = username;
            } else {
                System.out.println("Error. The username can not be empty or more than 16 letters");
            }
        }

        public void setPassword(String password) {
            boolean isValidPassword = true;
            if (16 >= password.length() && password.length() >= 8) {
                String upperCaseRegex = "[A-Z]";
                String lowerCaseRegex = "[a-z]";
                String digitRegex = "\\d";
                String specialCharRegex = "[!@#%&*.~|=+-><:;{}]";

                if (!password.matches(upperCaseRegex) || !password.matches(lowerCaseRegex) ||
                        !password.matches(digitRegex) || !password.matches(specialCharRegex)) {

                    isValidPassword = false;

                } else {
                    System.out.println("ERROR: password must contain at least one uppercase, one lowercase, one digit" +
                            "and one special character");
                }

            } else {
                System.out.println("ERROR: password's length must be at least 8 and at max 16 characters");
            }


            if (isValidPassword) {
                System.out.println("SUCCESS: The password is valid!");
                this.password = password;
            } else {
                System.out.println("It is not valid.");
            }
        }


        public boolean login(String username, String password) {
            if (!this.username.equals(username) || !this.password.equals(password)) {
                System.out.println("Incorrect password or username. Please try again!");
                return false;
            }
            System.out.println("Successfully logged in!");
            return true;
        }

        public void resetPassword(String password) {
            setPassword(password);
            System.out.println("Reset the password!");
        }

        public String getFullName() {
            return firstName + " " + lastName;

        }

        public boolean isAdult(int age) {
            return age >= 18;
        }


    }
