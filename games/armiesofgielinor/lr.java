/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr {
    static iv field_a;
    private int[] field_b;

    lr(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> 821848545) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((lr) this).field_b = new int[var2 - -var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((lr) this).field_b[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = var2 + -1 & param0[var3];
            while (0 != (((lr) this).field_b[var4 + (var4 + 1)] ^ -1)) {
                var4 = var4 + 1 & var2 - 1;
            }
            ((lr) this).field_b[var4 + var4] = param0[var3];
            ((lr) this).field_b[var4 + var4 + 1] = var3;
        }
    }

    final static ru[] a(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ru[] var1 = new ru[iw.field_n];
        for (var2 = 0; var2 < iw.field_n; var2++) {
            var1[var2] = new ru(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], vj.field_j[var2], qv.field_j);
        }
        if (param0 < 102) {
            Object var4 = null;
            lr.a((co[]) null, (byte) -34);
        }
        rj.d((byte) 103);
        return var1;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -1 + (((lr) this).field_b.length >> -2140433471);
        if (param1 == 1) {
          var4 = var3 & param0;
          L0: while (true) {
            var5 = ((lr) this).field_b[1 + (var4 + var4)];
            if ((var5 ^ -1) != 0) {
              if (((lr) this).field_b[var4 + var4] == param0) {
                return var5;
              } else {
                var4 = var3 & 1 + var4;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -110;
        }
    }

    final static void a(co[] param0, byte param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        co[] var5 = param0;
        co[] var2 = var5;
        if (param1 <= 35) {
            ru[] discarded$0 = lr.a(-11);
        }
        for (var3 = 0; var3 < var5.length; var3++) {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
