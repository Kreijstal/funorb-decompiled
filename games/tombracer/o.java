/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends ora implements sca {
    private int field_c;
    static hea field_d;

    public final long b(int param0) {
        if (param0 != 19135) {
            ((o) this).field_c = 80;
            return ((o) this).field_b.getAddress();
        }
        return ((o) this).field_b.getAddress();
    }

    public final void a(int param0, int param1, byte[] param2, int param3) {
        try {
            ((o) this).a(param2, param0);
            if (param1 != -11783) {
                int discarded$0 = ((o) this).a(100);
            }
            ((o) this).field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "o.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public final int a(int param0) {
        if (param0 != 9624) {
            ((o) this).field_c = 12;
            return 0;
        }
        return 0;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 != -1) {
            return true;
        }
        return (540800 & param2) != 0 ? true : false;
    }

    final static boolean e(int param0) {
        if (param0 != 540800) {
            return false;
        }
        if (oba.field_e == null) {
            return false;
        }
        if (km.field_p != uga.field_n) {
            return false;
        }
        return true;
    }

    public static void d(int param0) {
        field_d = null;
        if (param0 != 0) {
            field_d = null;
        }
    }

    public final int c(int param0) {
        if (param0 != -1771) {
            ((o) this).field_c = -125;
            return ((o) this).field_c;
        }
        return ((o) this).field_c;
    }

    o(cka param0, int param1, byte[] param2, int param3) {
        super(param0, param2, param3);
        try {
            ((o) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "o.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
    }
}
