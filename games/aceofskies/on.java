/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    private static bd field_a;

    private final static byte e(bd param0) {
        return (byte)on.a(8, param0);
    }

    private final static void a(int[] param0, int[] param1, int[] param2, byte[] param3, int param4, int param5, int param6) {
        int var7 = 0;
        for (int var8 = param4; var8 <= param5; var8++) {
          for (int var9 = 0; var9 < param6; var9++) {
            if (param3[var9] == var8) {
              param2[var7] = var9;
              var7++;
            }
          }
        }
        for (int var8Lifetime1 = 0; var8Lifetime1 < 23; var8Lifetime1++) {
          param1[var8Lifetime1] = 0;
        }
        for (int var8Lifetime2 = 0; var8Lifetime2 < param6; var8Lifetime2++) {
          int dupTemp$0 = param3[var8Lifetime2] + 1;
          param1[dupTemp$0] = param1[dupTemp$0] + 1;
        }
        for (int var8Lifetime3 = 1; var8Lifetime3 < 23; var8Lifetime3++) {
          param1[var8Lifetime3] = param1[var8Lifetime3] + param1[var8Lifetime3 - 1];
        }
        for (int var8Lifetime4 = 0; var8Lifetime4 < 23; var8Lifetime4++) {
          param0[var8Lifetime4] = 0;
        }
        int var10 = 0;
        for (int var8Lifetime5 = param4; var8Lifetime5 <= param5; var8Lifetime5++) {
          var10 = var10 + (param1[var8Lifetime5 + 1] - param1[var8Lifetime5]);
          param0[var8Lifetime5] = var10 - 1;
          var10 = var10 << 1;
        }
        for (int var8Lifetime6 = param4 + 1; var8Lifetime6 <= param5; var8Lifetime6++) {
          param1[var8Lifetime6] = (param0[var8Lifetime6 - 1] + 1 << 1) - param1[var8Lifetime6];
        }
    }

    final static int a(byte[] param0, int param1, byte[] param2, int param3, int param4) {
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = field_a;
        synchronized (var5) {
          field_a.field_p = param2;
          field_a.field_i = param4;
          field_a.field_s = param0;
          field_a.field_j = 0;
          field_a.field_e = param1;
          field_a.field_y = 0;
          field_a.field_z = 0;
          field_a.field_b = 0;
          field_a.field_c = 0;
          on.c(field_a);
          param1 = param1 - field_a.field_e;
          field_a.field_p = null;
          field_a.field_s = null;
          stackIn_2_0 = param1;
        }
        return stackIn_2_0;
    }

    private final static byte a(bd param0) {
        return (byte)on.a(1, param0);
    }

    private final static void d(bd param0) {
        int var2 = param0.field_f;
        int var3 = param0.field_k;
        int var4 = param0.field_h;
        int var5 = param0.field_a;
        int[] var15 = oc.field_g;
        int[] var14 = var15;
        int[] var6 = var14;
        int var7 = param0.field_q;
        byte[] var8 = param0.field_s;
        int var9 = param0.field_j;
        int var10 = param0.field_e;
        int var11 = var10;
        int var12 = param0.field_A + 1;
        scanLoop1: while (true) {
          if (var3 > 0) {
            while (true) {
              if (var10 == 0) {
                break scanLoop1;
              }
              if (var3 != 1) {
                var8[var9] = (byte)var2;
                var3--;
                var9++;
                var10--;
                continue;
              }
              break;
            }
            if (var10 == 0) {
              var3 = 1;
              break scanLoop1;
            }
            var8[var9] = (byte)var2;
            var9++;
            var10--;
          }
          while (var4 != var12) {
            int[] var15Lifetime1 = var14;
            var2 = (byte)var5;
            var7 = var15Lifetime1[var7];
            int var1 = (byte)var7;
            var7 = var7 >> 8;
            var4++;
            if (var1 == var5) {
              if (var4 != var12) {
                var3 = 2;
                var7 = var15Lifetime1[var7];
                var1 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                if (var4 == var12) {
                  continue scanLoop1;
                }
                if (var1 != var5) {
                  var5 = var1;
                  continue scanLoop1;
                }
                var3 = 3;
                var7 = var15Lifetime1[var7];
                var1 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                if (var4 == var12) {
                  continue scanLoop1;
                }
                if (var1 != var5) {
                  var5 = var1;
                  continue scanLoop1;
                }
                var7 = var15Lifetime1[var7];
                var1 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                var3 = (var1 & 255) + 4;
                var7 = var15Lifetime1[var7];
                var5 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                continue scanLoop1;
              }
              if (var10 == 0) {
                var3 = 1;
                break scanLoop1;
              }
            } else {
              var5 = var1;
              if (var10 == 0) {
                var3 = 1;
                break scanLoop1;
              }
            }
            var8[var9] = (byte)var2;
            var9++;
            var10--;
          }
          var3 = 0;
          break;
        }
        int var13 = param0.field_c;
        param0.field_c = param0.field_c + (var11 - var10);
        if (param0.field_c >= var13) {
        }
        param0.field_f = (byte) var2;
        param0.field_k = var3;
        param0.field_h = var4;
        param0.field_a = var5;
        oc.field_g = var6;
        param0.field_q = var7;
        param0.field_s = var8;
        param0.field_j = var9;
        param0.field_e = var10;
        return;
    }

    private final static int a(int param0, bd param1) {
        while (param1.field_y < param0) {
          param1.field_z = param1.field_z << 8 | param1.field_p[param1.field_i] & 255;
          param1.field_y = param1.field_y + 8;
          param1.field_i = param1.field_i + 1;
          param1.field_b = param1.field_b + 1;
          if (param1.field_b != 0) {
            continue;
          }
        }
        int var2 = param1.field_z >> param1.field_y - param0 & (1 << param0) - 1;
        param1.field_y = param1.field_y - param0;
        return var2;
    }

    private final static void b(bd param0) {
        param0.field_w = 0;
        for (int var1 = 0; var1 < 256; var1++) {
          if (param0.field_r[var1]) {
            param0.field_m[param0.field_w] = (byte)var1;
            param0.field_w = param0.field_w + 1;
          }
        }
    }

    public static void a() {
        field_a = null;
    }

    private final static void c(bd param0) {
        int var27;
        int var28;
        int var30;
        int var4 = 0;
        int var5 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        Object var24 = null;
        Object var25 = null;
        param0.field_G = 1;
        if (oc.field_g == null) {
          oc.field_g = new int[param0.field_G * 100000];
        }
        int var26 = 1;
        while (true) {
          if (var26 == 0) {
            return;
          }
          int var1 = on.e(param0);
          if (var1 == 23) {
            return;
          }
          var1 = on.e(param0);
          var1 = on.e(param0);
          var1 = on.e(param0);
          var1 = on.e(param0);
          var1 = on.e(param0);
          var1 = on.e(param0);
          var1 = on.e(param0);
          var1 = on.e(param0);
          var1 = on.e(param0);
          var1 = on.a(param0);
          if (var1 == 0) {
          }
          param0.field_d = 0;
          var1 = on.e(param0);
          param0.field_d = param0.field_d << 8 | var1 & 255;
          var1 = on.e(param0);
          param0.field_d = param0.field_d << 8 | var1 & 255;
          var1 = on.e(param0);
          param0.field_d = param0.field_d << 8 | var1 & 255;
          for (var4 = 0; var4 < 16; var4++) {
            var1 = on.a(param0);
            if (var1 != 1) {
              param0.field_n[var4] = false;
            } else {
              param0.field_n[var4] = true;
            }
          }
          for (var4 = 0; var4 < 256; var4++) {
            param0.field_r[var4] = false;
          }
          for (var4 = 0; var4 < 16; var4++) {
            if (param0.field_n[var4]) {
              for (var5 = 0; var5 < 16; var5++) {
                var1 = on.a(param0);
                if (var1 == 1) {
                  param0.field_r[var4 * 16 + var5] = true;
                }
              }
            }
          }
          on.b(param0);
          int var7 = param0.field_w + 2;
          int var8 = on.a(3, param0);
          int var9 = on.a(15, param0);
          var4 = 0;
          while (var4 < var9) {
            var5 = 0;
            while (true) {
              var1 = on.a(param0);
              if (var1 != 0) {
                var5++;
                continue;
              }
              break;
            }
            param0.field_E[var4] = (byte)var5;
            var4++;
          }
          byte[] var37 = new byte[6];
          byte[] var36 = var37;
          byte[] var27_ref_byte__ = var36;
          int var29 = 0;
          while (var29 < var8) {
            var27_ref_byte__[var29] = (byte)var29;
            var29 = (byte)(var29 + 1);
          }
          for (var4 = 0; var4 < var9; var4++) {
            var29 = param0.field_E[var4];
            var28 = var37[var29];
            while (var29 > 0) {
              var27_ref_byte__[var29] = var27_ref_byte__[var29 - 1];
              var29 = (byte)(var29 - 1);
            }
            var27_ref_byte__[0] = (byte)var28;
            param0.field_v[var4] = (byte)var28;
          }
          int var6 = 0;
          while (var6 < var8) {
            int var17 = on.a(5, param0);
            var4 = 0;
            while (true) {
              if (var4 >= var7) {
                var6++;
                break;
              }
              while (true) {
                var1 = on.a(param0);
                if (var1 == 0) {
                  param0.field_H[var6][var4] = (byte)var17;
                  var4++;
                  break;
                }
                var1 = on.a(param0);
                if (var1 != 0) {
                  var17--;
                  continue;
                }
                var17++;
              }
            }
          }
          for (var6 = 0; var6 < var8; var6++) {
            int var2 = 32;
            int var3 = 0;
            for (var4 = 0; var4 < var7; var4++) {
              if (param0.field_H[var6][var4] > var3) {
                var3 = param0.field_H[var6][var4];
              }
              if (param0.field_H[var6][var4] < var2) {
                var2 = param0.field_H[var6][var4];
              }
            }
            on.a(param0.field_t[var6], param0.field_B[var6], param0.field_l[var6], param0.field_H[var6], var2, var3, var7);
            param0.field_u[var6] = var2;
          }
          int var10 = param0.field_w + 1;
          int var11 = -1;
          int var12 = 0;
          for (var4 = 0; var4 <= 255; var4++) {
            param0.field_F[var4] = 0;
          }
          var29 = 4095;
          for (var27 = 15; var27 >= 0; var27--) {
            for (var28 = 15; var28 >= 0; var28--) {
              param0.field_x[var29] = (byte)(var27 * 16 + var28);
              var29--;
            }
            param0.field_g[var27] = var29 + 1;
          }
          int var14 = 0;
          if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = param0.field_v[var11];
            var22 = param0.field_u[var21];
            var23 = param0.field_t[var21];
            var25 = param0.field_l[var21];
            var24 = param0.field_B[var21];
          }
          var12--;
          int var18 = var22;
          int var19 = on.a(var18, param0);
          while (var19 > ((int[]) (var23))[var18]) {
            var18++;
            var20 = on.a(param0);
            var19 = var19 << 1 | var20;
          }
          int var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
          while (true) {
            if (var13 == var10) {
              param0.field_k = 0;
              param0.field_f = (byte) 0;
              param0.field_o[0] = 0;
              for (var4 = 1; var4 <= 256; var4++) {
                param0.field_o[var4] = param0.field_F[var4 - 1];
              }
              for (var4 = 1; var4 <= 256; var4++) {
                param0.field_o[var4] = param0.field_o[var4] + param0.field_o[var4 - 1];
              }
              for (var4 = 0; var4 < var14; var4++) {
                var1 = (byte)(oc.field_g[var4] & 255);
                int dupTemp$1 = param0.field_o[var1 & 255];
                oc.field_g[dupTemp$1] = oc.field_g[dupTemp$1] | var4 << 8;
                param0.field_o[var1 & 255] = param0.field_o[var1 & 255] + 1;
              }
              param0.field_q = oc.field_g[param0.field_d] >> 8;
              param0.field_h = 0;
              param0.field_q = oc.field_g[param0.field_q];
              param0.field_a = (byte)(param0.field_q & 255);
              param0.field_q = param0.field_q >> 8;
              param0.field_h = param0.field_h + 1;
              param0.field_A = var14;
              on.d(param0);
              if (param0.field_h == param0.field_A + 1 &&
                param0.field_k == 0) {
                var26 = 1;
                break;
              }
              var26 = 0;
              break;
            }
            if (var13 != 0 &&
              var13 != 1) {
              int var33 = var13 - 1;
              if (var33 < 16) {
                var30 = param0.field_g[0];
                var1 = param0.field_x[var30 + var33];
                while (var33 > 3) {
                  int var34 = var30 + var33;
                  param0.field_x[var34] = param0.field_x[var34 - 1];
                  param0.field_x[var34 - 1] = param0.field_x[var34 - 2];
                  param0.field_x[var34 - 2] = param0.field_x[var34 - 3];
                  param0.field_x[var34 - 3] = param0.field_x[var34 - 4];
                  var33 -= 4;
                }
                while (var33 > 0) {
                  param0.field_x[var30 + var33] = param0.field_x[var30 + var33 - 1];
                  var33--;
                }
                param0.field_x[var30] = (byte)var1;
              } else {
                int var31 = var33 / 16;
                int var32 = var33 % 16;
                int var35 = param0.field_g[var31] + var32;
                var30 = var35;
                var1 = param0.field_x[var35];
                while (var35 > param0.field_g[var31]) {
                  param0.field_x[var35] = param0.field_x[var35 - 1];
                  var35--;
                }
                param0.field_g[var31] = param0.field_g[var31] + 1;
                while (var31 > 0) {
                  param0.field_g[var31] = param0.field_g[var31] - 1;
                  param0.field_x[param0.field_g[var31]] = param0.field_x[param0.field_g[var31 - 1] + 16 - 1];
                  var31--;
                }
                param0.field_g[0] = param0.field_g[0] - 1;
                param0.field_x[param0.field_g[0]] = (byte)var1;
                if (param0.field_g[0] == 0) {
                  var29 = 4095;
                  for (var27 = 15; var27 >= 0; var27--) {
                    for (var28 = 15; var28 >= 0; var28--) {
                      param0.field_x[var29] = param0.field_x[param0.field_g[var27] + var28];
                      var29--;
                    }
                    param0.field_g[var27] = var29 + 1;
                  }
                }
              }
              int dupTemp$0 = param0.field_m[var1 & 255] & 255;
              param0.field_F[dupTemp$0] = param0.field_F[dupTemp$0] + 1;
              oc.field_g[var14] = param0.field_m[var1 & 255] & 255;
              var14++;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = param0.field_v[var11];
                var22 = param0.field_u[var21];
                var23 = param0.field_t[var21];
                var25 = param0.field_l[var21];
                var24 = param0.field_B[var21];
              }
              var12--;
              var18 = var22;
              var19 = on.a(var18, param0);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = on.a(param0);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
              continue;
            }
            int var15 = -1;
            int var16 = 1;
            do {
              if (var13 == 0) {
                var15 = var15 + 1 * var16;
              } else if (var13 == 1) {
                var15 = var15 + 2 * var16;
              }
              var16 = var16 * 2;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = param0.field_v[var11];
                var22 = param0.field_u[var21];
                var23 = param0.field_t[var21];
                var25 = param0.field_l[var21];
                var24 = param0.field_B[var21];
              }
              var12--;
              var18 = var22;
              var19 = on.a(var18, param0);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = on.a(param0);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
            } while (var13 == 0 ||
              var13 == 1);
            var15++;
            var1 = param0.field_m[param0.field_x[param0.field_g[0]] & 255];
            param0.field_F[var1 & 255] = param0.field_F[var1 & 255] + var15;
            while (var15 > 0) {
              oc.field_g[var14] = var1 & 255;
              var14++;
              var15--;
            }
          }
        }
    }

    static {
        field_a = new bd();
    }
}
