/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cd extends fl {
    static long field_t;
    static int[] field_q;
    static String field_r;
    static cn field_s;
    static String field_u;
    static int field_v;

    cd() {
    }

    public static void f(int param0) {
        field_r = null;
        field_s = null;
        field_q = null;
        if (param0 != -1) {
          field_q = (int[]) null;
          field_u = null;
          return;
        }
        field_u = null;
    }

    final static tk a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        tk var5 = null;
        tk stackIn_4_0 = null;
        tk stackIn_8_0 = null;
        tk stackIn_12_0 = null;
        tk stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (param0 == var2_int) {
              stackIn_8_0 = mf.field_d;
              return stackIn_8_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            var5 = sf.a(var3, (byte) 119);
            if (var5 != null) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
            stackIn_14_0 = rn.a(var4, ~param0);
            return stackIn_14_0;
          }
          stackIn_4_0 = ig.field_g;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("cd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_r = "Waiting for levels";
        field_u = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new cn();
        field_v = -1;
    }
}
