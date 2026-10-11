/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    private int field_b;
    private int[] field_g;
    private int field_c;
    private int field_e;
    private int field_a;
    private int field_d;
    private int field_f;

    final void a(float[] param0, int param1, boolean param2) {
        int var8 = 0;
        int var17 = 0;
        int var16 = 0;
        int var18 = 0;
        int var4;
        int var5;
        int var6;
        int[] var7;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        ac var14;
        int var15;
        int[] var19;
        int[] var22;
        float[] var27;
        float[] var28;
        int var4Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int[] var22Lifetime1;
        for (var4 = 0; var4 < param1; var4++) {
          param0[var4] = 0.0f;
        }
        if (param2) {
          return;
        }
        var4Lifetime1 = qd.field_q[this.field_e].field_c;
        var5 = this.field_b - this.field_a;
        var6 = var5 / this.field_c;
        var22 = new int[var6];
        var19 = var22;
        var7 = var19;
        for (var8 = 0; var8 < 8; var8++) {
          var9 = 0;
          while (var9 < var6) {
            if (var8 == 0) {
              var10 = qd.field_q[this.field_e].a();
              for (var11 = var4Lifetime1 - 1; var11 >= 0; var11--) {
                if (var9 + var11 < var6) {
                  var7[var9 + var11] = var10 % this.field_d;
                }
                var10 = var10 / this.field_d;
              }
            }
            var22Lifetime1 = var19;
            var10Lifetime1 = 0;
            while (var10Lifetime1 < var4Lifetime1) {
              var11Lifetime1 = var22Lifetime1[var9];
              var12 = this.field_g[var11Lifetime1 * 8 + var8];
              if (var12 >= 0) {
                var13 = this.field_a + var9 * this.field_c;
                var14 = qd.field_q[var12];
                if (this.field_f != 0) {
                  var15 = 0;
                  while (var15 < this.field_c) {
                    var28 = var14.b();
                    for (var17 = 0; var17 < var14.field_c; var17++) {
                      param0[var13 + var15] = param0[var13 + var15] + var28[var17];
                      var15++;
                    }
                  }
                } else {
                  var15 = this.field_c / var14.field_c;
                  for (var16 = 0; var16 < var15; var16++) {
                    var27 = var14.b();
                    for (var18 = 0; var18 < var14.field_c; var18++) {
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

    dl() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2 = 0;
        int var2Lifetime1;
        this.field_f = qd.f(16);
        this.field_a = qd.f(24);
        this.field_b = qd.f(24);
        this.field_c = qd.f(24) + 1;
        this.field_d = qd.f(6) + 1;
        this.field_e = qd.f(8);
        int[] var1 = new int[this.field_d];
        for (var2 = 0; var2 < this.field_d; var2++) {
          var3 = 0;
          var4 = qd.f(3);
          var5 = qd.c() != 0 ? 1 : 0;
          if (var5 != 0) {
            var3 = qd.f(5);
          }
          var1[var2] = var3 << 3 | var4;
        }
        this.field_g = new int[this.field_d * 8];
        int var6 = 0;
        var2Lifetime1 = var6;
        while (var6 < this.field_d * 8) {
          this.field_g[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? qd.f(8) : -1;
          var6++;
        }
    }
}
