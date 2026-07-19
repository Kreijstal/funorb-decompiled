/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tka extends aa {
    int[] field_b;
    int[] field_a;

    private tka() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        var2 = 99 % ((param0 - -55) / 39);
        if (-2 != (param1 ^ -1)) {
          if (7 == param1) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static int[] a(long param0, byte param1, long param2, int param3, Random param4) {
        int[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        long var12 = 0L;
        long var14 = 0L;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == 55) {
              var19 = new int[param3 << 925036801];
              var18 = var19;
              var17 = var18;
              var7 = var17;
              var8 = 0;
              L1: while (true) {
                if (var19.length <= var8) {
                  stackOut_7_0 = (int[]) (var7);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var9 = (1 + (var8 >> -389949855)) * 8192 / param3;
                  var10 = param2 + (long)hob.a(param4, (int)param0, 126);
                  var12 = (long)fc.a(var9, (byte) -124) * var10 >> 438624720;
                  var14 = var10 * (long)eu.a(var9, 67) >> -1985277104;
                  var17[var8] = (int)var12;
                  var17[var8 + 1] = (int)var14;
                  var8 += 2;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (int[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var7_ref);
            stackOut_9_1 = new StringBuilder().append("tka.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
    }
}
