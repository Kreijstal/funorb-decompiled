/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj {
    static Calendar field_c;
    static String[] field_b;
    static int field_a;

    final static void a(java.applet.Applet param0, String param1, String param2, byte param3, long param4) {
        try {
            Throwable var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var7 = 105 % ((64 - param3) / 62);
                  var9 = param0.getParameter("cookiehost");
                  var8 = var9;
                  var8 = var9;
                  var10 = param1 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                  var8 = var10;
                  var8 = var10;
                  if (param4 < 0L) {
                    var8 = var10 + "; Discard;";
                    break L1;
                  } else {
                    var8 = var10 + "; Expires=" + se.a(-80, fa.a(82) + 1000L * param4) + "; Max-Age=" + param4;
                    break L1;
                  }
                }
                ac.a((byte) 91, param0, "document.cookie=\"" + var8 + "\"");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var6 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        if (param0 != -50) {
            field_c = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_b = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Splot", "Splat", "Splam", "Splocher", "Splout", "Splassive Splat", "Spliny Splat", "Splikey Splat", "Splega Splat", "Splatty"};
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = 0;
    }
}
