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
        oc var4;
        int var5;
        int var6;
        int stackIn_10_0 = 0;
        if (-1 != (ln.field_a.field_i[param0] ^ -1)) {
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
                        stackIn_10_0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackIn_10_0 = 0;
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
                gj.a(1.1003973141348942, -79);
            }
            wi.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "gj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static double a(double param0, int param1) {
        if (param1 >= 0) {
            gj.a(124, -103, 11, -7);
        }
        return -24.0 + (24.0 * param0 - (double)uj.field_p.field_e);
    }

    public static void a(byte param0) {
        if (param0 > -5) {
            field_d = (bd) null;
        }
        field_d = null;
        field_b = null;
    }

    final static nd[] a(int param0) {
        if (param0 != -17) {
            field_d = (bd) null;
        }
        return new nd[]{bh.field_c, ac.field_c, tf.field_b, li.field_x, lk.field_N, kd.field_G, ee.field_h, pl.field_q, lg.field_e, gb.field_f, fh.field_a, bc.field_j, oa.field_g, ee.field_a};
    }

    final static u[] a(boolean param0, en param1) {
        en stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        en stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_6_0 = null;
        en stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        en stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        u[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        u[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        u var6_ref_u = null;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = (en) (param1);

              stackIn_3_1 = 8;

              if (param0) {
                stackIn_4_0 = (en) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              } else {
                stackIn_4_0 = (en) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
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
                  stackIn_19_0 = (u[]) (var4);
                  decompiledRegionSelector0 = 1;
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
                        param1.a(24, true);
                        param1.a(24, true);
                        var6_ref_u.field_i = param1.a(24, true);
                        param1.a(9, true);
                        param1.a(12, true);
                        param1.a(12, true);
                        stackIn_14_0 = (en) (param1);

                        stackIn_14_1 = 12;

                        if (param0) {
                          stackIn_15_0 = (en) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = 0;
                          break L5;
                        } else {
                          stackIn_15_0 = (en) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = 1;
                          break L5;
                        }
                      }
                      ((en) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0);
                      var4[var5] = var6_ref_u;
                      break L4;
                    }
                  }
                  var5++;
                  continue L3;
                }
              }
            } else {
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("gj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (u[]) ((Object) stackIn_6_0);
        } else {
          return stackIn_19_0;
        }
    }

    private gj() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new ub();
    }
}
