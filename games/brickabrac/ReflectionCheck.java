/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheck extends IntrusiveNode {
    byte[][][] serializedArguments;
    int operationCount;
    static java.security.SecureRandom payloadKeyRandom;
    PlatformTask[] fieldTasks;
    int[] fieldSetValues;
    static int[] parisBackgroundColors;
    static int textChoiceContentHeight;
    int[] operations;
    static String field_o;
    static int[][] field_n;
    int[] operationErrors;
    PlatformTask[] methodTasks;
    int requestId;

    final static int getLegacyMonthLength(int year, int obfuscationGuard, int monthIndex) {
        if (obfuscationGuard != 29) {
          ReflectionCheck.a(6);
          if (monthIndex != 1) {
            return CalendarMatchmakingState.commonYearMonthLengths[monthIndex];
          }
          if (NameEntryPopup.isLegacyLeapYear(year, -1)) {
            return 29;
          }
          return CalendarMatchmakingState.commonYearMonthLengths[monthIndex];
        }
        if (monthIndex != 1) {
          return CalendarMatchmakingState.commonYearMonthLengths[monthIndex];
        }
        if (NameEntryPopup.isLegacyLeapYear(year, -1)) {
          return 29;
        }
        return CalendarMatchmakingState.commonYearMonthLengths[monthIndex];
    }

    public static void a(int param0) {
        if (param0 != 6) {
          return;
        }
        field_n = (int[][]) null;
        field_o = null;
        parisBackgroundColors = null;
        payloadKeyRandom = null;
    }

    final static boolean containsRectanglePoint(int left, int rectangleHeight, int rectangleWidth, byte obfuscationGuard, int pointY, int pointX, int top) {
        if (obfuscationGuard <= 32) {
          textChoiceContentHeight = -47;
          if (pointX < left) {
            return false;
          }
          if (left + rectangleWidth <= pointX) {
            return false;
          }
          if (top > pointY) {
            return false;
          }
          if (rectangleHeight + top > pointY) {
            return true;
          }
          return false;
        }
        if (pointX < left) {
          return false;
        }
        if (left + rectangleWidth <= pointX) {
          return false;
        }
        if (top > pointY) {
          return false;
        }
        if (rectangleHeight + top > pointY) {
          return true;
        }
        return false;
    }

    ReflectionCheck() {
    }

    static {
        field_o = "Awesome!";
        field_n = new int[9][];
        parisBackgroundColors = new int[]{31114, 12658477, 16494651, 26679, 16711935};
        field_n[3] = new int[]{1, 4473924, 1};
        field_n[5] = new int[]{1, 128, 1};
        field_n[4] = new int[]{1, 255, 1};
        field_n[8] = new int[]{1, 12303291, 1};
        field_n[1] = new int[]{1, 13966189, 1};
        field_n[7] = new int[]{1, 5367552, 1};
        field_n[6] = new int[]{1, 0, 1};
        field_n[0] = new int[]{1, 4826854, 1};
        field_n[2] = new int[]{1, 16777215, 1};
    }
}
