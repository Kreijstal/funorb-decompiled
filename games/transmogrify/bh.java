/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static int field_c;
    static int[] field_a;
    static String[] field_b;

    final static fc a(int param0, String param1) {
        RuntimeException var2 = null;
        fc stackIn_2_0 = null;
        fc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -64) {
            stackIn_4_0 = new fc(param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (fc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("bh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static ti[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 <= -109) {
          return nj.a(1, param4, param2, 3, 1, param3, 103, 1, param0);
        }
        field_b = (String[]) null;
        return nj.a(1, param4, param2, 3, 1, param3, 103, 1, param0);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 88) {
          field_c = -60;
        }
    }

    static {
        field_c = 0;
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
