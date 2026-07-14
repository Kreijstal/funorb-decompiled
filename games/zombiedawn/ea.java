/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static tg field_c;
    static String field_d;
    static String field_b;
    static long field_a;

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 20000000) {
            field_d = null;
            return ch.a(param1, false, 0);
        }
        return ch.a(param1, false, 0);
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != 82) {
            field_a = -92L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tg();
        field_d = "Waiting for levels";
        field_a = 20000000L;
    }
}
