/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends rqa {
    static long field_q;
    static String field_p;
    static int[] field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            hj.a(-119, (byte) -60);
          }
          stackIn_3_0 = new nc(frb.a(26, 107));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hj.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 < 2) {
          field_q = 35L;
          field_o = null;
          field_p = null;
          return;
        }
        field_o = null;
        field_p = null;
    }

    hj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        if (param1 <= -93) {
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        }
        hj.a(126, (byte) 26);
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    static {
        field_p = "Tutorial tips: On";
        field_o = new int[8192];
    }
}
