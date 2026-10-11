/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private ok[] field_a;
    private int field_b;
    private int field_c;

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
          if (this.field_a[var2] != null &&
            this.field_a[var2].field_g + this.field_a[var2].field_y > var1) {
            var1 = this.field_a[var2].field_g + this.field_a[var2].field_y;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_a[var4] != null) {
            var5 = this.field_a[var4].field_g * 22050 / 1000;
            var6 = this.field_a[var4].field_y * 22050 / 1000;
            var13 = this.field_a[var4].a(var5, this.field_a[var4].field_g);
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

    final static va a(gb param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, param1, 0);
        if (var3 == null) {
          return null;
        }
        return new va(new vi(var3));
    }

    final static va a(gb param0, int param1, int param2) {
        byte[] var3 = param0.a(false, param2, param1);
        if (var3 == null) {
          return null;
        }
        return new va(new vi(var3));
    }

    final jb a() {
        byte[] var1 = this.b();
        return new jb(22050, var1, 22050 * this.field_b / 1000, 22050 * this.field_c / 1000);
    }

    private va(vi param0) {
        int var2 = 0;
        int var3;
        this.field_a = new ok[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.l(32270);
          if (var3 != 0) {
            param0.field_i = param0.field_i - 1;
            this.field_a[var2] = new ok();
            this.field_a[var2].a(param0);
          }
        }
        this.field_b = param0.e(8);
        this.field_c = param0.e(8);
    }
}
