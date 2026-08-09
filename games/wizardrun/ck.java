/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    final static void a(java.applet.Applet param0, String[] param1, int param2, int param3, int param4, int param5) {
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              td.field_d = param0.getParameter("overxgames");
              if (null == td.field_d) {
                td.field_d = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              dc.field_n = param0.getParameter("overxachievements");
              if (null != dc.field_n) {
                break L2;
              } else {
                dc.field_n = "0";
                break L2;
              }
            }
            L3: {
              var6 = param0.getParameter("currency");
              if (var6 == null) {
                bb.field_k = 2;
                break L3;
              } else {
                if (!af.a((CharSequence) ((Object) var6), (byte) 78)) {
                  bb.field_k = 2;
                  break L3;
                } else {
                  bb.field_k = ph.a(1124, (CharSequence) ((Object) var6));
                  break L3;
                }
              }
            }
            L4: {
              nh.field_n = param2;
              wd.field_g = param5;
              ug.field_H = param4;
              dc.field_s = new o[param1.length];
              if (param3 == 34) {
                break L4;
              } else {
                ck.a(-99, 41, 24);
                break L4;
              }
            }
            var7 = 0;
            L5: while (true) {
              if (param1.length <= var7) {
                nl.field_w = param1;
                break L0;
              } else {
                dc.field_s[var7] = new o(317, 34);
                var7++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6_ref);

            stackIn_20_1 = new StringBuilder().append("ck.A(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        di.a((byte) 60);
        if (param0 == 84) {
          if (wizardrun.field_G != null) {
            L0: {
              ka.a(wizardrun.field_G, 8053);
              td.b(4);
              wh.b((byte) -104);
              jl.b(1);
              if (ne.b(22845)) {
                n.field_b.c((byte) 88, 1);
                id.a((byte) -67, 0);
                break L0;
              } else {
                break L0;
              }
            }
            ql.a(param0 ^ -55);
            return;
          } else {
            L1: {
              td.b(4);
              wh.b((byte) -104);
              jl.b(1);
              if (ne.b(22845)) {
                n.field_b.c((byte) 88, 1);
                id.a((byte) -67, 0);
                break L1;
              } else {
                break L1;
              }
            }
            ql.a(param0 ^ -55);
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if ((param0 ^ -1) >= -1) {
                L2: {
                  if (param2 == 1685) {
                    break L2;
                  } else {
                    ck.a(-93, -128, 3);
                    break L2;
                  }
                }
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = param1 & 1 | var3_int << 2046877441;
                param0--;
                param1 = param1 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var3), "ck.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0) {
        la.field_d = false;
        nk.field_N.f(255);
        if (param0 != 2046877441) {
            return;
        }
    }

    static {
    }
}
