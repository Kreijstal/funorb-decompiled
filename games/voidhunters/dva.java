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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_p = -121L;
          }
          stackIn_3_0 = new nc(frb.a(142, 97));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dva.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, lta param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var11Lifetime1;
        try {
          hha.a(param1.a(param0, (byte) 127), (byte) 66, param1.a(param7, (byte) 123), param1.b(true, param4), param5, param1.b(true, param2), param6);
          var8_int = -param0 + param7;
          var9 = param2 - param4;
          var10 = -(var9 / 8) + param0 + var8_int * 3 / 4;
          var11 = var8_int / 8 + (3 * var9 / 4 + param4);
          hha.a(param1.a(var10, (byte) 116), (byte) 66, param1.a(param7, (byte) 116), param1.b(true, var11), param5, param1.b(true, param2), param6);
          var10Lifetime1 = param0 - (-(3 * var8_int / 4) - var9 / 8);
          var11Lifetime1 = -(var8_int / 8) + param4 + param3 * var9 / 4;
          hha.a(param1.a(var10Lifetime1, (byte) 125), (byte) 66, param1.a(param7, (byte) 121), param1.b(true, var11Lifetime1), param5, param1.b(true, param2), param6);
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
