/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    byte[] field_c;
    int field_e;
    byte[] field_f;
    int field_k;
    int field_a;
    int field_d;
    static String field_l;
    static int field_b;
    int field_i;
    int field_h;
    static String field_g;
    int field_j;

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_l = null;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            try {
              L0: {
                pa.field_f = param2;
                try {
                  L1: {
                    L2: {
                      var7 = param1.getParameter("cookieprefix");
                      var5 = var7;
                      var5 = var7;
                      var4 = param1.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var8 = var7 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                      var5 = var8;
                      var5 = var8;
                      if (0 != param2.length()) {
                        var5 = var8 + "; Expires=" + fc.a((byte) -32, 94608000000L + d.a((byte) 30)) + "; Max-Age=" + 94608000L;
                        break L2;
                      } else {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      }
                    }
                    cl.a(param1, "document.cookie=\"" + var5 + "\"", (byte) -111);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    break L3;
                  }
                }
                jf.a((byte) 76, param1);
                if (param0 == 26017) {
                  break L0;
                } else {
                  var6 = (String) null;
                  q.a(-77, (java.applet.Applet) null, (String) null);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var3_ref);

                stackIn_12_1 = new StringBuilder().append("q.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, java.awt.Frame param1, vh param2) {
        jh var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: while (true) {
              var3 = param2.a(7, param1);
              L2: while (true) {
                if (var3.field_a != 0) {
                  if (var3.field_a != 1) {
                    tg.a(100L, false);
                    continue L1;
                  } else {
                    param1.setVisible(false);
                    var3_int = 79 % ((param0 - -4) / 58);
                    param1.dispose();
                    break L0;
                  }
                } else {
                  tg.a(10L, false);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("q.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_l = "COMPLETE";
        field_b = 10;
        field_g = "to keep fullscreen or";
    }
}
