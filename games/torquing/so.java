/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so extends am {
    static ei field_t;
    static cd field_s;
    static cd field_u;

    public static void g(byte param0) {
        field_t = null;
        field_s = null;
        field_u = null;
    }

    final int[] a(byte param0, int param1) {
        if (param0 <= 86) {
            field_s = null;
        }
        int[] var4 = ((so) this).field_l.a(param1, 25657);
        int[] var3 = var4;
        if (((so) this).field_l.field_b) {
            dk.a(var4, 0, ci.field_c, dp.field_a[param1]);
        }
        return var4;
    }

    public so() {
        super(0, true);
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        of var4_ref_of = null;
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
        of var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = Torquing.field_u;
        try {
          L0: {
            od.field_t = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = db.field_a.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = od.field_t[9] >> 8;
                  var4 = od.field_t[10] >> 8;
                  var5 = od.field_t[11] >> 8;
                  var6 = jh.field_z << 4;
                  var7 = 0;
                  var8 = ah.a((byte) 127, var6) >> 8;
                  var9 = ao.b(2048, var6) >> 8;
                  if (n.field_t == -1) {
                    break L2;
                  } else {
                    if (-1 == k.field_e) {
                      break L2;
                    } else {
                      var9 = -128;
                      var7 = -320 + n.field_t;
                      var8 = -k.field_e + 240;
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
                var9 = (int)((double)var9 * var10);
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = var7 + -var3;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                if (param0 >= 93) {
                  var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12 * var12 + var13 * var13)));
                  var13 = (int)((double)var13 * var10);
                  var12 = (int)((double)var12 * var10);
                  var14 = (int)((double)var14 * var10);
                  var15 = 0;
                  L3: while (true) {
                    if (db.field_a.length <= var15) {
                      break L0;
                    } else {
                      var16 = 0;
                      var17_int = 1;
                      L4: while (true) {
                        if (var17_int >= db.field_a.length) {
                          var23[var16] = -2147483648;
                          var17 = db.field_a[var16];
                          tn.a(-127, var16);
                          var18 = 0;
                          L5: while (true) {
                            if (3 <= var18) {
                              vb.a(var17, (byte) -77, false, od.field_t, mo.field_B, true, false);
                              rg.a(var7, var14, var17, var9, (byte) 126, var13, var12, var8);
                              var15++;
                              continue L3;
                            } else {
                              mo.field_B[var18] = mo.field_B[var18] + eo.field_d[var15][var18];
                              var18++;
                              continue L5;
                            }
                          }
                        } else {
                          L6: {
                            if (var23[var16] >= var23[var17_int]) {
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var17_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                var4_ref_of = db.field_a[var3];
                var4_ref_of.a(32767);
                tn.a(-105, var3);
                var5 = var4_ref_of.field_A + var4_ref_of.field_g >> 1;
                var6 = var4_ref_of.field_H + var4_ref_of.field_x >> 1;
                var7 = var4_ref_of.field_p - -var4_ref_of.field_e >> 1;
                var8 = od.field_t[9] >> 2;
                var9 = od.field_t[10] >> 2;
                var10_int = od.field_t[11] >> 2;
                var11 = var10_int * mo.field_B[5] + (mo.field_B[4] * var9 + mo.field_B[3] * var8) >> 14;
                var12 = var9 * mo.field_B[7] + mo.field_B[6] * var8 + mo.field_B[8] * var10_int >> 14;
                var13 = var10_int * mo.field_B[11] + mo.field_B[10] * var9 + mo.field_B[9] * var8 >> 14;
                var2[var3] = var11 * var5 + var12 * var6 + var7 * var13 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "so.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new ei();
        field_s = new cd();
        field_u = new cd();
    }
}
