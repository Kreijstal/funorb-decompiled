/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static int[] field_c;
    private static long[] field_a;
    static pb field_b;

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        L0: {
          var3 = 73 / ((59 - param1) / 59);
          var2 = param0.getParameter("username");
          if (var2 == null) {
            break L0;
          } else {
            var4 = (CharSequence) (Object) var2;
            if (-1L != (nd.a(var4, (byte) -35) ^ -1L)) {
              return;
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 < 6) {
            return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        sl.field_c = true;
        String var2 = "tuhstatbut";
        if (param1) {
            return;
        }
        String var3 = "rvnadlm";
        long var4 = -1L;
        b.a(var3, (byte) 38, var4, var2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_c = new int[8192];
        field_a = new long[256];
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
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
                if ((var0 & 1L ^ -1L) != -2L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> -1944976959;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
