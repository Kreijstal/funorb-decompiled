/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sh extends fl {
    int field_q;
    static String field_r;
    static String field_s;

    abstract boolean d(byte param0);

    abstract Object e(byte param0);

    public static void f(int param0) {
        field_s = null;
        field_r = null;
        if (param0 != 0) {
            java.net.URL var2 = (java.net.URL) null;
            sh.a((byte) -113, (java.applet.Applet) null, (java.net.URL) null);
        }
    }

    final static ee a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ee[] var3 = null;
        int var4 = 0;
        ee var5 = null;
        int var6 = 0;
        ee stackIn_3_0 = null;
        ee stackIn_6_0 = null;
        ee stackIn_11_0 = null;
        ee stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var2 = dc.a((byte) 90, "jagex-last-login-method", param1);
            if (param0 == -1) {
              if (var2 != null) {
                var3 = ma.a(false);
                var4 = 0;
                L1: while (true) {
                  if (var3.length <= var4) {
                    stackIn_14_0 = qj.field_g;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var5 = var3[var4];
                    if (!var5.a(var2, (byte) 119)) {
                      var4++;
                      continue L1;
                    } else {
                      stackIn_11_0 = (ee) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_6_0 = qj.field_g;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (ee) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("sh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    sh(int param0) {
        this.field_q = param0;
    }

    final static java.net.URL a(byte param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = null;
            var4 = null;
            if (param0 >= 11) {
              L1: {
                if (null == oh.field_p) {
                  break L1;
                } else {
                  if (oh.field_p.equals(param1.getParameter("settings"))) {
                    break L1;
                  } else {
                    var3 = oh.field_p;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  }
                }
              }
              L2: {
                if (wi.field_i == null) {
                  break L2;
                } else {
                  if (wi.field_i.equals(param1.getParameter("session"))) {
                    break L2;
                  } else {
                    var4 = wi.field_i;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = vn.a((String) (var4), -1, (String) (var3), param2, 1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("sh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_r = "Escape Vector Expansion";
        field_s = "Retry";
    }
}
