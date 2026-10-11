/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private int field_b;
    private int field_a;
    private wg[] field_c;

    final static v a(nh param0, int param1, int param2) {
        byte[] var3 = param0.b(5, param1, param2);
        if (var3 == null) {
          return null;
        }
        return new v(new ec(var3));
    }

    final va a() {
        byte[] var1 = this.b();
        return new va(22050, var1, 22050 * this.field_a / 1000, 22050 * this.field_b / 1000);
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
          if (this.field_c[var2] != null &&
            this.field_c[var2].field_s + this.field_c[var2].field_o > var1) {
            var1 = this.field_c[var2].field_s + this.field_c[var2].field_o;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_c[var4] != null) {
            var5 = this.field_c[var4].field_s * 22050 / 1000;
            var6 = this.field_c[var4].field_o * 22050 / 1000;
            var13 = this.field_c[var4].a(var5, this.field_c[var4].field_s);
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

    private v(ec param0) {
        int var2 = 0;
        int var3;
        this.field_c = new wg[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.c(true);
          if (var3 != 0) {
            param0.field_o = param0.field_o - 1;
            this.field_c[var2] = new wg();
            this.field_c[var2].a(param0);
          }
        }
        this.field_a = param0.k(0);
        this.field_b = param0.k(0);
    }
}
