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

    final static int b(int param0) {
        if (param0 != 5395) {
            return -14;
        }
        return jj.field_c;
    }

    public static void a(boolean param0) {
        if (param0) {
            v.a(-93);
        }
        field_g = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    v(Throwable param0, String param1) {
        this.field_f = param0;
        this.field_d = param1;
    }

    final static void a(int param0, int param1, boolean param2, ak param3, int param4, int param5) {
        int stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        j var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            op.a(param0 + 6, t.field_d, 294, 6, param1, 64, 3 + param5);
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
                      var8 = var8 + (de.field_x + 294 << 2026107271);
                      var8 = var8 >> 8;
                      stackIn_7_0 = var7.field_H;

                      stackIn_7_1 = 0;

                      stackIn_7_2 = var7.field_M;

                      stackIn_7_3 = var8;

                      if (var6_int != param4) {
                        stackIn_8_0 = stackIn_7_0;
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = stackIn_7_2;
                        stackIn_8_3 = stackIn_7_3;
                        stackIn_8_4 = 0;
                        break L3;
                      } else {
                        stackIn_8_0 = stackIn_7_0;
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = stackIn_7_2;
                        stackIn_8_3 = stackIn_7_3;
                        stackIn_8_4 = 1;
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
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("v.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static jp[] a(int param0) {
        jp[] var1;
        int var2;
        int var3;
        byte[] var5;
        int var6;
        int[] var6_ref_int__;
        int var7;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          var1 = new jp[nl.field_c];
          if (param0 == -835) {
            break L0;
          } else {
            v.a(false);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= nl.field_c) {
            ee.d((byte) 96);
            return var1;
          } else {
            var3 = gg.field_t[var2] * jh.field_b[var2];
            var21 = cn.field_a[var2];
            if (!tm.field_b[var2]) {
              var10 = new int[var3];
              var22 = var10;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new jp(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var22);
                  var2++;
                  continue L1;
                } else {
                  var10[var6] = qp.field_c[ik.a((int) var21[var6], 255)];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var15 = bj.field_S[var2];
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var17 = new int[var3];
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L3: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (jp) ((Object) new fb(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var17));
                  var2++;
                  continue L1;
                } else {
                  var6_ref_int__[var7] = ud.d(ik.a(255, (int) var15[var7]) << 713805816, qp.field_c[ik.a(255, (int) var21[var7])]);
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        field_c = "Send private message to <%0>";
    }
}
