/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mgb extends rqa {
    static boolean field_o;
    static int field_q;
    static int[] field_p;

    public static void e(byte param0) {
        if (param0 != -49) {
          field_o = false;
          field_p = null;
          return;
        }
        field_p = null;
    }

    mgb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(27, 62, param0[0].a(15));
          if (param1 <= -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mgb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = 33;
        field_p = new int[8192];
    }
}
