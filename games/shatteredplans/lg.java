/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lg extends IOException {
    static jp field_e;
    static tj field_c;
    static String field_f;
    static boolean field_b;
    static int[] field_d;
    static int[] field_a;

    final static nk[] a(int param0, bc param1, int param2, int param3) {
        if (!vd.a(param3, param1, param2, 2)) {
            return null;
        }
        if (param0 != -20435) {
            return null;
        }
        return jj.c(true);
    }

    final static nk a(int param0, int param1, int param2, bc param3) {
        if (!vd.a(param2, param3, param1, 2)) {
            return null;
        }
        if (param0 >= -71) {
            return null;
        }
        return ta.c((byte) 118);
    }

    final static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -34 / ((23 - param0) / 53);
        field_d = null;
        field_a = null;
        field_c = null;
    }

    lg(String param0) {
        super(param0);
    }

    final static void a(long param0, java.applet.Applet param1, int param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param2 > 1) {
                break L0;
              } else {
                lg.a(63);
                break L0;
              }
            }
            try {
              L1: {
                var8 = param1.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param3 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (0L <= param0) {
                  var7 = var9 + "; Expires=" + vm.a(pr.a(14274) + 1000L * param0, 10) + "; Max-Age=" + param0;
                  break L1;
                } else {
                  var7 = var9 + "; Discard;";
                  break L1;
                }
              }
              ll.a(param1, "document.cookie=\"" + var7 + "\"", (byte) 123);
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

    final static bi a(int param0, String param1) {
        th var2 = mp.field_b;
        int var3 = ((nq) (Object) var2).c(param1);
        int var4 = ((nq) (Object) var2).field_J - -((nq) (Object) var2).field_q;
        bi var5 = new bi(var3, var4);
        bs.a(var5, 112);
        ((nq) (Object) var2).d(param1, 0, ((nq) (Object) var2).field_J, 16777215, -1);
        cg.i(param0);
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> has resigned and left.";
        field_a = new int[8192];
    }
}
