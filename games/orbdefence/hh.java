/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends sh {
    private String field_a;
    private String field_b;
    static volatile boolean field_c;
    static i field_d;
    static String field_e;

    public static void b(int param0) {
        field_d = null;
        if (param0 >= -24) {
            field_c = true;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final fk a(int param0) {
        if (param0 != 10277) {
            this.field_a = (String) null;
            return ci.field_b;
        }
        return ci.field_b;
    }

    hh(String param0, String param1) {
        try {
            this.field_a = param1;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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
            param0.a(false, this.field_b);
            if (param1 != 27557) {
                mg var4 = (mg) null;
                this.a((mg) null, 15);
            }
            param0.a((byte) -127, this.field_a);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = true;
        field_d = new i();
        field_e = "MY HISCORES";
    }
}
