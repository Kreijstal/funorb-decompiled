/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -28) {
          rr.b(-91);
        }
    }

    final static ru b(int param0) {
        ru var1 = new ru(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[param0], vj.field_j[0], MovementPresentation.field_j);
        rj.d((byte) 99);
        return var1;
    }

    final static boolean a(byte param0, PacketBuffer param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.k(0);
          stackIn_3_0 = (1 != var2_int) ? 0 : 1;
          var3 = stackIn_3_0;
          if (param0 != -76) {
            field_a = (String) null;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("rr.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_b = "You have already reached maximum favour with <%0>.";
        field_a = "Back to <%0>";
    }
}
