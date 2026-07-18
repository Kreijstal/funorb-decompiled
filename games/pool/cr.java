/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends ma {
    static String field_q;
    static int[] field_p;
    static int field_l;
    static String field_s;
    int field_r;
    static dd field_m;
    int field_n;
    static jg field_o;
    static String field_t;

    final static int a(int param0, double param1) {
        if (param0 != 4885) {
            return ud.a(param1, 3, 1);
        }
        return ud.a(param1, 3, 1);
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            iq.field_j = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            nn.a(var4, (byte) -120, param1, var3, var2);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cr.D(" + 16 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_p = null;
        field_t = null;
        field_m = null;
        field_q = null;
        field_s = null;
    }

    final static double a(byte param0, long param1) {
        if (param0 != 89) {
            int discarded$0 = cr.a(-26, 0.6233354276237926);
            return bb.a((byte) -107, 16, param1);
        }
        return bb.a((byte) -107, 16, param1);
    }

    cr(int param0, int param1) {
        ((cr) this).field_r = param1;
        ((cr) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "You need to play <%0> more rated games to unlock this option.";
        field_q = "You potted the 9 ball illegally. I will re-spot it for you so you can continue.";
        field_t = "achievements to collect";
    }
}
