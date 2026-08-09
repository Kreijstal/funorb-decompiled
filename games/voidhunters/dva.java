/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dva extends rqa {
    static long field_p;
    static boolean field_o;

    dva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_p = -121L;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(142, 97));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("dva.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, lta param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            hha.a(param1.a(param0, (byte) 127), (byte) 66, param1.a(param7, (byte) 123), param1.b(true, param4), param5, param1.b(true, param2), param6);
            var8_int = -param0 + param7;
            var9 = param2 + -param4;
            var10 = -(var9 / 8) + param0 + var8_int * 3 / 4;
            var11 = var8_int / 8 + (3 * var9 / 4 + param4);
            hha.a(param1.a(var10, (byte) 116), (byte) 66, param1.a(param7, (byte) 116), param1.b(true, var11), param5, param1.b(true, param2), param6);
            var10 = param0 - (-(3 * var8_int / 4) + -(var9 / 8));
            var11 = -(var8_int / 8) + param4 - -(param3 * var9 / 4);
            hha.a(param1.a(var10, (byte) 125), (byte) 66, param1.a(param7, (byte) 121), param1.b(true, var11), param5, param1.b(true, param2), param6);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "dva.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void e(byte param0) {
        fja.a(11);
        ce.b(false);
        wlb.f((byte) 64);
        jk.h(118);
        if (param0 <= 87) {
            field_o = true;
        }
    }

    static {
        field_p = 0L;
        field_o = false;
    }
}
