/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends java.awt.Canvas {
    static String[] field_c;
    private java.awt.Component field_b;
    static bu field_a;
    static String[] field_d;
    static int field_e;

    public final void update(java.awt.Graphics param0) {
        ((sa) this).field_b.update(param0);
    }

    public static void a(byte param0) {
        if (param0 < 106) {
            return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String stackIn_7_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            var9 = Kickabout.field_G;
            try {
              L0: {
                var10 = param0.getParameter("cookieprefix");
                var3 = var10 + "settings";
                var4 = (String) mm.a(30858, "getcookies", param0);
                var5 = wr.a(var4, 2, ';');
                var6 = 0;
                var7 = 35 % ((param1 - 32) / 57);
                L1: while (true) {
                  if (var6 >= var5.length) {
                    break L0;
                  } else {
                    L2: {
                      var8 = var5[var6].indexOf('=');
                      if ((var8 ^ -1) > -1) {
                        break L2;
                      } else {
                        if (var5[var6].substring(0, var8).trim().equals((Object) (Object) var3)) {
                          stackOut_6_0 = var5[var6].substring(var8 - -1).trim();
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = decompiledCaughtException;
                break L3;
              }
            }
            if (wk.field_b == null) {
              return param0.getParameter("settings");
            } else {
              return wk.field_b;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    sa(java.awt.Component param0) {
        ((sa) this).field_b = param0;
    }

    public final void paint(java.awt.Graphics param0) {
        ((sa) this).field_b.paint(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Press the spacebar to sprint.", "Press 'CTRL' to sprint."};
        tf discarded$0 = new tf();
        field_d = new String[]{"Modern", "Old School"};
    }
}
