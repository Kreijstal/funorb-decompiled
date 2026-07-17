/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um extends oh {
    static int field_f;

    um() {
    }

    final int a(byte param0, boolean param1) {
        if (param0 >= -53) {
            int discarded$0 = ((um) this).a((byte) -63, true);
            return 16;
        }
        return 16;
    }

    final int a(int param0, int param1) {
        if (param0 != 1843275042) {
            return -115;
        }
        return q.field_a[ma.field_n[param1]].field_e[1];
    }

    final static void a(int param0, String param1, byte param2) {
        try {
            if (param2 < 74) {
                field_f = 41;
            }
            gh.a(param1, 12, qd.field_r, param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "um.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
    }
}
