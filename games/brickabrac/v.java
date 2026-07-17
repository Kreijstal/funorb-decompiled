/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends RuntimeException {
    static jg[] field_g;
    Throwable field_f;
    String field_d;
    static jp field_b;
    static int field_e;
    static String field_c;
    static int[] field_a;

    final static int b() {
        return jj.field_c;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    v(Throwable param0, String param1) {
        ((v) this).field_f = param0;
        ((v) this).field_d = param1;
    }

    final static void a(int param0, int param1, boolean param2, ak param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        j var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            op.a(param0 + 6, t.field_d, 294, 6, 424, 64, 3 + param5);
            var6_int = 0;
            L1: while (true) {
              if (param3.field_k <= var6_int) {
                break L0;
              } else {
                L2: {
                  if (0 == (1 << var6_int & (param3.field_g | param3.field_i | param3.field_a))) {
                    L3: {
                      var7 = param3.field_l[var6_int];
                      var8 = 1414 * var7.field_G / (30 * param3.field_k);
                      var8 = var8 + (de.field_x + 294 << 7);
                      var8 = var8 >> 8;
                      stackOut_5_0 = var7.field_H;
                      stackOut_5_1 = 0;
                      stackOut_5_2 = var7.field_M;
                      stackOut_5_3 = var8;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      stackIn_7_3 = stackOut_5_3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      stackIn_6_3 = stackOut_5_3;
                      if (var6_int != param4) {
                        stackOut_7_0 = stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = stackIn_7_2;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        stackIn_8_4 = stackOut_7_4;
                        break L3;
                      } else {
                        stackOut_6_0 = stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = stackIn_6_2;
                        stackOut_6_3 = stackIn_6_3;
                        stackOut_6_4 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        stackIn_8_3 = stackOut_6_3;
                        stackIn_8_4 = stackOut_6_4;
                        break L3;
                      }
                    }
                    ib.a(stackIn_8_0, stackIn_8_1 != 0, stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0, param5, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("v.A(").append(param0).append(44).append(424).append(44).append(0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static jp[] a() {
        jp[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        var1 = new jp[nl.field_c];
        var2 = 0;
        L0: while (true) {
          if (var2 >= nl.field_c) {
            int discarded$1 = 96;
            ee.d();
            return var1;
          } else {
            var3 = gg.field_t[var2] * jh.field_b[var2];
            var24 = cn.field_a[var2];
            if (!tm.field_b[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new jp(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = qp.field_c[ik.a((int) var24[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var23 = bj.field_S[var2];
              var19 = var23;
              var15 = var19;
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (jp) (Object) new fb(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = ud.d(ik.a(255, (int) var23[var7]) << 24, qp.field_c[ik.a(255, (int) var24[var7])]);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Send private message to <%0>";
    }
}
