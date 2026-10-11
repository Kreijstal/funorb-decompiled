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
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        String var1Lifetime1;
        var5 = Virogrid.field_F ? 1 : 0;
        if (!param0) {
          return (String) null;
        }
        var6 = "(" + ah.field_e + " " + pl.field_c + " " + md.field_b + ") " + ci.field_q;
        var1 = var6;
        if (ba.field_a <= 0) {
          return var1;
        }
        var1Lifetime1 = var6 + ":";
        for (var2 = 0; ba.field_a > var2; var2++) {
          var7 = var1Lifetime1 + ' ';
          var3 = sh.field_qb.field_g[var2] & 255;
          var4 = var3 >> 4;
          var3 = var3 & 15;
          if (var4 < 10) {
            var4 += 48;
          } else {
            var4 += 55;
          }
          if (10 <= var3) {
            var3 += 55;
          } else {
            var3 += 48;
          }
          var8 = var7 + (char)var4;
          var1Lifetime1 = var8 + (char)var3;
        }
        return var1Lifetime1;
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
