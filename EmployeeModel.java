public class EmployeeModel {

    private String username = "admin";
    private String password = "admin123";

    public boolean login(
        String user,
        String pass
    ) {

        return username.equals(user)
            && password.equals(pass);
    }

    public boolean changePassword(
        String oldPassword,
        String newPassword,
        String confirmPassword
    ) {

        if (!password.equals(oldPassword))
            return false;

        if (!newPassword.equals(confirmPassword))
            return false;

        password = newPassword;

        return true;
    }
}
