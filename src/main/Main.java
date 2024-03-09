package main;

import exception.WrongLoginException;
import exception.WrongPasswordException;

import static check.Verification.checkUser;

public class Main {
    public static void main(String[] args) {
        String login = "Java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        try {
            checkUser(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Неверно введён логин, либо недопустимый формат логина");
        } catch (WrongPasswordException e) {
            System.out.println("Неверно введён пароль, либо недопустимый формат пароля");
        }
    }
}