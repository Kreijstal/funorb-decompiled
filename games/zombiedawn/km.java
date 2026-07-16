/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    boolean field_a;
    String field_d;
    static String field_b;
    String field_c;

    final static boolean a(int param0, int param1, wk param2, int param3) {
        if (param0 != 21405) {
            km.a((byte) 1);
            if ((param1 ^ -1) >= 47) {
                return false;
            }
            if (47 <= (param1 ^ -1)) {
                return false;
            }
            if ((float)param1 >= (float)qj.field_d * 1.0f) {
                return false;
            }
            if ((float)me.field_Bb * 1.0f <= (float)param3) {
                return false;
            }
            return true;
        }
        if ((param1 ^ -1) >= 47) {
            return false;
        }
        if (47 <= (param1 ^ -1)) {
            return false;
        }
        if ((float)param1 >= (float)qj.field_d * 1.0f) {
            return false;
        }
        if ((float)me.field_Bb * 1.0f <= (float)param3) {
            return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 15) {
            km.a((byte) -128);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Select a location!";
    }
}
