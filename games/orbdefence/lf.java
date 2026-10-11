/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_e;
    static String field_c;
    static int field_d;
    static im field_b;
    static ki field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = -2 % ((param0 - 29) / 52);
    }

    final static qj a(String param0, boolean param1) {
        RuntimeException var2 = null;
        qj stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        qj stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (qj) null;
            return stackIn_2_0;
          }
          if (tg.field_c == mg.field_m) {
            stackIn_5_0 = null;
            return (qj) (stackIn_5_0);
          }
          if (kf.field_d == tg.field_c &&
            param0.equals(pg.field_a)) {
            tg.field_c = tl.field_h;
            stackIn_9_0 = uc.field_q;
            return stackIn_9_0;
          }
          uc.field_q = null;
          pg.field_a = param0;
          tg.field_c = mg.field_m;
          stackIn_11_0 = null;
          return (qj) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("lf.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = 0;
    }
}
