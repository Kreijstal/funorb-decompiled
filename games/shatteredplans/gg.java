/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_b;
    static bi field_e;
    static qr field_d;
    static String field_c;
    static int field_a;

    final static qf a(int param0, int param1, String param2) {
        if (param0 != 128) {
            return null;
        }
        return new qf(mj.field_Sb.a(param0 + 27988, param2, ""), param1);
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
            field_e = null;
        }
    }

    final static void a(byte[] param0, byte param1) {
        if (!(param0[0] < 0)) {
            uc.field_A = param0[1];
        }
        int var2 = -79 / ((-55 - param1) / 60);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Reload game";
        field_c = "There are no valid types of game that match your preferences.";
        field_a = 128;
    }
}
