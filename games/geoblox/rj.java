/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static int field_i;
    static String field_e;
    int field_f;
    static int field_c;
    static long field_b;
    int field_d;
    static String field_g;
    int field_a;
    int field_h;

    final static void a(byte param0, int param1) {
        if (param0 != 121) {
            field_e = null;
            oj.field_c = 1000000000L / (long)param1;
            return;
        }
        oj.field_c = 1000000000L / (long)param1;
    }

    public static void a(int param0) {
        int var1 = 12 % ((-27 - param0) / 57);
        field_e = null;
        field_g = null;
    }

    final static rh a(int param0, byte param1, boolean param2, boolean param3, int param4) {
        if (param1 >= -13) {
            return null;
        }
        return am.a(-90, param0, param3, param4, param2, false);
    }

    final static boolean a(byte param0, rh param1) {
        int var2 = 12 % ((-57 - param0) / 57);
        return param1.b(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 5167632;
        field_i = 500;
        field_e = "Quit to website";
        field_g = "Logging in...";
    }
}
