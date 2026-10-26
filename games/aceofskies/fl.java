/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private int field_f;
    private int field_e;
    private int field_c;
    private int field_a;
    private int field_d;
    private int[] field_g;
    private int field_b;

    final void a(float[] param0, int param1, boolean param2) {
        int var15;
        for (int var4 = 0; var4 < param1; var4++) {
          param0[var4] = 0.0f;
        }
        if (param2) {
          return;
        }
        int var4Lifetime1 = t.field_q[this.field_d].field_b;
        int var5 = this.field_a - this.field_c;
        int var6 = var5 / this.field_e;
        int[] var22 = new int[var6];
        int[] var19 = var22;
        int[] var7 = var19;
        for (int var8 = 0; var8 < 8; var8++) {
          int var9 = 0;
          while (var9 < var6) {
            if (var8 == 0) {
              int var10 = t.field_q[this.field_d].a();
              for (int var11 = var4Lifetime1 - 1; var11 >= 0; var11--) {
                if (var9 + var11 < var6) {
                  var7[var9 + var11] = var10 % this.field_f;
                }
                var10 = var10 / this.field_f;
              }
            }
            int[] var22Lifetime1 = var19;
            int var10Lifetime1 = 0;
            while (var10Lifetime1 < var4Lifetime1) {
              int var11Lifetime1 = var22Lifetime1[var9];
              int var12 = this.field_g[var11Lifetime1 * 8 + var8];
              if (var12 >= 0) {
                int var13 = this.field_c + var9 * this.field_e;
                db var14 = t.field_q[var12];
                if (this.field_b != 0) {
                  var15 = 0;
                  while (var15 < this.field_e) {
                    float[] var28 = var14.c();
                    for (int var17 = 0; var17 < var14.field_b; var17++) {
                      param0[var13 + var15] = param0[var13 + var15] + var28[var17];
                      var15++;
                    }
                  }
                } else {
                  var15 = this.field_e / var14.field_b;
                  for (int var16 = 0; var16 < var15; var16++) {
                    float[] var27 = var14.c();
                    for (int var18 = 0; var18 < var14.field_b; var18++) {
                      param0[var13 + var16 + var18 * var15] = param0[var13 + var16 + var18 * var15] + var27[var18];
                    }
                  }
                }
              }
              var9++;
              if (var9 >= var6) {
                break;
              }
              var10Lifetime1++;
            }
          }
        }
        return;
    }

    fl() {
        this.field_b = t.d(16);
        this.field_c = t.d(24);
        this.field_a = t.d(24);
        this.field_e = t.d(24) + 1;
        this.field_f = t.d(6) + 1;
        this.field_d = t.d(8);
        int[] var1 = new int[this.field_f];
        for (int var2 = 0; var2 < this.field_f; var2++) {
          int var3 = 0;
          int var4 = t.d(3);
          int var5 = t.b() != 0 ? 1 : 0;
          if (var5 != 0) {
            var3 = t.d(5);
          }
          var1[var2] = var3 << 3 | var4;
        }
        this.field_g = new int[this.field_f * 8];
        int var6 = 0;
        int var2Lifetime1 = var6;
        while (var6 < this.field_f * 8) {
          this.field_g[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? t.d(8) : -1;
          var6++;
        }
    }
}
