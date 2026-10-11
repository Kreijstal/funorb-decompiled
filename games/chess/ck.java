/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    private int field_a;
    private og[] field_b;
    private int field_c;

    final lm a() {
        byte[] var1 = this.b();
        return new lm(22050, var1, 22050 * this.field_a / 1000, 22050 * this.field_c / 1000);
    }

    final static ck a(um param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, param2, 5847);
        if (var3 == null) {
          return null;
        }
        return new ck(new p(var3));
    }

    private final byte[] b() {
        int var4 = 0;
        int var8 = 0;
        int var1;
        int var2;
        byte[] var3;
        int var5;
        int var6;
        int var9;
        int[] var13;
        int var2Lifetime1;
        var1 = 0;
        for (var2 = 0; var2 < 10; var2++) {
          if (this.field_b[var2] != null &&
            this.field_b[var2].field_u + this.field_b[var2].field_m > var1) {
            var1 = this.field_b[var2].field_u + this.field_b[var2].field_m;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_b[var4] != null) {
            var5 = this.field_b[var4].field_u * 22050 / 1000;
            var6 = this.field_b[var4].field_m * 22050 / 1000;
            var13 = this.field_b[var4].a(var5, this.field_b[var4].field_u);
            for (var8 = 0; var8 < var5; var8++) {
              var9 = var3[var8 + var6] + (var13[var8] >> 8);
              if ((var9 + 128 & -256) != 0) {
                var9 = var9 >> 31 ^ 127;
              }
              var3[var8 + var6] = (byte)var9;
            }
          }
        }
        return var3;
    }

    private ck(p param0) {
        int var2 = 0;
        int var3;
        this.field_b = new og[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.i(-101);
          if (var3 != 0) {
            param0.field_l = param0.field_l - 1;
            this.field_b[var2] = new og();
            this.field_b[var2].a(param0);
          }
        }
        this.field_a = param0.f(674914976);
        this.field_c = param0.f(674914976);
    }
}
