/*
 * Decompiled by CFR-JS 0.4.0.
 */
class e extends bc {
    private String field_c;
    static String field_d;
    private long field_e;
    static la field_b;
    static int field_f;

    public static void b(boolean param0) {
        field_d = null;
        if (!param0) {
            field_d = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(fj param0, byte param1) {
        try {
            param0.a(118, this.field_e);
            param0.a((byte) 107, this.field_c);
            if (param1 != -71) {
                e.b(true);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "e.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    e(long param0, String param1) {
        try {
            this.field_e = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "e.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gq a(boolean param0) {
        if (param0) {
            field_d = (String) null;
            return hg.field_f;
        }
        return hg.field_f;
    }

    static {
        field_d = "This game has been updated! Please reload this page.";
    }
}
