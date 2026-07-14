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
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var4 = -38 % ((-19 - param0) / 39);
        param2 = uj.a('_', param2, 1, "");
        var3 = rk.a(param1, 5);
        if ((param2.indexOf(param1) ^ -1) == 0) {
          if (param2.indexOf(var3) != -1) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1 >= -5) {
                    Object var3 = null;
                    boolean discarded$0 = hf.a((byte) 119, (String) null, (String) null);
                }
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(ib.a(param0, var2, -5441), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
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
        field_e = new wk[3];
        field_f = "At the bottom of the screen, there are counters showing how many fleas are currently in the level, and how many you need to save. On some levels, you must save all the fleas; on other levels, only some must be saved.";
        field_h = new fh(7, 0, 1, 1);
        field_d = new int[40];
    }
}
