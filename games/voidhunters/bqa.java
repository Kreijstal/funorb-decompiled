/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bqa {
    static String field_f;
    static llb field_d;
    int field_a;
    int field_c;
    int field_b;
    int field_e;

    public static void a(byte param0) {
        field_f = null;
        if (param0 <= 104) {
          return;
        }
        field_d = null;
    }

    final static boolean a(boolean param0) {
        boolean stackIn_7_0 = false;
        if (param0) {
          return false;
        }
        if (fda.e((byte) 119)) {
          stackIn_7_0 = true;
        } else {
          if (hcb.field_o <= 0) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    private bqa() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Email is valid";
    }
}
