/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static fh field_h;
    int field_a;
    int field_j;
    int field_i;
    static wk[] field_e;
    static String field_f;
    int field_c;
    static int[] field_d;
    static int field_b;
    static sf field_g;

    public static void a(int param0) {
        field_g = null;
        if (param0 >= -105) {
            return;
        }
        field_d = null;
        field_f = null;
        field_e = null;
        field_h = null;
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -38 % ((-19 - param0) / 39);
                param2 = uj.a('_', param2, 1, "");
                var3 = rk.a(param1, 5);
                if ((param2.indexOf(param1) ^ -1) != 0) {
                  break L2;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("hf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param1 < -5) {
                      break L1;
                    } else {
                      var3 = (String) null;
                      hf.a((byte) 119, (String) null, (String) null);
                      break L1;
                    }
                  }
                  var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                  param0.getAppletContext().showDocument(ib.a(param0, var2, -5441), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("hf.A(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = new wk[3];
        field_f = "At the bottom of the screen, there are counters showing how many fleas are currently in the level, and how many you need to save. On some levels, you must save all the fleas; on other levels, only some must be saved.";
        field_h = new fh(7, 0, 1, 1);
        field_d = new int[40];
    }
}
