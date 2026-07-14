/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends ms {
    private static int[] field_k;
    boolean field_p;
    private int field_n;
    int field_o;
    int field_m;
    private int[] field_l;

    public static void a() {
        field_k = null;
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param0 == 0) {
            if (param1 == 0) {
                return;
            }
        }
        if (field_k != null) {
            // if_icmpeq L37
        }
        field_k = new int[((le) this).field_l.length];
        int var3 = ((le) this).field_l.length;
        int var4 = param0;
        int var5 = ((le) this).field_n - 1;
        int var6 = ((le) this).field_n * param1;
        int var7 = var3 - 1;
        int var8_int = 0;
        while (var8_int < var3) {
            var9 = var8_int + var6 & var7;
            for (var10 = 0; var10 < ((le) this).field_n; var10++) {
                var11 = var8_int + var10;
                var12 = var9 + (var10 + var4 & var5);
                field_k[var11] = ((le) this).field_l[var12];
            }
            var8_int = var8_int + ((le) this).field_n;
        }
        int[] var8 = ((le) this).field_l;
        ((le) this).field_l = field_k;
        field_k = var8;
    }

    private le() throws Throwable {
        throw new Error();
    }
}
