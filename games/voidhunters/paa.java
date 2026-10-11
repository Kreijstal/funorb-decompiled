/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class paa extends rqa {
    static int field_q;
    static String field_o;
    static String field_p;

    final static int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        RuntimeException var11 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -30) {
            paa.a((String) null, 23, -125, 6, -23, 39, -65, -95, 6, 44, -47);
          }
          stackIn_3_0 = nua.a(param6, param2, param3, param8, param7, param0, param1, param9, -20, param5, param10, nua.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("paa.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
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
            stackIn_4_0 = new nc(frb.a(188, 108));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("paa.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    paa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 > -44) {
          field_q = 86;
          if (!li.field_i) {
            dma.d(param5, param3, param2, param4, param0);
            return;
          }
          if (ne.field_v) {
            og.field_r.a(param2, (byte) 120, param0 | -16777216, param4, param3, param5);
            return;
          }
          return;
        }
        if (!li.field_i) {
          dma.d(param5, param3, param2, param4, param0);
          return;
        }
        if (!ne.field_v) {
          return;
        }
        og.field_r.a(param2, (byte) 120, param0 | -16777216, param4, param3, param5);
    }

    public static void e(byte param0) {
        int var1 = 59 / ((param0 - 43) / 46);
        field_p = null;
        field_o = null;
    }

    static {
        field_o = "Fewer neutrals";
        field_p = "Enemy ship spawned";
    }
}
