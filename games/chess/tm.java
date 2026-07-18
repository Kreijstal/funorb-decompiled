/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    int field_e;
    static int field_c;
    int field_g;
    static jc field_a;
    int field_f;
    int field_i;
    static int field_d;
    static String field_b;
    static String field_h;

    final static void a(boolean param0, pg param1) {
        nk var3 = null;
        try {
            var3 = qn.field_U;
            var3.f(7, -114);
            var3.c(param1.field_q, (byte) -91);
            var3.c(param1.field_u, (byte) -60);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "tm.C(" + false + ',' + (param1 != null ? "{...}" : "null") + ',' + 7 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_h = null;
        field_a = null;
    }

    final static String b(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var5 = Chess.field_G;
        var6 = "(" + lf.field_T + " " + wc.field_u + " " + hh.field_o + ") " + wg.field_B;
        if (sb.field_sb > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (sb.field_sb > var2) {
              L1: {
                var7 = var1 + ' ';
                var3 = 255 & tk.field_h.field_o[var2];
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 < 10) {
                  var4 += 48;
                  break L1;
                } else {
                  var4 += 55;
                  break L1;
                }
              }
              L2: {
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
            } else {
              if (param0 > -119) {
                String discarded$2 = tm.b((byte) 71);
                return var1;
              } else {
                return var1;
              }
            }
          }
        } else {
          if (param0 > -119) {
            String discarded$3 = tm.b((byte) 71);
            return var6;
          } else {
            return var6;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new jc();
        field_b = "Show players in <%0>'s game";
        field_h = "Players";
    }
}
