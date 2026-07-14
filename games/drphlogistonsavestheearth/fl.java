/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    int field_c;
    static df field_a;
    static int field_f;
    int field_b;
    int field_g;
    static String field_e;
    static boolean field_i;
    static String field_d;
    int field_h;

    final static String a(boolean param0) {
        if (fk.field_q == hg.field_ub) {
            return ol.field_j;
        }
        if (param0) {
            return null;
        }
        return nd.field_K;
    }

    public static void a(int param0) {
        if (param0 <= 42) {
          field_f = -71;
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static boolean b(int param0) {
        if (param0 < 6) {
            field_a = null;
            return kc.field_k;
        }
        return kc.field_k;
    }

    final static boolean a(int param0, vj param1, int param2, byte param3) {
        byte[] var5 = null;
        byte[] var4 = null;
        if (param3 != -98) {
            String discarded$0 = fl.a(true);
            var5 = param1.a(param2, param0, (byte) 35);
            var4 = var5;
            if (!(var5 != null)) {
                return false;
            }
            lk.a(var5, param3 ^ -55);
            return true;
        }
        var5 = param1.a(param2, param0, (byte) 35);
        var4 = var5;
        if (!(var5 != null)) {
            return false;
        }
        lk.a(var5, param3 ^ -55);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Email is valid";
        field_i = true;
    }
}
