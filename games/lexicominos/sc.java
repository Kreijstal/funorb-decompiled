/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static int field_f;
    static int field_b;
    static wh field_d;
    static String field_a;
    static boolean field_e;
    static int field_g;
    static String field_c;

    final static void a(int param0, byte param1, String param2) {
        int var4 = 0;
        try {
            gb.field_d = false;
            dl.field_g = false;
            int var3_int = 38 / ((-9 - param1) / 61);
            if (null != jj.field_a && jj.field_a.field_D) {
                var4 = 1;
                if (param0 != 8) {
                } else {
                    param0 = 2;
                    if (ca.field_k) {
                        param2 = fk.field_j;
                    } else {
                        param2 = l.field_C;
                    }
                    eb.field_b.a(3, dd.field_d);
                }
                if (!((param0 ^ -1) != -11)) {
                    var4 = 0;
                    qf.g(-94);
                }
                if (!(var4 == 0)) {
                    if (dl.field_g) {
                        param2 = da.a(new String[]{param2}, Lexicominos.field_F, false);
                    }
                    if (lh.field_w) {
                        param2 = id.field_u;
                    }
                    jj.field_a.a(-109, param0, param2);
                }
                if (-257 != (param0 ^ -1)) {
                    if (param0 == 10) {
                        return;
                    }
                    if (ca.field_k) {
                        return;
                    }
                    eb.field_b.d((byte) -100);
                }
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        g.field_n = param1;
        if (param0 >= -32) {
            return;
        }
        ec.field_c = param2;
        ea.field_b = param3;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -110 / ((-24 - param0) / 45);
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "Confirm Password: ";
        field_f = 0;
        field_e = false;
    }
}
