/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dbb extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(230, 99));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dbb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    dbb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        if (param7 == 0) {
          var10 = -(param0 * param9 / param1) + param3;
          if (param8 > var10) {
            return param2;
          }
          if (var10 > param5) {
            return param2;
          }
          if (param4 > param3) {
            if (param3 > var10) {
              return param2;
            }
            if (param4 < var10) {
              return param2;
            }
            var11 = -(param9 << param6) / param1;
            if (0 > var11) {
              return param2;
            }
            if (1 << param6 <= var11) {
              return param2;
            }
            if (param2 == -1) {
              return var11;
            }
            if (var11 >= param2) {
              return param2;
            }
            return var11;
          }
          if (var10 < param4) {
            return param2;
          }
          if (param3 < var10) {
            return param2;
          }
          var11Lifetime2 = -(param9 << param6) / param1;
          if (0 > var11Lifetime2) {
            return param2;
          }
          if (1 << param6 <= var11Lifetime2) {
            return param2;
          }
          if (param2 == -1) {
            return var11Lifetime2;
          }
          if (var11Lifetime2 >= param2) {
            return param2;
          }
          return var11Lifetime2;
        }
        dbb.a(-63, -43, 28, 28, -60, -61, 125, 10, -27, 53);
        var10Lifetime1 = -(param0 * param9 / param1) + param3;
        if (param8 > var10Lifetime1) {
          return param2;
        }
        if (var10Lifetime1 > param5) {
          return param2;
        }
        if (param4 <= param3) {
          if (var10Lifetime1 < param4) {
            return param2;
          }
          if (param3 < var10Lifetime1) {
            return param2;
          }
        } else {
          if (param3 > var10Lifetime1) {
            return param2;
          }
          if (param4 < var10Lifetime1) {
            return param2;
          }
        }
        var11Lifetime1 = -(param9 << param6) / param1;
        if (0 > var11Lifetime1) {
          return param2;
        }
        if (1 << param6 <= var11Lifetime1) {
          return param2;
        }
        if (param2 == -1) {
          return var11Lifetime1;
        }
        if (var11Lifetime1 >= param2) {
          return param2;
        }
        return var11Lifetime1;
    }

    final static byte[] a(float param0, float param1, byte param2, int param3, vjb param4, int param5, int param6, int param7, float param8, float param9, float param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        byte[] var12 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11_int = 57 / ((param2 - 17) / 51);
          var12 = new byte[param5 * (param6 * param7)];
          toa.a(param6, param8, param5, param10, param1, (byte) -61, param4, param9, 0, param0, param3, param7, var12);
          stackIn_1_0 = var12;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_4_0 = var11;
          stackIn_4_1 = new StringBuilder().append("dbb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    static {
        field_o = -1;
    }
}
