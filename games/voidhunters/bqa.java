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
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (!param0) {
          L0: {
            if (fda.e((byte) 119)) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if ((hcb.field_o ^ -1) < -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    private bqa() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Email is valid";
    }
}
