/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qe {
    cka field_a;
    static String field_b;

    abstract void a(int param0, int param1, kl param2);

    public static void a(int param0) {
        field_b = null;
        if (param0 != -18318) {
            field_b = (String) null;
        }
    }

    qe(cka param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(boolean param0);

    abstract void b(boolean param0, int param1);

    abstract boolean b(int param0);

    abstract void a(boolean param0, int param1);

    abstract void a(int param0, int param1, int param2);

    static {
        field_b = "Only show lobby chat from my friends";
    }
}
