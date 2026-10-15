/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CalendarRankingHelpers {
    static IndexedSprite[] field_e;
    static int textChoiceOuterPaddingX;
    static String field_h;
    static String[] field_c;
    static RgbSprite field_d;
    static long fullscreenConfirmationStartMillis;
    static boolean field_f;
    static QuickChatParameterType field_b;

    public static void a(boolean param0) {
        field_b = null;
        field_h = null;
        if (!param0) {
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        }
        CalendarRankingHelpers.a(true);
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static int getCurrentLocalYear(int obfuscationGuard) {
        if (obfuscationGuard == 1) {
          return 1900 + new Date().getYear();
        }
        CalendarRankingHelpers.a(false);
        return 1900 + new Date().getYear();
    }

    final static void decodeRankingStatistics(byte obfuscationGuard, PacketBuffer packet) {
        int winsDrawsBoundary = 0;
        int drawsLossesBoundary;
        int lossesRatingBoundary;
        try {
          RadialSelectorWidget.decodedRankingWins = packet.readUnsignedShort(65280) << 5;
          winsDrawsBoundary = packet.readUnsignedByte(255);
          fh.decodedRankingDraws = 1835008 & winsDrawsBoundary << 18;
          int guardArithmetic = -32 % ((obfuscationGuard + 69) / 37);
          RadialSelectorWidget.decodedRankingWins = RadialSelectorWidget.decodedRankingWins + (winsDrawsBoundary >> 3);
          fh.decodedRankingDraws = fh.decodedRankingDraws + (packet.readUnsignedShort(65280) << 2);
          drawsLossesBoundary = packet.readUnsignedByte(255);
          ValidatedTextFieldWidget.decodedRankingLosses = 2064384 & drawsLossesBoundary << 15;
          fh.decodedRankingDraws = fh.decodedRankingDraws + (drawsLossesBoundary >> 6);
          ValidatedTextFieldWidget.decodedRankingLosses = ValidatedTextFieldWidget.decodedRankingLosses + (packet.readUnsignedByte(255) << 7);
          lossesRatingBoundary = packet.readUnsignedByte(255);
          ValidatedTextFieldWidget.decodedRankingLosses = ValidatedTextFieldWidget.decodedRankingLosses + (lossesRatingBoundary >> 1);
          SocialTabbedPanel.decodedRankingRating = 65536 & lossesRatingBoundary << 16;
          SocialTabbedPanel.decodedRankingRating = SocialTabbedPanel.decodedRankingRating + packet.readUnsignedShort(65280);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "un.C(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_h = "Chat view has been scrolled up. Scroll down to chat.";
        field_b = new QuickChatParameterType(0, 2, 2, 1);
    }
}
