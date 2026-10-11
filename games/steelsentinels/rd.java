/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static int[] field_a;
    static int field_b;
    static String field_c;

    final static gk[] a(boolean param0, cm param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        gk[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wa.a((byte) 30, param3, param2, param1)) {
            stackIn_2_0 = null;
            return (gk[]) (stackIn_2_0);
          }
          if (!param0) {
            field_a = (int[]) null;
          }
          stackIn_6_0 = ij.i(-71);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 8192) {
          return;
        }
        field_c = null;
    }

    final static int a(byte param0) {
        if (param0 > -68) {
          return -121;
        }
        return hb.field_b - hl.field_q;
    }

    static {
        field_a = new int[8192];
        field_c = "Research into <col=00ffff>laser weapons</col> is needed before the <%0> can be engineered.";
    }
}
