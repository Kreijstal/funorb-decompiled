/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sh extends w {
    boolean field_s;
    volatile boolean field_v;
    boolean field_p;
    static int field_r;
    static cf field_t;
    static int[] field_w;
    static uj field_u;
    static int[] field_q;

    final static void a(int param0, boolean param1) {
        int var2 = 82 % ((param0 - 9) / 57);
        ub.field_h = 0;
        oi.field_j = 0;
        kk.field_i = 0;
        ll.field_d = eh.field_k;
        of.field_c = new rl(2);
        of.field_c.a((byte) -123, param1, -1, pf.a(ph.field_d, -19503, kc.field_u));
    }

    final static void a(int param0, int param1, int[] param2, int param3, int[][] param4, int[][] param5, int param6) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = param5[param3][1] - param5[param3][0];
            var8 = 64;
            var9 = param2[var7_int - 1] + param2[0] >> -1026292095;
            var10 = 0;
            L1: while (true) {
              if ((var10 ^ -1) <= -4) {
                var12 = 0;
                var10 = var12;
                L2: while (true) {
                  if (var12 > 1) {
                    la.field_f.a(-27);
                    if (param1 <= -98) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    L3: {
                      L4: {
                        re.field_v[var12][param3].d();
                        qg.a(ae.field_y);
                        if (-1 != (var12 ^ -1)) {
                          break L4;
                        } else {
                          if (-1 == (param0 ^ -1)) {
                            var7_int = param5[param3][1] + -param4[param3][0];
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var12 != 0) {
                          break L5;
                        } else {
                          if (1 != param0) {
                            break L5;
                          } else {
                            var7_int = -param5[param3][0] + param4[param3][1];
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (-2 != (var12 ^ -1)) {
                          break L6;
                        } else {
                          if (param0 == 0) {
                            var7_int = param5[param3][1] + -param4[param3][0];
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = param4[param3][1] - param5[param3][0];
                      break L3;
                    }
                    L7: {
                      if (-1 > (var7_int ^ -1)) {
                        qg.a(0, 0, var7_int, var8);
                        od.a(fh.field_a[param0][var7_int - 1], var9);
                        qg.b(ae.field_y);
                        la.field_f.a(-106);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var12++;
                    continue L2;
                  }
                }
              } else {
                L8: {
                  we.field_e[var10][param3].d();
                  qg.a(ae.field_y);
                  if (var7_int <= 0) {
                    break L8;
                  } else {
                    qg.a(0, 0, var7_int, var8);
                    od.a(cg.field_b[var10][param0][var7_int + -1], param2);
                    qg.b(ae.field_y);
                    la.field_f.a(-106);
                    break L8;
                  }
                }
                var10++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var7);

            stackIn_31_1 = new StringBuilder().append("sh.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param5 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L11;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_32_0), stackIn_38_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_q = null;
        field_t = null;
        field_w = null;
        if (!param0) {
            sh.d(99);
        }
        field_u = null;
    }

    abstract int f(int param0);

    final static ge d(int param0) {
        if (param0 >= -121) {
            field_r = 30;
        }
        ge var1 = new ge(ij.field_B, le.field_g, ug.field_e[0], dd.field_t[0], pg.field_r[0], lg.field_e[0], h.field_a[0], td.field_m);
        p.a(0);
        return var1;
    }

    sh() {
        this.field_v = true;
    }

    abstract byte[] e(int param0);

    static {
        field_r = 256;
        field_t = new cf();
        field_w = new int[4];
        field_q = new int[]{0, 0};
    }
}
