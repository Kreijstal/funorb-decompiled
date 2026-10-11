/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static int[] field_a;

    public static void a() {
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2) {
        int var13 = 0;
        int var14 = 0;
        int var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var15;
        if (param0 >= param2.length) {
          df.b(0, 0, df.field_e, df.field_f, param1);
          return;
        }
        var3 = param2[param0];
        if (var3 == 0) {
          return;
        }
        var4 = df.field_d;
        var5 = df.field_i;
        var6 = df.field_g;
        var7 = df.field_k - var5;
        var8 = df.field_h - var6;
        var9 = df.field_e - var7;
        var10 = var5 + var6 * df.field_e;
        var11 = var6 - 1 << 2;
        var12 = df.field_k;
        for (var13 = -var8; var13 < 0; var13++) {
          var11 = var11 + 4 & 12;
          for (var14 = -var7; var14 < 0; var14++) {
            var15 = 1 << var11 + (var12 + var14 & 3);
            if ((var3 & var15) == 0) {
              var10++;
            } else {
              var4[var10++] = param1;
            }
          }
          var10 = var10 + var9;
        }
    }

    static {
        field_a = new int[]{0, 32800, 41120, 41380, 42405, 46565, 62965, 65015};
    }
}
