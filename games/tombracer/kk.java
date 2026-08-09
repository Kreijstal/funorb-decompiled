/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 120) {
            kk.a(26);
        }
    }

    final static String a(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = "(" + vua.field_B + " " + hla.field_xb + " " + ufa.field_c + ") " + oka.field_z;
        var1 = var6;
        if ((uca.field_d ^ -1) < -1) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (uca.field_d <= var2) {
              if (param0 != 32) {
                return (String) null;
              } else {
                return var1;
              }
            } else {
              L1: {
                var7 = var1 + ' ';
                var1 = var7;
                var3 = vc.field_q.field_g[var2] & 255;
                var4 = var3 >> -1438821180;
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
          if (param0 != 32) {
            return (String) null;
          } else {
            return var1;
          }
        }
    }

    static {
        field_a = "Find opponents";
    }
}
