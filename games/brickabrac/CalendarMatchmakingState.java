/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CalendarMatchmakingState {
    static String field_a;
    static RgbSprite field_c;
    static byte[] matchmakingChoiceMask;
    static String[] field_e;
    static int[] commonYearMonthLengths;
    private static String field_z;

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 > 116) {
          commonYearMonthLengths = null;
          matchmakingChoiceMask = null;
          field_a = null;
          return;
        }
        CalendarMatchmakingState.a(42);
        commonYearMonthLengths = null;
        matchmakingChoiceMask = null;
        field_a = null;
    }

    static {
        field_z = "rh.A(";
        field_a = "Now press <img=2> or <img=5> to detonate the charge and destroy bricks close to the ball.";
        commonYearMonthLengths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_e = new String[3];
    }
}
