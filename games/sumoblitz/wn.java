/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static int field_a;
    static mp field_b;

    public static void a(int param0) {
        field_b = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 106 / ((-16 - param2) / 45);
        return (param0 & 16) != 0 ? true : false;
    }

    final static void a(boolean param0) {
        if (!(ms.field_a)) {
            throw new IllegalStateException();
        }
        pu.field_m = true;
        jv.a(false, false);
        jv.field_a = 0;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        param4 = param4 - param3;
        param0 = param0 - param5;
        if (param4 < -param1) {
            return false;
        }
        if (param0 < -param1) {
            return false;
        }
        if (param1 < param4) {
            return false;
        }
        if (param1 < param0) {
            return false;
        }
        if (param2 > -93) {
            return false;
        }
        int var6 = -13 + Math.max(wg.a(-123, param1), Math.max(wg.a(-122, param4), wg.a(-127, param0)));
        if (0 < var6) {
            param1 = param1 >> var6;
            param4 = param4 >> var6;
            param0 = param0 >> var6;
        }
        if (param1 <= 0) {
            return false;
        }
        if (!((param4 | param0) != 0)) {
            return true;
        }
        return param4 * param4 - -(param0 * param0) <= param1 * param1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new mp();
    }
}
