/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static int[] field_a;
    static String field_b;

    final static void a(boolean param0, int param1) {
        int var2 = -122 % ((param1 - 1) / 51);
        ai.a(param0, true, (byte) 124);
    }

    public static void a(boolean param0) {
        if (!param0) {
            jf.a(true, -98);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_a = new int[1024];
        field_b = "<br><br><br>Play on Medium to continue humanity's<br>fight against the Paragulans";
    }
}
