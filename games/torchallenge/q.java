/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    private int field_a;
    private dc[] field_b;
    private int field_c;

    final static q a(lj param0, int param1, int param2) {
        byte[] var3 = param0.c(param1, param2, 0);
        if (var3 == null) {
          return null;
        }
        return new q(new uf(var3));
    }

    final static q a(lj param0, String param1, String param2) {
        byte[] var3 = param0.a(-2, param2, param1);
        if (var3 == null) {
          return null;
        }
        return new q(new uf(var3));
    }

    final fe b() {
        byte[] var1 = this.a();
        return new fe(22050, var1, 22050 * this.field_c / 1000, 22050 * this.field_a / 1000);
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
          if (this.field_b[var2] != null &&
            this.field_b[var2].field_h + this.field_b[var2].field_t > var1) {
            var1 = this.field_b[var2].field_h + this.field_b[var2].field_t;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_b[var4] != null) {
            var5 = this.field_b[var4].field_h * 22050 / 1000;
            var6 = this.field_b[var4].field_t * 22050 / 1000;
            var13 = this.field_b[var4].a(var5, this.field_b[var4].field_h);
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

    private q(uf param0) {
        int var2 = 0;
        int var3;
        this.field_b = new dc[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.j(-109);
          if (var3 != 0) {
            param0.field_q = param0.field_q - 1;
            this.field_b[var2] = new dc();
            this.field_b[var2].a(param0);
          }
        }
        this.field_c = param0.c(false);
        this.field_a = param0.c(false);
    }
}
