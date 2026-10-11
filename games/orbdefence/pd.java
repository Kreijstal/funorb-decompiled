/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ca {
    int field_z;
    private int field_A;
    int field_B;
    private int field_g;
    int field_f;
    int field_h;
    double field_v;
    static li field_w;
    private int field_j;
    private int field_x;
    int field_l;
    int field_y;
    int field_m;
    static int field_C;
    int field_i;
    int field_o;
    private int field_k;
    static ki field_r;
    int field_E;
    private int field_q;
    int field_t;
    int field_u;
    private f field_s;
    kb field_p;
    boolean field_n;

    public static void a(byte param0) {
        field_r = null;
        field_w = null;
        if (param0 != -19) {
          pd.a((byte) -62);
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var24 = 0;
        int var25 = 0;
        int stackIn_17_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        hj var13_ref_hj;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var26;
        int var27;
        hj var28;
        hj var29;
        hj var30;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        var27 = OrbDefence.field_D ? 1 : 0;
        var4 = 320 - param0 + ol.field_e * this.field_u;
        var5 = 240 + (-param2 + this.field_z * ol.field_e);
        this.field_v = 320.0 / (double)(Math.abs(-320 + var4) + 320);
        var6 = he.field_u[this.field_y] + qh.field_c[this.field_s.field_f.field_o[this.field_t]];
        if (0 < var6) {
          if (this.field_k != 0) {
            if (1 == this.field_k) {
              var4 = var4 + this.field_g * ol.field_e / var6;
            } else {
              if (this.field_k == 2) {
                var5 = var5 - ol.field_e * this.field_g / var6;
              } else {
                if (3 == this.field_k) {
                  var4 = var4 - ol.field_e * this.field_g / var6;
                }
              }
            }
          } else {
            var5 = var5 + ol.field_e * this.field_g / var6;
          }
        }
        if (this.field_h <= 0) {
        }
        if (!this.field_n) {
        }
        if (12 == this.field_y) {
          ul.a(var4 << 4, var5 << 4, 64, 255, ki.field_f);
          return;
        }
        if (1 == this.field_y) {
        }
        stackIn_17_0 = (this.field_n) ? 1400 : 700;
        var7 = stackIn_17_0;
        if (3 != this.field_y) {
        }
        if (2 == this.field_y) {
          var7 += 200;
        }
        if (5 == this.field_y) {
        }
        if (4 == this.field_y) {
          var7 += 400;
        }
        if (6 == this.field_y) {
        }
        if (this.field_y == 7) {
          var7 += 200;
        }
        if (this.field_y == 9) {
        }
        if (this.field_y == 8) {
        }
        if (this.field_y == 10) {
          var7 += 400;
        }
        if (11 == this.field_y) {
          var7 += 100;
        }
        var8 = mg.a(this.field_y, (byte) -86);
        var9 = wh.field_a[var8];
        var10 = 12 * var8;
        var11 = var10 + this.field_A / 2 % var9;
        var5 = var5 - (-2 + ab.field_g[var10].field_k / 2 * var7 / 4096);
        if (this.field_i > 0) {
          var28 = ab.field_g[var11].f();
          var29 = var28;
          for (var13 = 0; var13 < var29.field_v.length; var13++) {
            var29.field_v[var13] = ((vi.a(65280, var28.field_v[var13]) >> 8) + (vi.a(16711680, var28.field_v[var13]) >> 16)) / 8 * 65793 + vi.a(255, var28.field_v[var13]) / 2 * 257;
          }
          var29.a(var4, var5, 0, var7);
        } else if (this.field_y == 9 &&
          this.field_E == 0) {
          if (!this.field_n) {
            var12 = ab.field_g[var11].field_o * var7 >> 12;
            var13 = var7 * ab.field_g[var11].field_k >> 12;
            ab.field_g[var11].d(-(var12 >> 1) + var4, -(var13 >> 1) + var5, var12, var13, 100);
          } else {
            var30 = ab.field_g[var11];
            var13_ref_hj = new hj(var30.field_o, var30.field_k);
            var16 = 0;
            var22 = -(var13_ref_hj.field_o * var7 >> 13) + var4;
            var15 = -var13_ref_hj.field_k >> 1;
            var23 = -(var7 * var13_ref_hj.field_k >> 13) + var5;
            for (var24 = 0; var13_ref_hj.field_k > var24; var24++) {
              var14 = -var13_ref_hj.field_o >> 1;
              for (var25 = 0; var25 < var13_ref_hj.field_o; var25++) {
                boolean decompiledFrameRemainder0 = true;
                if (var30.field_v[var16] != 0) {
                  var17 = ((var25 + var14) * var7 >> 12) + var22;
                  var18 = var23 + (var7 * (var15 + var24) >> 12);
                  decompiledFrameRemainder0 = !(var17 < 0);
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameRemainder0 = !(ul.field_f <= var17)) &&
                    (decompiledFrameRemainder0 = !(var18 < 0)) &&
                    (decompiledFrameRemainder0 = !(ul.field_l <= var18))) {
                    var21 = (255 & var30.field_v[var16]) >> 2;
                    var19 = (16711680 & var30.field_v[var16]) >> 18;
                    var20 = (65280 & var30.field_v[var16]) >> 10;
                    var26 = ul.field_b[ul.field_f * var18 + var17];
                    var21 = var21 + ((var26 & 255) >> 1);
                    var20 = var20 + (var26 >> 9 & 127);
                    var19 = var19 + (127 & var26 >> 17);
                    var13_ref_hj.field_v[var16] = var21 + ((var19 << 16) + (var20 << 8));
                  }
                }
                if (decompiledFrameRemainder0) {
                  var16++;
                  var14++;
                }
              }
              var15++;
            }
            var13_ref_hj.a(var4, var5, 0, var7);
          }
        } else {
          ab.field_g[var11].a(var4, var5, 0, var7);
        }
        if (this.field_f > 0) {
          var12Lifetime1 = var7 * ab.field_g[var11].field_o >> 12;
          var13Lifetime1 = ab.field_g[var11].field_k * var7 >> 12;
          var14Lifetime1 = this.field_s.field_i % 9000;
          var15Lifetime1 = var4 - (var12Lifetime1 >> 1) + (this.field_u * this.field_u + var14Lifetime1) % var12Lifetime1;
          var16Lifetime1 = -(var13Lifetime1 >> 1) + var5 + (this.field_z * this.field_u + var14Lifetime1) % var13Lifetime1;
          var17Lifetime1 = var14Lifetime1 * var14Lifetime1 % var12Lifetime1 - ((var12Lifetime1 >> 1) - var4);
          var18Lifetime1 = var5 - (var13Lifetime1 >> 1) + var14Lifetime1 * var14Lifetime1 % var13Lifetime1;
          ul.f(var15Lifetime1, var16Lifetime1, var17Lifetime1, var18Lifetime1, 16777215, 200);
        }
        if (param1 <= 73) {
          this.a(68, (byte) 10, -119);
        }
        return;
    }

    private final void d(int param0) {
        int fieldTemp$0 = this.field_q - 1;
        this.field_q = this.field_q - 1;
        if (fieldTemp$0 < 0) {
          this.field_q = 5;
          this.field_x = this.field_x + 1;
          if (2 < this.field_x) {
            this.field_x = this.field_x - 3;
          }
        }
        if (0 == (this.field_i & 1)) {
          this.field_A = this.field_A + 1;
          if (this.field_A > 256) {
            this.field_A = this.field_A - 256;
          }
        }
        if (param0 != 2) {
          return;
        }
        if (this.field_h > 0) {
          this.field_q = 5;
          this.field_x = 3;
        }
    }

    final void c(int param0) {
        int stackIn_58_0 = 0;
        boolean stackIn_66_0 = false;
        int stackIn_101_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (0 < this.field_m) {
          this.field_m = this.field_m - 1;
          return;
        }
        this.field_m = this.field_m - 1;
        if (this.field_E > 0) {
          this.field_E = this.field_E - 1;
        }
        if (this.field_i > 0) {
          this.field_i = this.field_i - 1;
          if (8 == this.field_y ||
            this.field_y == 7) {
            this.field_i = 0;
          }
        }
        if (this.field_y == 6 &&
          null != this.field_p) {
          this.field_s.field_h.a(param0 ^ -113, new me((double)this.field_p.field_g, (double)this.field_p.field_h, 0.04 * (-0.5 + Math.random()), 0.04 * (-0.5 + Math.random()), 1));
          this.field_B = this.field_B + 1;
          if (this.field_n) {
            this.field_B = this.field_B + 1;
          }
          if (this.field_B > 200) {
            this.field_B = 0;
            this.field_p.d(9);
            this.field_p = null;
          } else {
            if (!this.field_p.b(true)) {
              this.field_p = null;
            }
          }
        }
        this.d(param0 + param0);
        var2 = this.field_g;
        if (this.field_h > 0) {
          this.field_o = this.field_o - (1 + this.field_h / 10);
          if (this.field_y == 9) {
            this.field_E = 50;
          }
          this.field_h = this.field_h - (1 + this.field_h / 10);
          if (this.field_o <= 0) {
            this.field_s.field_f.field_g[this.field_u + this.field_z * this.field_s.field_f.field_c] = this.field_s.field_f.field_g[this.field_u + this.field_z * this.field_s.field_f.field_c] + 1;
          }
          if ((1 & this.field_s.field_i) == 0) {
            this.field_g = this.field_g - 1;
          }
        } else {
          this.field_g = this.field_g - 1;
        }
        if (this.field_i == 0) {
          this.field_g = this.field_g - 1;
        }
        if (this.field_y != 12 &&
          this.field_s.field_f.field_e[this.field_t]) {
          if (this.field_f == 0) {
            ea.a(param0 ^ 11, mh.field_a[57], (int)(this.field_v * 96.0));
          }
          gd.field_c = gd.field_c + 1;
          this.field_f = 2;
          this.field_s.field_f.field_m[this.field_t] = true;
        }
        if (0 < this.field_f) {
          this.field_f = this.field_f - 1;
          if (this.field_y == 9) {
            this.field_E = 100;
          }
          this.field_g = var2;
        }
        if (he.field_u[this.field_y] + qh.field_c[this.field_s.field_f.field_o[this.field_t]] < this.field_g) {
          this.field_g = he.field_u[this.field_y] + qh.field_c[this.field_s.field_f.field_o[this.field_t]];
        }
        if (0 > this.field_g) {
          var3 = this.field_u;
          var4 = this.field_z;
          var5 = this.field_z * this.field_s.field_f.field_c + this.field_u;
          if (this.field_y == 12) {
            this.field_j = 150;
          } else {
            this.field_s.field_f.field_m[var5] = false;
          }
          var6 = this.field_s.field_f.field_l[var5] + 1000;
          if (this.field_k != 3 &&
            var5 > 0 &&
            this.field_s.field_f.field_l[-1 + var5] < var6) {
            stackIn_58_0 = (this.field_s.field_f.field_m[-1 + var5]) ? 0 : 1;
            if (stackIn_58_0 == 1) {
              var3 = -1 + this.field_u;
              var4 = this.field_z;
              var6 = this.field_s.field_f.field_l[var5 - 1];
            }
          }
          if ((this.field_k != 2 &&
            this.field_s.field_f.field_c < var5 &&
            this.field_s.field_f.field_l[-this.field_s.field_f.field_c + var5] < var6) &&
            (stackIn_66_0 = !(this.field_s.field_f.field_m[var5 - this.field_s.field_f.field_c]))) {
            var4 = this.field_z - 1;
            var6 = this.field_s.field_f.field_l[var5 - this.field_s.field_f.field_c];
            var3 = this.field_u;
          }
          if (this.field_k != 1 &&
            var5 < this.field_s.field_f.field_i - 2 &&
            this.field_s.field_f.field_l[1 + var5] < var6 &&
            !this.field_s.field_f.field_m[1 + var5]) {
            var4 = this.field_z;
            var3 = this.field_u + 1;
            var6 = this.field_s.field_f.field_l[var5 + 1];
          }
          if (this.field_k != 0 &&
            var5 < this.field_s.field_f.field_i - this.field_s.field_f.field_c - 1 &&
            this.field_s.field_f.field_l[this.field_s.field_f.field_c + var5] < var6 &&
            !this.field_s.field_f.field_m[var5 + this.field_s.field_f.field_c]) {
            var6 = this.field_s.field_f.field_l[var5 + this.field_s.field_f.field_c];
            var4 = this.field_z + 1;
            var3 = this.field_u;
          }
          if (var6 == this.field_s.field_f.field_l[var5] + 1000) {
            var6 = this.field_s.field_f.field_l[var5];
            if (var5 > 0 &&
              var6 > this.field_s.field_f.field_l[-1 + var5] &&
              !this.field_s.field_f.field_m[-1 + var5]) {
              var6 = this.field_s.field_f.field_l[-1 + var5];
              var3 = this.field_u - 1;
              var4 = this.field_z;
            }
            if (this.field_s.field_f.field_c < var5 &&
              this.field_s.field_f.field_l[-this.field_s.field_f.field_c + var5] < var6 &&
              !this.field_s.field_f.field_m[var5 - this.field_s.field_f.field_c]) {
              var6 = this.field_s.field_f.field_l[var5 - this.field_s.field_f.field_c];
              var4 = this.field_z - 1;
              var3 = this.field_u;
            }
            if (var5 < -2 + this.field_s.field_f.field_i &&
              var6 > this.field_s.field_f.field_l[var5 + 1] &&
              !this.field_s.field_f.field_m[var5 + 1]) {
              var4 = this.field_z;
              var6 = this.field_s.field_f.field_l[var5 + 1];
              var3 = this.field_u + 1;
            }
            if (-1 - this.field_s.field_f.field_c + this.field_s.field_f.field_i > var5 &&
              var6 > this.field_s.field_f.field_l[this.field_s.field_f.field_c + var5]) {
              stackIn_101_0 = (this.field_s.field_f.field_m[this.field_s.field_f.field_c + var5]) ? 0 : 1;
              if (stackIn_101_0 == 1) {
                var4 = 1 + this.field_z;
                var3 = this.field_u;
                var6 = this.field_s.field_f.field_l[this.field_s.field_f.field_c + var5];
              }
            }
          }
          if (var6 > this.field_s.field_f.field_l[var5]) {
            this.field_j = this.field_j + 10;
          } else {
            this.field_j = this.field_j - 1;
          }
          if (this.field_j > 100) {
            if (var5 > 0 &&
              var6 > this.field_s.field_f.field_l[var5 - 1]) {
              var3 = -1 + this.field_u;
              var6 = this.field_s.field_f.field_l[var5 - 1];
              var4 = this.field_z;
            }
            if (var5 > this.field_s.field_f.field_c &&
              var6 > this.field_s.field_f.field_l[-this.field_s.field_f.field_c + var5]) {
              var6 = this.field_s.field_f.field_l[var5 - this.field_s.field_f.field_c];
              var3 = this.field_u;
              var4 = this.field_z - 1;
            }
            if (this.field_s.field_f.field_i - 2 > var5 &&
              var6 > this.field_s.field_f.field_l[1 + var5]) {
              var3 = 1 + this.field_u;
              var6 = this.field_s.field_f.field_l[var5 + 1];
              var4 = this.field_z;
            }
            if (var5 < -this.field_s.field_f.field_c + (this.field_s.field_f.field_i - 1) &&
              var6 > this.field_s.field_f.field_l[this.field_s.field_f.field_c + var5]) {
              var4 = this.field_z + 1;
              var3 = this.field_u;
              var6 = this.field_s.field_f.field_l[var5 + this.field_s.field_f.field_c];
            }
          }
          var7 = 0;
          if (var4 < this.field_z) {
            this.field_k = 0;
          }
          if (this.field_u != var3 ||
            var4 != this.field_z) {
            var7 = 1;
          }
          if (this.field_u > var3) {
            this.field_k = 1;
          }
          if (this.field_z < var4) {
            this.field_k = 2;
          }
          if (this.field_u < var3) {
            this.field_k = 3;
          }
          this.field_z = var4;
          this.field_u = var3;
          if (0 > this.field_u) {
            this.field_u = this.field_u + this.field_s.field_f.field_c;
          }
          if (this.field_s.field_f.field_c <= this.field_u) {
            this.field_u = this.field_u - this.field_s.field_f.field_c;
          }
          this.field_t = this.field_z * this.field_s.field_f.field_c + this.field_u;
          if (this.field_y != 12) {
            this.field_s.field_f.field_m[this.field_t] = true;
          }
          if (var7 != 0) {
            this.field_g = he.field_u[this.field_y] + qh.field_c[this.field_s.field_f.field_o[this.field_t]];
          } else {
            this.field_g = 0;
          }
        }
        return;
    }

    pd(int param0, int param1, f param2, int param3, int param4) {
        try {
          this.field_z = param1;
          this.field_y = param3;
          this.field_g = 0;
          this.field_s = param2;
          this.field_u = param0;
          this.field_o = param4 * he.field_o[this.field_y] >> 4;
          this.field_l = this.field_o;
          this.field_j = 0;
          this.field_B = 0;
          this.field_t = this.field_u + this.field_z * this.field_s.field_f.field_c;
          this.field_n = false;
          this.field_p = null;
          this.field_h = 0;
          this.field_A = (int)(256.0 * Math.random());
          this.field_m = 0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "pd.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_C = 0;
        field_w = new li();
    }
}
