/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar {
    static String field_e;
    static java.awt.Font field_b;
    static String field_a;
    static String field_d;
    static ot field_c;
    static String field_f;

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param0 != 15707) {
            return;
        }
        try {
            var2_int = el.field_A;
            var3 = n.field_m;
            var4 = dw.field_e.field_X.b(param1, 500);
            var5 = 6 + dw.field_e.field_X.a(param1, 500);
            var6 = 2 + var4 * sh.field_c;
            var7 = ou.b(var5, var2_int, 12, 127);
            var8 = nj.a(var3, 20, var6, 29079);
            on.e(var7, var8, var5, var6, 0);
            on.a(var7 - -1, 1 + var8, var5 + -2, -2 + var6, 16777088);
            int discarded$0 = dw.field_e.field_X.a(param1, 3 + var7, var8 - (-1 + -ig.field_c) - dw.field_e.field_X.field_G, 500, 1000, 0, -1, 0, 0, sh.field_c);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ar.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable throwable = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Object discarded$2 = mm.a(new Object[1], so.a(-120), "resizing", 25449);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                throwable = decompiledCaughtException;
                break L1;
              }
            }
            if (param0 != 500) {
              var3 = null;
              ar.a(70, (String) null);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_f = null;
        field_e = null;
        field_c = null;
        int var1 = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "auctions";
        field_d = "Click 'My Results' to view the money, experience and points you won for this game.";
        field_a = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_f = "You can join this game";
    }
}
