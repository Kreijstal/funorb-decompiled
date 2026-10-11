/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    private int field_a;
    private kv[] field_c;
    private int field_b;

    final to a() {
        byte[] var1 = this.b();
        return new to(22050, var1, 22050 * this.field_a / 1000, 22050 * this.field_b / 1000);
    }

    final static ed a(sj param0, int param1, int param2) {
        byte[] var3 = param0.b(param1, -32669, param2);
        if (var3 == null) {
          return null;
        }
        return new ed(new iw(var3));
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
            this.field_c[var2].field_w + this.field_c[var2].field_y > var1) {
            var1 = this.field_c[var2].field_w + this.field_c[var2].field_y;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_c[var4] != null) {
            var5 = this.field_c[var4].field_w * 22050 / 1000;
            var6 = this.field_c[var4].field_y * 22050 / 1000;
            var13 = this.field_c[var4].a(var5, this.field_c[var4].field_w);
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

    private ed(iw param0) {
        int var2 = 0;
        int var3;
        this.field_c = new kv[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.h((byte) -117);
          if (var3 != 0) {
            param0.field_n = param0.field_n - 1;
            this.field_c[var2] = new kv();
            this.field_c[var2].a(param0);
          }
        }
        this.field_a = param0.a((byte) 81);
        this.field_b = param0.a((byte) 81);
    }
}
