package check;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Verification {
    public static void checkUser(String login, String password, String confirmPassword) {
        String symbols = ",./<>';:\"[]{}-=+!@#№$^&*`~ячсмитьбюэждлорпавыфйцукенгшщзхъ";
        char[] chars = symbols.toCharArray();
        if (login.length() > 20) {
            throw new WrongLoginException("Логин слишком длинный!");
        }
        for (int i = 0; i < chars.length; i++) {
            if (login.indexOf(chars[i]) != -1) {
                throw new WrongLoginException("Запрещённые символы!");
            }
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль слишком длинный!");
        }
        for (int i = 0; i < chars.length; i++) {
            if (password.indexOf(chars[i]) != -1) {
                throw new WrongPasswordException("Запрещённые символы!");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        }
        System.out.println("Совершён вход!");
    }
}

