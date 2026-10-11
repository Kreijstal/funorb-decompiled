/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    private static th field_a;

    private final static int a(int param0, th param1) {
        int var2;
        while (param1.field_F < param0) {
          param1.field_m = param1.field_m << 8 | param1.field_z[param1.field_e] & 255;
          param1.field_F = param1.field_F + 8;
          param1.field_e = param1.field_e + 1;
          param1.field_A = param1.field_A + 1;
          if (param1.field_A != 0) {
            continue;
          }
        }
        var2 = param1.field_m >> param1.field_F - param0 & (1 << param0) - 1;
        param1.field_F = param1.field_F - param0;
        return var2;
    }

    private final static byte a(th param0) {
        return (byte)i.a(8, param0);
    }

    final static int a(byte[] param0, int param1, byte[] param2, int param3, int param4) {
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        var5 = field_a;
        synchronized (var5) {
          field_a.field_z = param2;
          field_a.field_e = param4;
          field_a.field_D = param0;
          field_a.field_C = 0;
          field_a.field_J = param1;
          field_a.field_F = 0;
          field_a.field_m = 0;
          field_a.field_A = 0;
          field_a.field_n = 0;
          i.b(field_a);
          param1 = param1 - field_a.field_J;
          field_a.field_z = null;
          field_a.field_D = null;
          stackIn_2_0 = param1;
        }
        return stackIn_2_0;
    }

    private final static void a(int[] param0, int[] param1, int[] param2, byte[] param3, int param4, int param5, int param6) {
        int var9 = 0;
        int dupTemp$0 = 0;
        int var7;
        int var8;
        int var10;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        var7 = 0;
        for (var8 = param4; var8 <= param5; var8++) {
          for (var9 = 0; var9 < param6; var9++) {
            if (param3[var9] == var8) {
              param2[var7] = var9;
              var7++;
            }
          }
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < 23; var8Lifetime1++) {
          param1[var8Lifetime1] = 0;
        }
        for (var8Lifetime2 = 0; var8Lifetime2 < param6; var8Lifetime2++) {
          dupTemp$0 = param3[var8Lifetime2] + 1;
          param1[dupTemp$0] = param1[dupTemp$0] + 1;
        }
        for (var8Lifetime3 = 1; var8Lifetime3 < 23; var8Lifetime3++) {
          param1[var8Lifetime3] = param1[var8Lifetime3] + param1[var8Lifetime3 - 1];
        }
        for (var8Lifetime4 = 0; var8Lifetime4 < 23; var8Lifetime4++) {
          param0[var8Lifetime4] = 0;
        }
        var10 = 0;
        for (var8Lifetime5 = param4; var8Lifetime5 <= param5; var8Lifetime5++) {
          var10 = var10 + (param1[var8Lifetime5 + 1] - param1[var8Lifetime5]);
          param0[var8Lifetime5] = var10 - 1;
          var10 = var10 << 1;
        }
        for (var8Lifetime6 = param4 + 1; var8Lifetime6 <= param5; var8Lifetime6++) {
          param1[var8Lifetime6] = (param0[var8Lifetime6 - 1] + 1 << 1) - param1[var8Lifetime6];
        }
    }

    public static void a() {
        field_a = null;
    }

    private final static byte c(th param0) {
        return (byte)i.a(1, param0);
    }

    private final static void e(th param0) {
        int var1 = 0;
        param0.field_h = 0;
        for (var1 = 0; var1 < 256; var1++) {
          if (param0.field_d[var1]) {
            param0.field_w[param0.field_h] = (byte)var1;
            param0.field_h = param0.field_h + 1;
          }
        }
    }

    private final static void d(th param0) {
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int[] var6;
        int var7;
        byte[] var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        int[] var15Lifetime1;
        var2 = param0.field_t;
        var3 = param0.field_b;
        var4 = param0.field_u;
        var5 = param0.field_l;
        var15 = bd.field_l;
        var14 = var15;
        var6 = var14;
        var7 = param0.field_k;
        var8 = param0.field_D;
        var9 = param0.field_C;
        var10 = param0.field_J;
        var11 = var10;
        var12 = param0.field_x + 1;
        L0: while (true) {
          if (var3 > 0) {
            while (true) {
              if (var10 == 0) {
                break L0;
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
              break L0;
            }
            var8[var9] = (byte)var2;
            var9++;
            var10--;
          }
          while (var4 != var12) {
            var15Lifetime1 = var14;
            var2 = (byte)var5;
            var7 = var15Lifetime1[var7];
            var1 = (byte)var7;
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
                  continue L0;
                }
                if (var1 != var5) {
                  var5 = var1;
                  continue L0;
                }
                var3 = 3;
                var7 = var15Lifetime1[var7];
                var1 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                if (var4 == var12) {
                  continue L0;
                }
                if (var1 != var5) {
                  var5 = var1;
                  continue L0;
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
                continue L0;
              }
              if (var10 == 0) {
                var3 = 1;
                break L0;
              }
            } else {
              var5 = var1;
              if (var10 == 0) {
                var3 = 1;
                break L0;
              }
            }
            var8[var9] = (byte)var2;
            var9++;
            var10--;
          }
          var3 = 0;
          break;
        }
        var13 = param0.field_n;
        param0.field_n = param0.field_n + (var11 - var10);
        if (param0.field_n >= var13) {
        }
        param0.field_t = (byte) var2;
        param0.field_b = var3;
        param0.field_u = var4;
        param0.field_l = var5;
        bd.field_l = var6;
        param0.field_k = var7;
        param0.field_D = var8;
        param0.field_C = var9;
        param0.field_J = var10;
        return;
    }

    private final static void b(th param0) {
        int dupTemp$1 = 0;
        int dupTemp$0 = 0;
        int var1;
        int var2;
        int var3;
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
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        Object var23;
        Object var24;
        Object var25;
        int var26;
        byte[] var27_ref_byte__;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        byte[] var36;
        byte[] var37;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        var11 = 0;
        var12 = 0;
        var13 = 0;
        var14 = 0;
        var15 = 0;
        var16 = 0;
        var17 = 0;
        var18 = 0;
        var19 = 0;
        var20 = 0;
        var21 = 0;
        var22 = 0;
        var23 = null;
        var24 = null;
        var25 = null;
        param0.field_i = 1;
        if (bd.field_l == null) {
          bd.field_l = new int[param0.field_i * 100000];
        }
        var26 = 1;
        while (true) {
          if (var26 == 0) {
            return;
          }
          var1 = i.a(param0);
          if (var1 == 23) {
            return;
          }
          var1 = i.a(param0);
          var1 = i.a(param0);
          var1 = i.a(param0);
          var1 = i.a(param0);
          var1 = i.a(param0);
          var1 = i.a(param0);
          var1 = i.a(param0);
          var1 = i.a(param0);
          var1 = i.a(param0);
          var1 = i.c(param0);
          if (var1 == 0) {
          }
          param0.field_g = 0;
          var1 = i.a(param0);
          param0.field_g = param0.field_g << 8 | var1 & 255;
          var1 = i.a(param0);
          param0.field_g = param0.field_g << 8 | var1 & 255;
          var1 = i.a(param0);
          param0.field_g = param0.field_g << 8 | var1 & 255;
          for (var4 = 0; var4 < 16; var4++) {
            var1 = i.c(param0);
            if (var1 != 1) {
              param0.field_f[var4] = false;
            } else {
              param0.field_f[var4] = true;
            }
          }
          for (var4 = 0; var4 < 256; var4++) {
            param0.field_d[var4] = false;
          }
          for (var4 = 0; var4 < 16; var4++) {
            if (param0.field_f[var4]) {
              for (var5 = 0; var5 < 16; var5++) {
                var1 = i.c(param0);
                if (var1 == 1) {
                  param0.field_d[var4 * 16 + var5] = true;
                }
              }
            }
          }
          i.e(param0);
          var7 = param0.field_h + 2;
          var8 = i.a(3, param0);
          var9 = i.a(15, param0);
          var4 = 0;
          while (var4 < var9) {
            var5 = 0;
            while (true) {
              var1 = i.c(param0);
              if (var1 != 0) {
                var5++;
                continue;
              }
              break;
            }
            param0.field_E[var4] = (byte)var5;
            var4++;
          }
          var37 = new byte[6];
          var36 = var37;
          var27_ref_byte__ = var36;
          var29 = 0;
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
            param0.field_s[var4] = (byte)var28;
          }
          var6 = 0;
          while (var6 < var8) {
            var17 = i.a(5, param0);
            var4 = 0;
            while (true) {
              if (var4 >= var7) {
                var6++;
                break;
              }
              while (true) {
                var1 = i.c(param0);
                if (var1 == 0) {
                  param0.field_q[var6][var4] = (byte)var17;
                  var4++;
                  break;
                }
                var1 = i.c(param0);
                if (var1 != 0) {
                  var17--;
                  continue;
                }
                var17++;
              }
            }
          }
          for (var6 = 0; var6 < var8; var6++) {
            var2 = 32;
            var3 = 0;
            for (var4 = 0; var4 < var7; var4++) {
              if (param0.field_q[var6][var4] > var3) {
                var3 = param0.field_q[var6][var4];
              }
              if (param0.field_q[var6][var4] < var2) {
                var2 = param0.field_q[var6][var4];
              }
            }
            i.a(param0.field_H[var6], param0.field_a[var6], param0.field_I[var6], param0.field_q[var6], var2, var3, var7);
            param0.field_c[var6] = var2;
          }
          var10 = param0.field_h + 1;
          var11 = -1;
          var12 = 0;
          for (var4 = 0; var4 <= 255; var4++) {
            param0.field_j[var4] = 0;
          }
          var29 = 4095;
          for (var27 = 15; var27 >= 0; var27--) {
            for (var28 = 15; var28 >= 0; var28--) {
              param0.field_o[var29] = (byte)(var27 * 16 + var28);
              var29--;
            }
            param0.field_r[var27] = var29 + 1;
          }
          var14 = 0;
          if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = param0.field_s[var11];
            var22 = param0.field_c[var21];
            var23 = param0.field_H[var21];
            var25 = param0.field_I[var21];
            var24 = param0.field_a[var21];
          }
          var12--;
          var18 = var22;
          var19 = i.a(var18, param0);
          while (var19 > ((int[]) (var23))[var18]) {
            var18++;
            var20 = i.c(param0);
            var19 = var19 << 1 | var20;
          }
          var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
          while (true) {
            if (var13 == var10) {
              param0.field_b = 0;
              param0.field_t = (byte) 0;
              param0.field_B[0] = 0;
              for (var4 = 1; var4 <= 256; var4++) {
                param0.field_B[var4] = param0.field_j[var4 - 1];
              }
              for (var4 = 1; var4 <= 256; var4++) {
                param0.field_B[var4] = param0.field_B[var4] + param0.field_B[var4 - 1];
              }
              for (var4 = 0; var4 < var14; var4++) {
                var1 = (byte)(bd.field_l[var4] & 255);
                dupTemp$1 = param0.field_B[var1 & 255];
                bd.field_l[dupTemp$1] = bd.field_l[dupTemp$1] | var4 << 8;
                param0.field_B[var1 & 255] = param0.field_B[var1 & 255] + 1;
              }
              param0.field_k = bd.field_l[param0.field_g] >> 8;
              param0.field_u = 0;
              param0.field_k = bd.field_l[param0.field_k];
              param0.field_l = (byte)(param0.field_k & 255);
              param0.field_k = param0.field_k >> 8;
              param0.field_u = param0.field_u + 1;
              param0.field_x = var14;
              i.d(param0);
              if (param0.field_u == param0.field_x + 1 &&
                param0.field_b == 0) {
                var26 = 1;
                break;
              }
              var26 = 0;
              break;
            }
            if (var13 != 0 &&
              var13 != 1) {
              var33 = var13 - 1;
              if (var33 < 16) {
                var30 = param0.field_r[0];
                var1 = param0.field_o[var30 + var33];
                while (var33 > 3) {
                  var34 = var30 + var33;
                  param0.field_o[var34] = param0.field_o[var34 - 1];
                  param0.field_o[var34 - 1] = param0.field_o[var34 - 2];
                  param0.field_o[var34 - 2] = param0.field_o[var34 - 3];
                  param0.field_o[var34 - 3] = param0.field_o[var34 - 4];
                  var33 -= 4;
                }
                while (var33 > 0) {
                  param0.field_o[var30 + var33] = param0.field_o[var30 + var33 - 1];
                  var33--;
                }
                param0.field_o[var30] = (byte)var1;
              } else {
                var31 = var33 / 16;
                var32 = var33 % 16;
                var35 = param0.field_r[var31] + var32;
                var30 = var35;
                var1 = param0.field_o[var35];
                while (var35 > param0.field_r[var31]) {
                  param0.field_o[var35] = param0.field_o[var35 - 1];
                  var35--;
                }
                param0.field_r[var31] = param0.field_r[var31] + 1;
                while (var31 > 0) {
                  param0.field_r[var31] = param0.field_r[var31] - 1;
                  param0.field_o[param0.field_r[var31]] = param0.field_o[param0.field_r[var31 - 1] + 16 - 1];
                  var31--;
                }
                param0.field_r[0] = param0.field_r[0] - 1;
                param0.field_o[param0.field_r[0]] = (byte)var1;
                if (param0.field_r[0] == 0) {
                  var29 = 4095;
                  for (var27 = 15; var27 >= 0; var27--) {
                    for (var28 = 15; var28 >= 0; var28--) {
                      param0.field_o[var29] = param0.field_o[param0.field_r[var27] + var28];
                      var29--;
                    }
                    param0.field_r[var27] = var29 + 1;
                  }
                }
              }
              dupTemp$0 = param0.field_w[var1 & 255] & 255;
              param0.field_j[dupTemp$0] = param0.field_j[dupTemp$0] + 1;
              bd.field_l[var14] = param0.field_w[var1 & 255] & 255;
              var14++;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = param0.field_s[var11];
                var22 = param0.field_c[var21];
                var23 = param0.field_H[var21];
                var25 = param0.field_I[var21];
                var24 = param0.field_a[var21];
              }
              var12--;
              var18 = var22;
              var19 = i.a(var18, param0);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = i.c(param0);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
              continue;
            }
            var15 = -1;
            var16 = 1;
            do {
              if (var13 != 0) {
                if (var13 == 1) {
                  var15 = var15 + 2 * var16;
                }
              } else {
                var15 = var15 + 1 * var16;
              }
              var16 = var16 * 2;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = param0.field_s[var11];
                var22 = param0.field_c[var21];
                var23 = param0.field_H[var21];
                var25 = param0.field_I[var21];
                var24 = param0.field_a[var21];
              }
              var12--;
              var18 = var22;
              var19 = i.a(var18, param0);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = i.c(param0);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
            } while (var13 == 0 ||
              var13 == 1);
            var15++;
            var1 = param0.field_w[param0.field_o[param0.field_r[0]] & 255];
            param0.field_j[var1 & 255] = param0.field_j[var1 & 255] + var15;
            while (var15 > 0) {
              bd.field_l[var14] = var1 & 255;
              var14++;
              var15--;
            }
          }
        }
    }

    static {
        field_a = new th();
    }
}
