/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    private kj[] field_b;
    private int field_c;
    private int field_a;

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
          if (this.field_b[var2] != null &&
            this.field_b[var2].field_r + this.field_b[var2].field_h > var1) {
            var1 = this.field_b[var2].field_r + this.field_b[var2].field_h;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_b[var4] != null) {
            var5 = this.field_b[var4].field_r * 22050 / 1000;
            var6 = this.field_b[var4].field_h * 22050 / 1000;
            var13 = this.field_b[var4].a(var5, this.field_b[var4].field_r);
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

    final ud b() {
        byte[] var1 = this.a();
        return new ud(22050, var1, 22050 * this.field_c / 1000, 22050 * this.field_a / 1000);
    }

    private bi(wl param0) {
        int var2 = 0;
        int var3;
        this.field_b = new kj[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.d((byte) -82);
          if (var3 != 0) {
            param0.field_n = param0.field_n - 1;
            this.field_b[var2] = new kj();
            this.field_b[var2].a(param0);
          }
        }
        this.field_c = param0.e(3);
        this.field_a = param0.e(3);
    }

    final static bi a(ji param0, int param1, int param2) {
        byte[] var3 = param0.a(param2, 76, param1);
        if (var3 == null) {
          return null;
        }
        return new bi(new wl(var3));
    }
}
