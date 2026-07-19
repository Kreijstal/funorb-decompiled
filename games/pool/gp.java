/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp {
    static int field_b;
    static na field_d;
    static int field_c;
    static String field_a;
    static int[] field_e;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 != 63) {
            return;
        }
        field_d = null;
    }

    final static void a(byte param0, sf param1) {
        try {
            param1.field_A = new char[]{(char)63};
            if (param0 < 9) {
                field_d = (na) null;
            }
            param1.field_D = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "gp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, i param1, int param2) {
        oq var6 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var6 = ej.field_j;
            var6.b(false, param0);
            var6.field_v = var6.field_v + 1;
            if (param2 != -6725) {
                i var5 = (i) null;
                gp.a(80, (i) null, -101);
            }
            var4 = var6.field_v;
            var6.a(1, false);
            var6.a(param1.field_r, false);
            var6.a(param1.field_n, false);
            var6.a(true, param1.field_p);
            var6.a(true, param1.field_s);
            var6.a(true, param1.field_t);
            var6.a(true, param1.field_q);
            discarded$0 = var6.d(-1, var4);
            var6.b(-var4 + var6.field_v, true);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "gp.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = 33;
        field_a = "Names should contain a maximum of 12 characters";
        field_d = new na();
    }
}
