/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends bk {
    int[] field_i;
    int[] field_s;
    int[] field_f;
    int field_m;
    private int field_w;
    int[] field_t;
    int[] field_u;
    byte[] field_F;
    int[] field_y;
    int[] field_l;
    private short[] field_r;
    private byte[] field_q;
    int[] field_p;
    short[] field_z;
    int[] field_g;
    private byte field_D;
    int[] field_v;
    private byte[] field_B;
    int field_k;
    int[] field_j;
    int field_x;
    private static boolean field_n;
    private boolean field_E;
    int[] field_h;
    private short field_o;

    final static int a(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
          param1 = 2;
        } else {
          if (param1 > 126) {
            param1 = 126;
          }
        }
        return (param0 & 65408) + param1;
    }

    final int a() {
        if (!this.field_E) {
          this.b();
        }
        return this.field_o;
    }

    final static int a(int param0) {
        if (param0 < 2) {
          param0 = 2;
        } else {
          if (param0 > 126) {
            param0 = 126;
          }
        }
        return param0;
    }

    private final void b() {
        int var9 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        var1 = 32767;
        var2 = 32767;
        var3 = 32767;
        var4 = -32768;
        var5 = -32768;
        var6 = -32768;
        var7 = 0;
        var8 = 0;
        for (var9 = 0; var9 < this.field_w; var9++) {
          var10 = this.field_j[var9];
          var11 = this.field_y[var9];
          var12 = this.field_v[var9];
          if (var10 < var1) {
            var1 = var10;
          }
          if (var10 > var4) {
            var4 = var10;
          }
          if (var11 < var2) {
            var2 = var11;
          }
          if (var11 > var5) {
            var5 = var11;
          }
          if (var12 < var3) {
            var3 = var12;
          }
          if (var12 > var6) {
            var6 = var12;
          }
          var13 = var10 * var10 + var12 * var12;
          if (var13 > var7) {
            var7 = var13;
          }
          var13 = var13 + var11 * var11;
          if (var13 > var8) {
            var8 = var13;
          }
        }
        Math.sqrt((double)var7);
        this.field_o = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_E = true;
    }

    private pj() {
        this.field_m = 0;
        this.field_w = 0;
        this.field_D = (byte) 0;
        this.field_k = 0;
        this.field_x = 0;
        this.field_E = false;
    }

    pj(rm param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        dd var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        bl var18;
        bl var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_m = 0;
        this.field_w = 0;
        this.field_D = (byte) 0;
        this.field_k = 0;
        this.field_x = 0;
        this.field_E = false;
        param0.a();
        param0.c();
        this.field_k = param0.field_f;
        this.field_w = param0.field_F;
        this.field_j = param0.field_M;
        this.field_y = param0.field_B;
        this.field_v = param0.field_E;
        this.field_x = param0.field_g;
        this.field_p = param0.field_o;
        this.field_u = param0.field_y;
        this.field_t = param0.field_q;
        this.field_B = param0.field_G;
        this.field_q = param0.field_r;
        this.field_D = param0.field_I;
        this.field_r = param0.field_m;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_f = new int[this.field_x];
        this.field_s = new int[this.field_x];
        this.field_l = new int[this.field_x];
        if (param0.field_A != null) {
          this.field_z = new short[this.field_x];
          for (var9 = 0; var9 < this.field_x; var9++) {
            var10 = param0.field_A[var9];
            if (var10 != -1 &&
              be.field_c.d(var10)) {
              this.field_z[var9] = (short)var10;
            } else {
              this.field_z[var9] = (short)-1;
            }
          }
        } else {
          this.field_z = null;
        }
        if (param0.field_k > 0 &&
          param0.field_D != null) {
          var20 = new int[param0.field_k];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_x; var10Lifetime1++) {
            if (param0.field_D[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_D[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_m = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_k; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_s[var10Lifetime1Lifetime1] == 0) {
              this.field_m = this.field_m + 1;
            }
          }
          this.field_h = new int[this.field_m];
          this.field_g = new int[this.field_m];
          this.field_i = new int[this.field_m];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_k; var11++) {
            if (var20[var11] > 0 &&
              param0.field_s[var11] == 0) {
              this.field_h[var10Lifetime1Lifetime2] = param0.field_u[var11] & 65535;
              this.field_g[var10Lifetime1Lifetime2] = param0.field_n[var11] & 65535;
              this.field_i[var10Lifetime1Lifetime2] = param0.field_x[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_F = new byte[this.field_x];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_x; var11Lifetime2++) {
            if (param0.field_D[var11Lifetime2] == -1) {
              this.field_F[var11Lifetime2] = (byte)-1;
            } else {
              this.field_F[var11Lifetime2] = (byte)var9_ref_int__[param0.field_D[var11Lifetime2] & 255];
              if (this.field_F[var11Lifetime2] == -1 &&
                this.field_z != null) {
                this.field_z[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_x) {
          if (param0.field_j != null) {
            var10Lifetime2 = param0.field_j[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_r != null) {
            var11Lifetime1 = param0.field_r[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_z != null) {
            var12 = this.field_z[var16];
          } else {
            var12 = -1;
          }
          if (var11Lifetime1 == -2) {
            var10Lifetime2 = 3;
          }
          if (var11Lifetime1 == -1) {
            var10Lifetime2 = 2;
          }
          if (var12 != -1) {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                this.field_l[var16] = -2;
              } else {
                var19 = param0.field_J[var16];
                var14 = param1 + (param3 * var19.field_c + param4 * var19.field_f + param5 * var19.field_a) / (var8 + var8 / 2);
                this.field_f[var16] = pj.a(var14);
                this.field_l[var16] = -1;
              }
            } else {
              if (param0.field_h != null &&
                param0.field_h[this.field_p[var16]] != null) {
                var13 = param0.field_h[this.field_p[var16]];
              } else {
                var13 = param0.field_l[this.field_p[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f);
              this.field_f[var16] = pj.a(var14);
              if (param0.field_h != null &&
                param0.field_h[this.field_u[var16]] != null) {
                var13 = param0.field_h[this.field_u[var16]];
              } else {
                var13 = param0.field_l[this.field_u[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f);
              this.field_s[var16] = pj.a(var14);
              if (param0.field_h != null &&
                param0.field_h[this.field_t[var16]] != null) {
                var13 = param0.field_h[this.field_t[var16]];
              } else {
                var13 = param0.field_l[this.field_t[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f);
              this.field_l[var16] = pj.a(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_l[var16] = -2;
                } else {
                  this.field_f[var16] = 128;
                  this.field_l[var16] = -1;
                }
              } else {
                var18 = param0.field_J[var16];
                var14 = param1 + (param3 * var18.field_c + param4 * var18.field_f + param5 * var18.field_a) / (var8 + var8 / 2) << 17;
                this.field_f[var16] = var14 | pj.a(param0.field_m[var16] & 65535, var14 >> 17);
                this.field_l[var16] = -1;
              }
            } else {
              var15 = param0.field_m[var16] & 65535;
              if (param0.field_h != null &&
                param0.field_h[this.field_p[var16]] != null) {
                var13 = param0.field_h[this.field_p[var16]];
              } else {
                var13 = param0.field_l[this.field_p[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f) << 17;
              this.field_f[var16] = var14 | pj.a(var15, var14 >> 17);
              if (param0.field_h != null &&
                param0.field_h[this.field_u[var16]] != null) {
                var13 = param0.field_h[this.field_u[var16]];
              } else {
                var13 = param0.field_l[this.field_u[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f) << 17;
              this.field_s[var16] = var14 | pj.a(var15, var14 >> 17);
              if (param0.field_h != null &&
                param0.field_h[this.field_t[var16]] != null) {
                var13 = param0.field_h[this.field_t[var16]];
              } else {
                var13 = param0.field_l[this.field_t[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f) << 17;
              this.field_l[var16] = var14 | pj.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    pj(pj[] param0, int param1) {
        int var8 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        byte[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_55_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        pj var8_ref_pj;
        pj var9;
        int var9_int;
        int var10;
        pj var11;
        int var12;
        pj var13;
        pj var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var10Lifetime1;
        pj var8_ref_pjLifetime1;
        this.field_m = 0;
        this.field_w = 0;
        this.field_D = (byte) 0;
        this.field_k = 0;
        this.field_x = 0;
        this.field_E = false;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        this.field_k = 0;
        this.field_x = 0;
        this.field_m = 0;
        this.field_D = (byte) -1;
        for (var7 = 0; var7 < param1; var7++) {
          var13 = param0[var7];
          var8_ref_pj = var13;
          if (var8_ref_pj != null) {
            this.field_k = this.field_k + var13.field_k;
            this.field_x = this.field_x + var13.field_x;
            this.field_m = this.field_m + var13.field_m;
            if (var13.field_B == null) {
              if (this.field_D == -1) {
                this.field_D = var13.field_D;
              }
              if (this.field_D != var13.field_D) {
                var3 = 1;
              }
            } else {
              var3 = 1;
            }
            stackIn_13_0 = var4;
            if (var13.field_q == null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            var4 = stackIn_13_0 | stackIn_14_1;
            stackIn_16_0 = var5;
            if (var13.field_z == null) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = 1;
            }
            var5 = stackIn_16_0 | stackIn_17_1;
            stackIn_19_0 = var6;
            if (var13.field_F == null) {
              stackIn_20_1 = 0;
            } else {
              stackIn_20_1 = 1;
            }
            var6 = stackIn_19_0 | stackIn_20_1;
          }
        }
        this.field_j = new int[this.field_k];
        this.field_y = new int[this.field_k];
        this.field_v = new int[this.field_k];
        this.field_p = new int[this.field_x];
        this.field_u = new int[this.field_x];
        this.field_t = new int[this.field_x];
        this.field_f = new int[this.field_x];
        this.field_s = new int[this.field_x];
        this.field_l = new int[this.field_x];
        if (var3 != 0) {
          this.field_B = new byte[this.field_x];
        }
        if (var4 != 0) {
          this.field_q = new byte[this.field_x];
        }
        if (var5 != 0) {
          this.field_z = new short[this.field_x];
        }
        if (var6 != 0) {
          this.field_F = new byte[this.field_x];
        }
        if (this.field_m > 0) {
          this.field_h = new int[this.field_m];
          this.field_g = new int[this.field_m];
          this.field_i = new int[this.field_m];
        }
        this.field_r = new short[this.field_x];
        this.field_k = 0;
        this.field_x = 0;
        this.field_m = 0;
        for (var7Lifetime1 = 0; var7Lifetime1 < param1; var7Lifetime1++) {
          var11 = param0[var7Lifetime1];
          var14 = var11;
          var8_ref_pjLifetime1 = var14;
          if (var8_ref_pjLifetime1 != null) {
            for (var9_int = 0; var9_int < var14.field_x; var9_int++) {
              this.field_p[this.field_x] = var11.field_p[var9_int] + this.field_k;
              this.field_u[this.field_x] = var11.field_u[var9_int] + this.field_k;
              this.field_t[this.field_x] = var11.field_t[var9_int] + this.field_k;
              this.field_f[this.field_x] = var11.field_f[var9_int];
              this.field_s[this.field_x] = var11.field_s[var9_int];
              this.field_l[this.field_x] = var11.field_l[var9_int];
              this.field_r[this.field_x] = var11.field_r[var9_int];
              if (var3 != 0) {
                if (var14.field_B == null) {
                  this.field_B[this.field_x] = var11.field_D;
                } else {
                  this.field_B[this.field_x] = var11.field_B[var9_int];
                }
              }
              if (var4 != 0 &&
                var14.field_q != null) {
                this.field_q[this.field_x] = var11.field_q[var9_int];
              }
              if (var5 != 0) {
                if (var14.field_z == null) {
                  this.field_z[this.field_x] = (short)-1;
                } else {
                  this.field_z[this.field_x] = var11.field_z[var9_int];
                }
              }
              if (var6 != 0) {
                stackIn_54_0 = this.field_F;
                stackIn_54_1 = this.field_x;
                if (var14.field_F != null &&
                  var11.field_F[var9_int] != -1) {
                  stackIn_55_2 = var11.field_F[var9_int] + this.field_m;
                } else {
                  stackIn_55_2 = -1;
                }
                stackIn_54_0[stackIn_54_1] = (byte)stackIn_55_2;
              }
              this.field_x = this.field_x + 1;
            }
            for (var9_intLifetime1 = 0; var9_intLifetime1 < var14.field_m; var9_intLifetime1++) {
              if (var11.field_h[var9_intLifetime1] < var14.field_w) {
                this.field_h[this.field_m] = var11.field_h[var9_intLifetime1] + this.field_k;
              }
              if (var11.field_g[var9_intLifetime1] < var14.field_w) {
                this.field_g[this.field_m] = var11.field_g[var9_intLifetime1] + this.field_k;
              }
              if (var11.field_i[var9_intLifetime1] < var14.field_w) {
                this.field_i[this.field_m] = var11.field_i[var9_intLifetime1] + this.field_k;
              }
              this.field_m = this.field_m + 1;
            }
            for (var9_intLifetime2 = 0; var9_intLifetime2 < var14.field_w; var9_intLifetime2++) {
              this.field_j[this.field_k] = var11.field_j[var9_intLifetime2];
              this.field_y[this.field_k] = var11.field_y[var9_intLifetime2];
              this.field_v[this.field_k] = var11.field_v[var9_intLifetime2];
              this.field_k = this.field_k + 1;
            }
          }
        }
        var7Lifetime2 = 0;
        this.field_w = this.field_k;
        for (var8 = 0; var8 < param1; var8++) {
          var9 = param0[var8];
          if (var9 != null) {
            for (var10 = 0; var10 < var9.field_m; var10++) {
              if (var9.field_h[var10] >= var9.field_w) {
                this.field_h[var7Lifetime2] = var9.field_h[var10] - var9.field_w + this.field_k;
              }
              if (var9.field_g[var10] >= var9.field_w) {
                this.field_g[var7Lifetime2] = var9.field_g[var10] - var9.field_w + this.field_k;
              }
              if (var9.field_i[var10] >= var9.field_w) {
                this.field_i[var7Lifetime2] = var9.field_i[var10] - var9.field_w + this.field_k;
              }
              var7Lifetime2++;
            }
            var12 = var9.field_w;
            var10Lifetime1 = var12;
            while (var12 < var9.field_k) {
              this.field_j[this.field_k] = var9.field_j[var12];
              this.field_y[this.field_k] = var9.field_y[var12];
              this.field_v[this.field_k] = var9.field_v[var12];
              this.field_k = this.field_k + 1;
              var12++;
            }
          }
        }
    }

    static {
        pj discarded$0 = new pj();
        pj discarded$1 = new pj();
        pj discarded$2 = new pj();
        field_n = false;
        if (field_n) {
        }
    }
}
