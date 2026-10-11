/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static bk field_d;
    static int field_b;
    static int[] field_a;
    static int[] field_c;

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!param2) {
            bj.a(-127);
          }
          param1 = s.a(param1, '_', "", (byte) -10);
          var3 = vh.a(param1, 0);
          stackIn_7_0 = (param0.indexOf(param1) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("bj.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != -1) {
          field_b = 29;
        }
    }

    static {
        field_a = new int[8192];
        field_c = new int[8];
    }
}
