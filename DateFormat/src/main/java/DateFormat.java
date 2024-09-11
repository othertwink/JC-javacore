import java.time.LocalDateTime;

// @Getter из Lombok
public class DateFormat {

    // spring
    // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy:MM:dd##:HH:mm:ss:SSS", locale = "ru")
    private LocalDateTime dateTime;

    public DateFormat(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

}
