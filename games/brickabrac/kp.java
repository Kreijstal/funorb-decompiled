/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kp {
    static vl field_c;
    static dh field_b;
    static jp[] field_e;
    static int field_a;
    static Vector field_d;

    final static void a(int param0, byte param1, pn param2) {
        pi var6 = null;
        int var5 = 0;
        try {
            var6 = k.field_h;
            int var4 = 107 / ((44 - param1) / 45);
            var6.e(-13413, param0);
            var6.field_l = var6.field_l + 1;
            var5 = var6.field_l;
            var6.a(-117, 1);
            var6.a(-99, param2.field_p);
            var6.b(param2.field_n, (byte) 117);
            var6.a(param2.field_t, (byte) -79);
            var6.a(param2.field_r, (byte) -79);
            var6.a(param2.field_l, (byte) -79);
            var6.a(param2.field_k, (byte) -79);
            int discarded$0 = var6.d(3, var5);
            var6.d((byte) 124, -var5 + var6.field_l);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "kp.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        int var1 = 0;
        field_c = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new vl();
    }
}
