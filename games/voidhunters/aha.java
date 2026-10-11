/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aha extends rqa {
    static llb field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(80, 62, param0[0].a(109));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("aha.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = VoidHunters.field_G;
        try {
          var5_int = param2 + param1;
          var6 = param3 + param0;
          if (param2 <= dma.field_d) {
            stackIn_4_0 = dma.field_d;
          } else {
            stackIn_4_0 = param2;
          }
          var7 = stackIn_4_0;
          if (dma.field_c < param0) {
            stackIn_7_0 = param0;
          } else {
            stackIn_7_0 = dma.field_c;
          }
          var8 = stackIn_7_0;
          if (param4 >= -41) {
            aha.a(110);
          }
          if (dma.field_a <= var5_int) {
            stackIn_12_0 = dma.field_a;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (var6 < dma.field_f) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = dma.field_f;
          }
          var10 = stackIn_15_0;
          if (param2 >= dma.field_d &&
            dma.field_a > param2) {
            var11 = dma.field_g * var8 + param2;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              dma.field_i[var11] = 16777215;
              var11 = var11 + 2 * dma.field_g;
            }
          }
          if (dma.field_c <= param0 &&
            var6 < dma.field_f) {
            var11Lifetime1 = dma.field_g * param0 + var7;
            var12Lifetime1 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              dma.field_i[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= dma.field_d &&
            var5_int < dma.field_a) {
            var11Lifetime2 = (var8 + (var5_int - param2 & 1)) * dma.field_g + var5_int;
            var12Lifetime2 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              dma.field_i[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + dma.field_g * 2;
            }
          }
          if (dma.field_c <= param0) {
            if (dma.field_f <= var6) {
              return;
            }
            var11Lifetime3 = dma.field_g * var6 + var7 + (1 & -param0 + var6);
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                return;
              }
              dma.field_i[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "aha.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 1511754497) {
          aha.a(-121, 80, -93, -27, (byte) -68);
        }
    }

    aha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
