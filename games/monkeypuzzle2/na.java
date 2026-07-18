/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    final static Boolean a() {
        int var1 = 0;
        Boolean var2 = kc.field_b;
        kc.field_b = null;
        return var2;
    }

    final static void a(byte param0, li param1) {
        if (param0 <= 17) {
            return;
        }
        try {
            bd.field_c.a(-8212, (ug) (Object) new hk(param1, (ug) (Object) param1));
            qb.field_c.a((fh) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "na.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
