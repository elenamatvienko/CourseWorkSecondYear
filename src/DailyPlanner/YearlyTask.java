package DailyPlanner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task{

    public YearlyTask(String title, String description, LocalDateTime taskTime, Type type) throws IncorrectArgumentException {
        super(title, description, taskTime, type);
    }

    @Override
    public boolean appearsIn(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getTaskTime().toLocalDate()) ||
                dateForChecking.isEqual(getTaskTime().toLocalDate())) &&
                dateForChecking.getDayOfYear() == getTaskTime().getDayOfYear();
    }
}
