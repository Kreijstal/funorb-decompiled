/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static int field_i;
    static String field_e;
    int field_f;
    static int field_c;
    static long field_b;
    int field_d;
    static String field_g;
    int field_a;
    int field_h;

    final static void a(byte param0, int param1) {
        if (param0 != 121) {
            field_e = (String) null;
            oj.field_c = 1000000000L / (long)param1;
            return;
        }
        oj.field_c = 1000000000L / (long)param1;
    }

    public static void a(int param0) {
        int var1 = 12 % ((-27 - param0) / 57);
        field_e = null;
        field_g = null;
    }

    final static rh a(int param0, byte param1, boolean param2, boolean param3, int param4) {
        if (param1 >= -13) {
            return (rh) null;
        }
        return am.a(-90, param0, param3, param4, param2, false);
    }

    final static boolean a(byte param0, rh param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 12 % ((-57 - param0) / 57);
          stackIn_1_0 = param1.b(true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var2);
          stackIn_4_1 = new StringBuilder().append("rj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_c = 5167632;
        field_i = 500;
        field_e = "Quit to website";
        field_g = "Logging in...";
    }
}
