/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kmb {
    static String field_b;
    static String field_e;
    static boolean field_c;
    static int field_a;
    static int field_f;
    static String field_d;

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 18700) {
            kmb.a(9);
          }
          if (di.field_l == null) {
            return;
          }
          di.field_l.a(dpa.field_p, param1 ^ -17690, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("kmb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 32768) {
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
        field_f = 35;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    static {
        field_e = "Toggle debug mode";
        field_c = false;
        field_b = "Mosquito chassis";
        field_d = "Waiting for players...";
        field_f = 32768;
    }
}
