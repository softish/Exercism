import java.time.*;

class Gigasecond {

    private LocalDate birthDate;
    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;

    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
        if (birthDate != null) {
            birthDateTime = LocalDateTime.of(birthDate, LocalTime.of(0, 0, 0));
        }

        return birthDateTime.plusSeconds((long) Math.pow(10, 9));
    }

}