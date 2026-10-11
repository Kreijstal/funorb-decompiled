/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static te field_b;
    static le field_d;
    static String field_a;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 1) {
          return;
        }
        field_a = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (bg.a(4826, param2)) {
            return false;
          }
          if (sg.a(param2, false)) {
            return false;
          }
          if (tl.a(0, param2)) {
            return false;
          }
          if (0 == param0.length()) {
            return true;
          }
          if (qj.a(param2, false, param0)) {
            return false;
          }
          var3_int = -121 % ((param1 - 42) / 59);
          if (ue.a(param2, param0, (byte) -84)) {
            return false;
          }
          if (!di.a(95, param0, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("ph.A(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_b = new te(14, 0, 4, 1);
        field_a = "Next";
    }
}
