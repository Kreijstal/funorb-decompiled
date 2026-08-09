/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static boolean field_f;
    static gm field_c;
    static ot field_h;
    static String field_e;
    static int field_a;
    static String field_b;
    static boolean field_d;
    static int[] field_g;

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 != 29136) {
            String var2 = (String) null;
            fc.a((String) null, -116, 0);
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var4 = 0;
        try {
            po.field_f = false;
            wq.field_g = false;
            int var3_int = 123 / ((param2 - 22) / 47);
            if (null != rk.field_f) {
                if (!rk.field_f.field_C) {
                    return;
                }
                var4 = 1;
                if ((param1 ^ -1) != -9) {
                } else {
                    param1 = 2;
                    if (!hk.field_G) {
                        param0 = cb.field_f;
                    } else {
                        param0 = dt.field_j;
                    }
                    pb.field_E.a(ep.field_b, (byte) 120);
                }
                if ((param1 ^ -1) == -11) {
                    pc.a((byte) -126);
                    var4 = 0;
                }
                if (var4 != 0) {
                    if (!(!po.field_f)) {
                        param0 = vo.a((byte) -18, mh.field_l, new String[]{param0});
                    }
                    if (is.field_a) {
                        param0 = ai.field_L;
                    }
                    rk.field_f.a(param1, 101, param0);
                }
                if (-257 != (param1 ^ -1) && (param1 ^ -1) != -11 && !hk.field_G) {
                    pb.field_E.h((byte) -76);
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "fc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = 2;
        field_e = "Slight stagger";
        field_b = "rankings";
    }
}
