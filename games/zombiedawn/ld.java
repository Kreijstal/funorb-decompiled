/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends bn {
    static int[] field_k;
    static int field_j;
    static int[] field_n;
    static boolean field_m;
    static vn[][] field_l;

    public static void d(int param0) {
        field_n = null;
        field_k = null;
        if (param0 != 25008) {
            field_j = 49;
        }
        field_l = (vn[][]) null;
    }

    final static void a(long param0, byte param1) {
        if (param1 <= 32) {
            field_j = 40;
        }
        if (!(0L < param0)) {
            return;
        }
        if ((param0 % 10L ^ -1L) == -1L) {
            pb.a(-1L + param0, (byte) 37);
            pb.a(1L, (byte) 29);
        } else {
            pb.a(param0, (byte) 55);
        }
    }

    final nk a(byte param0) {
        if (param0 != -102) {
            field_n = (int[]) null;
        }
        return ek.field_E;
    }

    ld(long param0, String param1) {
        super(param0, param1);
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_k = new int[32];
        field_n = new int[98304];
        for (var0 = 92682; -46342 >= (var0 ^ -1); var0--) {
            var4 = (long)(-1 + (var0 << -2029372223));
            var6 = (long)((var0 << -123421503) - -1);
            var2 = (int)(-32768L + (var4 * var4 >> -1326313134));
            var3 = (int)(-32768L + (var6 * var6 >> -1829200814));
            if (!(field_n.length > var3)) {
                var3 = field_n.length - 1;
            }
            for (var1 = -1 >= (var2 ^ -1) ? var2 : 0; var1 <= var3; var1++) {
                field_n[var1] = var0;
            }
        }
        field_m = true;
        field_l = new vn[31][];
    }
}
