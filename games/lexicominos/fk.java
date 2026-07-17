/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fk extends kb {
    static int field_e;
    static ng field_i;
    private long field_g;
    static long field_h;
    static String[] field_c;
    static String field_j;
    static int[] field_d;
    private String field_f;

    final void a(wf param0, int param1) {
        try {
            if (param1 != 7895) {
                bj discarded$0 = ((fk) this).a((byte) 17);
            }
            param0.a(((fk) this).field_g, (byte) 37);
            param0.a(param1 + -7895, ((fk) this).field_f);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "fk.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void b() {
        field_c = null;
        field_d = null;
        field_i = null;
        field_j = null;
    }

    bj a(byte param0) {
        if (param0 != 45) {
            field_j = null;
            return ej.field_a;
        }
        return ej.field_a;
    }

    final static void a(boolean param0, sh param1, byte param2, sh param3, sh param4) {
        try {
            qa.field_c = mb.a((byte) -63, "");
            qa.field_c.a((byte) 121, false);
            int discarded$0 = 109;
            ul.a(param1, param4, param3);
            int discarded$1 = 1;
            kf.f();
            bk.field_c = c.field_m;
            ee.field_c = c.field_m;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "fk.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 40 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static gb a() {
        int var1 = 0;
        int discarded$0 = 25594;
        return new gb(ve.b(), ja.a(-2116060060));
    }

    fk(long param0, String param1) {
        try {
            ((fk) this).field_f = param1;
            ((fk) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "fk.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_j = "Invalid password.";
        field_d = new int[8192];
    }
}
