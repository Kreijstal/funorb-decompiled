/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends hf {
    int field_f;
    int[] field_h;
    static tf field_g;

    private ea() throws Throwable {
        throw new Error();
    }

    public static void b(int param0) {
        if (param0 != 1000) {
            return;
        }
        field_g = null;
    }

    final static void a(byte param0, long param1, java.applet.Applet param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var9 = param2.getParameter("cookiehost");
                var7 = var9;
                var7 = var9;
                var8 = -108 / ((48 - param0) / 59);
                var10 = param3 + "=" + param4 + "; version=1; path=/; domain=" + var9;
                var7 = var10;
                var7 = var10;
                if (-1L < (param1 ^ -1L)) {
                  var7 = var10 + "; Discard;";
                  break L0;
                } else {
                  var7 = var10 + "; Expires=" + md.a((byte) -79, 1000L * param1 + oa.a(-12520)) + "; Max-Age=" + param1;
                  break L0;
                }
              }
              wk.a(param2, "document.cookie=\"" + var7 + "\"", (byte) -10);
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

    final static qd a(rh param0, byte param1, rh param2, int param3, int param4) {
        int var5 = 0;
        if (!mf.a(param3, param4, 117, param0)) {
          return null;
        } else {
          var5 = 8 % ((-50 - param1) / 51);
          return qa.a(param2.a(param4, -28153, param3), false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new tf();
    }
}
