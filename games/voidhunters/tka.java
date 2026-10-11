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
        int var2 = 99 % ((param0 + 55) / 39);
        if (param1 == 1) {
          return false;
        }
        if (7 != param1) {
          return true;
        }
        return false;
    }

    final static int[] a(long param0, byte param1, long param2, int param3, Random param4) {
        int var8 = 0;
        int[] var7 = null;
        RuntimeException var7_ref = null;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = VoidHunters.field_G;
        try {
          if (param1 != 55) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          var19 = new int[param3 << 1];
          var18 = var19;
          var17 = var18;
          var7 = var17;
          for (var8 = 0; var19.length > var8; var8 += 2) {
            var9 = (1 + (var8 >> 1)) * 8192 / param3;
            var10 = param2 + (long)hob.a(param4, (int)param0, 126);
            var12 = (long)fc.a(var9, (byte) -124) * var10 >> 16;
            var14 = var10 * (long)eu.a(var9, 67) >> 16;
            var17[var8] = (int)var12;
            var17[var8 + 1] = (int)var14;
          }
          stackIn_8_0 = var7;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_11_0 = var7_ref;
          stackIn_11_1 = new StringBuilder().append("tka.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
    }
}
