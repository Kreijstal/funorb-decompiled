/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends b {
    private Object field_p;
    static boolean field_o;

    la(Object param0, int param1) {
        super(param1);
        try {
            ((la) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "la.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean b(byte param0) {
        int var2 = 78 % ((param0 - -87) / 32);
        return false;
    }

    final static dd a(Throwable param0, String param1) {
        dd var2 = null;
        if (param0 instanceof dd) {
            var2 = (dd) (Object) param0;
            var2.field_c = var2.field_c + 32 + param1;
        } else {
            var2 = new dd(param0, param1);
        }
        return var2;
    }

    final Object a(byte param0) {
        if (param0 != -78) {
            field_o = false;
            return ((la) this).field_p;
        }
        return ((la) this).field_p;
    }

    static {
    }
}
