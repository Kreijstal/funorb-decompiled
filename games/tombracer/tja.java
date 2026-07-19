/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tja extends pb {
    static String field_p;
    static qaa field_q;
    private Object field_o;

    public static void a(boolean param0) {
        field_p = null;
        field_q = null;
        if (param0) {
            tja.a(false);
        }
    }

    final boolean a(int param0) {
        Object discarded$0 = null;
        if (param0 != 14646) {
            discarded$0 = this.f(6);
            return false;
        }
        return false;
    }

    final Object f(int param0) {
        Object discarded$0 = null;
        if (param0 != 29243) {
            discarded$0 = this.f(77);
            return this.field_o;
        }
        return this.field_o;
    }

    tja(Object param0, int param1) {
        super(param1);
        try {
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_p = "+2 Loot Bags";
    }
}
