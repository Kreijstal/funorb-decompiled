/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wv extends pu {
    static sna field_l;

    public static void b(int param0) {
        if (param0 > -55) {
            wv.b(-52);
        }
        field_l = null;
    }

    final static void a(byte param0, byte[] param1) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var13 = null;
        int[] var15 = null;
        String var9 = null;
        int var10 = 0;
        int[] var18 = null;
        int[] var17 = null;
        int[] var16 = null;
        int[] var14 = null;
        int[] var11 = null;
        int var12 = BachelorFridge.field_y;
        lka.field_E = qs.a(false, new lu(param1));
        if (param0 >= -16) {
            field_l = null;
        }
        gfa.field_a = new wca[-1 + lka.field_E.length];
        for (var2 = 1; var2 < lka.field_E.length; var2++) {
            var3 = Integer.parseInt(lka.field_E[var2][0]);
            var4 = lka.field_E[var2][3];
            var5 = lka.field_E[var2][4];
            var6 = m.a(var2, (byte) 98, 1);
            var7 = kka.a(var2, -55, 2);
            var8 = new int[13];
            var13 = w.field_h[var2 + -1];
            var15 = var13;
            var8 = var15;
            var9 = lka.field_E[var2][15];
            if (7 == var6) {
                var13[1] = kka.a(var2, 95, 5);
                var13[4] = kka.a(var2, 85, 6);
                var13[7] = kka.a(var2, -41, 7);
                var13[10] = kka.a(var2, -75, 8);
            } else {
                if ((var6 ^ -1) != -7) {
                    var8[1] = m.a(var2, (byte) 30, 5);
                    var8[4] = m.a(var2, (byte) 99, 6);
                    var8[7] = kka.a(var2, 68, 7);
                    var8[10] = kka.a(var2, 61, 8);
                } else {
                    var8[1] = m.a(var2, (byte) 105, 5);
                    var8[4] = kka.a(var2, -67, 6);
                    var8[7] = kka.a(var2, -72, 7);
                    var8[10] = kka.a(var2, -124, 8);
                }
            }
            var10 = ch.a((byte) 91, var2);
            var18 = new int[4];
            var17 = var18;
            var16 = var17;
            var14 = var16;
            var11 = var14;
            var11[0] = vc.a(var2, 10, -16306);
            var11[1] = vc.a(var2, 11, -16306);
            var11[2] = vc.a(var2, 12, -16306);
            var11[3] = vc.a(var2, 13, -16306);
            ob.a(var4, var10, var18, var9, var7, (byte) 22, var7, var5, uma.field_P[var3], var15);
        }
    }

    static {
    }
}
