/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as {
    static long field_b;
    static String field_a;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static cp a(gk param0, int param1, gk param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        cp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -89) {
            field_b = -94L;
          }
          var5_int = param2.b(param4, 0);
          var6 = param2.a(-110, var5_int, param3);
          stackIn_3_0 = uc.a(121, param0, var6, param2, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("as.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (null != vn.field_f) {
          vn.field_f.j(0);
        }
        int var1 = -41 % ((param0 + 56) / 53);
        if (null != fu.field_d) {
          fu.field_d.k(-116);
        }
        fo.b(0);
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 < 120) {
          field_c = -80;
        }
    }

    static {
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
