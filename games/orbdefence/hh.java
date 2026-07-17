/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends sh {
    private String field_a;
    private String field_b;
    static volatile boolean field_c;
    static i field_d;
    static String field_e;

    public static void b() {
        field_d = null;
        field_e = null;
    }

    final fk a(int param0) {
        if (param0 != 10277) {
            ((hh) this).field_a = null;
            return ci.field_b;
        }
        return ci.field_b;
    }

    hh(String param0, String param1) {
        try {
            ((hh) this).field_a = param1;
            ((hh) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "hh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void c(int param0) {
        kg.field_h.field_b = 0;
        if (param0 != 24060) {
            hh.c(-57);
            kg.field_h.field_n = 0;
            return;
        }
        kg.field_h.field_n = 0;
    }

    final void a(mg param0, int param1) {
        try {
            param0.a(false, ((hh) this).field_b);
            if (param1 != 27557) {
                Object var4 = null;
                ((hh) this).a((mg) null, 15);
            }
            param0.a((byte) -127, ((hh) this).field_a);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "hh.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_d = new i();
        field_e = "MY HISCORES";
    }
}
