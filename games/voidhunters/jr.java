/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends rqa {
    final static im a(int param0, int param1, int param2, qfa param3, int param4) {
        RuntimeException var5 = null;
        im stackIn_2_0 = null;
        im stackIn_8_0 = null;
        im stackIn_11_0 = null;
        im stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 28) {
            stackIn_2_0 = (im) null;
            return stackIn_2_0;
          }
          if (!param3.field_n && (!bd.a(param1, (byte) -95) ||
            !bd.a(param2, (byte) -95))) {
            if (param3.field_g) {
              stackIn_13_0 = new im(param3, 34037, param4, param1, param2);
              return stackIn_13_0;
            }
            stackIn_11_0 = new im(param3, param4, param1, param2, hj.a(param1, (byte) -106), hj.a(param2, (byte) -106));
            return stackIn_11_0;
          }
          stackIn_8_0 = new im(param3, 3553, param4, param1, param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("jr.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    jr(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          if (param1 > -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(28, 62, param0[0].a(115));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jr.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
