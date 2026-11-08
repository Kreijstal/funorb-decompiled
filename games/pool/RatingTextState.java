/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RatingTextState {
    static String yourRatingIsX;
    static volatile boolean field_d;
    static String gameoptPleasetrychanging;
    static BitmapFont field_c;
    static int field_f;
    static int field_e;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_c = null;
        yourRatingIsX = null;
        gameoptPleasetrychanging = null;
        if (param0 > -31) {
          RatingTextState.releaseStatics((byte) 74);
        }
    }

    static {
        field_z = "m.A(";
        yourRatingIsX = "Your rating is <%0>";
        field_d = false;
        gameoptPleasetrychanging = "Please try changing the following settings:  ";
    }
}
