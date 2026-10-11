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
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        String var1Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = "(" + vua.field_B + " " + hla.field_xb + " " + ufa.field_c + ") " + oka.field_z;
        var1 = var6;
        if (uca.field_d <= 0) {
          if (param0 != 32) {
            return (String) null;
          }
          return var1;
        }
        var1Lifetime1 = var6 + ":";
        for (var2 = 0; uca.field_d > var2; var2++) {
          var7 = var1Lifetime1 + ' ';
          var1Lifetime1 = var7;
          var3 = vc.field_q.field_g[var2] & 255;
          var4 = var3 >> 4;
          if (var4 < 10) {
            var4 += 48;
          } else {
            var4 += 55;
          }
          var3 = var3 & 15;
          if (var3 < 10) {
            var3 += 48;
          } else {
            var3 += 55;
          }
          var8 = var7 + (char)var4;
          var1Lifetime1 = var8 + (char)var3;
        }
        if (param0 != 32) {
          return (String) null;
        }
        return var1Lifetime1;
    }

    static {
        field_a = "Find opponents";
    }
}
