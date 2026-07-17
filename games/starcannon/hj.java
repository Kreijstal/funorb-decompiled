/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    boolean field_e;
    static String[] field_b;
    static bg field_c;
    String field_a;
    static volatile int field_d;
    String field_f;

    final static void a(int param0, int param1, ka param2, int param3, int param4, int param5, int param6, String param7, int param8) {
        try {
            md.field_b = param7;
            int var9_int = 22;
            wj.field_b = param1;
            kc.field_M = param6;
            va.field_s = param8;
            ac.field_e = param5;
            ld.field_fb = param0;
            ij.field_f = param2;
            ob.field_b = param3;
            jh.field_b = (eh) (Object) new vh();
            bc.field_j = new ef(param2);
            bl.field_b = new jc(jh.field_b, bc.field_j);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hj.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + 78 + 44 + param5 + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 44 + param8 + 41);
        }
    }

    public static void a() {
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"All scores", "My scores", "Best each"};
        field_d = -1;
        field_c = new bg();
    }
}
