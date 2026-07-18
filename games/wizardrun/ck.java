/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    final static void a(java.applet.Applet param0, String[] param1, int param2, int param3, int param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
                if (!af.a((CharSequence) (Object) var6, (byte) 78)) {
                  bb.field_k = 2;
                  break L3;
                } else {
                  bb.field_k = ph.a(1124, (CharSequence) (Object) var6);
                  break L3;
                }
              }
            }
            nh.field_n = 0;
            wd.field_g = 255;
            ug.field_H = 16777215;
            dc.field_s = new o[param1.length];
            var7 = 0;
            L4: while (true) {
              if (param1.length <= var7) {
                nl.field_w = param1;
                break L0;
              } else {
                dc.field_s[var7] = new o(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6_ref;
            stackOut_16_1 = new StringBuilder().append("ck.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 0 + ',' + 34 + ',' + 16777215 + ',' + 255 + ')');
        }
    }

    final static void a(byte param0) {
        di.a((byte) 60);
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
          ql.a(-99);
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
          ql.a(-99);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0 <= 0) {
                L2: {
                  if (param2 == 1685) {
                    break L2;
                  } else {
                    int discarded$2 = ck.a(-93, -128, 3);
                    break L2;
                  }
                }
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = param1 & 1 | var3_int << 1;
                param0--;
                param1 = param1 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "ck.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0) {
        la.field_d = false;
        int discarded$0 = nk.field_N.f(255);
    }

    static {
    }
}
