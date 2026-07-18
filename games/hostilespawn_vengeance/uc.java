/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static bd field_a;
    static String field_d;
    static volatile long field_c;
    static int field_b;

    public static void a() {
        field_a = null;
        field_d = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        pf var5_ref_pf = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        double var11 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        pf var18 = null;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException decompiledCaughtException = null;
        var20 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var1_int = 0 / ((62 - param0) / 57);
            cb.field_d = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var2 = wj.field_J.length;
            var24 = new int[var2];
            var23 = var24;
            var22 = var23;
            var21 = var22;
            var3 = var21;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2) {
                L2: {
                  var4 = cb.field_d[9] >> 8;
                  var5 = cb.field_d[10] >> 8;
                  var6 = cb.field_d[11] >> 8;
                  var7 = tk.field_e << 4;
                  var8 = 0;
                  var9 = ni.a(var7, 8191) >> 8;
                  var10 = of.a((byte) -121, var7) >> 8;
                  if (-1 == j.field_c) {
                    break L2;
                  } else {
                    if (rb.field_m == -1) {
                      break L2;
                    } else {
                      var9 = -rb.field_m + 240;
                      var10 = -128;
                      var8 = j.field_c - 320;
                      break L2;
                    }
                  }
                }
                var11 = 256.0 / Math.sqrt((double)(var8 * var8 - -(var9 * var9) - -(var10 * var10)));
                var9 = (int)((double)var9 * var11);
                var10 = (int)((double)var10 * var11);
                var8 = (int)((double)var8 * var11);
                var13 = -var4 + var8;
                var14 = var9 - var5;
                var15 = var10 + -var6;
                var11 = 256.0 / Math.sqrt((double)(var15 * var15 + (var14 * var14 + var13 * var13)));
                var13 = (int)((double)var13 * var11);
                var14 = (int)((double)var14 * var11);
                var15 = (int)((double)var15 * var11);
                var16 = 0;
                L3: while (true) {
                  if (wj.field_J.length <= var16) {
                    break L0;
                  } else {
                    var17 = 0;
                    var18_int = 1;
                    L4: while (true) {
                      if (wj.field_J.length <= var18_int) {
                        var24[var17] = -2147483648;
                        var18 = wj.field_J[var17];
                        wg.c(var17, -5878);
                        var19 = 0;
                        L5: while (true) {
                          if (3 <= var19) {
                            el.a(vg.field_a, cb.field_d, -12705, true, var18, false, false);
                            di.a(var10, var9, var18, var13, -536936193, var8, var14, var15);
                            var16++;
                            continue L3;
                          } else {
                            vg.field_a[var19] = vg.field_a[var19] + of.field_f[var16][var19];
                            var19++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var24[var18_int] > var24[var17]) {
                            var17 = var18_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var18_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var5_ref_pf = wj.field_J[var4];
                var5_ref_pf.c(-103);
                wg.c(var4, -5878);
                var6 = var5_ref_pf.field_J + var5_ref_pf.field_d >> 1;
                var7 = var5_ref_pf.field_C + var5_ref_pf.field_a >> 1;
                var8 = var5_ref_pf.field_D + var5_ref_pf.field_t >> 1;
                var9 = cb.field_d[9] >> 2;
                var10 = cb.field_d[10] >> 2;
                var11_int = cb.field_d[11] >> 2;
                var12 = var9 * vg.field_a[3] - (-(var10 * vg.field_a[4]) - vg.field_a[5] * var11_int) >> 14;
                var13 = vg.field_a[6] * var9 + vg.field_a[7] * var10 + vg.field_a[8] * var11_int >> 14;
                var14 = vg.field_a[9] * var9 + (var10 * vg.field_a[10] + var11_int * vg.field_a[11]) >> 14;
                var3[var4] = var14 * var8 + (var13 * var7 + var12 * var6) >> 16;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "uc.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0L;
        field_b = 0;
    }
}
