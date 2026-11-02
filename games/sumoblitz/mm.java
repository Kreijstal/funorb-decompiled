/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_c;
    static String thisPasswordIsPartText;
    static jf field_a;
    static String levelSelectText;
    static mi field_h;
    static String field_g;
    static int field_f;
    static String pleaseWaitText;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_h = null;
        field_c = null;
        levelSelectText = null;
        pleaseWaitText = null;
        thisPasswordIsPartText = null;
        if (param0 <= 62) {
          field_h = (mi) null;
        }
    }

    static {
        thisPasswordIsPartText = "This password is part of your Player Name, and would be easy to guess";
        levelSelectText = "Level select";
        field_a = new jf();
        field_h = new mi();
        field_g = "Level Select";
        field_f = 20;
        pleaseWaitText = "Please wait...";
    }
}
