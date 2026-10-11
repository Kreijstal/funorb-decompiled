/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static int[] field_c;
    static int[] field_a;
    static boolean field_b;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 255) {
          ck.b(97);
          field_c = null;
          return;
        }
        field_c = null;
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
        var5 = TorChallenge.field_F ? 1 : 0;
        var6 = "(" + ul.field_j + " " + uc.field_X + " " + md.field_i + ") " + cb.field_g;
        var1 = var6;
        if (bb.field_i <= 0) {
          if (param0 != -13299) {
            ck.a(-82);
          }
          return var1;
        }
        var1Lifetime1 = var6 + ":";
        for (var2 = 0; bb.field_i > var2; var2++) {
          var7 = var1Lifetime1 + ' ';
          var1Lifetime1 = var7;
          var3 = 255 & id.field_b.field_m[var2];
          var4 = var3 >> 4;
          if (var4 < 10) {
            var4 += 48;
          } else {
            var4 += 55;
          }
          var3 = var3 & 15;
          var8 = var7 + (char)var4;
          if (10 <= var3) {
            var3 += 55;
          } else {
            var3 += 48;
          }
          var1Lifetime1 = var8 + (char)var3;
        }
        if (param0 == -13299) {
          return var1Lifetime1;
        }
        ck.a(-82);
        return var1Lifetime1;
    }

    static {
        field_a = new int[]{20, 0, 0, 10, 0, 0, 0, 0, 0, 0};
        field_c = new int[4];
    }
}
