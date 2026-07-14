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
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        long var12 = 0L;
        long var14 = 0L;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = VoidHunters.field_G;
        if (param1 != 55) {
          return null;
        } else {
          var19 = new int[param3 << 925036801];
          var18 = var19;
          var17 = var18;
          var7 = var17;
          var8 = 0;
          L0: while (true) {
            if (var19.length <= var8) {
              return var7;
            } else {
              var9 = (1 + (var8 >> -389949855)) * 8192 / param3;
              var10 = param2 + (long)hob.a(param4, (int)param0, 126);
              var12 = (long)fc.a(var9, (byte) -124) * var10 >> 438624720;
              var14 = var10 * (long)eu.a(var9, 67) >> -1985277104;
              var17[var8] = (int)var12;
              var17[var8 + 1] = (int)var14;
              var8 += 2;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
