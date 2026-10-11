/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oi extends aja {
    static int field_h;
    static int field_B;
    private int[] field_t;
    static int field_f;
    static int field_i;
    private static int field_c;
    static int field_s;
    static int field_l;
    static int field_p;
    static int field_a;
    static int field_v;
    int field_j;
    private static int field_d;
    static int field_E;
    static int field_b;
    static int field_u;
    int field_n;
    static int field_g;
    static int field_o;
    static int field_C;
    private static int field_r;
    int field_q;
    static int field_x;
    static int field_z;
    int field_D;
    int field_k;
    static int field_m;
    sob field_w;
    private static int field_A;
    static int field_y;
    int field_e;

    abstract void b(int param0, int param1);

    final void a(int param0, int param1, int param2, int param3) {
        this.field_k = param0;
        this.field_n = param1;
        this.field_D = param2;
        this.field_j = param3;
    }

    final int b() {
        return this.field_n + this.field_q + this.field_j;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4);

    final int d() {
        return this.field_e;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    abstract void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    final int c() {
        return this.field_k + this.field_e + this.field_D;
    }

    private final boolean a(float param0, float param1, float param2, float param3, float param4, float param5) {
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var7 = this.field_k + this.field_e + this.field_D;
        int var8 = this.field_n + this.field_q + this.field_j;
        float var9Lifetime1;
        float var10Lifetime1;
        float var11Lifetime1;
        float var12Lifetime1;
        float var13Lifetime1;
        float var14Lifetime1;
        float var15Lifetime1;
        float var16Lifetime1;
        if (var7 != this.field_e ||
          var8 != this.field_q) {
          var9 = (param2 - param0) / (float)var7;
          var10 = (param3 - param1) / (float)var7;
          var11 = (param4 - param0) / (float)var8;
          var12 = (param5 - param1) / (float)var8;
          var13 = var11 * (float)this.field_n;
          var14 = var12 * (float)this.field_n;
          var15 = var9 * (float)this.field_k;
          var16 = var10 * (float)this.field_k;
          var17 = -var9 * (float)this.field_D;
          var18 = -var10 * (float)this.field_D;
          var19 = -var11 * (float)this.field_j;
          var20 = -var12 * (float)this.field_j;
          param0 = param0 + (var15 + var13);
          param1 = param1 + (var16 + var14);
          param2 = param2 + (var17 + var13);
          param3 = param3 + (var18 + var14);
          param4 = param4 + (var15 + var19);
          param5 = param5 + (var16 + var20);
        }
        var9Lifetime1 = param4 + (param2 - param0);
        var10Lifetime1 = param3 + (param5 - param1);
        if (param0 < param2) {
          var11Lifetime1 = param0;
          var12Lifetime1 = param2;
        } else {
          var11Lifetime1 = param2;
          var12Lifetime1 = param0;
        }
        if (param4 < var11Lifetime1) {
          var11Lifetime1 = param4;
        }
        if (var9Lifetime1 < var11Lifetime1) {
          var11Lifetime1 = var9Lifetime1;
        }
        if (param4 > var12Lifetime1) {
          var12Lifetime1 = param4;
        }
        if (var9Lifetime1 > var12Lifetime1) {
          var12Lifetime1 = var9Lifetime1;
        }
        if (param1 < param3) {
          var13Lifetime1 = param1;
          var14Lifetime1 = param3;
        } else {
          var13Lifetime1 = param3;
          var14Lifetime1 = param1;
        }
        if (param5 < var13Lifetime1) {
          var13Lifetime1 = param5;
        }
        if (var10Lifetime1 < var13Lifetime1) {
          var13Lifetime1 = var10Lifetime1;
        }
        if (param5 > var14Lifetime1) {
          var14Lifetime1 = param5;
        }
        if (var10Lifetime1 > var14Lifetime1) {
          var14Lifetime1 = var10Lifetime1;
        }
        if (var11Lifetime1 < (float)this.field_w.field_H) {
          var11Lifetime1 = (float)this.field_w.field_H;
        }
        if (var12Lifetime1 > (float)this.field_w.field_A) {
          var12Lifetime1 = (float)this.field_w.field_A;
        }
        if (var13Lifetime1 < (float)this.field_w.field_n) {
          var13Lifetime1 = (float)this.field_w.field_n;
        }
        if (var14Lifetime1 > (float)this.field_w.field_p) {
          var14Lifetime1 = (float)this.field_w.field_p;
        }
        var12Lifetime1 = var11Lifetime1 - var12Lifetime1;
        if (var12Lifetime1 >= 0.0f) {
          return false;
        }
        var14Lifetime1 = var13Lifetime1 - var14Lifetime1;
        if (var14Lifetime1 >= 0.0f) {
          return false;
        }
        field_o = this.field_w.field_i;
        field_f = (int)((float)((int)var13Lifetime1 * field_o) + var11Lifetime1);
        var15Lifetime1 = (param2 - param0) * (param5 - param1) - (param3 - param1) * (param4 - param0);
        var16Lifetime1 = (param4 - param0) * (param3 - param1) - (param5 - param1) * (param2 - param0);
        field_C = (int)((param5 - param1) * 4096.0f * (float)this.field_e / var15Lifetime1);
        field_v = (int)((param3 - param1) * 4096.0f * (float)this.field_q / var16Lifetime1);
        field_z = (int)((param4 - param0) * 4096.0f * (float)this.field_e / var16Lifetime1);
        field_u = (int)((param2 - param0) * 4096.0f * (float)this.field_q / var15Lifetime1);
        field_A = (int)(var11Lifetime1 * 16.0f + 8.0f - (param0 + param2 + param4 + var9Lifetime1) / 4.0f * 16.0f);
        field_d = (int)(var13Lifetime1 * 16.0f + 8.0f - (param1 + param3 + param5 + var10Lifetime1) / 4.0f * 16.0f);
        field_m = (this.field_e >> 1 << 12) + (field_d * field_z >> 4);
        field_p = (this.field_q >> 1 << 12) + (field_d * field_u >> 4);
        field_a = field_A * field_C >> 4;
        field_l = field_A * field_v >> 4;
        field_B = (int)var12Lifetime1;
        field_h = (int)var14Lifetime1;
        return true;
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (this.field_w.g()) {
          throw new IllegalStateException();
        }
        if (this.field_t == null) {
          this.field_t = new int[4];
        }
        this.field_w.K(this.field_t);
        this.field_w.T(this.field_w.field_H, this.field_w.field_n, param0 + param2, param1 + param3);
        int var8 = this.c();
        int var9 = this.b();
        int var10 = (param2 + var8 - 1) / var8;
        int var11 = (param3 + var9 - 1) / var9;
        for (var12 = 0; var12 < var11; var12++) {
          var13 = var12 * var9;
          for (var14 = 0; var14 < var10; var14++) {
            this.a(param0 + var14 * var8, param1 + var13, param4, param5, param6);
          }
        }
        this.field_w.KA(this.field_t[0], this.field_t[1], this.field_t[2], this.field_t[3]);
    }

    final int a() {
        return this.field_q;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        int var11;
        int var12;
        if (this.field_w.g()) {
          throw new IllegalStateException();
        }
        if (!this.a(param0, param1, param2, param3, param4, param5)) {
          return;
        }
        field_y = param7;
        if (param6 != 1) {
          field_i = param7 >>> 24;
          field_b = 256 - field_i;
          if (param6 != 0) {
            if (param6 == 2) {
              field_c = param7 >>> 24;
              field_r = 256 - field_c;
              var11 = (param7 & 16711935) * field_r & -16711936;
              var12 = (param7 & 65280) * field_r & 16711680;
              field_g = (var11 | var12) >>> 8;
            }
          } else {
            field_x = (param7 & 16711680) >> 16;
            field_s = (param7 & 65280) >> 8;
            field_E = param7 & 255;
          }
        }
        if (param6 != 1) {
          if (param6 != 0) {
            if (param6 != 3) {
              if (param6 == 2) {
                if (param8 != 0) {
                  if (param8 != 1) {
                    if (param8 == 2) {
                      this.b(2, 2);
                    }
                  } else {
                    this.b(2, 1);
                  }
                } else {
                  this.b(2, 0);
                }
              }
            } else {
              if (param8 != 0) {
                if (param8 != 1) {
                  if (param8 == 2) {
                    this.b(3, 2);
                  }
                } else {
                  this.b(3, 1);
                }
              } else {
                this.b(3, 0);
              }
            }
          } else {
            if (param8 != 0) {
              if (param8 != 1) {
                if (param8 == 2) {
                  this.b(0, 2);
                }
              } else {
                this.b(0, 1);
              }
            } else {
              this.b(0, 0);
            }
          }
        } else {
          if (param8 != 0) {
            if (param8 != 1) {
              if (param8 == 2) {
                this.b(1, 2);
              }
            } else {
              this.b(1, 1);
            }
          } else {
            this.b(1, 0);
          }
        }
    }

    oi(sob param0, int param1, int param2) {
        this.field_w = param0;
        this.field_e = param1;
        this.field_q = param2;
    }

    static {
        field_g = 0;
        field_b = 0;
        field_x = 0;
        field_i = 0;
        field_c = 0;
        field_s = 0;
        field_r = 0;
        field_E = 0;
    }
}
