/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static int field_a;
    static int[] field_b;
    static boolean field_c;
    static int[][] field_d;

    final static String a(int param0, byte[] param1) {
        if (param0 != 0) {
            return null;
        }
        return tc.a((byte) -114, param1, param1.length, 0);
    }

    final static void a(byte param0, boolean param1) {
        vi.field_q = 0;
        vi.field_p = ke.field_c;
        el.field_e = 0;
        uj.field_d = 0;
        si.field_ob = new sd(2);
        if (param0 != 49) {
          return;
        } else {
          si.field_ob.a(-1, param1, kk.a(param0 + 10423, ef.field_j, jb.field_b), param0 + -134);
          return;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 1000) {
            ll.a((byte) -104, false);
        }
    }

    final static void a(String param0, long param1, byte param2, java.applet.Applet param3, String param4) {
        try {
            Throwable var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var9 = param3.getParameter("cookiehost");
                var8 = var9;
                var8 = var9;
                var7 = 27 % ((param2 - 35) / 56);
                var10 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var9;
                var8 = var10;
                var8 = var10;
                if ((param1 ^ -1L) <= -1L) {
                  var8 = var10 + "; Expires=" + wc.a(1000L * param1 + ll.a(1000), -1) + "; Max-Age=" + param1;
                  break L0;
                } else {
                  var8 = var10 + "; Discard;";
                  break L0;
                }
              }
              cd.a(param3, 13162, "document.cookie=\"" + var8 + "\"");
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

    final synchronized static long a(int param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if ((var1 ^ -1L) <= (sh.field_n ^ -1L)) {
          if (param0 != 1000) {
            sh.field_n = var1;
            return var1 + ba.field_i;
          } else {
            sh.field_n = var1;
            return var1 + ba.field_i;
          }
        } else {
          ba.field_i = ba.field_i + (sh.field_n + -var1);
          if (param0 == 1000) {
            sh.field_n = var1;
            return var1 + ba.field_i;
          } else {
            sh.field_n = var1;
            return var1 + ba.field_i;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_c = true;
        field_b = new int[128];
    }
}
