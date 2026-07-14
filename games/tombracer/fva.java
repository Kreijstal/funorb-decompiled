/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fva extends loa {
    static int[] field_c;
    static String field_b;

    final void a(int param0, int param1, hj param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param1 < 73) {
            return;
        }
        for (var5 = 1; -1 + param2.field_f > var5; var5 += 2) {
            for (var6 = 1; param2.field_a - 1 > var6; var6 += 2) {
                param2.a(var6, -1, 0, var5);
            }
        }
        this.a(param2, param3, param0, 21619);
    }

    private final boolean a(int param0, hj param1, int param2, int param3) {
        if (0 < param2) {
            // if_icmpge L39
            // if_icmple L39
            // if_icmple L39
        } else {
            return false;
        }
        if (param3 > -53) {
            return false;
        }
        int var5 = param1.b((byte) -5, param0, param2);
        if ((var5 ^ -1) == 0) {
            return true;
        }
        return false;
    }

    public static void a(int param0) {
        int var1 = -112 % ((-17 - param0) / 46);
        field_c = null;
        field_b = null;
    }

    private final void a(hj param0, int param1, int param2, int param3) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          if (param3 == 21619) {
            break L0;
          } else {
            var11 = null;
            this.a((hj) null, -65, 4, -46);
            break L0;
          }
        }
        var14 = ((fva) this).a(4, param3 + -23971);
        var13 = var14;
        var12 = var13;
        var5 = var12;
        var6 = 0;
        L1: while (true) {
          if ((var6 ^ -1) <= -5) {
            return;
          } else {
            var7 = var14[var6];
            var8 = param1 + 2 * dma.field_k[var7][0];
            var9 = dma.field_k[var7][1] * 2 + param2;
            if (this.a(var9, param0, var8, -74)) {
              ((fva) this).a(param2, (byte) -42, param0, param1, var9, var8);
              this.a(param0, var8, var9, 21619);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    fva(qea param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_b = "<%0> chose reward: <%1>";
    }
}
