/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uva extends ksa {
    private int field_e;
    int field_d;
    boolean field_h;
    private static int[] field_f;
    int field_g;
    private int[] field_i;

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
        if (field_f != null) {
            // if_icmpeq L37
        }
        field_f = new int[((uva) this).field_i.length];
        int var3 = ((uva) this).field_i.length;
        int var4 = param0;
        int var5 = ((uva) this).field_e - 1;
        int var6 = ((uva) this).field_e * param1;
        int var7 = var3 - 1;
        int var8_int = 0;
        while (var8_int < var3) {
            var9 = var8_int + var6 & var7;
            for (var10 = 0; var10 < ((uva) this).field_e; var10++) {
                var11 = var8_int + var10;
                var12 = var9 + (var10 + var4 & var5);
                field_f[var11] = ((uva) this).field_i[var12];
            }
            var8_int = var8_int + ((uva) this).field_e;
        }
        int[] var8 = ((uva) this).field_i;
        ((uva) this).field_i = field_f;
        field_f = var8;
    }

    public static void a() {
        field_f = null;
    }

    private uva() throws Throwable {
        throw new Error();
    }
}
