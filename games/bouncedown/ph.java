/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private String field_d;
    private static long[] field_a;
    static tg field_b;
    static byte[][] field_c;

    final boolean a(String param0, int param1) {
        if (param1 != 0) {
            return false;
        }
        return ((ph) this).field_d.equals((Object) (Object) param0);
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            field_b = null;
        }
        field_c = null;
    }

    final void a(int param0, java.applet.Applet param1) {
        lj.a(param1, "jagex-last-login-method", ((ph) this).field_d, (byte) 126, 31536000L);
        if (param0 != 1) {
            field_c = null;
        }
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            bl.field_b = param0;
            try {
                var3 = param1.getParameter("cookieprefix");
                var4 = param1.getParameter("cookiehost");
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (param2 <= 28) {
                    ph.a(-77);
                }
                if (!(param0.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ac.a((byte) 91, param1, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            kc.a(param1, 27477);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ph(String param0) {
        ((ph) this).field_d = param0;
    }

    final static long a(byte param0) {
        int var1 = -5 / ((param0 - 10) / 57);
        return -qe.field_k + fa.a(-79);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_a = new long[256];
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_a[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> -550122303;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
