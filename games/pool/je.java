/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_c;
    static String field_a;
    static String field_b;

    final static void a(sj param0, int param1, int param2, int param3, String param4, byte param5, int param6, int param7, int param8) {
        try {
            na.field_a = param6;
            nr.field_X = param4;
            ei.field_B = param8;
            qf.field_f = param2;
            ci.field_k = param1;
            om.field_v = param7;
            fe.field_M = param0;
            wn.field_h = param3;
            sq.field_c = (no) (Object) new ug();
            ri.field_U = new rn(param0);
            nk.field_m = new qd(sq.field_c, ri.field_U);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "je.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + -96 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static boolean b() {
        if (fk.field_gb == null) {
            return false;
        }
        if (!fk.field_gb.e(100)) {
            return false;
        }
        return true;
    }

    public static void a() {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, boolean param2, byte[] param3) {
        oq var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var6 = ej.field_j;
            var6.b(false, 11);
            var6.field_v = var6.field_v + 1;
            var7 = var6.field_v;
            var6.a(4, false);
            var6.a(param1, false);
            var8 = 0;
            var8 += 128;
            var6.a(var8, false);
            var6.a(param3, (byte) 0, 0, param3.length);
            var6.b(var6.field_v - var7, true);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "je.D(" + 11 + ',' + param1 + ',' + true + ',' + (param3 != null ? "{...}" : "null") + ',' + 0 + ',' + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Click or press F10 to open Quick Chat";
        field_b = "Tips";
        field_a = "To enter <u=ffffff>shot mode</u>: <col=99ff99>Press</col> <img=4>, or <img=0> click on the cue ball once.";
    }
}
