/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends ic {
    static int field_p;
    private String field_r;
    static String field_q;
    static String field_n;
    static int field_m;
    static String field_s;
    private String field_o;

    final pi b(int param0) {
        if (param0 != 7) {
            Object var3 = null;
            ((mn) this).a((k) null, -78);
            return uq.field_b;
        }
        return uq.field_b;
    }

    public static void c(int param0) {
        field_s = null;
        field_q = null;
        field_n = null;
        if (param0 != 3) {
            mn.c(96);
        }
    }

    final void a(k param0, int param1) {
        try {
            if (param1 != -1) {
                field_q = null;
            }
            param0.b(-16171, ((mn) this).field_r);
            param0.a(param1 ^ -13067, ((mn) this).field_o);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mn.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    mn(String param0, String param1) {
        try {
            ((mn) this).field_r = param0;
            ((mn) this).field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 200;
        field_q = "Honour";
        field_m = 3;
        field_n = "Seriously offensive language";
        field_s = "Enough playing around.";
    }
}
