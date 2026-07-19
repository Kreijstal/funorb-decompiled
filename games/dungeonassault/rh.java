/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    int field_g;
    private cn field_d;
    private int field_c;
    int field_a;
    int field_h;
    int field_b;
    int field_e;
    private int field_f;

    final void b() {
        this.c();
    }

    final void a(cn param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var4 = (int)(32.0 * (1.0 + te.a(mo.field_a << 4)));
          if (var4 >= 0) {
            break L0;
          } else {
            var4 = 0;
            break L0;
          }
        }
        L1: {
          if (var4 <= 64) {
            break L1;
          } else {
            var4 = 64;
            break L1;
          }
        }
        L2: {
          param1 = param1 + param0.field_w;
          param2 = param2 + param0.field_A;
          var5 = param1 + param2 * this.field_c;
          var6 = 0;
          var7 = param0.field_v;
          var8 = param0.field_y;
          var9 = this.field_c - var8;
          var10 = 0;
          if (param2 >= 0) {
            break L2;
          } else {
            var7 = var7 + param2;
            var6 = var6 - param2 * var8;
            var5 = var5 - param2 * this.field_c;
            param2 = 0;
            break L2;
          }
        }
        L3: {
          if (param2 + var7 <= this.field_f) {
            break L3;
          } else {
            var7 = var7 - (param2 + var7 - this.field_f);
            break L3;
          }
        }
        L4: {
          if (param1 >= 0) {
            break L4;
          } else {
            var8 = var8 + param1;
            var6 = var6 - param1;
            var5 = var5 - param1;
            var10 = var10 - param1;
            var9 = var9 - param1;
            param1 = 0;
            break L4;
          }
        }
        L5: {
          if (param1 + var8 <= this.field_c) {
            break L5;
          } else {
            var11 = param1 + var8 - this.field_c;
            var8 = var8 - var11;
            var10 = var10 + var11;
            var9 = var9 + var11;
            break L5;
          }
        }
        L6: {
          if (var8 <= 0) {
            break L6;
          } else {
            if (var7 > 0) {
              param2 = -var7;
              L7: while (true) {
                if (param2 >= 0) {
                  this.c();
                  return;
                } else {
                  param1 = -var8;
                  L8: while (true) {
                    if (param1 >= 0) {
                      param2++;
                      var5 = var5 + var9;
                      var6 = var6 + var10;
                      continue L7;
                    } else {
                      if (param0.field_B[var6] != 0) {
                        this.field_d.field_B[var5] = this.field_e + oi.b(0, var4 + 1) * this.field_h;
                        param1++;
                        var5++;
                        var6++;
                        continue L8;
                      } else {
                        param1++;
                        var5++;
                        var6++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            } else {
              break L6;
            }
          }
        }
    }

    final void e() {
        int var2 = 0;
        int var1 = (int)(32.0 * (1.0 + te.a(mo.field_a << 4)));
        if (var1 < 0) {
            var1 = 0;
        }
        if (var1 > 64) {
            var1 = 64;
        }
        for (var2 = 0; var2 < 2; var2++) {
            this.field_d.field_B[this.field_c * this.field_f - this.field_c - (this.field_c >> 1) - 1 + var2] = this.field_e + oi.b(0, var1 + 1) * this.field_h;
            this.field_d.field_B[this.field_c * this.field_f - (this.field_c >> 1) - 1 + var2] = this.field_e + oi.b(0, var1 + 1) * this.field_h;
        }
        this.c();
    }

    private final void c() {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var14 = this.field_d.field_B;
        int[] var13 = var14;
        int[] var1 = var13;
        int var3 = this.field_d.field_y;
        int var4 = this.field_d.field_v;
        int var2 = var3 + 1;
        for (var5 = 2 - var4; var5 < 0; var5++) {
            var6 = var1[var2 - 1];
            var7 = var14[var2];
            var8 = var1[var2 + 1];
            for (var9 = 2 - var3; var9 < 0; var9++) {
                var10 = var1[var2 - var3];
                var11 = (var10 & 65280) + (var6 & 65280) + (var7 & 65280) + (var8 & 65280) >> 2;
                var12 = (var10 & 16711935) + (var6 & 16711935) + (var7 & 16711935) + (var8 & 16711935) >> 2;
                var1[var2 - var3] = (var11 & 65280) + (var12 & 16711935);
                var2++;
                var6 = var7;
                var7 = var8;
                var8 = var1[var2 + 1];
            }
            var2 += 2;
        }
        for (var5 = var14.length - 1; var5 >= 0; var5--) {
            var6 = var14[var5];
            var7 = var6 & 65280;
            var6 = var6 & 16711935;
            var6 = var6 * this.field_a;
            var7 = var7 * this.field_a;
            var1[var5] = (var6 & -16711936 | var7 & 16711680) >>> 8;
        }
        this.field_d.b(this.field_g - (this.field_c >> 1), this.field_b - this.field_f, 256);
        this.field_d.b(this.field_g - (this.field_c >> 1), this.field_b - this.field_f, 256);
    }

    final void d() {
        int var2 = 0;
        int var1 = (int)(32.0 * (1.0 + te.a(mo.field_a << 4)));
        if (var1 < 0) {
            var1 = 0;
        }
        if (var1 > 64) {
            var1 = 64;
        }
        for (var2 = 0; var2 < 3; var2++) {
            this.field_d.field_B[this.field_c * this.field_f - this.field_c - (this.field_c >> 1) - 1 + var2] = this.field_e + oi.b(0, var1 + 1) * this.field_h;
        }
        this.c();
    }

    final void a() {
        this.field_d.b(this.field_g - (this.field_c >> 1), this.field_b - this.field_f, 256);
        this.field_d.b(this.field_g - (this.field_c >> 1), this.field_b - this.field_f, 256);
    }

    rh(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_g = param0;
        this.field_b = param1;
        this.field_c = param2;
        this.field_f = param3;
        this.field_d = new cn(this.field_c, this.field_f);
        this.field_e = param4;
        this.field_h = param5;
        this.field_a = param6;
    }
}
