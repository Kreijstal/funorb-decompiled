/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static boolean field_h;
    static String field_a;
    static String field_b;
    static String field_g;
    static String field_f;
    static int field_e;
    static int[] field_c;
    static dl field_d;

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 != 5) {
            fi.a((byte) -81);
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 10) {
            return false;
        }
        return fj.a(97, param0, true, 10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection lost - attempting to reconnect";
        field_b = "Find opponents";
        field_g = "You can ask to join this game";
        field_c = new int[]{9, 10, 11};
        field_f = "Play rated game";
        field_e = 33;
    }
}
