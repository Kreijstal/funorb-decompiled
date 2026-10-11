/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jp {
    static String field_b;
    static int[] field_a;
    static String field_d;
    static String field_c;

    abstract byte[] a(int param0, int param1);

    abstract kj a(byte param0);

    public static void b(byte param0) {
        if (param0 >= -42) {
          return;
        }
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 <= 110) {
          jp.b((byte) -3);
          bn.field_I.a(param5, param0, param4, 256, param2);
          if (null != bo.field_h) {
            bo.field_h.a(param0, param6 - di.field_a, param3, param6, (byte) -94, param0);
            return;
          }
          return;
        }
        bn.field_I.a(param5, param0, param4, 256, param2);
        if (null == bo.field_h) {
          return;
        }
        bo.field_h.a(param0, param6 - di.field_a, param3, param6, (byte) -94, param0);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (null == eg.field_n) {
          eg.field_n = null;
          bj.field_d = null;
          var1 = -128 / ((-64 - param0) / 33);
          return;
        }
        if (null != eg.field_n.field_o) {
          eg.field_n.field_o.field_U = false;
          eg.field_n = null;
          bj.field_d = null;
          var1Lifetime1 = -128 / ((-64 - param0) / 33);
          return;
        }
        eg.field_n = null;
        bj.field_d = null;
        var1Lifetime2 = -128 / ((-64 - param0) / 33);
    }

    final static int a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8192) {
            field_d = (String) null;
          }
          if (!param2) {
            stackIn_6_0 = lm.field_o.c(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = ie.field_G.c(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jp.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    abstract int b(int param0, int param1);

    static {
        field_a = new int[8192];
        field_d = "You have not yet unlocked this option for use.";
        field_b = "Please remove <%0> from your friend list first.";
    }
}
