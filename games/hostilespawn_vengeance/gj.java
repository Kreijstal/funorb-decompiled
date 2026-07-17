/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    gb field_a;
    static int field_h;
    String field_c;
    String field_e;
    String field_g;
    static ub field_b;
    static bd field_d;
    int field_f;

    final static boolean a(int param0, int param1, int param2, int param3) {
        oc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (ln.field_a.field_i[param0] != 0) {
          var4 = mm.field_m[0].field_j;
          if (param2 <= -89) {
            L0: {
              L1: {
                var5 = -param3 + var4.field_e;
                var6 = -param1 + var4.field_g;
                if (-20 >= var5) {
                  break L1;
                } else {
                  if (20 <= var5) {
                    break L1;
                  } else {
                    if (var6 <= -17) {
                      break L1;
                    } else {
                      if (var6 >= 17) {
                        break L1;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            return stackIn_10_0 != 0;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, String param1, float param2) {
        try {
            bl.field_f = param2;
            if (param0 != 20) {
            }
            wi.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "gj.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static double a(double param0, int param1) {
        if (param1 >= 0) {
            boolean discarded$0 = gj.a(124, -103, 11, -7);
        }
        return -24.0 + (24.0 * param0 - (double)uj.field_p.field_e);
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
    }

    final static nd[] a(int param0) {
        return new nd[]{bh.field_c, ac.field_c, tf.field_b, li.field_x, lk.field_N, kd.field_G, ee.field_h, pl.field_q, lg.field_e, gb.field_f, fh.field_a, bc.field_j, oa.field_g, ee.field_a};
    }

    final static u[] a(boolean param0, en param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        u[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        u var6_ref_u = null;
        int var7 = 0;
        en stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        en stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        en stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_6_0 = null;
        en stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        en stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        en stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        u[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        en stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        en stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        u[] stackOut_18_0 = null;
        en stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        en stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        en stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = (en) param1;
              stackOut_1_1 = 8;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (param0) {
                stackOut_3_0 = (en) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (en) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            var2_int = ((en) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0);
            if (0 >= var2_int) {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  field_h = -34;
                  break L2;
                }
              }
              var3 = param1.a(12, true);
              var4 = new u[var3];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var3) {
                  stackOut_18_0 = (u[]) var4;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L4: {
                    if (!vi.a((byte) 124, param1)) {
                      var6 = param1.a(aa.a(4, var5 + -1), true);
                      var4[var5] = var4[var6];
                      break L4;
                    } else {
                      L5: {
                        var6_ref_u = new u();
                        int discarded$6 = param1.a(24, true);
                        int discarded$7 = param1.a(24, true);
                        var6_ref_u.field_i = param1.a(24, true);
                        int discarded$8 = param1.a(9, true);
                        int discarded$9 = param1.a(12, true);
                        int discarded$10 = param1.a(12, true);
                        stackOut_12_0 = (en) param1;
                        stackOut_12_1 = 12;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param0) {
                          stackOut_14_0 = (en) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          stackIn_15_2 = stackOut_14_2;
                          break L5;
                        } else {
                          stackOut_13_0 = (en) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          break L5;
                        }
                      }
                      int discarded$11 = ((en) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0);
                      var4[var5] = var6_ref_u;
                      break L4;
                    }
                  }
                  var5++;
                  continue L3;
                }
              }
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (u[]) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("gj.A(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    private gj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ub();
    }
}
