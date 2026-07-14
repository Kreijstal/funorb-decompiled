/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends li {
    ra field_r;
    int field_p;
    static cr field_o;
    static int[] field_n;
    li field_q;
    static String field_s;

    final static void a(String param0, boolean param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param0);
                var3 = ar.a(param2, var3, 0);
                hc.a(var3.toString(), 16011, param1, param2);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_s = null;
        field_o = null;
        field_n = null;
        if (param0 > -68) {
            field_n = null;
        }
    }

    gg(ra param0, li param1) {
        ((gg) this).field_r = param0;
        ((gg) this).field_p = param0.h();
        ((gg) this).field_q = param1;
        ((gg) this).field_r.g(tg.field_e * ((gg) this).field_p + 128 >> 1665928232);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[5];
        field_s = "Pick up a paint pot by moving over it and then paint all the tiles purple! Be careful not to fall off the bottom of the level or you'll lose a life.";
    }
}
