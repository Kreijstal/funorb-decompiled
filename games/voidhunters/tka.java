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
        if (param1 != 1) {
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
        int[] var20 = null;
        int[] var21 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var21 = new int[param3 << 1];
            var20 = var21;
            var19 = var20;
            var18 = var19;
            var17 = var18;
            var7 = var17;
            var8 = 0;
            L1: while (true) {
              if (var21.length <= var8) {
                stackOut_6_0 = (int[]) var7;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var9 = (1 + (var8 >> 1)) * 8192 / param3;
                var10 = param2 + (long)hob.a(param4, (int)param0, 126);
                var12 = (long)fc.a(var9, (byte) -124) * var10 >> 16;
                var14 = var10 * (long)eu.a(var9, 67) >> 16;
                var17[var8] = (int)var12;
                var17[var8 + 1] = (int)var14;
                var8 += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("tka.A(").append(param0).append(44).append(55).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    static {
    }
}
