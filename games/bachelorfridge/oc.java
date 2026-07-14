/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends pu {
    static String field_m;
    static po field_l;

    public static void b(int param0) {
        if (param0 != 32586) {
            return;
        }
        field_m = null;
        field_l = null;
    }

    final static void a(java.applet.Applet param0, String param1, long param2, int param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param0.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                if (param3 >= 115) {
                  break L0;
                } else {
                  field_m = null;
                  break L0;
                }
              }
              L1: {
                var9 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (-1L < (param2 ^ -1L)) {
                  var7 = var9 + "; Discard;";
                  break L1;
                } else {
                  var7 = var9 + "; Expires=" + km.a(f.b((byte) 73) - -(param2 * 1000L), -1) + "; Max-Age=" + param2;
                  break L1;
                }
              }
              ac.a("document.cookie=\"" + var7 + "\"", param0, 118);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
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
        field_m = "Logging in...";
    }
}
