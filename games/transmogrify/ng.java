/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends wf {
    static String field_g;
    int field_k;
    int field_m;
    static hi field_j;
    static String[] field_i;
    static String[] field_l;
    static String field_h;

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_j = null;
        field_l = null;
        field_h = null;
        int var1 = 36 / ((param0 - 32) / 49);
    }

    private ng() throws Throwable {
        throw new Error();
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
            if (!(gl.field_y != 11)) {
                sd.q(274);
            }
            if (param0) {
                ng.a((byte) 43);
            }
            ch.a(58, ea.field_n, g.field_A, ah.field_a);
            ah.a(0, 0, (byte) 90, param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ng.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Names cannot contain consecutive spaces";
        field_j = new hi();
        field_l = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_h = "Connection timed out. Please try using a different server.";
    }
}
