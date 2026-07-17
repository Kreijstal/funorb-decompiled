/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq extends le {
    static dja field_i;
    static String field_j;

    private final int c(int param0, int param1) {
        int var4 = param1 * 57 + param0;
        var4 = var4 << 1 ^ var4;
        return -((2147483647 & 1376312589 + (789221 + var4 * (var4 * 15731)) * var4) / 262144) + 4096;
    }

    public static void d(int param0) {
        field_j = null;
        field_i = null;
        if (param0 != 262144) {
            lq.d(-121);
        }
    }

    final int[] a(int param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (!param1) {
            int[] discarded$0 = ((lq) this).a(-57, false);
        }
        int[] var7 = ((lq) this).field_f.a((byte) -21, param0);
        int[] var3 = var7;
        if (((lq) this).field_f.field_e) {
            var4 = sj.field_p[param0];
            for (var5 = 0; var5 < hob.field_d; var5++) {
                int discarded$1 = 789221;
                var7[var5] = this.c(grb.field_l[var5], var4) % 4096;
            }
        }
        return var3;
    }

    public lq() {
        super(0, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = (dja) (Object) new upb();
        field_j = "Type your age in years";
    }
}
