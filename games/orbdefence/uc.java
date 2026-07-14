/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends wj {
    byte[] field_u;
    eh field_s;
    static String field_r;
    int field_t;
    static qj field_q;

    final static qg a(boolean param0, String param1, ki param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0) {
          field_r = null;
          var4 = param2.a(param1, 0);
          var5 = param2.a(param3, 5187, var4);
          return e.a(var4, var5, param2, 26052);
        } else {
          var4 = param2.a(param1, 0);
          var5 = param2.a(param3, 5187, var4);
          return e.a(var4, var5, param2, 26052);
        }
    }

    final int e(int param0) {
        if (param0 != 100) {
            qg discarded$18 = uc.a(false, (String) null, (ki) null, (String) null);
            if (!(!((uc) this).field_l)) {
                return 0;
            }
            return 100;
        }
        if (!(!((uc) this).field_l)) {
            return 0;
        }
        return 100;
    }

    final byte[] f(int param0) {
        if (param0 != 0) {
            return null;
        }
        if (((uc) this).field_l) {
            throw new RuntimeException();
        }
        return ((uc) this).field_u;
    }

    public static void d(byte param0) {
        field_q = null;
        field_r = null;
        if (param0 >= -67) {
            field_r = null;
        }
    }

    uc() {
    }

    static {
    }
}
