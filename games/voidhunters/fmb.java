/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fmb extends rqa {
    static String field_p;
    static int[] field_o;
    static String field_q;
    static int field_r;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ah.field_o[3] = param3;
        if (param0 >= 2) {
          ah.field_o[0] = param2;
          ah.field_o[2] = param1;
          ah.field_o[1] = param4;
          return;
        }
    }

    fmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        if (param0 != 0) {
          fmb.a(36, 75, 97, 14, 66);
        }
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
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(161, 103));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fmb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = "Mass driver";
        field_p = "Your game";
        field_r = 0;
    }
}
