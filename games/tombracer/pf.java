/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pf extends nh {
    int field_o;
    static int field_u;
    static int field_e;
    static int field_c;
    static int field_i;
    int field_g;
    static int field_y;
    int field_v;
    static int field_x;
    static int field_k;
    static int field_A;
    static int field_C;
    static int field_B;
    static int field_j;
    int field_a;
    static int field_h;
    int field_f;
    private static int field_q;
    sfa field_b;
    static int field_D;
    private static int field_p;
    static int field_d;
    private static int field_s;
    private static int field_m;
    static int field_w;
    static int field_r;
    static int field_z;
    static int field_n;
    static int field_t;
    int field_l;

    final int a() {
        return this.field_a;
    }

    abstract void b(int param0, int param1);

    abstract void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    final int c() {
        return this.field_f;
    }

    final int d() {
        return this.field_l + this.field_a + this.field_g;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    abstract void a(int param0, int param1, int param2, int param3, int param4);

    private final boolean a(float param0, float param1, float param2, float param3, float param4, float param5) {
        int var7;
        int var8;
        float var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var9Lifetime1;
        float var10Lifetime1;
        float var11Lifetime1;
        float var12Lifetime1;
        float var13Lifetime1;
        float var14Lifetime1;
        float var15Lifetime1;
        float var16Lifetime1;
        var7 = this.field_l + this.field_a + this.field_g;
        var8 = this.field_o + this.field_f + this.field_v;
        if (var7 != this.field_a) {
          var9 = (param2 - param0) / (float)var7;
          var10 = (param3 - param1) / (float)var7;
          var11 = (param4 - param0) / (float)var8;
          var12 = (param5 - param1) / (float)var8;
          var13 = var11 * (float)this.field_o;
          var14 = var12 * (float)this.field_o;
          var15 = var9 * (float)this.field_l;
          var16 = var10 * (float)this.field_l;
          var17 = -var9 * (float)this.field_g;
          var18 = -var10 * (float)this.field_g;
          var19 = -var11 * (float)this.field_v;
          var20 = -var12 * (float)this.field_v;
          param0 = param0 + (var15 + var13);
          param1 = param1 + (var16 + var14);
          param2 = param2 + (var17 + var13);
          param3 = param3 + (var18 + var14);
          param4 = param4 + (var15 + var19);
          param5 = param5 + (var16 + var20);
        } else {
          if (var8 != this.field_f) {
            var9 = (param2 - param0) / (float)var7;
            var10 = (param3 - param1) / (float)var7;
            var11 = (param4 - param0) / (float)var8;
            var12 = (param5 - param1) / (float)var8;
            var13 = var11 * (float)this.field_o;
            var14 = var12 * (float)this.field_o;
            var15 = var9 * (float)this.field_l;
            var16 = var10 * (float)this.field_l;
            var17 = -var9 * (float)this.field_g;
            var18 = -var10 * (float)this.field_g;
            var19 = -var11 * (float)this.field_v;
            var20 = -var12 * (float)this.field_v;
            param0 = param0 + (var15 + var13);
            param1 = param1 + (var16 + var14);
            param2 = param2 + (var17 + var13);
            param3 = param3 + (var18 + var14);
            param4 = param4 + (var15 + var19);
            param5 = param5 + (var16 + var20);
          }
        }
        var9Lifetime1 = param4 + (param2 - param0);
        var10Lifetime1 = param3 + (param5 - param1);
        if (!(param0 < param2)) {
          var11Lifetime1 = param2;
          var12Lifetime1 = param0;
        } else {
          var11Lifetime1 = param0;
          var12Lifetime1 = param2;
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
        if (!(param1 < param3)) {
          var13Lifetime1 = param3;
          var14Lifetime1 = param1;
        } else {
          var13Lifetime1 = param1;
          var14Lifetime1 = param3;
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
        if (var11Lifetime1 < (float)this.field_b.field_J) {
          var11Lifetime1 = (float)this.field_b.field_J;
        }
        if (var12Lifetime1 > (float)this.field_b.field_W) {
          var12Lifetime1 = (float)this.field_b.field_W;
        }
        if (var13Lifetime1 < (float)this.field_b.field_d) {
          var13Lifetime1 = (float)this.field_b.field_d;
        }
        if (var14Lifetime1 > (float)this.field_b.field_P) {
          var14Lifetime1 = (float)this.field_b.field_P;
        }
        var12Lifetime1 = var11Lifetime1 - var12Lifetime1;
        if (var12Lifetime1 >= 0.0f) {
          return false;
        }
        var14Lifetime1 = var13Lifetime1 - var14Lifetime1;
        if (var14Lifetime1 >= 0.0f) {
          return false;
        }
        field_x = this.field_b.field_K;
        field_e = (int)((float)((int)var13Lifetime1 * field_x) + var11Lifetime1);
        var15Lifetime1 = (param2 - param0) * (param5 - param1) - (param3 - param1) * (param4 - param0);
        var16Lifetime1 = (param4 - param0) * (param3 - param1) - (param5 - param1) * (param2 - param0);
        field_z = (int)((param5 - param1) * 4096.0f * (float)this.field_a / var15Lifetime1);
        field_y = (int)((param3 - param1) * 4096.0f * (float)this.field_f / var16Lifetime1);
        field_u = (int)((param4 - param0) * 4096.0f * (float)this.field_a / var16Lifetime1);
        field_A = (int)((param2 - param0) * 4096.0f * (float)this.field_f / var15Lifetime1);
        field_p = (int)(var11Lifetime1 * 16.0f + 8.0f - (param0 + param2 + param4 + var9Lifetime1) / 4.0f * 16.0f);
        field_m = (int)(var13Lifetime1 * 16.0f + 8.0f - (param1 + param3 + param5 + var10Lifetime1) / 4.0f * 16.0f);
        field_n = (this.field_a >> 1 << 12) + (field_m * field_u >> 4);
        field_w = (this.field_f >> 1 << 12) + (field_m * field_A >> 4);
        field_C = field_p * field_z >> 4;
        field_r = field_p * field_y >> 4;
        field_i = (int)var12Lifetime1;
        field_c = (int)var14Lifetime1;
        return true;
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_l = param0;
        this.field_o = param1;
        this.field_g = param2;
        this.field_v = param3;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    final int b() {
        return this.field_o + this.field_f + this.field_v;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        int var11;
        int var12;
        if (this.field_b.n()) {
          throw new IllegalStateException();
        }
        if (!this.a(param0, param1, param2, param3, param4, param5)) {
          return;
        }
        field_B = param7;
        if (param6 == 1) {
          if (param6 == 1) {
            if (param8 == 0) {
              this.b(1, 0);
              return;
            }
            if (param8 == 1) {
              this.b(1, 1);
              return;
            }
            if (param8 != 2) {
              return;
            }
            this.b(1, 2);
            return;
          }
          if (param6 == 0) {
            if (param8 == 0) {
              this.b(0, 0);
              return;
            }
            if (param8 == 1) {
              this.b(0, 1);
              return;
            }
            if (param8 != 2) {
              return;
            }
            this.b(0, 2);
            return;
          }
          if (param6 == 3) {
            if (param8 == 0) {
              this.b(3, 0);
              return;
            }
            if (param8 == 1) {
              this.b(3, 1);
              return;
            }
            if (param8 != 2) {
              return;
            }
            this.b(3, 2);
            return;
          }
          if (param6 != 2) {
            return;
          }
          if (param8 == 0) {
            this.b(2, 0);
            return;
          }
          if (param8 == 1) {
            this.b(2, 1);
            return;
          }
          if (param8 != 2) {
            return;
          }
          this.b(2, 2);
          return;
        }
        field_k = param7 >>> 24;
        field_D = 256 - field_k;
        if (param6 == 0) {
          field_d = (param7 & 16711680) >> 16;
          field_j = (param7 & 65280) >> 8;
          field_t = param7 & 255;
          if (param6 == 1) {
            if (param8 == 0) {
              this.b(1, 0);
              return;
            }
            if (param8 == 1) {
              this.b(1, 1);
              return;
            }
            if (param8 != 2) {
              return;
            }
            this.b(1, 2);
            return;
          }
          if (param6 == 0) {
            if (param8 == 0) {
              this.b(0, 0);
              return;
            }
            if (param8 == 1) {
              this.b(0, 1);
              return;
            }
            if (param8 != 2) {
              return;
            }
            this.b(0, 2);
            return;
          }
          if (param6 == 3) {
            if (param8 == 0) {
              this.b(3, 0);
              return;
            }
            if (param8 == 1) {
              this.b(3, 1);
              return;
            }
            if (param8 != 2) {
              return;
            }
            this.b(3, 2);
            return;
          }
          if (param6 != 2) {
            return;
          }
          if (param8 == 0) {
            this.b(2, 0);
            return;
          }
          if (param8 == 1) {
            this.b(2, 1);
            return;
          }
          if (param8 != 2) {
            return;
          }
          this.b(2, 2);
          return;
        }
        if (param6 == 2) {
          field_s = param7 >>> 24;
          field_q = 256 - field_s;
          var11 = (param7 & 16711935) * field_q & -16711936;
          var12 = (param7 & 65280) * field_q & 16711680;
          field_h = (var11 | var12) >>> 8;
        }
        if (param6 == 1) {
          if (param8 == 0) {
            this.b(1, 0);
            return;
          }
          if (param8 == 1) {
            this.b(1, 1);
            return;
          }
          if (param8 != 2) {
            return;
          }
          this.b(1, 2);
          return;
        }
        if (param6 != 0) {
          if (param6 != 3) {
            if (param6 == 2) {
              if (param8 == 0) {
                this.b(2, 0);
                return;
              }
              if (param8 == 1) {
                this.b(2, 1);
                return;
              }
              if (param8 == 2) {
                this.b(2, 2);
                return;
              }
            }
          } else {
            if (param8 == 0) {
              this.b(3, 0);
              return;
            }
            if (param8 == 1) {
              this.b(3, 1);
              return;
            }
            if (param8 == 2) {
              this.b(3, 2);
              return;
            }
          }
        } else {
          if (param8 == 0) {
            this.b(0, 0);
            return;
          }
          if (param8 == 1) {
            this.b(0, 1);
            return;
          }
          if (param8 == 2) {
            this.b(0, 2);
            return;
          }
        }
    }

    pf(sfa param0, int param1, int param2) {
        this.field_b = param0;
        this.field_a = param1;
        this.field_f = param2;
    }

    static {
        field_h = 0;
        field_j = 0;
        field_s = 0;
        field_q = 0;
        field_d = 0;
        field_k = 0;
        field_t = 0;
        field_D = 0;
    }
}
