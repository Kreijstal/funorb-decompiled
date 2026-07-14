/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static int field_a;

    final static al[] a(un param0, byte param1) {
        int var5 = 0;
        al var6 = null;
        int var7 = CrazyCrystals.field_B;
        if (!param0.b(5)) {
            return new al[]{};
        }
        gb var9 = param0.a((byte) -116);
        while (var9.field_a == 0) {
            fh.a(true, 10L);
        }
        if (!((var9.field_a ^ -1) != -3)) {
            return new al[]{};
        }
        int[] var13 = (int[]) var9.field_b;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var3 = var10;
        al[] var4 = new al[var13.length >> 1010349570];
        if (param1 <= 13) {
            Object var8 = null;
            al[] discarded$0 = ri.a((un) null, (byte) -59);
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new al();
            var4[var5] = var6;
            var6.field_i = var3[var5 << 1475799650];
            var6.field_g = var3[(var5 << -1692541246) - -1];
            var6.field_b = var3[2 + (var5 << 632575202)];
            var6.field_e = var3[3 + (var5 << -1222162238)];
        }
        return var4;
    }

    static {
    }
}
