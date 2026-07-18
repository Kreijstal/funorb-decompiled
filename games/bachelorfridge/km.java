/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class km extends hf {
    int field_I;
    int field_D;
    int field_J;
    int field_A;
    int field_F;
    int field_G;

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              L1: {
                var8_int = -((km) this).field_s - (param2 + (((km) this).field_A - param0));
                var9 = param6 - ((km) this).field_D - ((km) this).field_v - param4;
                if (var9 * var9 + var8_int * var8_int >= ((km) this).field_G * ((km) this).field_G) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - nd.field_j;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)((km) this).field_F;
                      break L2;
                    } else {
                      if (var10 > 0.0) {
                        var10 = var10 + 3.141592653589793 / (double)((km) this).field_F;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((km) this).field_I = (int)((double)((km) this).field_F * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (((km) this).field_F > ((km) this).field_I) {
                      L4: while (true) {
                        if (((km) this).field_I >= 0) {
                          break L1;
                        } else {
                          ((km) this).field_I = ((km) this).field_I + ((km) this).field_F;
                          continue L4;
                        }
                      }
                    } else {
                      ((km) this).field_I = ((km) this).field_I - ((km) this).field_F;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("km.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param6 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          if (param1 == -1) {
            break L0;
          } else {
            String discarded$1 = km.a(-37L, 30);
            break L0;
          }
        }
        gd.field_o.setTime(new Date(param0));
        var3 = gd.field_o.get(7);
        var4 = gd.field_o.get(5);
        var5 = gd.field_o.get(2);
        var6 = gd.field_o.get(1);
        var7 = gd.field_o.get(11);
        var8 = gd.field_o.get(12);
        var9 = gd.field_o.get(13);
        return gp.field_B[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + sh.field_E[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    private km() throws Throwable {
        throw new Error();
    }

    static {
    }
}
