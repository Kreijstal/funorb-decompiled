/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static sb field_c;
    static ea field_d;
    static int field_b;
    static String field_a;

    final static ed a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        ed stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -75) {
            rf.a((byte) -48);
          }
          if (bd.field_h == ci.field_e) {
            stackIn_4_0 = null;
            return (ed) (stackIn_4_0);
          }
          if (bd.field_h == kd.field_p &&
            param1.equals(ic.field_m)) {
            bd.field_h = mc.field_t;
            stackIn_11_0 = sd.field_d;
            return stackIn_11_0;
          }
          ic.field_m = param1;
          sd.field_d = null;
          bd.field_h = ci.field_e;
          stackIn_9_0 = null;
          return (ed) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("rf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 13) {
          return false;
        }
        if (rj.field_f == 13) {
          stackIn_7_0 = true;
        } else {
          if (ul.field_b > 0) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 != -56) {
          rf.a((byte) -36);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_c = new sb(256);
        field_a = "Logging in...";
    }
}
