/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private static int field_a;
    private static int field_e;
    private static int field_g;
    private static int field_h;
    private static int field_f;
    private static int field_d;
    private static int[] field_b;
    private static int field_i;
    private static int field_c;

    final static void a(int param0, int param1, int param2, tf param3, int param4) {
        int var7 = 0;
        int var5;
        int var6;
        param0 = param0 - (param3.field_A >> 1);
        var5 = param2 - 5;
        var6 = param2 - 3 - 1;
        for (var7 = 0; var7 < param2; var7++) {
          if (var7 >= 3 &&
            var7 <= var6) {
            if (var7 >= 5 &&
              var7 < var5) {
              param3.b(param0, param1 + var7, 256);
            }
          } else {
            fi.a(param3, param0, param1 + var7, param4);
          }
        }
    }

    public static void a() {
        field_b = null;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var13 = 0;
        int var14 = 0;
        int incrementValue$12 = 0;
        int var11;
        int var12;
        int var15;
        var11 = param9 >> 8;
        var12 = 256 - var11;
        for (var13 = -param6; var13 < 0; var13++) {
          if (var11 > 0) {
            for (var14 = -param5; var14 < 0; var14++) {
              param2 = param1[param3++];
              if (param2 == 0) {
                param4++;
              } else {
                var15 = param0[param4];
                incrementValue$12 = param4;
                param4++;
                param0[incrementValue$12] = ((param2 & 16711935) * var11 + (var15 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var11 + (var15 & 65280) * var12 & 16711680) >> 8;
              }
            }
          } else {
            param3 = param3 + param5;
            param4 = param4 + param5;
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
          param9 = param9 + param10;
          var11 = param9 >> 8;
          var12 = 256 - var11;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int var14;
        while (param11 < 0) {
          field_h = field_f;
          field_e = field_c;
          var14 = param12;
          while (var14 < 0) {
            param1 = field_e - field_i >> 16;
            if (param1 >= -param2 &&
              param1 <= param2) {
              param0 = field_h + field_a >> 16;
              if (param0 >= -param2 &&
                param0 <= param5 + param2) {
                if (param0 >= param2) {
                  if (param0 <= param5 - param2) {
                    stackIn_16_0 = param8;
                  } else {
                    stackIn_16_0 = (param5 + param2 - param0) * field_d >> 8;
                  }
                } else {
                  stackIn_16_0 = (param0 + param2) * field_d >> 8;
                }
                param3 = stackIn_16_0;
                param4 = param1 * param3 * field_g >> 8;
                if (param4 < 0) {
                  stackIn_19_0 = field_b[param3 + param4];
                } else {
                  stackIn_19_0 = field_b[param3 - param4];
                }
                param1 = stackIn_19_0;
                param0 = param6[param7];
                param3 = param1 + param0;
                param1 = (param1 & 16711935) + (param0 & 16711935);
                param0 = (param1 & 16777472) + (param3 - param1 & 65536);
                param6[param7] = param3 - param0 | param0 - (param0 >>> 8);
              }
            }
            var14++;
            param7++;
            field_h = field_h + param9;
            field_e = field_e + param10;
          }
          param7 = param7 + param13;
          param11++;
          field_i = field_i + param9;
          field_a = field_a + param10;
        }
    }

    final static void a(tf param0, hh param1, int param2, int param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param2 = param2 + param0.field_D;
        param3 = param3 + param0.field_y;
        int var4 = param2 + param3 * t.field_j;
        int var5 = 0;
        int var6 = param0.field_E;
        int var7 = param0.field_F;
        int var8 = t.field_j - var7;
        int var9 = 0;
        if (param3 < t.field_f) {
          var10 = t.field_f - param3;
          var6 = var6 - var10;
          param3 = t.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * t.field_j;
        }
        if (param3 + var6 > t.field_a) {
          var6 = var6 - (param3 + var6 - t.field_a);
        }
        if (param2 < t.field_e) {
          var10Lifetime1 = t.field_e - param2;
          var7 = var7 - var10Lifetime1;
          param2 = t.field_e;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param2 + var7 > t.field_h) {
          var10Lifetime2 = param2 + var7 - t.field_h;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        fi.a(t.field_k, param0.field_G, 0, var5, var4, var7, var6, var8, var9, param1.field_n);
    }

    final static void a(int[] param0, int param1, int param2) {
        int var12 = 0;
        int incrementValue$3 = 0;
        int incrementValue$1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var11Lifetime1;
        var3 = 480;
        var4 = 640;
        var5 = param1 << 8;
        var6 = (param2 - param1 << 8) / var3;
        var7 = 0;
        var8 = t.field_j - var4;
        var9 = 640 - var4;
        var10 = 0;
        var11 = 0;
        for (var12 = -var3; var12 < 0; var12++) {
          var13 = var5 >> 8;
          var14 = 256 - var13;
          if (var13 >= 0) {
            if (var13 > 255) {
              for (var11Lifetime1 = -var4; var11Lifetime1 < 0; var11Lifetime1++) {
                var15 = param0[var7++];
                incrementValue$3 = var10;
                var10++;
                t.field_k[incrementValue$3] = var15;
              }
            } else {
              for (var11Lifetime1 = -var4; var11Lifetime1 < 0; var11Lifetime1++) {
                var15 = param0[var7++];
                var16 = t.field_k[var10];
                var17 = (var16 & 16711935) * var14 + (var15 & 16711935) * var13 >> 8 & 16711935;
                incrementValue$1 = var10;
                var10++;
                t.field_k[incrementValue$1] = var17 + ((var16 & 65280) * var14 + (var15 & 65280) * var13 >> 8 & 65280);
              }
            }
            var10 = var10 + var8;
            var7 = var7 + var9;
            var5 = var5 + var6;
          }
        }
    }

    private final static void a(tf param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param1 = param1 + param0.field_D;
        param2 = param2 + param0.field_y;
        int var4 = param1 + param2 * t.field_j;
        int var5 = 0;
        int var6 = param0.field_E;
        int var7 = param0.field_F;
        int var8 = t.field_j - var7;
        int var9 = 0;
        if (param2 < t.field_f) {
          var10 = t.field_f - param2;
          var6 = var6 - var10;
          param2 = t.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * t.field_j;
        }
        if (param2 + var6 > t.field_a) {
          var6 = var6 - (param2 + var6 - t.field_a);
        }
        if (param1 < t.field_e) {
          var10Lifetime1 = t.field_e - param1;
          var7 = var7 - var10Lifetime1;
          param1 = t.field_e;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > t.field_h) {
          var10Lifetime2 = param1 + var7 - t.field_h;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        fi.a(0, 0, 0, t.field_k, param0.field_G, var5, 0, var4, 0, var7, var6, var8, var9, param3);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int var15 = 0;
        int var15Lifetime1;
        if (!jc.field_d) {
          t.b(param0, param1, param2, param3, param6[param5]);
          return;
        }
        int var7 = param2 - param0;
        int var8 = param3 - param1;
        int var9 = (int)Math.sqrt((double)(var7 * var7 + var8 * var8));
        int var10 = (int)(65536.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
        var7 = var7 * var10;
        var8 = var8 * var10;
        int var11 = param0;
        int var12 = param1;
        int var13 = param2;
        int var14 = param3;
        if (var11 > var13) {
          var15 = var11;
          var11 = var13;
          var13 = var15;
        }
        if (var12 > var14) {
          var15Lifetime1 = var12;
          var12 = var14;
          var14 = var15Lifetime1;
        }
        var11 = var11 - param4;
        var12 = var12 - param4;
        var13 = var13 + param4;
        var14 = var14 + param4;
        if (var11 < t.field_e) {
          var11 = t.field_e;
        }
        if (var12 < t.field_f) {
          var12 = t.field_f;
        }
        if (var13 > t.field_h) {
          var13 = t.field_h;
        }
        if (var14 > t.field_a) {
          var14 = t.field_a;
        }
        field_g = 256 / param4;
        field_d = param5 * 128 / param4;
        field_i = (var12 - param1) * var7;
        field_a = (var12 - param1) * var8;
        field_f = (var11 - param0) * var7;
        field_c = (var11 - param0) * var8;
        field_b = param6;
        fi.a(param0, param1, param4, 0, 0, var9, t.field_k, var12 * t.field_j + var11, param5, var7, var8, var12 - var14, var11 - var13, t.field_j - (var13 - var11));
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            incrementValue$11 = param5;
            param5++;
            param0 = param4[incrementValue$11] & 255;
            if (param0 == 0) {
              param7++;
            } else {
              param2 = param3[param7];
              param1 = 255 - param0;
              incrementValue$12 = param7;
              param7++;
              param3[incrementValue$12] = ((param2 & 16711935) * param1 & -16711936) + ((param2 & 65280) * param1 & 16711680) + ((param13 & 16711935) * param0 & -16711936) + ((param13 & 65280) * param0 & 16711680) >> 8;
            }
          }
          param7 = param7 + param11;
          param5 = param5 + param12;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var12;
        int var8Lifetime1;
        int var8Lifetime2;
        if (param0 < t.field_e) {
          param2 = param2 - (t.field_e - param0);
          param0 = t.field_e;
        }
        if (param1 < t.field_f) {
          param3 = param3 - (t.field_f - param1);
          param1 = t.field_f;
        }
        if (param0 + param2 > t.field_h) {
          param2 = t.field_h - param0;
        }
        if (param1 + param3 > t.field_a) {
          param3 = t.field_a - param1;
        }
        var6 = t.field_j - param2;
        var7 = param0 + param1 * t.field_j;
        for (var10 = -param3; var10 < 0; var10++) {
          for (var11 = -param2; var11 < 0; var11++) {
            var8 = (param4 & 16711935) * param5;
            var9 = (var8 & -16711936) + (param4 * param5 - var8 & 16711680) >>> 8;
            var8Lifetime1 = t.field_k[var7];
            var12 = var9 + var8Lifetime1;
            var9 = (var9 & 16711935) + (var8Lifetime1 & 16711935);
            var8Lifetime2 = (var9 & 16777472) + (var12 - var9 & 65536);
            incrementValue$0 = var7;
            var7++;
            t.field_k[incrementValue$0] = var12 - var8Lifetime2 | var8Lifetime2 - (var8Lifetime2 >>> 8);
          }
          var7 = var7 + var6;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte[] param9) {
        int var11 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            param2 = param1[param3];
            incrementValue$2 = param3;
            param3++;
            if (param9[incrementValue$2] != 0 &&
              param2 != 0) {
              param0[param4++] = param2;
            } else {
              param4++;
            }
            param2 = param1[param3];
            incrementValue$4 = param3;
            param3++;
            if (param9[incrementValue$4] != 0 &&
              param2 != 0) {
              param0[param4++] = param2;
            } else {
              param4++;
            }
            param2 = param1[param3];
            incrementValue$6 = param3;
            param3++;
            if (param9[incrementValue$6] != 0 &&
              param2 != 0) {
              param0[param4++] = param2;
            } else {
              param4++;
            }
            param2 = param1[param3];
            if (param9[param3++] != 0) {
              if (param2 != 0) {
                param0[param4++] = param2;
              } else {
                param4++;
              }
            } else {
              param4++;
            }
          }
          for (var12Lifetime1 = param5; var12Lifetime1 < 0; var12Lifetime1++) {
            param2 = param1[param3];
            if (param9[param3++] != 0) {
              if (param2 != 0) {
                param0[param4++] = param2;
              } else {
                param4++;
              }
            } else {
              param4++;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final static void a(tf param0, int param1, int param2) {
        int var9 = 0;
        int var3 = param1 + param2 * t.field_j;
        int var4 = 0;
        int var5 = param0.field_E;
        int var6 = param0.field_F;
        int var7 = t.field_j - var6;
        int var8 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        if (param2 < t.field_f) {
          var9 = t.field_f - param2;
          var5 = var5 - var9;
          param2 = t.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * t.field_j;
        }
        if (param2 + var5 > t.field_a) {
          var5 = var5 - (param2 + var5 - t.field_a);
        }
        if (param1 < t.field_e) {
          var9Lifetime1 = t.field_e - param1;
          var6 = var6 - var9Lifetime1;
          param1 = t.field_e;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param1 + var6 > t.field_h) {
          var9Lifetime2 = param1 + var6 - t.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        fi.a(t.field_k, param0.field_G, 0, var4, var3, var6, var5, var7, var8);
    }

    final static void a(int param0, int param1, int param2, tf param3) {
        fi.a(param0, param1, param2, param3, 65280);
    }

    final static void a(jl param0, String param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        param0.b(param1, param4, param5, param6, param7, param8);
        param0.b(param2, param4 + param3, param5, param6, param7, param8);
    }

    final static tf a(int param0) {
        int var2 = 0;
        int var3 = 0;
        tf var1 = new tf(param0, 1);
        for (var2 = 0; var2 < param0; var2++) {
          var3 = ((var2 > param0 / 2 - 1 ? param0 - var2 - 1 : var2) << 9) / param0;
          var1.field_G[var2] = 65793 * var3;
        }
        return var1;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var10;
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = -param5; var12 < 0; var12++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var9 = param0[param4];
              var10 = 256 - (param2 & 255);
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (var9 & 16711935) * var10 >> 8 & 16711935 | (var9 & 65280) * var10 >> 8 & 65280;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final static void a(tf param0, int param1, int param2, int param3, int param4) {
        int var13 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        param1 = param1 + param0.field_D;
        param2 = param2 + param0.field_y;
        int var5 = param1 + param2 * t.field_j;
        int var6 = 0;
        int var7 = param0.field_E;
        int var8 = param0.field_F;
        int var9 = t.field_j - var8;
        int var10 = 0;
        int var11 = param3 << 8;
        int var12 = (param4 - param3 << 8) / var7;
        if (param2 < t.field_f) {
          var11 = var11 + (t.field_f - param2) * var12;
          var13 = t.field_f - param2;
          var7 = var7 - var13;
          param2 = t.field_f;
          var6 = var6 + var13 * var8;
          var5 = var5 + var13 * t.field_j;
        }
        if (param2 + var7 > t.field_a) {
          var7 = var7 - (param2 + var7 - t.field_a);
        }
        if (param1 < t.field_e) {
          var13Lifetime1 = t.field_e - param1;
          var8 = var8 - var13Lifetime1;
          param1 = t.field_e;
          var6 = var6 + var13Lifetime1;
          var5 = var5 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
        }
        if (param1 + var8 > t.field_h) {
          var13Lifetime2 = param1 + var8 - t.field_h;
          var8 = var8 - var13Lifetime2;
          var10 = var10 + var13Lifetime2;
          var9 = var9 + var13Lifetime2;
        }
        if (var8 <= 0 ||
          var7 <= 0) {
          return;
        }
        fi.a(t.field_k, param0.field_G, 0, var6, var5, var8, var7, var9, var10, var11, var12);
    }
}
