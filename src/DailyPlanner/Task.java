package DailyPlanner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {
    private int idGenerator = 0;
    private final int id;
    private String title;
    private String description;

    private LocalDateTime taskTime;
    private Type type;

    public Task(String title, String description, LocalDateTime taskTime, Type type) throws IncorrectArgumentException {
        this.id = idGenerator++;
        setTitle(title);
        setDescription(description);
        setTaskTime(taskTime);
        setType(type);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IncorrectArgumentException {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IncorrectArgumentException("заголовок задачи");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws IncorrectArgumentException {
        if (description != null && !description.isEmpty()) {
        this.description = description;
        } else {
            throw new IncorrectArgumentException("описание задачи");
        }
    }

    public LocalDateTime getTaskTime() {
        return taskTime;
    }
    public void setTaskTime(LocalDateTime taskTime) throws IncorrectArgumentException {
        if (taskTime != null ) {
            this.taskTime = taskTime;
        } else {
            throw new IncorrectArgumentException("дата и время задачи");
        }
    }

    public Type getType() {
        return type;
    }
    public void setType (Type type) throws IncorrectArgumentException {
        if (type != null ) {
            this.type = type;
        } else {
            throw new IncorrectArgumentException("тип задачи");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(taskTime, task.taskTime) && type == task.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, taskTime, type);
    }

    public abstract boolean appearsIn(LocalDate dateForChecking) throws IncorrectArgumentException;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", taskTime=" + taskTime +
                ", type=" + type +
                '}';
    }
}

