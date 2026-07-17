/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tja extends pb {
    static String field_p;
    static qaa field_q;
    private Object field_o;

    public static void a() {
        field_p = null;
        field_q = null;
    }

    final boolean a(int param0) {
        if (param0 != 14646) {
            Object discarded$0 = ((tja) this).f(6);
            return false;
        }
        return false;
    }

    final Object f(int param0) {
        if (param0 != 29243) {
            Object discarded$0 = ((tja) this).f(77);
            return ((tja) this).field_o;
        }
        return ((tja) this).field_o;
    }

    tja(Object param0, int param1) {
        super(param1);
        try {
            ((tja) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tja.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "+2 Loot Bags";
    }
}
