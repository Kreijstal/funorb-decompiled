/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static int[] field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            wc.a((String) null, (java.applet.Applet) null, -86, true);
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2, boolean param3) {
        try {
            if (param2 != 14301) {
                java.applet.Applet var5 = (java.applet.Applet) null;
                wc.a((String) null, (java.applet.Applet) null, 36, true);
            }
            if (rk.field_f.startsWith("win")) {
                if (!(!km.a(param0, param2 + -14300))) {
                    return;
                }
            }
            try {
                param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                v.a("MGR1: " + param0, (byte) -52, (Throwable) null);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -38) {
          L0: {
            field_a = (int[]) null;
            if (-1 == (33 & param1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (33 & param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
