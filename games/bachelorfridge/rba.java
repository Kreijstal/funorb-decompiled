/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rba {
    static int field_b;
    static ok field_a;
    static kia field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = 16;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (param2 < 0) {
          return;
        } else {
          L0: {
            if (param2 >= dg.field_i) {
              break L0;
            } else {
              if (param1 < 0) {
                break L0;
              } else {
                if (dg.field_c > param1) {
                  var5 = param0 * (param4 >>> 24) >> 8;
                  var6 = 256 - var5;
                  var7 = dg.field_i * param1 + param2;
                  var8 = param4;
                  var9 = dg.field_e[var7];
                  int incrementValue$2 = var7;
                  var7++;
                  dg.field_e[incrementValue$2] = dda.a(dda.a(var9, 16711935) * var6 + dda.a(16711935, var8) * var5, -16711936) + dda.a(16711680, var5 * dda.a(var8, 65280) - -(dda.a(65280, var9) * var6)) >>> 8;
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final static byte[] a(int param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (param1 >= -82) {
            return null;
        }
        uw var2 = (uw) (Object) it.field_o.a(118, (long)param0);
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param0);
            for (var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; 255 > var5; var5++) {
                var6 = -var5 + 255;
                var7 = kla.a(var6, var4, -2147483648);
                var8 = var11[var7];
                var3[var7] = var11[var6];
                var3[511 + -var5] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2 = new uw(var11);
            it.field_o.a((eo) (Object) var2, (long)param0, 83);
        }
        return var2.field_n;
    }

    final static void a(mu param0, byte param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              lp.field_u = false;
              if (param0 == null) {
                break L1;
              } else {
                if (null == param0.field_f) {
                  break L1;
                } else {
                  var6 = param0.field_f;
                  var2 = var6;
                  var3 = 0;
                  L2: while (true) {
                    if (var6.length <= var3) {
                      var3 = -119 % ((-12 - param1) / 50);
                      break L0;
                    } else {
                      var4 = var6[var3];
                      if (var4 != 0) {
                        lp.field_u = true;
                        return;
                      } else {
                        var3++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("rba.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
