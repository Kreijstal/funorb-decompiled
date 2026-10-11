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

    final static void a(boolean param0, pg param1, int param2) {
        nk var3 = null;
        try {
          var3 = qn.field_U;
          var3.f(param2, -114);
          if (param0) {
            field_d = -61;
          }
          var3.c(param1.field_q, (byte) -91);
          var3.c(param1.field_u, (byte) -60);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "tm.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_a = null;
        if (param0 <= 5) {
          field_d = -35;
        }
    }

    final static String b(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        String var1Lifetime1;
        var5 = Chess.field_G;
        var6 = "(" + lf.field_T + " " + wc.field_u + " " + hh.field_o + ") " + wg.field_B;
        var1 = var6;
        if (sb.field_sb <= 0) {
          if (param0 <= -119) {
            return var1;
          }
          tm.b((byte) 71);
          return var1;
        }
        var1Lifetime1 = var6 + ":";
        for (var2 = 0; sb.field_sb > var2; var2++) {
          var7 = var1Lifetime1 + ' ';
          var1Lifetime1 = var7;
          var3 = 255 & tk.field_h.field_o[var2];
          var4 = var3 >> 4;
          var3 = var3 & 15;
          if (var4 < 10) {
            var4 += 48;
          } else {
            var4 += 55;
          }
          if (var3 < 10) {
            var3 += 48;
          } else {
            var3 += 55;
          }
          var8 = var7 + (char)var4;
          var1Lifetime1 = var8 + (char)var3;
        }
        if (param0 <= -119) {
          return var1Lifetime1;
        }
        tm.b((byte) 71);
        return var1Lifetime1;
    }

    static {
        field_a = new jc();
        field_b = "Show players in <%0>'s game";
        field_h = "Players";
    }
}
