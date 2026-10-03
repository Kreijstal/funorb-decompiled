/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static String quitText;
    static String field_a;
    static int currentScreenId;

    final static boolean a(byte param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if ((0 < param1) &&
                (128 > param1)) {
              break L0;
            }
            if ((param1 >= 160) &&
                (255 >= param1)) {
              break L0;
            }
            if (param0 != -112) {
              quitText = (String) null;
            }
            if (param1 == 0) {
              return false;
            }
            var6 = lf.extendedTextCharacters;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (var4 == param1) {
                return true;
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "tc.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        quitText = null;
        field_a = null;
        if (!param0) {
            tc.a(false);
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            try {
                NetworkArchiveRequest.field_z = param1;
                try {
                    var7 = param2.getParameter("cookieprefix");
                    var5 = var7;
                    var5 = var7;
                    var4 = param2.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                    var5 = var8;
                    var5 = var8;
                    if (param1.length() != 0) {
                        var5 = var8 + "; Expires=" + md.a((byte) -58, oa.a(-12520) + 94608000000L) + "; Max-Age=" + 94608000L;
                    } else {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    int var6 = -93 % ((-64 - param0) / 61);
                    wk.a(param2, "document.cookie=\"" + var5 + "\"", (byte) -92);
                } catch (Throwable throwable) {
                }
                oj.a(param2, 20000000);
            } catch (RuntimeException runtimeException) {
                throw t.a((Throwable) ((Object) runtimeException), "tc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = null;
        quitText = "Quit";
    }
}
