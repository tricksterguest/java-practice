package day02;

public class ApplicationCheck {
    public static void main(String[] args) {
        int daysOnReview = 5;
        int statusCode = 2;      // 1 — Новая, 2 — На проверке, 3 — Одобрена, 4 — Отклонена
        boolean isUrgent = true;

        String status = switch (statusCode) {
            case 1 -> "Новая";
            case 2 -> "На проверке";
            case 3 -> "Одобрена";
            case 4 -> "Отклонена";
            default -> "Неизвестно";
        };
        System.out.println(status);

        boolean isActive = statusCode == 1 || statusCode == 2;

        if (!isActive) {
            System.out.println("Рассмотрение завершено");
        } else if (daysOnReview > 30) {
            System.out.println("Просрочена");
        } else if (daysOnReview > 20) {
            System.out.println("Скоро срок");
        } else {
            System.out.println("В срок");
        }

        if (isUrgent && statusCode == 2 && daysOnReview > 20) {
            System.out.println("⚠ Срочно обработать!");
        }
    }
}