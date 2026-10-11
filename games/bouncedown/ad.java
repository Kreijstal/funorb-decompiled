/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private static uj field_a;

    public static void a() {
        field_a = null;
    }

    private final static int a(int param0, uj param1) {
        int var2;
        while (param1.field_i < param0) {
          param1.field_o = param1.field_o << 8 | param1.field_r[param1.field_t] & 255;
          param1.field_i = param1.field_i + 8;
          param1.field_t = param1.field_t + 1;
          param1.field_D = param1.field_D + 1;
          if (param1.field_D != 0) {
            continue;
          }
        }
        var2 = param1.field_o >> param1.field_i - param0 & (1 << param0) - 1;
        param1.field_i = param1.field_i - param0;
        return var2;
    }

    private final static void e(uj param0) {
        int var1 = 0;
        param0.field_b = 0;
        for (var1 = 0; var1 < 256; var1++) {
          if (param0.field_d[var1]) {
            param0.field_a[param0.field_b] = (byte)var1;
            param0.field_b = param0.field_b + 1;
          }
        }
    }

    private final static void b(uj param0) {
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
        param0.field_w = 1;
        if (qi.field_r == null) {
          qi.field_r = new int[param0.field_w * 100000];
        }
        var26 = 1;
        while (true) {
          if (var26 == 0) {
            return;
          }
          var1 = ad.d(param0);
          if (var1 == 23) {
            return;
          }
          var1 = ad.d(param0);
          var1 = ad.d(param0);
          var1 = ad.d(param0);
          var1 = ad.d(param0);
          var1 = ad.d(param0);
          var1 = ad.d(param0);
          var1 = ad.d(param0);
          var1 = ad.d(param0);
          var1 = ad.d(param0);
          var1 = ad.a(param0);
          if (var1 == 0) {
          }
          param0.field_u = 0;
          var1 = ad.d(param0);
          param0.field_u = param0.field_u << 8 | var1 & 255;
          var1 = ad.d(param0);
          param0.field_u = param0.field_u << 8 | var1 & 255;
          var1 = ad.d(param0);
          param0.field_u = param0.field_u << 8 | var1 & 255;
          for (var4 = 0; var4 < 16; var4++) {
            var1 = ad.a(param0);
            if (var1 != 1) {
              param0.field_n[var4] = false;
            } else {
              param0.field_n[var4] = true;
            }
          }
          for (var4 = 0; var4 < 256; var4++) {
            param0.field_d[var4] = false;
          }
          for (var4 = 0; var4 < 16; var4++) {
            if (param0.field_n[var4]) {
              for (var5 = 0; var5 < 16; var5++) {
                var1 = ad.a(param0);
                if (var1 == 1) {
                  param0.field_d[var4 * 16 + var5] = true;
                }
              }
            }
          }
          ad.e(param0);
          var7 = param0.field_b + 2;
          var8 = ad.a(3, param0);
          var9 = ad.a(15, param0);
          var4 = 0;
          while (var4 < var9) {
            var5 = 0;
            while (true) {
              var1 = ad.a(param0);
              if (var1 != 0) {
                var5++;
                continue;
              }
              break;
            }
            param0.field_c[var4] = (byte)var5;
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
            var29 = param0.field_c[var4];
            var28 = var37[var29];
            while (var29 > 0) {
              var27_ref_byte__[var29] = var27_ref_byte__[var29 - 1];
              var29 = (byte)(var29 - 1);
            }
            var27_ref_byte__[0] = (byte)var28;
            param0.field_B[var4] = (byte)var28;
          }
          var6 = 0;
          while (var6 < var8) {
            var17 = ad.a(5, param0);
            var4 = 0;
            while (true) {
              if (var4 >= var7) {
                var6++;
                break;
              }
              while (true) {
                var1 = ad.a(param0);
                if (var1 == 0) {
                  param0.field_e[var6][var4] = (byte)var17;
                  var4++;
                  break;
                }
                var1 = ad.a(param0);
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
              if (param0.field_e[var6][var4] > var3) {
                var3 = param0.field_e[var6][var4];
              }
              if (param0.field_e[var6][var4] < var2) {
                var2 = param0.field_e[var6][var4];
              }
            }
            ad.a(param0.field_p[var6], param0.field_y[var6], param0.field_j[var6], param0.field_e[var6], var2, var3, var7);
            param0.field_g[var6] = var2;
          }
          var10 = param0.field_b + 1;
          var11 = -1;
          var12 = 0;
          for (var4 = 0; var4 <= 255; var4++) {
            param0.field_A[var4] = 0;
          }
          var29 = 4095;
          for (var27 = 15; var27 >= 0; var27--) {
            for (var28 = 15; var28 >= 0; var28--) {
              param0.field_G[var29] = (byte)(var27 * 16 + var28);
              var29--;
            }
            param0.field_k[var27] = var29 + 1;
          }
          var14 = 0;
          if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = param0.field_B[var11];
            var22 = param0.field_g[var21];
            var23 = param0.field_p[var21];
            var25 = param0.field_j[var21];
            var24 = param0.field_y[var21];
          }
          var12--;
          var18 = var22;
          var19 = ad.a(var18, param0);
          while (var19 > ((int[]) (var23))[var18]) {
            var18++;
            var20 = ad.a(param0);
            var19 = var19 << 1 | var20;
          }
          var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
          while (true) {
            if (var13 == var10) {
              param0.field_l = 0;
              param0.field_z = (byte) 0;
              param0.field_H[0] = 0;
              for (var4 = 1; var4 <= 256; var4++) {
                param0.field_H[var4] = param0.field_A[var4 - 1];
              }
              for (var4 = 1; var4 <= 256; var4++) {
                param0.field_H[var4] = param0.field_H[var4] + param0.field_H[var4 - 1];
              }
              for (var4 = 0; var4 < var14; var4++) {
                var1 = (byte)(qi.field_r[var4] & 255);
                dupTemp$1 = param0.field_H[var1 & 255];
                qi.field_r[dupTemp$1] = qi.field_r[dupTemp$1] | var4 << 8;
                param0.field_H[var1 & 255] = param0.field_H[var1 & 255] + 1;
              }
              param0.field_E = qi.field_r[param0.field_u] >> 8;
              param0.field_f = 0;
              param0.field_E = qi.field_r[param0.field_E];
              param0.field_x = (byte)(param0.field_E & 255);
              param0.field_E = param0.field_E >> 8;
              param0.field_f = param0.field_f + 1;
              param0.field_F = var14;
              ad.c(param0);
              if (param0.field_f == param0.field_F + 1 &&
                param0.field_l == 0) {
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
                var30 = param0.field_k[0];
                var1 = param0.field_G[var30 + var33];
                while (var33 > 3) {
                  var34 = var30 + var33;
                  param0.field_G[var34] = param0.field_G[var34 - 1];
                  param0.field_G[var34 - 1] = param0.field_G[var34 - 2];
                  param0.field_G[var34 - 2] = param0.field_G[var34 - 3];
                  param0.field_G[var34 - 3] = param0.field_G[var34 - 4];
                  var33 -= 4;
                }
                while (var33 > 0) {
                  param0.field_G[var30 + var33] = param0.field_G[var30 + var33 - 1];
                  var33--;
                }
                param0.field_G[var30] = (byte)var1;
              } else {
                var31 = var33 / 16;
                var32 = var33 % 16;
                var35 = param0.field_k[var31] + var32;
                var30 = var35;
                var1 = param0.field_G[var35];
                while (var35 > param0.field_k[var31]) {
                  param0.field_G[var35] = param0.field_G[var35 - 1];
                  var35--;
                }
                param0.field_k[var31] = param0.field_k[var31] + 1;
                while (var31 > 0) {
                  param0.field_k[var31] = param0.field_k[var31] - 1;
                  param0.field_G[param0.field_k[var31]] = param0.field_G[param0.field_k[var31 - 1] + 16 - 1];
                  var31--;
                }
                param0.field_k[0] = param0.field_k[0] - 1;
                param0.field_G[param0.field_k[0]] = (byte)var1;
                if (param0.field_k[0] == 0) {
                  var29 = 4095;
                  for (var27 = 15; var27 >= 0; var27--) {
                    for (var28 = 15; var28 >= 0; var28--) {
                      param0.field_G[var29] = param0.field_G[param0.field_k[var27] + var28];
                      var29--;
                    }
                    param0.field_k[var27] = var29 + 1;
                  }
                }
              }
              dupTemp$0 = param0.field_a[var1 & 255] & 255;
              param0.field_A[dupTemp$0] = param0.field_A[dupTemp$0] + 1;
              qi.field_r[var14] = param0.field_a[var1 & 255] & 255;
              var14++;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = param0.field_B[var11];
                var22 = param0.field_g[var21];
                var23 = param0.field_p[var21];
                var25 = param0.field_j[var21];
                var24 = param0.field_y[var21];
              }
              var12--;
              var18 = var22;
              var19 = ad.a(var18, param0);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = ad.a(param0);
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
                var21 = param0.field_B[var11];
                var22 = param0.field_g[var21];
                var23 = param0.field_p[var21];
                var25 = param0.field_j[var21];
                var24 = param0.field_y[var21];
              }
              var12--;
              var18 = var22;
              var19 = ad.a(var18, param0);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = ad.a(param0);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
            } while (var13 == 0 ||
              var13 == 1);
            var15++;
            var1 = param0.field_a[param0.field_G[param0.field_k[0]] & 255];
            param0.field_A[var1 & 255] = param0.field_A[var1 & 255] + var15;
            while (var15 > 0) {
              qi.field_r[var14] = var1 & 255;
              var14++;
              var15--;
            }
          }
        }
    }

    private final static byte a(uj param0) {
        return (byte)ad.a(1, param0);
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

    final static int a(byte[] param0, int param1, byte[] param2, int param3, int param4) {
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        var5 = field_a;
        synchronized (var5) {
          field_a.field_r = param2;
          field_a.field_t = param4;
          field_a.field_q = param0;
          field_a.field_C = 0;
          field_a.field_h = param1;
          field_a.field_i = 0;
          field_a.field_o = 0;
          field_a.field_D = 0;
          field_a.field_m = 0;
          ad.b(field_a);
          param1 = param1 - field_a.field_h;
          field_a.field_r = null;
          field_a.field_q = null;
          stackIn_2_0 = param1;
        }
        return stackIn_2_0;
    }

    private final static byte d(uj param0) {
        return (byte)ad.a(8, param0);
    }

    private final static void c(uj param0) {
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
        var2 = param0.field_z;
        var3 = param0.field_l;
        var4 = param0.field_f;
        var5 = param0.field_x;
        var15 = qi.field_r;
        var14 = var15;
        var6 = var14;
        var7 = param0.field_E;
        var8 = param0.field_q;
        var9 = param0.field_C;
        var10 = param0.field_h;
        var11 = var10;
        var12 = param0.field_F + 1;
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
        var13 = param0.field_m;
        param0.field_m = param0.field_m + (var11 - var10);
        if (param0.field_m >= var13) {
        }
        param0.field_z = (byte) var2;
        param0.field_l = var3;
        param0.field_f = var4;
        param0.field_x = var5;
        qi.field_r = var6;
        param0.field_E = var7;
        param0.field_q = var8;
        param0.field_C = var9;
        param0.field_h = var10;
        return;
    }

    static {
        field_a = new uj();
    }
}
