/*
 * Decompiled by CFR-JS 0.4.0.
 */
class no extends vi {
    static volatile boolean field_r;
    static String field_q;
    static String field_s;
    static jp[][] field_t;
    int field_u;
    static am field_p;

    no(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param5);
        ((no) this).field_u = param4;
    }

    public static void d(byte param0) {
        field_s = null;
        field_t = null;
        int var1 = -78 % ((-14 - param0) / 61);
        field_q = null;
        field_p = null;
    }

    int a(int param0, StringBuilder param1) {
        if (param0 < 79) {
          field_p = null;
          return ((no) this).field_u + 1365 << 637558534 ^ super.a(89, param1);
        } else {
          return ((no) this).field_u + 1365 << 637558534 ^ super.a(89, param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = true;
        field_q = "Unfortunately you are not eligible to create an account.";
        field_s = "Chat is currently disabled.";
    }
}
