/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gva extends Exception {
    String field_b;
    static dja field_a;

    public static void a(boolean param0) {
        field_a = null;
    }

    final static void a() {
        int discarded$5 = 44;
        if (!(uab.a())) {
            return;
        }
        int var1 = -35;
        wha.a(2, false, 4);
    }

    gva(String param0) {
        try {
            ((gva) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "gva.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
