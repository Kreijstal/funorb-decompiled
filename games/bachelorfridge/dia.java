/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dia extends hf {
    static volatile int field_A;
    static String field_D;

    private dia(String param0, qda param1, pl param2) {
        super(param0, param1, param2);
        try {
            ((dia) this).field_f = fda.field_i.field_h;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        ((dia) this).field_B = !((dia) this).field_B ? true : false;
        super.a(param0, param1, param2, param3);
    }

    dia(String param0, pl param1, boolean param2) {
        this(param0, param1);
        try {
            ((dia) this).field_B = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private dia(String param0, pl param1) {
        this(param0, fda.field_i.field_r, param1);
        try {
            ((dia) this).field_f = fda.field_i.field_h;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_D = null;
        if (param0 != 14213) {
            dia.a(-32);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = -1;
        field_D = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
