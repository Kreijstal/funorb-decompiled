/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uja {
    static int field_b;
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -121) {
            uja.a((byte) 103);
        }
    }

    final static phb[] a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        phb[] var1 = new phb[mma.field_a];
        for (var2 = 0; var2 < mma.field_a; var2++) {
            var3 = hla.field_a[var2] * nhb.field_o[var2];
            var4 = sh.field_a[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = rlb.field_d[dla.a(255, (int) var4[var6])];
            }
            var1[var2] = new phb(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var5);
        }
        qqb.a(84);
        return var1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
    }
}
