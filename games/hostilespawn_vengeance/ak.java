/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    int field_e;
    int field_d;
    static vl field_i;
    int field_k;
    int field_j;
    static bd field_a;
    static pg[] field_b;
    static int field_f;
    static int[] field_c;
    static String field_g;
    static pg[] field_h;

    final static void a(boolean param0, String param1, String param2) {
        try {
            if (null != jj.field_d) {
                jj.field_d.g((byte) -122);
            }
            ib.field_e = new lk(param2, param1, false, true, true);
            ke.field_s.b((ag) (Object) ib.field_e, (byte) 110);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ak.A(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_h = null;
        field_b = null;
        field_i = null;
        if (param0 != -15673) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new vl();
        field_f = 0;
        field_c = new int[]{5, 17, 18};
        field_g = "Email is valid";
    }
}
