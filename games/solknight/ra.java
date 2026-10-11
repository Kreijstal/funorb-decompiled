/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private int field_c;
    private fe[] field_a;
    private int field_b;

    final static ra a(da param0, int param1, int param2) {
        byte[] var3 = param0.b(param1, 12257, param2);
        if (var3 == null) {
          return null;
        }
        return new ra(new gb(var3));
    }

    private final byte[] a() {
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
            this.field_a[var2].field_n + this.field_a[var2].field_m > var1) {
            var1 = this.field_a[var2].field_n + this.field_a[var2].field_m;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_a[var4] != null) {
            var5 = this.field_a[var4].field_n * 22050 / 1000;
            var6 = this.field_a[var4].field_m * 22050 / 1000;
            var13 = this.field_a[var4].a(var5, this.field_a[var4].field_n);
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

    final sh b() {
        byte[] var1 = this.a();
        return new sh(22050, var1, 22050 * this.field_c / 1000, 22050 * this.field_b / 1000);
    }

    final static ra a(da param0, String param1, String param2) {
        byte[] var3 = param0.a(4, param1, param2);
        if (var3 == null) {
          return null;
        }
        return new ra(new gb(var3));
    }

    private ra(gb param0) {
        int var2 = 0;
        int var3;
        this.field_a = new fe[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.j(255);
          if (var3 != 0) {
            param0.field_m = param0.field_m - 1;
            this.field_a[var2] = new fe();
            this.field_a[var2].a(param0);
          }
        }
        this.field_c = param0.i(59);
        this.field_b = param0.i(-113);
    }
}
