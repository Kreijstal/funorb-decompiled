/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends am {
    static volatile boolean field_v;
    static int field_x;
    static int[] field_u;
    static int field_w;
    static String[] field_s;
    static double[] field_t;

    final static int g(byte param0) {
        if (param0 <= 108) {
            int discarded$0 = b.g((byte) 51);
        }
        return ii.field_k;
    }

    final static int e(int param0, int param1, int param2) {
        int var3 = param0 - 1 & param1 >> 31;
        return var3 + ((param1 >>> 31) + param1) % param0;
    }

    public b() {
        super(0, true);
    }

    public static void c(int param0) {
        field_t = null;
        field_s = null;
        if (param0 != 16060) {
            b.c(118);
        }
        field_u = null;
    }

    private final int d(int param0, int param1, int param2) {
        int var4 = param2 - -(param1 * 57);
        var4 = var4 << 1 ^ var4;
        return -((1376312589 + (var4 * var4 * 15731 - -789221) * var4 & 2147483647) / 262144) + 4096;
    }

    final static void b(int param0) {
        if (on.field_c <= 20) {
            bd.a(false, 0);
        } else {
            bd.a(false, on.field_c - 20);
        }
    }

    final int[] a(byte param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Torquing.field_u;
        int[] var7 = ((b) this).field_l.a(param1, 25657);
        int[] var3 = var7;
        if (param0 < 86) {
            return null;
        }
        if (((b) this).field_l.field_b) {
            var4 = dp.field_a[param1];
            for (var5 = 0; var5 < ci.field_c; var5++) {
                var7[var5] = this.d(-5951, var4, q.field_b[var5]) % 4096;
            }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = false;
        field_t = new double[3];
        field_s = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
