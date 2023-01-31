package DailyPlanner;

public enum Type {
    PERSONAL_TASK("Личная задача"),
    WORK_TASK("Рабочая задача");

    final String type;

    Type(String type) {
        this.type = type;

    }

    public String getType() {
        return type;
    }

}

