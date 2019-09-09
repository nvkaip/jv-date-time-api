package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class JavaDateTimeApiTest {

    private JavaDateTimeApiAnswers javaDateTimeApi = new JavaDateTimeApiAnswers();

    @Test
    public void todayDateFull() {
        String expected = String.valueOf(LocalDate.now());
        String result = javaDateTimeApi.todayDate(DateTimePart.FULL);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getDate() {
        Integer[] dateParams = {2018, 12, 1};
        Optional<LocalDate> expected =
                Optional.of(LocalDate.of(dateParams[0], dateParams[1], dateParams[2]));
        Optional<LocalDate> result = javaDateTimeApi.getDate(dateParams);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getDateIncorrect() {
        Integer[] dateParams = {2018, 22, 441};
        Optional<LocalDate> expected = Optional.empty();
        Optional<LocalDate> result = javaDateTimeApi.getDate(dateParams);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getDateEmpty() {
        Integer[] dateParams = {};
        Optional<LocalDate> expected = Optional.empty();
        Optional<LocalDate> result = javaDateTimeApi.getDate(dateParams);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addHours() {
        LocalTime expected = LocalTime.now().plusHours(268).truncatedTo(ChronoUnit.SECONDS);
        LocalTime result = javaDateTimeApi.addHours(268);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addMinutes() {
        LocalTime expected = LocalTime.now().plusMinutes(589).truncatedTo(ChronoUnit.SECONDS);
        LocalTime result = javaDateTimeApi.addMinutes(589);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addSeconds() {
        LocalTime expected = LocalTime.now().plusSeconds(369589).truncatedTo(ChronoUnit.SECONDS);
        LocalTime result = javaDateTimeApi.addSeconds(369589);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addWeeks() {
        LocalDate expected = LocalDate.now().plusWeeks(2);
        LocalDate result = javaDateTimeApi.addWeeks(2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void beforeDate() {
        LocalDate someDate = LocalDate.of(2019, 9, 3);
        String expected = someDate + " is before " + LocalDate.now();
        String result = javaDateTimeApi.beforeOrAfter(someDate);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void afterDate() {
        LocalDate someDate = LocalDate.now().plusMonths(2);
        String expected = someDate + " is after " + LocalDate.now();
        String result = javaDateTimeApi.beforeOrAfter(someDate);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nowDate() {
        LocalDate someDate = LocalDate.now();
        String expected = someDate + " is today";
        String result = javaDateTimeApi.beforeOrAfter(someDate);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void diffBetweenZones() {
        Optional<Integer> expected = Optional.of(6);
        Optional<Integer> result = javaDateTimeApi.diffBetweenZones("America/Puerto_Rico", "Europe/Paris");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void diffBetweenZonesIncorrect() {
        Optional<Integer> expected = Optional.empty();
        Optional<Integer> result = javaDateTimeApi.diffBetweenZones("Europe/Lviv", "Europe/Paris");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void offsetUkraine() {
        LocalDateTime localDateTime =
                LocalDateTime.of(2019, Month.SEPTEMBER, 06, 13, 17);
        OffsetDateTime expected = OffsetDateTime.of(localDateTime, ZoneOffset.of("+02:00"));
        OffsetDateTime result = javaDateTimeApi.offsetDateTime(localDateTime);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void parseDate() {
        LocalDate localDate = LocalDate.of(2019, 9, 21);
        Optional<LocalDate> expected = Optional.of(localDate);
        Optional<LocalDate> result = javaDateTimeApi.parseDate("20190921");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void parseDateIncorrect() {
        Optional<LocalDate> expected = Optional.empty();
        Optional<LocalDate> result = javaDateTimeApi.parseDate("20193921");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void customParseDate() {
        Optional<LocalDate> expected = Optional.of(LocalDate.of(2019, 9, 6));
        Optional<LocalDate> result = javaDateTimeApi.customParseDate("06 Sep 2019");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void customParseDateIncorrect() {
        Optional<LocalDate> expected = Optional.empty();
        Optional<LocalDate> result = javaDateTimeApi.customParseDate("36 Sep 2019");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void formatDate() {
        String expected = "06 September 2019 16:15";
        LocalDateTime localDateTime = LocalDateTime.of(2019, 9, 6, 16, 15, 26);
        String result = javaDateTimeApi.formatDate(localDateTime);
        Assert.assertEquals(expected, result);
    }
}
