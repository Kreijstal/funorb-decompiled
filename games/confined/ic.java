/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static String field_d;
    static nf field_a;
    static int field_b;
    static bi[] field_c;

    public static void a() {
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static int a(int param0) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (!(param0 <= 0)) {
            var2 = 1;
            if (param0 > 65535) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (!(param0 <= 255)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(param0 <= 15)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (param0 > 3) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if (param0 > 1) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if (!(param0 >= -256)) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (!(param0 >= -16)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (param0 < -4) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (-2 > param0) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_d = "A";
        field_c = new bi[13];
    }
}
