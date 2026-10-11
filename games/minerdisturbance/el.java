/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    static boolean field_c;
    static String field_a;
    static String field_b;
    static char field_d;

    final static void a(int param0, int param1) {
        if (al.field_s != de.field_b &&
          aa.field_e != de.field_b) {
          if (param1 != -5629) {
            el.a(53, -55);
          }
          if (param0 == 0) {
            mm.a(false, h.field_d, 2, param1 + 5630, true, 2);
          }
          if (param0 == 1) {
            mm.a(false, eg.field_p, 2, 1, true, 2);
          }
          return;
        }
    }

    final static ea a(int param0, int param1, bj param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ea stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 2) {
            el.a(115, 46);
          }
          if (cn.a(param0, param3 + 256, param1, param2)) {
            stackIn_6_0 = ti.a(0);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (ea) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("el.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 2) {
          return;
        }
        field_b = null;
    }

    static {
        field_d = '"';
        field_c = false;
        field_a = "Charge: Explosives. Works underwater.";
        field_b = "Micro drill: Allows mining in mid-air.";
    }
}
