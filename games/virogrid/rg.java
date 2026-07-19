/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends RuntimeException {
    Throwable field_a;
    static ra field_b;
    static ob field_d;
    String field_c;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        int var1 = -64 / ((param0 - 11) / 45);
    }

    final static String a(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param0) {
          var6 = "(" + ah.field_e + " " + pl.field_c + " " + md.field_b + ") " + ci.field_q;
          var1 = var6;
          if ((ba.field_a ^ -1) < -1) {
            var1 = var6 + ":";
            var2 = 0;
            L0: while (true) {
              if (ba.field_a > var2) {
                L1: {
                  var7 = var1 + ' ';
                  var3 = sh.field_qb.field_g[var2] & 255;
                  var4 = var3 >> 216247428;
                  var3 = var3 & 15;
                  if ((var4 ^ -1) > -11) {
                    var4 += 48;
                    break L1;
                  } else {
                    var4 += 55;
                    break L1;
                  }
                }
                L2: {
                  if (10 <= var3) {
                    var3 += 55;
                    break L2;
                  } else {
                    var3 += 48;
                    break L2;
                  }
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
                var2++;
                continue L0;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        } else {
          return (String) null;
        }
    }

    rg(Throwable param0, String param1) {
        this.field_a = param0;
        this.field_c = param1;
    }

    static {
        field_b = new ra();
        field_d = new ob();
    }
}
