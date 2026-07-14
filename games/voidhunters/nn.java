/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn implements dja {
    static int field_b;
    static int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var8 = VoidHunters.field_G;
        for (var6 = param2; var6 <= param5; var6++) {
            ww.a(param4, param1, rba.field_b[var6], (byte) 75, param0);
        }
        int var7 = -38 % ((-5 - param3) / 63);
    }

    final static void a(int param0, int param1, int param2, int param3, lta param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = VoidHunters.field_G;
        var6 = param5;
        var7 = param0;
        var8 = param5;
        var9 = param0;
        var10 = param3 + -param5;
        var11 = param2 + -param0;
        var12 = var11;
        var13 = -var10;
        var14 = ar.a(var12, (byte) 103, var13);
        var13 = (var13 << 1557493768) / var14;
        var12 = (var12 << 1515227016) / var14;
        var15 = 64;
        var16 = param1;
        L0: while (true) {
          if (var15 + 1 <= var16) {
            return;
          } else {
            var17 = fc.a(512 * kdb.field_o - (var16 << 1779826984), (byte) -65) >> -1727635698;
            var18 = fc.a(-(var16 << 1816191304) + kdb.field_o * 500, (byte) 59) >> 1273255374;
            var19 = var12 * var17 + var10 * var16 / var15 + param5;
            var20 = var17 * var13 + var16 * var11 / var15 + param0;
            var21 = param5 - -(var10 * var16 / var15) + -(var18 * var12);
            hha.a(param4.a(var6, (byte) 126), (byte) 66, param4.a(var19, (byte) 126), param4.b(true, var7), 11206400, param4.b(true, var20), 200);
            var22 = -(var13 * var18) + (param0 + var11 * var16 / var15);
            var7 = var20;
            hha.a(param4.a(var8, (byte) 113), (byte) 66, param4.a(var21, (byte) 125), param4.b(true, var9), 12320512, param4.b(true, var22), 240);
            var6 = var19;
            var8 = var21;
            var9 = var22;
            var16++;
            continue L0;
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_b = -83;
        }
        return (tv[]) (Object) new bha[param1];
    }

    public final tv a(byte param0) {
        int var2 = -59 % ((param0 - -64) / 50);
        return (tv) (Object) new bha();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 18;
        field_b = 0;
    }
}
