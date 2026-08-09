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
        int var1 = -16 / ((param0 - 16) / 44);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        if (param2 >= 0) {
            if (param2 >= dg.field_i || (param1 ^ -1) > -1 || dg.field_c <= param1) {
                return;
            }
            if (param3 != -1) {
                field_c = (kia) null;
            }
            var5 = param0 * (param4 >>> -1185860040) >> 1147446472;
            var6 = 256 - var5;
            var7 = dg.field_i * param1 + param2;
            var8 = param4;
            var9 = dg.field_e[var7];
            incrementValue$0 = var7;
            var7++;
            dg.field_e[incrementValue$0] = dda.a(dda.a(var9, 16711935) * var6 + dda.a(16711935, var8) * var5, -16711936) + dda.a(16711680, var5 * dda.a(var8, 65280) - -(dda.a(65280, var9) * var6)) >>> 1843057384;
            return;
        }
    }

    final static byte[] a(int param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var9 = BachelorFridge.field_y;
        if (param1 >= -82) {
            return (byte[]) null;
        }
        uw var2 = (uw) ((Object) it.field_o.a(118, (long)param0));
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
            it.field_o.a(var2, (long)param0, 83);
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4 = var6[var3];
                      if ((var4 ^ -1) != -1) {
                        lp.field_u = true;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2_ref);

            stackIn_16_1 = new StringBuilder().append("rba.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
