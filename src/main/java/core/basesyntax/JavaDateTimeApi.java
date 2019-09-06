package core.basesyntax;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.Optional;

public class JavaDateTimeApi {

    /**
     * Верните текущую дату в виде строки в зависимости от запроса.
     *
     * @param datePart Запрос на часть даты или всю дата целиком:
     *                 - FULL - текущая дата целиком год, месяц, день (число месяца),
     *                 возвращаемое значение по умолчанию;
     *                 - YEAR - текущий год;
     *                 - MONTH - название текущего месяца;
     *                 - DAY - текущий день (число месяца);
     **/
    public String todayDate(DateTimePart datePart) {
        return "Today";
    }

    /**
     * Верните Optional даты соответствующей дате в массиве.
     *
     * @param dateParams Дан массив данных состоящий из 3-х элементов, где:
     *                   - 1-й элемент массива - год;
     *                   - 2-й элемент массива - месяц;
     *                   - 3-й элемент массива - день (число);
     **/

    public Optional<LocalDate> someDate(Integer[] dateParams) {
        return Optional.empty();
    }

    /**
     * Известно на сколько нужно изменить время (часть времени и на сколько надо ее изменить).
     *
     * @param timePart  часть времение, которую надо изменить:
     *                  - HOURS - часы
     *                  изменяемое значение по умолчанию
     *                  - MINUTES - минуты
     *                  - SECONDS - секунды
     * @param timeToAdd величина, на которую следует изменит часть времени полученную в timePart
     * @return Верните измененное текущее время на величину указаную в запросе
     **/

    public LocalTime addTime(DateTimePart timePart, Integer timeToAdd) {
        return LocalTime.now();
    }

    /**
     * @param numberOfWeeks количество недель
     * @return Добавте к текущей дате полученое количество недель и верните получившуюся дату
     */
    public LocalDate addWeeks(Integer numberOfWeeks) {
        return LocalDate.now();
    }

    /**
     * Дана произвольная дата someDate.
     * Определите соотношение сегодня к someDate и верните строку:
     * - "someDate is after текущая дата" - если someDate в будующем
     * - "someDate is before текущая дата" - если someDate в прошлом
     * - "someDate is today" - если someDate - сегодня
     */
    public String beforeOrAfter(LocalDate someDate) {
        return someDate + "is today";
    }

    /**
     * Даны две временные зоны.
     * Верните часовую разницу между двумя временными зонами.
     *
     * @return positive Integer
     */
    public Integer diffBetweenZones(String firstZone, String secondZone) {
        return null;
    }

    /**
     * Необходимо расчитать и вернуть количество дней оставшихся до Нового Года,
     * используя классы только из пакета java.time
     *
     * @return количество дней.
     **/
    public Integer daysToNewYear() {
        return null;
    }

    /**
     * Данны дата и время. Надо вернуть дату и время с местным временным смещением,
     * пусть это будет для Украины "+02:00".
     **/
    public OffsetDateTime offsetDateTime(LocalDateTime localTime) {
        return OffsetDateTime.now();
    }

    /**
     * Дана строка в виде "yyyymmdd".
     * Необходимо вернуть дату в LocalDate формате
     */
    public LocalDate parseDate(String date) {
        return LocalDate.now();
    }

    /**
     * Дана строка в виде "d MMM yyyy" (MMM - Sep, Oct, etc).
     * Необходимо вернуть Optional даты в LocalDate формате
     */
    public Optional<LocalDate> customParseDate(String date) {
        return Optional.empty();
    }

    /**
     * Даны произвольные время и дата.
     * Верните строку с датой и временем в формате
     * "день(2 цифры) месяц(полное название на английском) год(4 цифры) час(24 часа):минуты"
     * или сообщение "dateTime can't be formatted!"
     */
    public String formatDate(LocalDateTime dateTime) {
        return "Date can't be formatted!";
    }
}
