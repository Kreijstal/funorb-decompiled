/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_a;

    public static void a() {
        field_a = null;
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = "(" + vua.field_B + " " + hla.field_xb + " " + ufa.field_c + ") " + oka.field_z;
        if (uca.field_d > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (uca.field_d <= var2) {
              return var1;
            } else {
              L1: {
                var7 = var1 + 32;
                var3 = vc.field_q.field_g[var2] & 255;
                var4 = var3 >> 4;
                if (var4 < 10) {
                  var4 += 48;
                  break L1;
                } else {
                  var4 += 55;
                  break L1;
                }
              }
              L2: {
                var3 = var3 & 15;
                if (var3 < 10) {
                  var3 += 48;
                  break L2;
                } else {
                  var3 += 55;
                  break L2;
                }
              }
              var8 = var7 + (char)var4;
              var1 = var8 + (char)var3;
              var2++;
              continue L0;
            }
          }
        } else {
          return var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Find opponents";
    }
}
