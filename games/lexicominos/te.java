/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends kf {
    static java.awt.Color field_E;

    private te(String param0, rd param1, vd param2) {
        super(param0, param1, param2);
        ((te) this).field_i = nb.field_z.field_b;
    }

    private te(String param0, vd param1) {
        this(param0, nb.field_z.field_f, param1);
        ((te) this).field_i = nb.field_z.field_b;
    }

    public static void a(byte param0) {
        if (param0 != -122) {
            return;
        }
        field_E = null;
    }

    te(String param0, vd param1, boolean param2) {
        this(param0, param1);
        ((te) this).field_C = param2 ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((te) this).field_C = !((te) this).field_C ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static void a(String param0, long param1, java.applet.Applet param2, String param3, int param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            Object var8 = null;
            String var9 = null;
            String var10 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param4 == 1000) {
                break L0;
              } else {
                var8 = null;
                te.a((String) null, 24L, (java.applet.Applet) null, (String) null, -63);
                break L0;
              }
            }
            try {
              L1: {
                var9 = param2.getParameter("cookiehost");
                var7 = var9;
                var7 = var9;
                var10 = param0 + "=" + param3 + "; version=1; path=/; domain=" + var9;
                var7 = var10;
                var7 = var10;
                if (0L > param1) {
                  var7 = var10 + "; Discard;";
                  break L1;
                } else {
                  var7 = var10 + "; Expires=" + q.a(1000L * param1 + rf.c(0), (byte) 28) + "; Max-Age=" + param1;
                  break L1;
                }
              }
              oa.a("document.cookie=\"" + var7 + "\"", param2, param4 + -31196);
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

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new java.awt.Color(10040319);
    }
}
