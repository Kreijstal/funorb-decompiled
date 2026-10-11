/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static int[] field_l;
    static int field_c;
    static int field_h;
    private static int[] field_f;
    static int field_a;
    static int field_d;
    private static int[] field_g;
    static int field_k;
    static int[] field_b;
    static int[] field_e;
    static int field_j;
    private static int[] field_i;

    final static void d(int param0, int param1, int param2, int param3) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var14;
        int var15;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        if (param2 == 0) {
          ph.a(param0, param1, param3);
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        var4 = param1 - param2;
        if (var4 < field_c) {
          var4 = field_c;
        }
        var5 = param1 + param2 + 1;
        if (var5 > field_h) {
          var5 = field_h;
        }
        var6 = var4;
        var7 = param2 * param2;
        var8 = 0;
        var9 = param1 - var6;
        var10 = var9 * var9;
        var11 = var10 - var9;
        if (param1 > var5) {
          param1 = var5;
        }
        while (var6 < param1) {
          while (true) {
            if (var11 > var7 &&
              var10 > var7) {
              var12 = param0 - var8 + 1;
              if (var12 < field_k) {
                var12 = field_k;
              }
              var13 = param0 + var8;
              if (var13 > field_a) {
                var13 = field_a;
              }
              var14 = var12 + var6 * field_j;
              for (var15 = var12; var15 < var13; var15++) {
                incrementValue$4 = var14;
                var14++;
                field_e[incrementValue$4] = param3;
              }
              var6++;
              incrementValue$3 = var9;
              var9--;
              var10 = var10 - (incrementValue$3 + var9);
              var11 = var11 - (var9 + var9);
              break;
            }
            var10 = var10 + (var8 + var8);
            incrementValue$5 = var8;
            var8++;
            var11 = var11 + (incrementValue$5 + var8);
          }
        }
        var8Lifetime1 = param2;
        var9Lifetime1 = var6 - param1;
        var11Lifetime1 = var9Lifetime1 * var9Lifetime1 + var7;
        var10Lifetime1 = var11Lifetime1 - var8Lifetime1;
        var11Lifetime1 = var11Lifetime1 - var9Lifetime1;
        while (var6 < var5) {
          while (var11Lifetime1 > var7) {
            if (var10Lifetime1 > var7) {
              incrementValue$0 = var8Lifetime1;
              var8Lifetime1--;
              var11Lifetime1 = var11Lifetime1 - (incrementValue$0 + var8Lifetime1);
              var10Lifetime1 = var10Lifetime1 - (var8Lifetime1 + var8Lifetime1);
              continue;
            }
            break;
          }
          var12Lifetime1 = param0 - var8Lifetime1;
          if (var12Lifetime1 < field_k) {
            var12Lifetime1 = field_k;
          }
          var13Lifetime1 = param0 + var8Lifetime1;
          if (var13Lifetime1 > field_a - 1) {
            var13Lifetime1 = field_a - 1;
          }
          var14Lifetime1 = var12Lifetime1 + var6 * field_j;
          for (var15Lifetime1 = var12Lifetime1; var15Lifetime1 <= var13Lifetime1; var15Lifetime1++) {
            incrementValue$2 = var14Lifetime1;
            var14Lifetime1++;
            field_e[incrementValue$2] = param3;
          }
          var6++;
          var11Lifetime1 = var11Lifetime1 + (var9Lifetime1 + var9Lifetime1);
          incrementValue$1 = var9Lifetime1;
          var9Lifetime1++;
          var10Lifetime1 = var10Lifetime1 + (incrementValue$1 + var9Lifetime1);
        }
        return;
    }

    final static void g(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (param2 > field_j) {
          param2 = field_j;
        }
        if (param3 > field_d) {
          param3 = field_d;
        }
        field_k = param0;
        field_c = param1;
        field_a = param2;
        field_h = param3;
        ph.d();
    }

    final static void b(int[] param0) {
        param0[0] = field_k;
        param0[1] = field_c;
        param0[2] = field_a;
        param0[3] = field_h;
    }

    private final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5) {
        while (param4 < 0) {
          param2 = param0 + param3 - 7;
          while (param0 < param2) {
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
          }
          param2 += 7;
          while (param0 < param2) {
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
          }
          param0 = param0 + param5;
          param4++;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var11;
        if (param0 < field_k) {
          param2 = param2 - (field_k - param0);
          param0 = field_k;
        }
        if (param1 < field_c) {
          param3 = param3 - (field_c - param1);
          param1 = field_c;
        }
        if (param0 + param2 > field_a) {
          param2 = field_a - param0;
        }
        if (param1 + param3 > field_h) {
          param3 = field_h - param1;
        }
        param4 = ((param4 & 16711935) * param5 >> 8 & 16711935) + ((param4 & 65280) * param5 >> 8 & 65280);
        var6 = 256 - param5;
        var7 = field_j - param2;
        var8 = param0 + param1 * field_j;
        for (var9 = 0; var9 < param3; var9++) {
          for (var10 = -param2; var10 < 0; var10++) {
            var11 = field_e[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
            incrementValue$0 = var8;
            var8++;
            field_e[incrementValue$0] = param4 + var11;
          }
          var8 = var8 + var7;
        }
    }

    final static void b() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var0 = 0;
        int var1 = field_j * field_d - 7;
        while (var0 < var1) {
          incrementValue$0 = var0;
          var0++;
          field_e[incrementValue$0] = 0;
          incrementValue$1 = var0;
          var0++;
          field_e[incrementValue$1] = 0;
          incrementValue$2 = var0;
          var0++;
          field_e[incrementValue$2] = 0;
          incrementValue$3 = var0;
          var0++;
          field_e[incrementValue$3] = 0;
          incrementValue$4 = var0;
          var0++;
          field_e[incrementValue$4] = 0;
          incrementValue$5 = var0;
          var0++;
          field_e[incrementValue$5] = 0;
          incrementValue$6 = var0;
          var0++;
          field_e[incrementValue$6] = 0;
          incrementValue$7 = var0;
          var0++;
          field_e[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
          incrementValue$8 = var0;
          var0++;
          field_e[incrementValue$8] = 0;
        }
    }

    final static void e(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
          var5 = 128 - (var6 << 5);
          ph.f(param0 + var6, param1 + param3 + var6, param2, param4, var5);
          ph.b(param0 + param2 + var6, param1 + var6, param3 + 1, param4, var5);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        var6 = 0;
        var7 = 65536 / param3;
        if (param0 < field_k) {
          param2 = param2 - (field_k - param0);
          param0 = field_k;
        }
        if (param1 < field_c) {
          var6 = var6 + (field_c - param1) * var7;
          param3 = param3 - (field_c - param1);
          param1 = field_c;
        }
        if (param0 + param2 > field_a) {
          param2 = field_a - param0;
        }
        if (param1 + param3 > field_h) {
          param3 = field_h - param1;
        }
        var8 = field_j - param2;
        var9 = param0 + param1 * field_j;
        for (var10 = -param3; var10 < 0; var10++) {
          var11 = 65536 - var6 >> 8;
          var12 = var6 >> 8;
          var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
          for (var14 = -param2; var14 < 0; var14++) {
            incrementValue$0 = var9;
            var9++;
            field_e[incrementValue$0] = var13;
          }
          var9 = var9 + var8;
          var6 = var6 + var7;
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        ph.b(param0, param1, param2, param4);
        ph.b(param0, param1 + param3 - 1, param2, param4);
        ph.a(param0, param1, param3, param4);
        ph.a(param0 + param2 - 1, param1, param3, param4);
    }

    final static void f(int param0, int param1, int param2, int param3) {
        if (field_k < param0) {
          field_k = param0;
        }
        if (field_c < param1) {
          field_c = param1;
        }
        if (field_a > param2) {
          field_a = param2;
        }
        if (field_h > param3) {
          field_h = param3;
        }
        ph.d();
    }

    final static void c(int param0, int param1, int param2, int param3) {
        if (param0 < field_k) {
          param2 = param2 - (field_k - param0);
          param0 = field_k;
        }
        if (param1 < field_c) {
          param3 = param3 - (field_c - param1);
          param1 = field_c;
        }
        if (param0 + param2 > field_a) {
          param2 = field_a - param0;
        }
        if (param1 + param3 > field_h) {
          param3 = field_h - param1;
        }
        int var4 = field_j - param2;
        int var5 = param0 + param1 * field_j;
        ph.a(var5, field_e, 0, param2, -param3, var4);
    }

    private final static void d() {
        field_b = null;
        field_l = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 >= field_k) {
          if (param1 < field_c ||
            param0 >= field_a ||
            param1 >= field_h) {
            return;
          }
          field_e[param0 + param1 * field_j] = param2;
          return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        ph.a(field_e, 0, param2 + param3 * field_j, param0, param2, param4, field_j - param4, param5);
        ph.a(field_e, 0, param2 + param3 * field_j, param1, param3, param5, field_j - param4, param2, param4);
    }

    final static void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var22Lifetime1;
        int var22Lifetime2;
        int var22Lifetime3;
        if (param4 == 0) {
          ph.c(param0, param1, param2, param3, param5);
          return;
        }
        if (param4 < 0) {
          param4 = -param4;
        }
        var6 = param0 + param4;
        var7 = param1 + param4;
        var8 = param0 + param2 - param4 - 1;
        var9 = param1 + param3 - param4 - 1;
        if (field_a > field_k) {
          if (field_h <= field_c) {
            return;
          }
          if (param0 + param2 > field_k) {
            if (param0 < field_a &&
              param1 + param3 >= field_c &&
              param1 < field_h) {
              var10 = var6 + (var7 - param4) * field_j;
              var11 = var8 + (var7 - param4) * field_j;
              var12 = var6 + var7 * field_j;
              var13 = var8 + var7 * field_j;
              var14 = var6 + var9 * field_j;
              var15 = var8 + var9 * field_j;
              var16 = var6 + (var9 + param4) * field_j;
              var17 = var8 + (var9 + param4) * field_j;
              var18 = param4;
              var19 = 0;
              var20 = param4 * param4;
              var21 = var20 - var18;
              if (param0 >= field_k &&
                param0 + param2 < field_a &&
                param1 >= field_c &&
                param1 + param3 < field_h) {
                for (var22 = var12; var22 <= var14; var22 = var22 + field_j) {
                  field_e[var22 - var18] = param5;
                }
                for (var22Lifetime1 = var13; var22Lifetime1 <= var15; var22Lifetime1 = var22Lifetime1 + field_j) {
                  field_e[var22Lifetime1 + var18] = param5;
                }
                for (var22Lifetime2 = var10; var22Lifetime2 <= var11; var22Lifetime2++) {
                  field_e[var22Lifetime2] = param5;
                }
                for (var22Lifetime3 = var16; var22Lifetime3 <= var17; var22Lifetime3++) {
                  field_e[var22Lifetime3] = param5;
                }
                while (true) {
                  incrementValue$0 = var19;
                  var19++;
                  var21 = var21 + (incrementValue$0 + var19);
                  var12 = var12 - field_j;
                  var13 = var13 - field_j;
                  var14 = var14 + field_j;
                  var15 = var15 + field_j;
                  if (var21 > var20) {
                    var18--;
                    var21 = var21 - (var18 + var18);
                    var10 = var10 + field_j;
                    var11 = var11 + field_j;
                    var16 = var16 - field_j;
                    var17 = var17 - field_j;
                  }
                  if (var18 < var19) {
                    return;
                  }
                  field_e[var10 - var19] = param5;
                  field_e[var11 + var19] = param5;
                  field_e[var12 - var18] = param5;
                  field_e[var13 + var18] = param5;
                  field_e[var14 - var18] = param5;
                  field_e[var15 + var18] = param5;
                  field_e[var16 - var19] = param5;
                  field_e[var17 + var19] = param5;
                }
              }
              ph.a(param0, param1 + var18, param3 - var18 - var18, param5);
              ph.a(param0 + param2 - 1, param1 + var18, param3 - var18 - var18, param5);
              ph.b(param0 + var18, param1, param2 - var18 - var18, param5);
              ph.b(param0 + var18, param1 + param3 - 1, param2 - var18 - var18, param5);
              while (true) {
                incrementValue$1 = var19;
                var19++;
                var21 = var21 + (incrementValue$1 + var19);
                var12 = var12 - field_j;
                var13 = var13 - field_j;
                var14 = var14 + field_j;
                var15 = var15 + field_j;
                if (var21 > var20) {
                  var18--;
                  var21 = var21 - (var18 + var18);
                  var10 = var10 + field_j;
                  var11 = var11 + field_j;
                  var16 = var16 - field_j;
                  var17 = var17 - field_j;
                }
                if (var18 < var19) {
                  return;
                }
                if (var7 - var18 >= field_c &&
                  var7 - var18 < field_h) {
                  if (var6 - var19 >= field_k &&
                    var6 - var19 < field_a) {
                    field_e[var10 - var19] = param5;
                  }
                  if (var8 + var19 >= field_k &&
                    var8 + var19 < field_a) {
                    field_e[var11 + var19] = param5;
                  }
                }
                if (var7 - var19 >= field_c &&
                  var7 - var19 < field_h) {
                  if (var6 - var18 >= field_k &&
                    var6 - var18 < field_a) {
                    field_e[var12 - var18] = param5;
                  }
                  if (var8 + var18 >= field_k &&
                    var8 + var18 < field_a) {
                    field_e[var13 + var18] = param5;
                  }
                }
                if (var9 + var19 >= field_c &&
                  var9 + var19 < field_h) {
                  if (var6 - var18 >= field_k &&
                    var6 - var18 < field_a) {
                    field_e[var14 - var18] = param5;
                  }
                  if (var8 + var18 >= field_k &&
                    var8 + var18 < field_a) {
                    field_e[var15 + var18] = param5;
                  }
                }
                if (var9 + var18 < field_c) {
                  continue;
                }
                if (var9 + var18 >= field_h) {
                  continue;
                }
                if (var6 - var19 >= field_k &&
                  var6 - var19 < field_a) {
                  field_e[var16 - var19] = param5;
                }
                if (var8 + var19 < field_k) {
                  continue;
                }
                if (var8 + var19 >= field_a) {
                  continue;
                }
                field_e[var17 + var19] = param5;
              }
            }
            return;
          }
        }
        return;
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        if (param0 >= field_k) {
          if (param0 >= field_a) {
            return;
          }
          if (param1 < field_c) {
            param2 = param2 - (field_c - param1);
            param1 = field_c;
          }
          if (param1 + param2 > field_h) {
            param2 = field_h - param1;
          }
          var5 = 256 - param4;
          var6 = (param3 >> 16 & 255) * param4;
          var7 = (param3 >> 8 & 255) * param4;
          var8 = (param3 & 255) * param4;
          var12 = param0 + param1 * field_j;
          for (var13 = 0; var13 < param2; var13++) {
            var9 = (field_e[var12] >> 16 & 255) * var5;
            var10 = (field_e[var12] >> 8 & 255) * var5;
            var11 = (field_e[var12] & 255) * var5;
            var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field_e[var12] = var14;
            var12 = var12 + field_j;
          }
          return;
        }
    }

    final static void a(int[] param0) {
        field_k = param0[0];
        field_c = param0[1];
        field_a = param0[2];
        field_h = param0[3];
        ph.d();
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$7 = 0;
        int incrementValue$6 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_45_2 = 0;
        int[] var9;
        int[] var10;
        int[] var11;
        int var12;
        int var13;
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
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        int[] var29;
        int var13Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var20Lifetime3;
        int var20Lifetime1Lifetime1;
        int var20Lifetime1Lifetime2;
        int var20Lifetime2Lifetime1;
        int var21Lifetime1Lifetime1;
        int var21Lifetime1Lifetime2;
        int var21Lifetime1Lifetime3;
        if (field_f == null ||
          !(field_f.length >= param8)) {
          field_f = new int[param8];
          field_g = new int[param8];
          field_i = new int[param8];
        }
        var27 = field_f;
        var24 = var27;
        var9 = var24;
        var28 = field_g;
        var25 = var28;
        var10 = var25;
        var29 = field_i;
        var26 = var29;
        var11 = var26;
        dk.a(var27, 0, param8);
        dk.a(var28, 0, param8);
        dk.a(var29, 0, param8);
        var12 = 16384 / (2 * param3 + 1);
        var13 = param4 - param3;
        if (var13 < 0) {
          var13 = 0;
        }
        var14 = param7 + var13 * field_j;
        var15 = param4 + param3;
        var16 = 0;
        if (var15 >= field_d) {
          var16 = var15 - field_d + 1;
          var15 = field_d - 1;
        }
        var17 = var15 - var13 + 1;
        while (var13 <= var15) {
          for (var18 = 0; var18 < param8; var18++) {
            param1 = param0[var14++];
            var9[var18] = var9[var18] + (param1 >> 16 & 255);
            var10[var18] = var10[var18] + (param1 >> 8 & 255);
            var11[var18] = var11[var18] + (param1 & 255);
          }
          var14 = var14 + param6;
          var13++;
        }
        var14 = var14 + var16 * field_j;
        for (var18Lifetime1 = 0; var18Lifetime1 < param8; var18Lifetime1++) {
          incrementValue$7 = param2;
          param2++;
          param0[incrementValue$7] = (var27[var18Lifetime1] / var17 << 16) + (var28[var18Lifetime1] / var17 << 8) + var29[var18Lifetime1] / var17;
        }
        param2 = param2 + param6;
        var13Lifetime1 = 1 - param5;
        var18Lifetime2 = 1 + param3 - param5 - param4;
        if (0 < var18Lifetime2) {
          var18Lifetime2 = 0;
        }
        var19 = param7 + (param4 - param3) * field_j;
        if (var13Lifetime1 < var18Lifetime2) {
          var19 = var19 + (var18Lifetime2 - var13Lifetime1) * field_j;
        }
        while (var13Lifetime1 < var18Lifetime2) {
          if (var13Lifetime1 + param4 + param5 + param3 < field_h) {
            for (var20 = 0; var20 < param8; var20++) {
              param1 = param0[var14++];
              var9[var20] = var9[var20] + (param1 >> 16 & 255);
              var10[var20] = var10[var20] + (param1 >> 8 & 255);
              var11[var20] = var11[var20] + (param1 & 255);
            }
            var14 = var14 + param6;
            var17++;
          } else {
            var14 = var14 + field_j;
          }
          for (var20Lifetime3 = 0; var20Lifetime3 < param8; var20Lifetime3++) {
            var21 = var27[var20Lifetime3] / var17;
            var22 = var28[var20Lifetime3] / var17;
            var23 = var29[var20Lifetime3] / var17;
            incrementValue$6 = param2;
            param2++;
            param0[incrementValue$6] = (var21 << 16) + (var22 << 8) + var23;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
        var18Lifetime3 = field_d - param4 - param5 - param3;
        if (0 < var18Lifetime3) {
          var18Lifetime3 = 0;
        }
        while (var13Lifetime1 < var18Lifetime3) {
          for (var20Lifetime1 = 0; var20Lifetime1 < param8; var20Lifetime1++) {
            param1 = param0[var19++];
            var21Lifetime1 = var27[var20Lifetime1] - (param1 >> 16 & 255);
            stackIn_38_0 = var9;
            stackIn_38_1 = var20Lifetime1;
            if (var21Lifetime1 >= 0) {
              stackIn_39_2 = var21Lifetime1;
            } else {
              stackIn_39_2 = 0;
            }
            stackIn_38_0[stackIn_38_1] = stackIn_39_2;
            var21Lifetime1Lifetime2 = var28[var20Lifetime1] - (param1 >> 8 & 255);
            stackIn_41_0 = var10;
            stackIn_41_1 = var20Lifetime1;
            if (var21Lifetime1Lifetime2 >= 0) {
              stackIn_42_2 = var21Lifetime1Lifetime2;
            } else {
              stackIn_42_2 = 0;
            }
            stackIn_41_0[stackIn_41_1] = stackIn_42_2;
            var21Lifetime1Lifetime3 = var29[var20Lifetime1] - (param1 & 255);
            stackIn_44_0 = var11;
            stackIn_44_1 = var20Lifetime1;
            if (var21Lifetime1Lifetime3 >= 0) {
              stackIn_45_2 = var21Lifetime1Lifetime3;
            } else {
              stackIn_45_2 = 0;
            }
            stackIn_44_0[stackIn_44_1] = stackIn_45_2;
          }
          var19 = var19 + param6;
          for (var20Lifetime1Lifetime1 = 0; var20Lifetime1Lifetime1 < param8; var20Lifetime1Lifetime1++) {
            param1 = param0[var14++];
            var9[var20Lifetime1Lifetime1] = var9[var20Lifetime1Lifetime1] + (param1 >> 16 & 255);
            var10[var20Lifetime1Lifetime1] = var10[var20Lifetime1Lifetime1] + (param1 >> 8 & 255);
            var11[var20Lifetime1Lifetime1] = var11[var20Lifetime1Lifetime1] + (param1 & 255);
          }
          var14 = var14 + param6;
          for (var20Lifetime1Lifetime2 = 0; var20Lifetime1Lifetime2 < param8; var20Lifetime1Lifetime2++) {
            var21Lifetime1Lifetime1 = var27[var20Lifetime1Lifetime2] * var12 >> 14;
            var22Lifetime1 = var28[var20Lifetime1Lifetime2] * var12 >> 14;
            var23Lifetime1 = var29[var20Lifetime1Lifetime2] * var12 >> 14;
            if (var21Lifetime1Lifetime1 > 255) {
              var21Lifetime1Lifetime1 = 255;
            }
            if (var22Lifetime1 > 255) {
              var22Lifetime1 = 255;
            }
            if (var23Lifetime1 > 255) {
              var23Lifetime1 = 255;
            }
            incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21Lifetime1Lifetime1 << 16) + (var22Lifetime1 << 8) + var23Lifetime1;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
        while (var13Lifetime1 < 0) {
          for (var20Lifetime2 = 0; var20Lifetime2 < param8; var20Lifetime2++) {
            param1 = param0[var19++];
            var9[var20Lifetime2] = var9[var20Lifetime2] - (param1 >> 16 & 255);
            var10[var20Lifetime2] = var10[var20Lifetime2] - (param1 >> 8 & 255);
            var11[var20Lifetime2] = var11[var20Lifetime2] - (param1 & 255);
          }
          var19 = var19 + param6;
          var17--;
          for (var20Lifetime2Lifetime1 = 0; var20Lifetime2Lifetime1 < param8; var20Lifetime2Lifetime1++) {
            var21Lifetime2 = var27[var20Lifetime2Lifetime1] / var17;
            var22Lifetime2 = var28[var20Lifetime2Lifetime1] / var17;
            var23Lifetime2 = var29[var20Lifetime2Lifetime1] / var17;
            if (var21Lifetime2 >= 0) {
              if (var21Lifetime2 > 255) {
                var21Lifetime2 = 255;
              }
            } else {
              var21Lifetime2 = 0;
            }
            if (var22Lifetime2 >= 0) {
              if (var22Lifetime2 > 255) {
                var22Lifetime2 = 255;
              }
            } else {
              var22Lifetime2 = 0;
            }
            if (var23Lifetime2 >= 0) {
              if (var23Lifetime2 > 255) {
                var23Lifetime2 = 255;
              }
            } else {
              var23Lifetime2 = 0;
            }
            incrementValue$0 = param2;
            param2++;
            param0[incrementValue$0] = (var21Lifetime2 << 16) + (var22Lifetime2 << 8) + var23Lifetime2;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_k) {
          param2 = param2 - (field_k - param0);
          param0 = field_k;
        }
        if (param1 < field_c) {
          param3 = param3 - (field_c - param1);
          param1 = field_c;
        }
        if (param0 + param2 > field_a) {
          param2 = field_a - param0;
        }
        if (param1 + param3 > field_h) {
          param3 = field_h - param1;
        }
        int var5 = field_j - param2;
        int var6 = param0 + param1 * field_j;
        for (var7 = -param3; var7 < 0; var7++) {
          for (var8 = -param2; var8 < 0; var8++) {
            incrementValue$0 = var6;
            var6++;
            field_e[incrementValue$0] = param4;
          }
          var6 = var6 + var5;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var13 = 0;
        int incrementValue$0 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$2 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
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
        int var19Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        var8 = 16384 / (2 * param3 + 1);
        var9 = 1 + param3 - param5 - param4;
        if (0 < var9) {
          var9 = 0;
        }
        var10 = field_j - param4 - param5 - param3;
        if (0 < var10) {
          var10 = 0;
        }
        var11 = 0;
        var12 = param4 + param3 + 1;
        if (field_j < var12) {
          var11 = var12 - field_j;
          var12 = field_j;
        }
        for (var13 = -param7; var13 < 0; var13++) {
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = param2 - param3;
          var18 = var17 - (param3 << 1) - 1;
          var19 = param4 - param3;
          if (var19 < 0) {
            var17 = var17 - var19;
            var18 = var18 - var19;
            var19 = 0;
          }
          var20 = var12 - var19;
          while (var19 < var12) {
            param1 = param0[var17];
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            var17++;
            var18++;
            var19++;
          }
          var18 = var18 + var11;
          incrementValue$0 = param2;
          param2++;
          param0[incrementValue$0] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;
          for (var19Lifetime1 = 1 - param5; var19Lifetime1 < var9; var19Lifetime1++) {
            var18++;
            if (param4 + param5 + var19Lifetime1 + param3 < field_a) {
              param1 = param0[var17];
              var17++;
              var14 = var14 + (param1 >> 16 & 255);
              var15 = var15 + (param1 >> 8 & 255);
              var16 = var16 + (param1 & 255);
              var20++;
            }
            var21 = var14 / var20;
            var22 = var15 / var20;
            var23 = var16 / var20;
            incrementValue$5 = param2;
            param2++;
            param0[incrementValue$5] = (var21 << 16) + (var22 << 8) + var23;
          }
          while (var19Lifetime1 < var10) {
            param1 = param0[var18++];
            var14 = var14 - (param1 >> 16 & 255);
            if (var14 < 0) {
              var14 = 0;
            }
            var15 = var15 - (param1 >> 8 & 255);
            if (var15 < 0) {
              var15 = 0;
            }
            var16 = var16 - (param1 & 255);
            if (var16 < 0) {
              var16 = 0;
            }
            param1 = param0[var17];
            var17++;
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            var21Lifetime1 = var14 * var8 >> 14;
            var22Lifetime1 = var15 * var8 >> 14;
            var23Lifetime1 = var16 * var8 >> 14;
            if (var21Lifetime1 > 255) {
              var21Lifetime1 = 255;
            }
            if (var22Lifetime1 > 255) {
              var22Lifetime1 = 255;
            }
            if (var23Lifetime1 > 255) {
              var23Lifetime1 = 255;
            }
            incrementValue$4 = param2;
            param2++;
            param0[incrementValue$4] = (var21Lifetime1 << 16) + (var22Lifetime1 << 8) + var23Lifetime1;
            var19Lifetime1++;
          }
          while (var19Lifetime1 < 0) {
            param1 = param0[var18++];
            var14 = var14 - (param1 >> 16 & 255);
            var15 = var15 - (param1 >> 8 & 255);
            var16 = var16 - (param1 & 255);
            var20--;
            var21Lifetime2 = var14 / var20;
            var22Lifetime2 = var15 / var20;
            var23Lifetime2 = var16 / var20;
            if (var21Lifetime2 >= 0) {
              if (var21Lifetime2 > 255) {
                var21Lifetime2 = 255;
              }
            } else {
              var21Lifetime2 = 0;
            }
            if (var22Lifetime2 >= 0) {
              if (var22Lifetime2 > 255) {
                var22Lifetime2 = 255;
              }
            } else {
              var22Lifetime2 = 0;
            }
            if (var23Lifetime2 >= 0) {
              if (var23Lifetime2 > 255) {
                var23Lifetime2 = 255;
              }
            } else {
              var23Lifetime2 = 0;
            }
            incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21Lifetime2 << 16) + (var22Lifetime2 << 8) + var23Lifetime2;
            var19Lifetime1++;
          }
          param2 = param2 + param6;
        }
    }

    final static void a() {
        field_k = 0;
        field_c = 0;
        field_a = field_j;
        field_h = field_d;
        ph.d();
    }

    final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int var22 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        if (param4 == 0) {
          ph.d(param0, param1, param2, param3, param5);
          return;
        }
        if (param4 < 0) {
          param4 = -param4;
        }
        var6 = param0 + param4;
        var7 = param1 + param4;
        var8 = param1;
        if (var8 < field_c) {
          var8 = field_c;
        }
        var9 = param1 + param3;
        if (var9 > field_h) {
          var9 = field_h;
        }
        var10 = param2 - param4 - param4 - 1;
        var11 = var8;
        var12 = param4 * param4;
        var13 = 0;
        var14 = var7 - var11;
        var15 = var14 * var14;
        var16 = var15 - var14;
        if (var7 > var9) {
          var7 = var9;
        }
        while (var11 < var7) {
          while (true) {
            if (var16 > var12 &&
              var15 > var12) {
              var17 = var6 - var13 + 1;
              if (var17 < field_k) {
                var17 = field_k;
              }
              var18 = var6 + var10 + var13;
              if (var18 > field_a) {
                var18 = field_a;
              }
              var19 = var17 + var11 * field_j;
              for (var20 = var17; var20 < var18; var20++) {
                incrementValue$5 = var19;
                var19++;
                field_e[incrementValue$5] = param5;
              }
              var11++;
              incrementValue$4 = var14;
              var14--;
              var15 = var15 - (incrementValue$4 + var14);
              var16 = var16 - (var14 + var14);
              break;
            }
            var15 = var15 + (var13 + var13);
            incrementValue$6 = var13;
            var13++;
            var16 = var16 + (incrementValue$6 + var13);
          }
        }
        var14Lifetime1 = var11 - var7;
        var17Lifetime1 = param0;
        if (var17Lifetime1 < field_k) {
          var17Lifetime1 = field_k;
        }
        var18Lifetime1 = param0 + param2;
        if (var18Lifetime1 > field_a) {
          var18Lifetime1 = field_a;
        }
        var19Lifetime1 = var17Lifetime1 + var11 * field_j;
        var20Lifetime1 = field_j + var17Lifetime1 - var18Lifetime1;
        var21 = param1 + param3 - param4 - 1;
        if (var21 > field_h) {
          var21 = field_h;
        }
        while (var11 < var21) {
          for (var22 = var17Lifetime1; var22 < var18Lifetime1; var22++) {
            incrementValue$3 = var19Lifetime1;
            var19Lifetime1++;
            field_e[incrementValue$3] = param5;
          }
          var11++;
          var19Lifetime1 = var19Lifetime1 + var20Lifetime1;
        }
        var14Lifetime2 = 0;
        var13Lifetime1 = param4;
        var16Lifetime1 = var14Lifetime2 * var14Lifetime2 + var12;
        var15Lifetime1 = var16Lifetime1 - var13Lifetime1;
        var16Lifetime1 = var16Lifetime1 - var14Lifetime2;
        while (var11 < var9) {
          while (var16Lifetime1 > var12) {
            if (var15Lifetime1 > var12) {
              incrementValue$0 = var13Lifetime1;
              var13Lifetime1--;
              var16Lifetime1 = var16Lifetime1 - (incrementValue$0 + var13Lifetime1);
              var15Lifetime1 = var15Lifetime1 - (var13Lifetime1 + var13Lifetime1);
              continue;
            }
            break;
          }
          var17Lifetime2 = var6 - var13Lifetime1;
          if (var17Lifetime2 < field_k) {
            var17Lifetime2 = field_k;
          }
          var18Lifetime2 = var6 + var10 + var13Lifetime1;
          if (var18Lifetime2 > field_a - 1) {
            var18Lifetime2 = field_a - 1;
          }
          var19Lifetime2 = var17Lifetime2 + var11 * field_j;
          for (var20Lifetime2 = var17Lifetime2; var20Lifetime2 <= var18Lifetime2; var20Lifetime2++) {
            incrementValue$2 = var19Lifetime2;
            var19Lifetime2++;
            field_e[incrementValue$2] = param5;
          }
          var11++;
          var16Lifetime1 = var16Lifetime1 + (var14Lifetime2 + var14Lifetime2);
          incrementValue$1 = var14Lifetime2;
          var14Lifetime2++;
          var15Lifetime1 = var15Lifetime1 + (incrementValue$1 + var14Lifetime2);
        }
        return;
    }

    private final static void f(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        if (param1 >= field_c) {
          if (param1 >= field_h) {
            return;
          }
          if (param0 < field_k) {
            param2 = param2 - (field_k - param0);
            param0 = field_k;
          }
          if (param0 + param2 > field_a) {
            param2 = field_a - param0;
          }
          var5 = 256 - param4;
          var6 = (param3 >> 16 & 255) * param4;
          var7 = (param3 >> 8 & 255) * param4;
          var8 = (param3 & 255) * param4;
          var12 = param0 + param1 * field_j;
          for (var13 = 0; var13 < param2; var13++) {
            var9 = (field_e[var12] >> 16 & 255) * var5;
            var10 = (field_e[var12] >> 8 & 255) * var5;
            var11 = (field_e[var12] & 255) * var5;
            var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            incrementValue$0 = var12;
            var12++;
            field_e[incrementValue$0] = var14;
          }
          return;
        }
    }

    final static void e(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_k) {
          param2 = param2 - (field_k - param0);
          param0 = field_k;
        }
        if (param0 + param2 > field_a) {
          param2 = field_a - param0;
        }
        if (param1 < field_c) {
          param3 = param3 - (field_c - param1);
          param1 = field_c;
        }
        if (param1 + param3 > field_h) {
          param3 = field_h - param1;
        }
        int var4 = param0 + param1 * field_j;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          for (var5 = 0; var5 < param3; var5++) {
            for (var6 = 0; var6 < param2; var6++) {
              var7 = field_e[var4];
              var8 = var7 >> 15 & 510;
              var9 = var7 >> 8 & 255;
              var10 = var7 & 255;
              var11 = (var10 + var8) / 3 + var9 >> 1;
              incrementValue$0 = var4;
              var4++;
              field_e[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
            }
            var4 = var4 + (field_j - param2);
          }
          return;
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param1 >= field_c) {
          if (param1 >= field_h) {
            return;
          }
          if (param0 < field_k) {
            param2 = param2 - (field_k - param0);
            param0 = field_k;
          }
          if (param0 + param2 > field_a) {
            param2 = field_a - param0;
          }
          var4 = param0 + param1 * field_j;
          for (var5 = 0; var5 < param2; var5++) {
            field_e[var4 + var5] = param3;
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var5Lifetime1;
        int var6Lifetime1;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            ph.b(param0 + param2, param1, -param2 + 1, param4);
          } else {
            ph.b(param0, param1, param2 + 1, param4);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            ph.a(param0, param1 + param3, -param3 + 1, param4);
          } else {
            ph.a(param0, param1, param3 + 1, param4);
          }
          return;
        }
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          var5 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < field_c) {
            param0 = param0 + var5 * (field_c - param1);
            param1 = field_c;
          }
          if (param3 >= field_h) {
            param3 = field_h - 1;
          }
          while (param1 <= param3) {
            var6 = param0 >> 16;
            if (var6 >= field_k &&
              var6 < field_a) {
              field_e[var6 + param1 * field_j] = param4;
            }
            param0 = param0 + var5;
            param1++;
          }
          return;
        }
        param1 = param1 << 16;
        param1 = param1 + 32768;
        param3 = param3 << 16;
        var5Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
        param2 = param2 + param0;
        if (param0 < field_k) {
          param1 = param1 + var5Lifetime1 * (field_k - param0);
          param0 = field_k;
        }
        if (param2 >= field_a) {
          param2 = field_a - 1;
        }
        while (param0 <= param2) {
          var6Lifetime1 = param1 >> 16;
          if (var6Lifetime1 >= field_c &&
            var6Lifetime1 < field_h) {
            field_e[param0 + var6Lifetime1 * field_j] = param4;
          }
          param1 = param1 + var5Lifetime1;
          param0++;
        }
    }

    public static void c() {
        field_e = null;
        field_b = null;
        field_l = null;
        field_f = null;
        field_g = null;
        field_i = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 >= field_k) {
          if (param0 >= field_a) {
            return;
          }
          if (param1 < field_c) {
            param2 = param2 - (field_c - param1);
            param1 = field_c;
          }
          if (param1 + param2 > field_h) {
            param2 = field_h - param1;
          }
          var4 = param0 + param1 * field_j;
          var5 = 0;
          while (var5 < param2) {
            field_e[var4] = param3;
            var5++;
            var4 = var4 + field_j;
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int var24 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
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
        int var25;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        if (param6 == 256) {
          ph.c(param0, param1, param2, param3, param4, param5);
          return;
        }
        if (param4 == 0) {
          ph.b(param0, param1, param2, param3, param5, param6);
          return;
        }
        var7 = 256 - param6;
        param5 = ((param5 & 16711935) * param6 >> 8 & 16711935) + ((param5 & 65280) * param6 >> 8 & 65280);
        if (param4 < 0) {
          param4 = -param4;
        }
        var8 = param0 + param4;
        var9 = param1 + param4;
        var10 = param1;
        if (var10 < field_c) {
          var10 = field_c;
        }
        var11 = param1 + param3;
        if (var11 > field_h) {
          var11 = field_h;
        }
        var12 = param2 - param4 - param4 - 1;
        var13 = var10;
        var14 = param4 * param4;
        var15 = 0;
        var16 = var9 - var13;
        var17 = var16 * var16;
        var18 = var17 - var16;
        if (var9 > var11) {
          var9 = var11;
        }
        while (var13 < var9) {
          while (true) {
            if (var18 > var14 &&
              var17 > var14) {
              var19 = var8 - var15 + 1;
              if (var19 < field_k) {
                var19 = field_k;
              }
              var20 = var8 + var12 + var15;
              if (var20 > field_a) {
                var20 = field_a;
              }
              var21 = var19 + var13 * field_j;
              for (var22 = var19; var22 < var20; var22++) {
                var23 = field_e[var21];
                var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & 65280) * var7 >> 8 & 65280);
                incrementValue$5 = var21;
                var21++;
                field_e[incrementValue$5] = param5 + var23;
              }
              var13++;
              incrementValue$4 = var16;
              var16--;
              var17 = var17 - (incrementValue$4 + var16);
              var18 = var18 - (var16 + var16);
              break;
            }
            var17 = var17 + (var15 + var15);
            incrementValue$6 = var15;
            var15++;
            var18 = var18 + (incrementValue$6 + var15);
          }
        }
        var16Lifetime1 = var13 - var9;
        var19Lifetime1 = param0;
        if (var19Lifetime1 < field_k) {
          var19Lifetime1 = field_k;
        }
        var20Lifetime1 = param0 + param2;
        if (var20Lifetime1 > field_a) {
          var20Lifetime1 = field_a;
        }
        var21Lifetime1 = var19Lifetime1 + var13 * field_j;
        var22Lifetime1 = field_j + var19Lifetime1 - var20Lifetime1;
        var23Lifetime1 = param1 + param3 - param4 - 1;
        if (var23Lifetime1 > field_h) {
          var23Lifetime1 = field_h;
        }
        while (var13 < var23Lifetime1) {
          for (var24 = var19Lifetime1; var24 < var20Lifetime1; var24++) {
            var25 = field_e[var21Lifetime1];
            var25 = ((var25 & 16711935) * var7 >> 8 & 16711935) + ((var25 & 65280) * var7 >> 8 & 65280);
            incrementValue$3 = var21Lifetime1;
            var21Lifetime1++;
            field_e[incrementValue$3] = param5 + var25;
          }
          var13++;
          var21Lifetime1 = var21Lifetime1 + var22Lifetime1;
        }
        var16Lifetime2 = 0;
        var15Lifetime1 = param4;
        var18Lifetime1 = var16Lifetime2 * var16Lifetime2 + var14;
        var17Lifetime1 = var18Lifetime1 - var15Lifetime1;
        var18Lifetime1 = var18Lifetime1 - var16Lifetime2;
        while (var13 < var11) {
          while (var18Lifetime1 > var14) {
            if (var17Lifetime1 > var14) {
              incrementValue$0 = var15Lifetime1;
              var15Lifetime1--;
              var18Lifetime1 = var18Lifetime1 - (incrementValue$0 + var15Lifetime1);
              var17Lifetime1 = var17Lifetime1 - (var15Lifetime1 + var15Lifetime1);
              continue;
            }
            break;
          }
          var19Lifetime2 = var8 - var15Lifetime1;
          if (var19Lifetime2 < field_k) {
            var19Lifetime2 = field_k;
          }
          var20Lifetime2 = var8 + var12 + var15Lifetime1;
          if (var20Lifetime2 > field_a - 1) {
            var20Lifetime2 = field_a - 1;
          }
          var21Lifetime2 = var19Lifetime2 + var13 * field_j;
          for (var22Lifetime2 = var19Lifetime2; var22Lifetime2 <= var20Lifetime2; var22Lifetime2++) {
            var23Lifetime2 = field_e[var21Lifetime2];
            var23Lifetime2 = ((var23Lifetime2 & 16711935) * var7 >> 8 & 16711935) + ((var23Lifetime2 & 65280) * var7 >> 8 & 65280);
            incrementValue$2 = var21Lifetime2;
            var21Lifetime2++;
            field_e[incrementValue$2] = param5 + var23Lifetime2;
          }
          var13++;
          var18Lifetime1 = var18Lifetime1 + (var16Lifetime2 + var16Lifetime2);
          incrementValue$1 = var16Lifetime2;
          var16Lifetime2++;
          var17Lifetime1 = var17Lifetime1 + (incrementValue$1 + var16Lifetime2);
        }
        return;
    }

    final static void a(int[] param0, int param1, int param2) {
        field_e = param0;
        field_j = param1;
        field_d = param2;
        ph.g(0, 0, param1, param2);
    }

    static {
        field_h = 0;
        field_c = 0;
        field_a = 0;
        field_k = 0;
    }
}
