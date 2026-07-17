/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wc extends lb {
    static ko field_q;

    wc(int param0) {
        this(ai.field_h, param0);
    }

    public static void b(byte param0) {
        field_q = null;
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        try {
            if (!(!param4)) {
                ca.a((byte) -125, param3.field_r + param2, param0 + param3.field_j, param3.field_f, param3.field_g);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "wc.B(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    wc(vc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_o, -1, 2147483647, false);
    }

    static {
    }
}
