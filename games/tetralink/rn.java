/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static float field_d;
    static de field_e;
    static String field_a;
    static hl field_c;
    static int field_b;

    final static void a(int param0) {
        wm.field_p = null;
        gg.field_k = null;
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 < 97) {
            rn.a((byte) 104);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (!(param1 != 0)) {
            return 0;
        }
        if (param1 > 0) {
            var2 = 1;
            if (param1 > 65535) {
                var2 += 16;
                param1 = param1 >> 16;
            }
            if (!(param1 <= 255)) {
                param1 = param1 >> 8;
                var2 += 8;
            }
            if (!(param1 <= 15)) {
                param1 = param1 >> 4;
                var2 += 4;
            }
            if (!(param1 <= 3)) {
                var2 += 2;
                param1 = param1 >> 2;
            }
            if (param1 > 1) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!(param1 >= -65536)) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (param1 < -256) {
            var2 += 8;
            param1 = param1 >> 8;
        }
        if (param1 < -16) {
            var2 += 4;
            param1 = param1 >> 4;
        }
        if (!(param1 >= -4)) {
            var2 += 2;
            param1 = param1 >> 2;
        }
        if (!(param1 >= -2)) {
            param1 = param1 >> 1;
            var2++;
        }
        return var2;
    }

    final static void a(boolean param0, int param1) {
        i.a(true, param0);
        ji.b(-1002815199, param0);
        int var2 = 117 / ((param1 - 15) / 57);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Use this alternative as your account name";
    }
}
