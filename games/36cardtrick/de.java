/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    int field_d;
    static bk field_e;
    static int field_c;
    int field_a;
    static int field_b;

    public static void a() {
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        mg var4_ref_mg = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        mg var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = Main.field_T;
        try {
          L0: {
            rh.field_h = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = il.field_a.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = rh.field_h[9] >> 8;
                  var4 = rh.field_h[10] >> 8;
                  var5 = rh.field_h[11] >> 8;
                  var6 = h.field_F << 4;
                  var7 = 0;
                  var8 = ph.a(-35, var6) >> 8;
                  var9 = kh.a(95, var6) >> 8;
                  if (eg.field_b == -1) {
                    break L2;
                  } else {
                    if (ij.field_e != -1) {
                      var8 = 240 + -ij.field_e;
                      var9 = -128;
                      var7 = eg.field_b - 320;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var10 = 256.0 / Math.sqrt((double)(var7 * var7 - (-(var8 * var8) + -(var9 * var9))));
                  var9 = (int)((double)var9 * var10);
                  if (param0 >= 17) {
                    break L3;
                  } else {
                    int discarded$2 = de.a(93);
                    break L3;
                  }
                }
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = -var3 + var7;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12 * var12 + var13 * var13)));
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L4: while (true) {
                  if (il.field_a.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= il.field_a.length) {
                        var23[var16] = -2147483648;
                        var17 = il.field_a[var16];
                        kj.a((byte) 104, var16);
                        var18 = 0;
                        L6: while (true) {
                          if (var18 >= 3) {
                            int discarded$3 = 0;
                            me.a(false, false, nl.field_c, true, var17, rh.field_h);
                            fj.a(-102, var8, var12, var14, var9, var7, var17, var13);
                            var15++;
                            continue L4;
                          } else {
                            nl.field_c[var18] = nl.field_c[var18] + sk.field_b[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var23[var17_int] <= var23[var16]) {
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_mg = il.field_a[var3];
                var4_ref_mg.a((byte) 116);
                kj.a((byte) 104, var3);
                var5 = var4_ref_mg.field_f + var4_ref_mg.field_e >> 1;
                var6 = var4_ref_mg.field_s + var4_ref_mg.field_u >> 1;
                var7 = var4_ref_mg.field_z - -var4_ref_mg.field_i >> 1;
                var8 = rh.field_h[9] >> 2;
                var9 = rh.field_h[10] >> 2;
                var10_int = rh.field_h[11] >> 2;
                var11 = var10_int * nl.field_c[5] + (var9 * nl.field_c[4] + nl.field_c[3] * var8) >> 14;
                var12 = nl.field_c[8] * var10_int + (nl.field_c[6] * var8 - -(nl.field_c[7] * var9)) >> 14;
                var13 = nl.field_c[9] * var8 - -(var9 * nl.field_c[10]) + var10_int * nl.field_c[11] >> 14;
                var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "de.C(" + param0 + ')');
        }
    }

    final static int a(int param0) {
        if (param0 != 565192680) {
            de.b(-60);
        }
        return ok.field_c;
    }

    de(int param0, int param1, int param2, int param3) {
        ((de) this).field_d = param3;
        ((de) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new bk();
    }
}
