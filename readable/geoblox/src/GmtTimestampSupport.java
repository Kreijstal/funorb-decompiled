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
        int dayOfMonth = 0;
        int monthIndex = 0;
        int year = 0;
        int hourOfDay = 0;
        int minute = 0;
        int second = 0;
        MatchCandidateSupport.gmtCalendar.setTime(new Date(timestampMillis));
        int weekdayIndex = MatchCandidateSupport.gmtCalendar.get(7);
        if (methodGuard <= -43) {
            dayOfMonth = MatchCandidateSupport.gmtCalendar.get(5);
            monthIndex = MatchCandidateSupport.gmtCalendar.get(2);
            year = MatchCandidateSupport.gmtCalendar.get(1);
            hourOfDay = MatchCandidateSupport.gmtCalendar.get(11);
            minute = MatchCandidateSupport.gmtCalendar.get(12);
            second = MatchCandidateSupport.gmtCalendar.get(13);
            return ArchiveNetworkClient.gmtWeekdayAbbreviations[-1 + weekdayIndex] + ", " + dayOfMonth / 10 + dayOfMonth % 10 + "-" + LoginTextValue.gmtMonthAbbreviations[monthIndex] + "-" + year + " " + hourOfDay / 10 + hourOfDay % 10 + ":" + minute / 10 + minute % 10 + ":" + second / 10 + second % 10 + " GMT";
        }
        GmtTimestampSupport.formatGmtTimestamp((byte) -70, -99L);
        dayOfMonth = MatchCandidateSupport.gmtCalendar.get(5);
        monthIndex = MatchCandidateSupport.gmtCalendar.get(2);
        year = MatchCandidateSupport.gmtCalendar.get(1);
        hourOfDay = MatchCandidateSupport.gmtCalendar.get(11);
        minute = MatchCandidateSupport.gmtCalendar.get(12);
        second = MatchCandidateSupport.gmtCalendar.get(13);
        return ArchiveNetworkClient.gmtWeekdayAbbreviations[-1 + weekdayIndex] + ", " + dayOfMonth / 10 + dayOfMonth % 10 + "-" + LoginTextValue.gmtMonthAbbreviations[monthIndex] + "-" + year + " " + hourOfDay / 10 + hourOfDay % 10 + ":" + minute / 10 + minute % 10 + ":" + second / 10 + second % 10 + " GMT";
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
