package DailyPlanner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task {

    public WeeklyTask(String title, String description, LocalDateTime taskTime, Type type) throws IncorrectArgumentException {
        super(title, description, taskTime, type);
    }

    @Override
    public boolean appearsIn(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getTaskTime().toLocalDate()) ||
                dateForChecking.isEqual(getTaskTime().toLocalDate())) &&
                dateForChecking.getDayOfWeek() == getTaskTime().getDayOfWeek();
    }
}
