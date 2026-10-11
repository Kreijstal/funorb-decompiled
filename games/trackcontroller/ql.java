/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends dd {
    static String field_q;

    final String c(byte param0, al param1) {
        RuntimeException var3 = null;
        al var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 49) {
            var4 = (al) null;
            this.c((byte) -78, (al) null);
          }
          stackIn_3_0 = uh.a(param1.field_s.length(), '*', (byte) 20);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ql.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 42) {
          byte[] var2 = (byte[]) null;
          ql.a(39, (byte[]) null, 29);
          field_q = null;
          return;
        }
        field_q = null;
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            ql.c(-93);
          }
          stackIn_3_0 = cl.a(1, param2, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ql.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    ql(int param0) {
        this(gk.field_c, param0);
    }

    private ql(oh param0, int param1) {
        super(param0, param1);
    }

    static {
        field_q = "Loading sound effects";
    }
}
