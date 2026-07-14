/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    int field_e;
    static String field_b;
    int field_d;
    static int field_h;
    int field_f;
    static String field_c;
    int field_g;
    static int field_j;
    static String field_a;
    static int field_i;

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        int var2 = param1.charAt(0);
        if (param0 > -54) {
            ef.a(56);
        }
        for (var3 = 1; var3 < param1.length(); var3++) {
            if (!(var2 == param1.charAt(var3))) {
                return false;
            }
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != 31955) {
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Left click to select ";
        field_j = 0;
        field_b = "ACT I: ";
        field_h = 66;
        field_c = "Snap Accuracy: ";
    }
}
