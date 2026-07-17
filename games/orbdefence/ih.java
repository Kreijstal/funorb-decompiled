/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_b;
    static int field_a;

    final static void a(String param0, int param1, float param2, boolean param3) {
        try {
            if (na.field_c == null) {
                na.field_c = new ve(bm.field_d, bm.field_a);
                bm.field_d.b((byte) 74, (pj) (Object) na.field_c);
            }
            na.field_c.a(param3, param0, param2, 2113632);
            ul.d();
            m.a(true, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ih.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 > -121) {
            ih.a(5);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You cannot afford this turret";
        field_a = 0;
    }
}
