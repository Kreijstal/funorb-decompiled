/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    byte[] field_i;
    int field_g;
    int field_h;
    static int field_l;
    static String field_e;
    static int field_a;
    byte[] field_j;
    int field_b;
    static kg field_k;
    int field_d;
    int field_f;
    int field_c;
    int field_m;

    public static void a(int param0) {
        field_e = null;
        field_k = null;
    }

    final static jg a(int param0, int param1, dl param2, int param3, byte param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        jg var7 = null;
        Object var8 = null;
        java.awt.Frame var9 = null;
        Object stackIn_2_0 = null;
        jg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var9 = ii.a(true, param5, param2, param0, param1, param3);
            var6 = var9;
            if (var9 != null) {
              L1: {
                var7 = new jg();
                var7.field_c = var9;
                java.awt.Component discarded$9 = var7.field_c.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param3, param0);
                if (param4 == -81) {
                  break L1;
                } else {
                  var8 = null;
                  g.a((java.applet.Applet) null, (String) null, -30);
                  break L1;
                }
              }
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_5_0 = (jg) var7;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (jg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6_ref;
            stackOut_7_1 = new StringBuilder().append("g.A(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                bf.field_i = param1;
                try {
                  L1: {
                    var3 = param0.getParameter("cookieprefix");
                    if (param2 == -3603) {
                      L2: {
                        var4 = param0.getParameter("cookiehost");
                        var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                        if (param1.length() == 0) {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      fd.a(57, param0, "document.cookie=\"" + var5 + "\"");
                      break L1;
                    } else {
                      return;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = decompiledCaughtException;
                    break L3;
                  }
                }
                la.a(param0, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref2;
                stackOut_11_1 = new StringBuilder().append("g.B(");
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
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
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Checking";
        field_k = new kg();
    }
}
