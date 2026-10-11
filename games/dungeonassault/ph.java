/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    cn field_a;
    int[] field_c;
    int field_d;
    int field_b;
    private static String field_z;

    private final void e(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a.field_w;
        param1 = param1 + this.field_a.field_A;
        int var3 = param0 + param1 * gf.field_i;
        int var4 = 0;
        int var5 = this.field_b;
        int var6 = this.field_d;
        int var7 = gf.field_i - var6;
        int var8 = 0;
        if (param1 < gf.field_f) {
          var9 = gf.field_f - param1;
          var5 = var5 - var9;
          param1 = gf.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * gf.field_i;
        }
        if (param1 + var5 > gf.field_e) {
          var5 = var5 - (param1 + var5 - gf.field_e);
        }
        if (param0 < gf.field_j) {
          var9Lifetime1 = gf.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = gf.field_j;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > gf.field_h) {
          var9Lifetime2 = param0 + var6 - gf.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ph.a(jh.field_f, this.field_c, var4, var3, var6, var5, var7, var8);
    }

    private final void g(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a.field_w;
        param1 = param1 + (this.field_a.field_G - this.field_a.field_v - this.field_a.field_A);
        int var3 = param0 + (param1 + this.field_b - 1) * gf.field_i;
        int var4 = 0;
        int var5 = this.field_b;
        int var6 = this.field_d;
        int var7 = -gf.field_i - var6;
        int var8 = 0;
        if (param1 < gf.field_f) {
          var5 = var5 - (gf.field_f - param1);
          param1 = gf.field_f;
        }
        if (param1 + var5 > gf.field_e) {
          var9 = param1 + var5 - gf.field_e;
          var5 = var5 - var9;
          var3 = var3 - var9 * gf.field_i;
          var4 = var4 + var9 * var6;
        }
        if (param0 < gf.field_j) {
          var9Lifetime1 = gf.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = gf.field_j;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > gf.field_h) {
          var9Lifetime2 = param0 + var6 - gf.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ph.a(jh.field_f, this.field_c, 0, var4, var3, 65280, var6, var5, var7, var8);
    }

    final void h(int param0, int param1) {
        this.field_a.h(param0, param1);
        this.d(param0, param1);
    }

    final static ph a(nh param0, String param1, String param2) {
        cn var4 = null;
        cn var3 = oh.a(param0, param1, 11091, param2);
        param2 = param2 + field_z;
        if (param0.b(param2, param1, (byte) -82)) {
          var4 = oh.a(param0, param1, 11091, param2);
          return new ph(var3, var4);
        }
        return new ph(var3, ph.a(var3));
    }

    final void f(int param0, int param1) {
        this.field_a.b(param0, param1);
        this.c(param0, param1);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var8 = -(param4 >> 2);
        int var10Lifetime1;
        param4 = -(param4 & 3);
        for (var9 = -param5; var9 < 0; var9++) {
          for (var10 = var8; var10 < 0; var10++) {
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
          }
          for (var10Lifetime1 = param4; var10Lifetime1 < 0; var10Lifetime1++) {
            param0[param3++] = param1[param2++];
          }
          param3 = param3 + param6;
          param2 = param2 + param7;
        }
    }

    final void i(int param0, int param1) {
        this.field_a.g(param0, param1);
        this.g(param0, param1);
    }

    private final void c(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a.field_w;
        param1 = param1 + (this.field_a.field_G - this.field_b - this.field_a.field_A);
        int var3 = param0 + (param1 + this.field_b - 1) * gf.field_i;
        int var4 = this.field_d - 1;
        int var5 = this.field_b;
        int var6 = this.field_d;
        int var7 = -gf.field_i - var6;
        int var8 = var6 + var6;
        if (param1 < gf.field_f) {
          var5 = var5 - (gf.field_f - param1);
          param1 = gf.field_f;
        }
        if (param1 + var5 > gf.field_e) {
          var9 = param1 + var5 - gf.field_e;
          var5 = var5 - var9;
          var3 = var3 - var9 * gf.field_i;
          var4 = var4 + var9 * var6;
        }
        if (param0 < gf.field_j) {
          var9Lifetime1 = gf.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = gf.field_j;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > gf.field_h) {
          var9Lifetime2 = param0 + var6 - gf.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ph.b(jh.field_f, this.field_c, 0, var4, var3, 16776960, var6, var5, var7, var8);
    }

    final void d(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a.field_w;
        param1 = param1 + this.field_a.field_A;
        int var3 = param0 + param1 * gf.field_i;
        int var4 = 0;
        int var5 = this.field_b;
        int var6 = this.field_d;
        int var7 = gf.field_i - var6;
        int var8 = 0;
        if (param1 < gf.field_f) {
          var9 = gf.field_f - param1;
          var5 = var5 - var9;
          param1 = gf.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * gf.field_i;
        }
        if (param1 + var5 > gf.field_e) {
          var5 = var5 - (param1 + var5 - gf.field_e);
        }
        if (param0 < gf.field_j) {
          var9Lifetime1 = gf.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = gf.field_j;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > gf.field_h) {
          var9Lifetime2 = param0 + var6 - gf.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ph.a(jh.field_f, this.field_c, 0, var4, var3, 0, var6, var5, var7, var8);
    }

    private final void a(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + (this.field_a.field_E - this.field_a.field_y - this.field_a.field_w);
        param1 = param1 + this.field_a.field_A;
        int var3 = param0 + param1 * gf.field_i;
        int var4 = this.field_a.field_y - 1;
        int var5 = this.field_a.field_v;
        int var6 = this.field_a.field_y;
        int var7 = gf.field_i - var6;
        int var8 = var6 + var6;
        if (param1 < gf.field_f) {
          var9 = gf.field_f - param1;
          var5 = var5 - var9;
          param1 = gf.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * gf.field_i;
        }
        if (param1 + var5 > gf.field_e) {
          var5 = var5 - (param1 + var5 - gf.field_e);
        }
        if (param0 < gf.field_j) {
          var9Lifetime1 = gf.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = gf.field_j;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > gf.field_h) {
          var9Lifetime2 = param0 + var6 - gf.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ph.b(jh.field_f, this.field_c, 0, var4, var3, 16711680, var6, var5, var7, var8);
    }

    final void b(int param0, int param1) {
        this.field_a.c(param0, param1);
        this.e(param0, param1);
    }

    private final static int[] a(cn param0) {
        int[] var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2;
        int var7Lifetime2;
        int var8Lifetime2;
        int var2Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = new int[param0.field_y * param0.field_v];
        var9 = var10;
        var1 = var9;
        var2 = 0;
        var3 = -1;
        for (var4 = 0; var4 < param0.field_v; var4++) {
          var5 = 0;
          var3Lifetime1 = -1;
          while (var5 < param0.field_y) {
            if (param0.field_B[var2] != 0) {
              param0.field_B[var2] = param0.field_B[var2] | -2147483648;
              if (var3Lifetime1 == -1) {
                var3Lifetime1 = var5;
              }
            } else {
              if (var3Lifetime1 != -1) {
                var2 = var4 * param0.field_y + var3Lifetime1;
                for (var6 = var3Lifetime1; var6 < var5; var6++) {
                  var7 = 64 - 128 * (var6 - var3Lifetime1) / (var5 - var3Lifetime1);
                  var8 = (byte)var7 << 16 | 16;
                  var10[var2] = var8;
                  var2++;
                }
              }
              var3Lifetime1 = -1;
            }
            var5++;
            var2++;
          }
          var10 = var9;
          if (var3Lifetime1 != -1) {
            var2 = var4 * param0.field_y + var3Lifetime1;
            for (var6Lifetime2 = var3Lifetime1; var6Lifetime2 < var5; var6Lifetime2++) {
              var7Lifetime2 = 64 - 128 * (var6Lifetime2 - var3Lifetime1) / (var5 - var3Lifetime1);
              var8Lifetime2 = (byte)var7Lifetime2 << 16 | 16;
              var10[var2] = var8Lifetime2;
              var2++;
            }
          }
        }
        var4Lifetime1 = -1;
        for (var5Lifetime1 = 0; var5Lifetime1 < param0.field_y; var5Lifetime1++) {
          var6Lifetime1 = 0;
          var4Lifetime2 = -1;
          var2Lifetime1 = var5Lifetime1;
          while (var6Lifetime1 < param0.field_v) {
            if (param0.field_B[var2Lifetime1] != 0) {
              if (var4Lifetime2 == -1) {
                var4Lifetime2 = var6Lifetime1;
              }
            } else {
              if (var4Lifetime2 != -1) {
                var2Lifetime1 = var4Lifetime2 * param0.field_y + var5Lifetime1;
                for (var7Lifetime1 = var4Lifetime2; var7Lifetime1 < var6Lifetime1; var7Lifetime1++) {
                  var8Lifetime1 = 64 - 128 * (var7Lifetime1 - var4Lifetime2) / (var6Lifetime1 - var4Lifetime2);
                  var1[var2Lifetime1] = var1[var2Lifetime1] | (byte)var8Lifetime1 << 8;
                  var2Lifetime1 = var2Lifetime1 + param0.field_y;
                }
              }
              var4Lifetime2 = -1;
            }
            var6Lifetime1++;
            var2Lifetime1 = var2Lifetime1 + param0.field_y;
          }
          if (var4Lifetime2 != -1) {
            var2Lifetime1Lifetime1 = var4Lifetime2 * param0.field_y + var5Lifetime1;
            for (var7Lifetime1Lifetime1 = var4Lifetime2; var7Lifetime1Lifetime1 < var6Lifetime1; var7Lifetime1Lifetime1++) {
              var8Lifetime1Lifetime1 = 64 - 128 * (var7Lifetime1Lifetime1 - var4Lifetime2) / (var6Lifetime1 - var4Lifetime2);
              var1[var2Lifetime1Lifetime1] = var1[var2Lifetime1Lifetime1] | (byte)var8Lifetime1Lifetime1 << 8;
              var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + param0.field_y;
            }
          }
        }
        return var1;
    }

    ph(cn param0, cn param1) {
        this.field_a = param0;
        this.field_c = param1.field_B;
        this.field_d = param0.field_y;
        this.field_b = param0.field_v;
    }

    ph(cn param0, int[] param1) {
        this.field_a = param0;
        this.field_c = param1;
        this.field_d = param0.field_y;
        this.field_b = param0.field_v;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$9 = 0;
        int incrementValue$1 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$3 = param4;
              param4++;
              param0[incrementValue$3] = param2 ^ param5;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$5 = param4;
              param4++;
              param0[incrementValue$5] = param2 ^ param5;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$7 = param4;
              param4++;
              param0[incrementValue$7] = param2 ^ param5;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$9 = param4;
              param4++;
              param0[incrementValue$9] = param2 ^ param5;
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$1 = param4;
              param4++;
              param0[incrementValue$1] = param2 ^ param5;
            }
          }
          param4 = param4 + param8;
          param3 = param3 + param9;
        }
    }

    final void j(int param0, int param1) {
        this.field_a.f(param0, param1);
        this.a(param0, param1);
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$9 = 0;
        int incrementValue$1 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$3 = param4;
              param4++;
              param0[incrementValue$3] = param2 ^ param5;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$5 = param4;
              param4++;
              param0[incrementValue$5] = param2 ^ param5;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$7 = param4;
              param4++;
              param0[incrementValue$7] = param2 ^ param5;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$9 = param4;
              param4++;
              param0[incrementValue$9] = param2 ^ param5;
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$1 = param4;
              param4++;
              param0[incrementValue$1] = param2 ^ param5;
            }
          }
          param4 = param4 + param8;
          param3 = param3 + param9;
        }
    }

    static {
        field_z = "_normals";
    }
}
