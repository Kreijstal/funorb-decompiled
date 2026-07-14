/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static long field_b;
    static String field_a;

    final static lba[] a(byte param0, ht param1) {
        int[] var3 = null;
        lba[] var4 = null;
        int var5 = 0;
        lba var6 = null;
        int var7 = 0;
        eh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var7 = BachelorFridge.field_y;
        if (!param1.b(34)) {
          return new lba[]{};
        } else {
          var8 = param1.c(-1);
          L0: while (true) {
            if (0 != var8.field_f) {
              if (2 != var8.field_f) {
                var12 = (int[]) var8.field_e;
                var11 = var12;
                var10 = var11;
                var9 = var10;
                var3 = var9;
                var4 = new lba[var12.length >> -267186558];
                var5 = 0;
                if (param0 < -31) {
                  L1: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new lba();
                      var4[var5] = var6;
                      var6.field_d = var3[var5 << -2052271870];
                      var6.field_e = var3[1 + (var5 << -168984574)];
                      var6.field_a = var3[(var5 << 1996623970) + 2];
                      var6.field_b = var3[3 + (var5 << 1348161058)];
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  field_a = null;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new lba();
                      var4[var5] = var6;
                      var6.field_d = var3[var5 << -2052271870];
                      var6.field_e = var3[1 + (var5 << -168984574)];
                      var6.field_a = var3[(var5 << 1996623970) + 2];
                      var6.field_b = var3[3 + (var5 << 1348161058)];
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new lba[]{};
              }
            } else {
              gda.a(false, 10L);
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < -122) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Falling into a pit means instant death for the creature! Take great care not to slip and fall, or be pushed!";
    }
}
