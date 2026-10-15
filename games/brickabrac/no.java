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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 79) {
            field_p = (am) null;
          }
          stackIn_3_0 = this.field_u + 1365 << 6 ^ super.a(89, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("no.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_r = true;
        field_q = "Unfortunately you are not eligible to create an account.";
        field_s = "Chat is currently disabled.";
    }
}
