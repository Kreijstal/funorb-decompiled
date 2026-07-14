/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_d;
    static llb field_b;
    static wf[] field_a;
    static phb[] field_c;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (!param0) {
            Object var2 = null;
            lo.a(20, 74, (aja) null, (lta) null);
        }
        field_a = null;
    }

    final static void a(int param0, int param1, aja param2, lta param3) {
        int var4 = 0;
        int var5 = 0;
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
        int var24 = 0;
        L0: {
          var24 = VoidHunters.field_G;
          var4 = param3.a(true, 0);
          if (-1 < var4) {
            var4 = var4 - param1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var5 = param3.a(param0 + 0, 0);
          if (-1 <= var5) {
            break L1;
          } else {
            var5 = var5 - param1;
            break L1;
          }
        }
        var6 = param3.a(true, ip.field_p.width);
        var7 = param3.a(0, ip.field_p.height);
        var8 = -var4 + var6;
        var9 = var7 + -var5;
        var10 = var4 / param1 * param1;
        var11 = param1 * (var5 / param1);
        var12 = var8 / param1;
        var13 = var9 / param1;
        var14 = var10;
        var15 = var11;
        var16 = param0;
        L2: while (true) {
          if (var16 > var12) {
            return;
          } else {
            var17 = 0;
            L3: while (true) {
              if (var13 < var17) {
                var14 = var14 + param1;
                var15 = var11;
                var16++;
                continue L2;
              } else {
                var18 = var14 + param1;
                var19 = var15 - -param1;
                var20 = param3.a(var14, (byte) 127);
                var21 = param3.b(true, var15);
                var22 = param3.a(var18, (byte) 127);
                var23 = param3.b(true, var19);
                param2.b(var20, var21, var22 - var20, -var21 + var23);
                var15 = var15 + param1;
                var17++;
                continue L3;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wf[10];
    }
}
