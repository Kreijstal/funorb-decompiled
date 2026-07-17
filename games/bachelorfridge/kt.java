/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends pp {
    static int field_k;
    static sna field_m;
    int field_l;
    static int field_j;
    static boolean field_i;

    final void a(lu param0, byte param1) {
        try {
            er.a(((kt) this).field_h, 120, param0);
            int var3_int = 51 % ((param1 - 34) / 58);
            param0.d(((kt) this).field_l, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kt.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != -23401) {
            kt.a(89);
            field_m = null;
            return;
        }
        field_m = null;
    }

    kt(nq param0, int param1) {
        try {
            ((kt) this).field_l = param1;
            ((kt) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kt.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(aga param0, op param1, int param2) {
        aga var4 = null;
        try {
            var4 = ((kt) this).field_h.a(param2 ^ 93, param1);
            var4.j(((kt) this).field_l, param2 ^ param2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kt.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
    }
}
