/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bj extends IOException {
    static int[] field_b;
    static volatile int field_c;
    static int[] field_d;
    static int[] field_a;

    final static void a(int param0) {
        fl.a(-128, true, mj.field_d, uf.field_j);
        int var1 = 25 / ((param0 + 28) / 48);
        ae.field_C = true;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != 71) {
            field_a = (int[]) null;
          }
          if (null == wa.field_pb) {
            wa.field_pb = new boolean[5];
          }
          for (var1_int = 0; var1_int < 5; var1_int++) {
            mh.field_d[var1_int] = -1;
            wa.field_pb[var1_int] = false;
          }
          gh.field_m = false;
          bi.field_f = false;
          vi.field_a = 0;
          jj.field_d = false;
          qk.field_lb = 0;
          wj.field_a = 0;
          ih.a(param0 ^ 55);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "bj.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        fk.a(param0, 17);
    }

    bj(String param0) {
        super(param0);
    }

    public static void b(int param0) {
        field_b = null;
        int var1 = 30 % ((param0 - 17) / 50);
        field_a = null;
        field_d = null;
    }

    final static int a(int param0, boolean param1, int param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
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
        int var7Lifetime1;
        int var9Lifetime1;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1) {
            stackIn_3_0 = -82;
            return stackIn_3_0;
          }
          var5_int = -param0 + param4;
          var6 = -param2 + param3;
          var7 = 0;
          var8 = 1;
          if (var5_int < 0) {
            var8 = -1;
            var5_int = -var5_int;
          }
          var9 = 0;
          if (var5_int > 32) {
            var9Lifetime1 = -var8;
          } else {
            var9Lifetime1 = var8;
          }
          if (var6 < 0) {
            var6 = -var6;
          }
          if (var5_int >= 32) {
            var5_int = -var5_int + 64;
          }
          if (var5_int > 64) {
            stackIn_17_0 = -1;
            return stackIn_17_0;
          }
          if (var5_int > 16) {
            stackIn_20_0 = -1;
            return stackIn_20_0;
          }
          if (var6 * 64 > 240) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          var10 = var5_int * var5_int;
          var11 = 0;
          while (var10 > 0) {
            var11++;
            var10 = var10 >> 1;
          }
          var7Lifetime1 = -var11 + 9;
          var7Lifetime1 = var7Lifetime1 << 7;
          if (var9Lifetime1 > 0) {
            var7Lifetime1 = -var7Lifetime1 + 256;
          }
          stackIn_30_0 = var7Lifetime1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "bj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = -1;
        field_d = new int[]{28, 26, 24, 22, 20};
        field_a = new int[]{0, 5, 10};
    }
}
