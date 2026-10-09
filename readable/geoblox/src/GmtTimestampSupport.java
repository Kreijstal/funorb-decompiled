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
        int dayOfMonthLiteralPhase1;
        int monthIndexLiteralPhase1;
        int yearLiteralPhase1;
        int hourOfDayLiteralPhase1;
        int minuteLiteralPhase1;
        int secondLiteralPhase1;
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
        dayOfMonthLiteralPhase1 = MatchCandidateSupport.gmtCalendar.get(5);
        monthIndexLiteralPhase1 = MatchCandidateSupport.gmtCalendar.get(2);
        yearLiteralPhase1 = MatchCandidateSupport.gmtCalendar.get(1);
        hourOfDayLiteralPhase1 = MatchCandidateSupport.gmtCalendar.get(11);
        minuteLiteralPhase1 = MatchCandidateSupport.gmtCalendar.get(12);
        secondLiteralPhase1 = MatchCandidateSupport.gmtCalendar.get(13);
        return ArchiveNetworkClient.gmtWeekdayAbbreviations[-1 + weekdayIndex] + ", " + dayOfMonthLiteralPhase1 / 10 + dayOfMonthLiteralPhase1 % 10 + "-" + LoginTextValue.gmtMonthAbbreviations[monthIndexLiteralPhase1] + "-" + yearLiteralPhase1 + " " + hourOfDayLiteralPhase1 / 10 + hourOfDayLiteralPhase1 % 10 + ":" + minuteLiteralPhase1 / 10 + minuteLiteralPhase1 % 10 + ":" + secondLiteralPhase1 / 10 + secondLiteralPhase1 % 10 + " GMT";
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
