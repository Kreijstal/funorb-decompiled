/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends hl {
    static long field_E;
    static bk field_G;
    static java.awt.Image field_F;

    public static void a(int param0) {
        int var1 = 40 / ((param0 - 6) / 45);
        field_G = null;
        field_F = null;
    }

    private ua(String param0, pl param1) {
        this(param0, pj.field_a.field_i, param1);
        try {
            this.field_v = pj.field_a.field_m;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_D = !this.field_D ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private ua(String param0, ci param1, pl param2) {
        super(param0, param1, param2);
        try {
            this.field_v = pj.field_a.field_m;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ua(String param0, pl param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_D = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_G = new bk();
    }
}
