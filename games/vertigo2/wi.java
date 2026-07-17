/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends v {
    private String field_e;
    static fc[][] field_j;
    static int field_f;
    static cr field_g;
    static go[] field_d;
    private String field_i;
    static boolean[] field_h;

    public static void b() {
        field_d = null;
        int var1 = 81;
        field_j = null;
        field_g = null;
        field_h = null;
    }

    final tq a(byte param0) {
        if (param0 != -83) {
            return null;
        }
        return lb.field_e;
    }

    final void a(ed param0, int param1) {
        try {
            if (param1 != 47) {
                tq discarded$0 = ((wi) this).a((byte) -76);
            }
            param0.a(684868900, ((wi) this).field_e);
            param0.b(0, ((wi) this).field_i);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "wi.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    wi(String param0, String param1) {
        try {
            ((wi) this).field_i = param1;
            ((wi) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "wi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new go[6];
        field_f = -1;
        field_j = new fc[31][2];
        field_h = new boolean[64];
    }
}
