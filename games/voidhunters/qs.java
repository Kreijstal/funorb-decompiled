/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qs {
    static String field_b;
    static int field_a;
    static int field_c;

    final static void a(java.applet.Applet param0, int param1, String param2, String param3, long param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 <= -99) {
                  break L0;
                } else {
                  field_c = -102;
                  break L0;
                }
              }
              L1: {
                var8 = param0.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (-1L < (param4 ^ -1L)) {
                  var7 = var9 + "; Discard;";
                  break L1;
                } else {
                  var7 = var9 + "; Expires=" + tnb.a((byte) 98, param4 * 1000L + wt.a(false)) + "; Max-Age=" + param4;
                  break L1;
                }
              }
              ia.a((byte) -122, param0, "document.cookie=\"" + var7 + "\"");
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

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static boolean a(int param0, String param1) {
        CharSequence var3 = null;
        if (fva.field_p) {
          if ((ow.field_b ^ -1) == -3) {
            if (nkb.field_o != null) {
              var3 = (CharSequence) (Object) param1;
              if (nkb.field_o.equals((Object) (Object) jwa.a(false, var3))) {
                if (param0 != 0) {
                  return true;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "Confirm Email:";
    }
}
