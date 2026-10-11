/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qd extends hr {
    static int field_d;
    static int field_f;
    static int field_g;
    static int field_p;
    private static int field_C;
    static int field_v;
    int field_q;
    int field_t;
    static int field_c;
    private static int field_l;
    static int field_D;
    int field_k;
    private static int field_x;
    static int field_n;
    private static int field_o;
    static int field_s;
    static int field_i;
    static int field_j;
    static int field_w;
    int field_z;
    static int field_h;
    int field_A;
    int field_y;
    qa field_B;
    static int field_r;
    static int field_b;
    static int field_e;
    static int field_u;
    static int field_a;
    static int field_m;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    final int c() {
        return this.field_z;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        int var11;
        int var12;
        if (this.field_B.f()) {
          throw new IllegalStateException();
        }
        if (!this.a(param0, param1, param2, param3, param4, param5)) {
          return;
        }
        field_u = param7;
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
        field_f = param7 >>> 24;
        field_c = 256 - field_f;
        if (param6 == 0) {
          field_j = (param7 & 16711680) >> 16;
          field_v = (param7 & 65280) >> 8;
          field_i = param7 & 255;
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
          field_o = param7 >>> 24;
          field_x = 256 - field_o;
          var11 = (param7 & 16711935) * field_x & -16711936;
          var12 = (param7 & 65280) * field_x & 16711680;
          field_D = (var11 | var12) >>> 8;
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

    final int d() {
        return this.field_A + this.field_q + this.field_k;
    }

    final int b() {
        return this.field_t + this.field_z + this.field_y;
    }

    abstract void b(int param0, int param1);

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
        var7 = this.field_t + this.field_z + this.field_y;
        var8 = this.field_A + this.field_q + this.field_k;
        if (var7 != this.field_z) {
          var9 = (param2 - param0) / (float)var7;
          var10 = (param3 - param1) / (float)var7;
          var11 = (param4 - param0) / (float)var8;
          var12 = (param5 - param1) / (float)var8;
          var13 = var11 * (float)this.field_A;
          var14 = var12 * (float)this.field_A;
          var15 = var9 * (float)this.field_t;
          var16 = var10 * (float)this.field_t;
          var17 = -var9 * (float)this.field_y;
          var18 = -var10 * (float)this.field_y;
          var19 = -var11 * (float)this.field_k;
          var20 = -var12 * (float)this.field_k;
          param0 = param0 + (var15 + var13);
          param1 = param1 + (var16 + var14);
          param2 = param2 + (var17 + var13);
          param3 = param3 + (var18 + var14);
          param4 = param4 + (var15 + var19);
          param5 = param5 + (var16 + var20);
        } else {
          if (var8 != this.field_q) {
            var9 = (param2 - param0) / (float)var7;
            var10 = (param3 - param1) / (float)var7;
            var11 = (param4 - param0) / (float)var8;
            var12 = (param5 - param1) / (float)var8;
            var13 = var11 * (float)this.field_A;
            var14 = var12 * (float)this.field_A;
            var15 = var9 * (float)this.field_t;
            var16 = var10 * (float)this.field_t;
            var17 = -var9 * (float)this.field_y;
            var18 = -var10 * (float)this.field_y;
            var19 = -var11 * (float)this.field_k;
            var20 = -var12 * (float)this.field_k;
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
        if (var11Lifetime1 < (float)this.field_B.field_v) {
          var11Lifetime1 = (float)this.field_B.field_v;
        }
        if (var12Lifetime1 > (float)this.field_B.field_D) {
          var12Lifetime1 = (float)this.field_B.field_D;
        }
        if (var13Lifetime1 < (float)this.field_B.field_H) {
          var13Lifetime1 = (float)this.field_B.field_H;
        }
        if (var14Lifetime1 > (float)this.field_B.field_C) {
          var14Lifetime1 = (float)this.field_B.field_C;
        }
        var12Lifetime1 = var11Lifetime1 - var12Lifetime1;
        if (var12Lifetime1 >= 0.0f) {
          return false;
        }
        var14Lifetime1 = var13Lifetime1 - var14Lifetime1;
        if (var14Lifetime1 >= 0.0f) {
          return false;
        }
        field_r = this.field_B.field_k;
        field_e = (int)((float)((int)var13Lifetime1 * field_r) + var11Lifetime1);
        var15Lifetime1 = (param2 - param0) * (param5 - param1) - (param3 - param1) * (param4 - param0);
        var16Lifetime1 = (param4 - param0) * (param3 - param1) - (param5 - param1) * (param2 - param0);
        field_w = (int)((param5 - param1) * 4096.0f * (float)this.field_z / var15Lifetime1);
        field_d = (int)((param3 - param1) * 4096.0f * (float)this.field_q / var16Lifetime1);
        field_p = (int)((param4 - param0) * 4096.0f * (float)this.field_z / var16Lifetime1);
        field_b = (int)((param2 - param0) * 4096.0f * (float)this.field_q / var15Lifetime1);
        field_l = (int)(var11Lifetime1 * 16.0f + 8.0f - (param0 + param2 + param4 + var9Lifetime1) / 4.0f * 16.0f);
        field_C = (int)(var13Lifetime1 * 16.0f + 8.0f - (param1 + param3 + param5 + var10Lifetime1) / 4.0f * 16.0f);
        field_s = (this.field_z >> 1 << 12) + (field_C * field_p >> 4);
        field_m = (this.field_q >> 1 << 12) + (field_C * field_b >> 4);
        field_g = field_l * field_w >> 4;
        field_a = field_l * field_d >> 4;
        field_h = (int)var12Lifetime1;
        field_n = (int)var14Lifetime1;
        return true;
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_t = param0;
        this.field_A = param1;
        this.field_y = param2;
        this.field_k = param3;
    }

    qd(qa param0, int param1, int param2) {
        this.field_B = param0;
        this.field_z = param1;
        this.field_q = param2;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4);

    final int a() {
        return this.field_q;
    }

    static {
        field_f = 0;
        field_x = 0;
        field_v = 0;
        field_c = 0;
        field_j = 0;
        field_i = 0;
        field_o = 0;
        field_D = 0;
    }
}
