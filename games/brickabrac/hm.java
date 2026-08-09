/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_c;
    static String[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 8) {
            return;
        }
        field_c = null;
    }

    final static void a(mh param0, byte param1, byte[] param2, mh param3, int param4, int param5, mh param6, int param7, int param8, int param9) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            wc.field_e = param9;
            oc.field_p = -1L;
            jg.field_c = param2;
            cq.field_p = param2.length;
            fh.field_d = false;
            rh.field_d = new byte[(wc.field_e + 7) / 8];
            o.field_e = null;
            nl.field_f = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (jg.field_c.length <= var11) {
                L2: {
                  var10_int = (7 + var10_int) / 8;
                  lj.field_p = new byte[var10_int];
                  if (param3.field_bb == null) {
                    param3.field_bb = new vl();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  ua.field_c = param3.field_bb;
                  ua.field_c.c((byte) -60);
                  eq.field_m = new mk(param5);
                  m.field_h = -1;
                  re.field_i = 0;
                  uf.field_c = 0;
                  ko.field_s = -1;
                  if (param6.field_bb == null) {
                    param6.field_bb = new vl();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  rq.field_a = param6.field_bb;
                  rq.field_a.c((byte) -48);
                  pn.field_i = new mk(param8);
                  if (param0.field_bb == null) {
                    param0.field_bb = new vl();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                mp.field_Tb = param0.field_bb;
                mp.field_Tb.c((byte) -61);
                if (param1 == 86) {
                  BrickABrac.field_F = new mk(param7);
                  ic.field_b = 0L;
                  cm.field_o = param4;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var10_int = var10_int + (jg.field_c[var11] & 255);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var10);

            stackIn_19_1 = new StringBuilder().append("hm.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_29_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        oe var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                var4 = (oe) null;
                hm.a(-91, (oe) null, 44);
                break L1;
              }
            }
            if (param0) {
              stackIn_6_0 = kp.field_b.c(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = ni.field_Wb.c(param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hm.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static l a(int param0, oe param1, int param2) {
        RuntimeException var3 = null;
        l stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            stackIn_3_0 = sk.a((byte) -9, kl.b(param1, 100, param2));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_c = "Withdraw invitation to <%0> to join this game";
        field_a = "Private";
    }
}
