/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GmtTimestampSupport {
    static String[] mustLogin4Texts;
    static int[] decodedSpriteYOffsets;
    static IntrusiveDeque activeScorePopups;
    static float avatarTintRedDelta;
    static int rankedEntryCount;

    final static String formatGmtTimestamp(byte methodGuard, long timestampMillis) {
        int requestedDayOfMonth = 0;
        int requestedMonthIndex = 0;
        int requestedYear = 0;
        int requestedHourOfDay = 0;
        int requestedMinute = 0;
        int requestedSecond = 0;
        int fallbackCalendarDayOfMonth;
        int fallbackCalendarMonthIndex;
        int fallbackCalendarYear;
        int fallbackCalendarHourOfDay;
        int fallbackCalendarMinute;
        int fallbackCalendarSecond;
        MatchCandidateSupport.gmtCalendar.setTime(new Date(timestampMillis));
        int weekdayIndex = MatchCandidateSupport.gmtCalendar.get(7);
        if (methodGuard <= -43) {
            requestedDayOfMonth = MatchCandidateSupport.gmtCalendar.get(5);
            requestedMonthIndex = MatchCandidateSupport.gmtCalendar.get(2);
            requestedYear = MatchCandidateSupport.gmtCalendar.get(1);
            requestedHourOfDay = MatchCandidateSupport.gmtCalendar.get(11);
            requestedMinute = MatchCandidateSupport.gmtCalendar.get(12);
            requestedSecond = MatchCandidateSupport.gmtCalendar.get(13);
            return ArchiveNetworkClient.gmtWeekdayAbbreviations[-1 + weekdayIndex] + ", " + requestedDayOfMonth / 10 + requestedDayOfMonth % 10 + "-" + LoginTextValue.gmtMonthAbbreviations[requestedMonthIndex] + "-" + requestedYear + " " + requestedHourOfDay / 10 + requestedHourOfDay % 10 + ":" + requestedMinute / 10 + requestedMinute % 10 + ":" + requestedSecond / 10 + requestedSecond % 10 + " GMT";
        }
        GmtTimestampSupport.formatGmtTimestamp((byte) -70, -99L);
        fallbackCalendarDayOfMonth = MatchCandidateSupport.gmtCalendar.get(5);
        fallbackCalendarMonthIndex = MatchCandidateSupport.gmtCalendar.get(2);
        fallbackCalendarYear = MatchCandidateSupport.gmtCalendar.get(1);
        fallbackCalendarHourOfDay = MatchCandidateSupport.gmtCalendar.get(11);
        fallbackCalendarMinute = MatchCandidateSupport.gmtCalendar.get(12);
        fallbackCalendarSecond = MatchCandidateSupport.gmtCalendar.get(13);
        return ArchiveNetworkClient.gmtWeekdayAbbreviations[-1 + weekdayIndex] + ", " + fallbackCalendarDayOfMonth / 10 + fallbackCalendarDayOfMonth % 10 + "-" + LoginTextValue.gmtMonthAbbreviations[fallbackCalendarMonthIndex] + "-" + fallbackCalendarYear + " " + fallbackCalendarHourOfDay / 10 + fallbackCalendarHourOfDay % 10 + ":" + fallbackCalendarMinute / 10 + fallbackCalendarMinute % 10 + ":" + fallbackCalendarSecond / 10 + fallbackCalendarSecond % 10 + " GMT";
    }

    public static void clearTimestampAndPopupResources(byte methodGuard) {
        mustLogin4Texts = null;
        decodedSpriteYOffsets = null;
        activeScorePopups = null;
        if (methodGuard != 40) {
            GmtTimestampSupport.clearTimestampAndPopupResources((byte) 23);
        }
    }

    static {
        mustLogin4Texts = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        activeScorePopups = new IntrusiveDeque();
    }
}
