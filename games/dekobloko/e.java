/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static String field_c;
    static String field_a;
    static String field_d;
    static ck field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 == -22811) {
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
        e.b(91);
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void b(int param0) {
        lj.field_a = null;
        wf.field_s = null;
        if (param0 != -8621) {
          field_c = (String) null;
        }
    }

    final static nj a(ji param0, int param1, int param2, byte param3, ji param4) {
        RuntimeException var5 = null;
        nj stackIn_5_0 = null;
        nj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gb.a(param1, param4, param2, 102)) {
            return null;
          }
          if (param3 == -75) {
            stackIn_7_0 = on.a(param0.a(param2, 75, param1), (byte) 25);
            return stackIn_7_0;
          }
          stackIn_5_0 = (nj) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("e.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_d = "<%0> CHAIN";
        field_c = "Password is valid";
        field_a = "Cancel draw";
    }
}
