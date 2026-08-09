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
        this.field_u = param4;
    }

    public static void d(byte param0) {
        field_s = null;
        field_t = (jp[][]) null;
        int var1 = -78 % ((-14 - param0) / 61);
        field_q = null;
        field_p = null;
    }

    int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 79) {
                break L1;
              } else {
                field_p = (am) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_u + 1365 << 637558534 ^ super.a(89, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("no.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_r = true;
        field_q = "Unfortunately you are not eligible to create an account.";
        field_s = "Chat is currently disabled.";
    }
}
