/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    static boolean field_a;
    static String field_c;
    static int field_d;
    static int[] field_b;

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        try {
            jf.e(640);
            gl.field_E.l(24910);
            ra.field_y = new rl(qg.field_c, (String) null, vg.field_o, param2, param1);
            re.field_g = new pj(gl.field_E, (al) (Object) ra.field_y);
            gl.field_E.d((byte) -70, (al) (Object) re.field_g);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "jb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + 0 + ')');
        }
    }

    final static void a(byte param0, boolean param1, nb param2, int param3, java.awt.Component param4, int param5, uf param6, int param7) {
        try {
            oa.a(22050, true, 10);
            sb.field_b = oa.a(param6, param4, 0, 22050);
            g.field_x = oa.a(param6, param4, 1, 1024);
            qc.field_e = new k();
            kk.field_h = 46;
            g.field_x.a((wh) (Object) qc.field_e);
            fj.field_P = param2;
            fj.field_P.d(16384, kc.field_b);
            sb.field_b.a((wh) (Object) fj.field_P);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "jb.B(" + -109 + ',' + true + ',' + (param2 != null ? "{...}" : "null") + ',' + 22050 + ',' + (param4 != null ? "{...}" : "null") + ',' + 1024 + ',' + (param6 != null ? "{...}" : "null") + ',' + 22050 + ')');
        }
    }

    final static void a(boolean param0) {
        rj.field_d.field_e = 0;
        rj.field_d.field_b = 0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
