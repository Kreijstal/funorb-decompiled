/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static String field_a;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -19073) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = sd.field_a.a((byte) 7, param0, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wf.C(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        gi var2 = null;
        int var3 = 0;
        java.applet.Applet var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Main.field_T;
        try {
          L0: {
            L1: {
              mf.field_i = param0;
              var2 = (gi) ((Object) aj.field_s.a((byte) 74));
              if (param1 < -9) {
                break L1;
              } else {
                var4 = (java.applet.Applet) null;
                wf.a((byte) -32, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var2 == null) {
                break L0;
              } else {
                L3: {
                  if (var2.field_i.b(-115)) {
                    var2.field_h.f(mf.field_i * var2.field_j / 80);
                    break L3;
                  } else {
                    var2.c(103);
                    break L3;
                  }
                }
                var2 = (gi) ((Object) aj.field_s.b((byte) -111));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "wf.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            rc.field_m = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            if (param0 > -81) {
                String var6 = (String) null;
                wf.a((String) null, -37);
            }
            uh.a(var4, 100, var2, var3, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "wf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 3) {
            wf.a(-101, -45, 29, 105, 103);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static kc[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 1) {
          wf.a(120, -107);
          return ma.a(param2, 1, param3, 1, 3, param4, 1, param0, (byte) -22);
        } else {
          return ma.a(param2, 1, param3, 1, 3, param4, 1, param0, (byte) -22);
        }
    }

    static {
        field_a = "Change display name";
    }
}
