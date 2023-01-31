package DailyPlanner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {

    public OneTimeTask(String title, String description, LocalDateTime taskTime, Type type) throws IncorrectArgumentException {
        super(title, description, taskTime, type);
    }

    @Override
    public boolean appearsIn(LocalDate dateForChecking) {
        return false;
    }
}
