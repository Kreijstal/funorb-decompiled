/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static int field_k;
    static String field_a;
    static String field_j;
    static sb field_f;
    static boolean field_b;
    static bd field_h;
    static jl field_e;
    static boolean field_d;
    static int field_g;
    static String field_i;
    static vi field_c;

    public static void a(byte param0) {
        field_j = null;
        field_a = null;
        field_h = null;
        field_f = null;
        if (param0 <= 125) {
            bd.a((byte) 110);
        }
        field_c = null;
        field_e = null;
        field_i = null;
    }

    final static void a(String param0, int param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        try {
            sb.field_n.field_T[0][bi.field_p] = 0;
            sb.field_n.field_T[0][re.field_b] = 14540253;
            for (var4_int = param2; var4_int < sb.field_n.field_G; var4_int++) {
                var5 = 169 - -(-76 * var4_int / sb.field_n.field_G);
                sb.field_n.field_T[0][wd.field_e] = hi.a(hi.a(var5 << -435920024, var5 << 1729126672), var5);
                eh.a(0, param3 + -sb.field_n.field_G + var4_int, 640, -sb.field_n.field_G + param3 - -var4_int - -1);
                sb.field_n.b(param0, param1, param3, 0, -1);
            }
            eh.a();
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "bd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = true;
        field_a = "Ranking: Polar Prince";
        field_i = "Hard hat: Protection from falling rock.";
    }
}
