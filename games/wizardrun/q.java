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
            Throwable throwable = null;
            String var4 = null;
            String var5 = null;
            Object var6 = null;
            String var7 = null;
            String var8 = null;
            Throwable decompiledCaughtException = null;
            pa.field_f = param2;
            try {
              L0: {
                L1: {
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
                    break L1;
                  } else {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    break L1;
                  }
                }
                cl.a(param1, "document.cookie=\"" + var5 + "\"", (byte) -111);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                throwable = decompiledCaughtException;
                break L2;
              }
            }
            jf.a((byte) 76, param1);
            if (param0 != 26017) {
              var6 = null;
              q.a(-77, (java.applet.Applet) null, (String) null);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, java.awt.Frame param1, vh param2) {
        jh var3_ref_jh = null;
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        L0: while (true) {
          var3_ref_jh = param2.a(7, param1);
          L1: while (true) {
            if (var3_ref_jh.field_a != 0) {
              if (var3_ref_jh.field_a != 1) {
                tg.a(100L, false);
                continue L0;
              } else {
                param1.setVisible(false);
                var3 = 79 % ((param0 - -4) / 58);
                param1.dispose();
                return;
              }
            } else {
              tg.a(10L, false);
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "COMPLETE";
        field_b = 10;
        field_g = "to keep fullscreen or";
    }
}
