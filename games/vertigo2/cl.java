/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static volatile int field_f;
    int field_e;
    int field_g;
    int field_b;
    static bk field_c;
    static int field_d;
    int field_a;

    public static void a(byte param0) {
        if (param0 != 124) {
          return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var35 = null;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        var25 = Vertigo2.field_L ? 1 : 0;
        try {
          jk.a(2, param5);
          var7_int = 0;
          var8 = param5 - param6;
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = param5;
          var10 = -param5;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          var14 = -1;
          var35 = vl.field_e[param3];
          var16 = param1 - var8;
          ki.a(-90, -param5 + param1, var35, var16, param2);
          if (param4 != -40) {
            return;
          }
          var17 = var8 + param1;
          ki.a(param4 - 61, var16, var35, var17, param0);
          ki.a(param4 - 76, var17, var35, param5 + param1, param2);
          while (var7_int < var9) {
            var14 += 2;
            var13 += 2;
            var10 = var10 + var13;
            var12 = var12 + var14;
            if (var12 >= 0 &&
              var11 >= 1) {
              jo.field_h[var11] = var7_int;
              var11--;
              var12 = var12 - (var11 << 1);
            }
            var7_int++;
            if (var10 >= 0) {
              var9--;
              if (var8 > var9) {
                var29 = vl.field_e[var9 + param3];
                var30 = vl.field_e[-var9 + param3];
                var20 = jo.field_h[var9];
                var21 = var7_int + param1;
                var22 = param1 - var7_int;
                var23 = var20 + param1;
                var24 = param1 - var20;
                ki.a(param4 - 70, var22, var29, var24, param2);
                ki.a(param4 ^ 83, var24, var29, var23, param0);
                ki.a(param4 ^ 89, var23, var29, var21, param2);
                ki.a(-122, var22, var30, var24, param2);
                ki.a(-114, var24, var30, var23, param0);
                ki.a(-103, var23, var30, var21, param2);
              } else {
                var27 = vl.field_e[var9 + param3];
                var28 = vl.field_e[-var9 + param3];
                var20 = param1 + var7_int;
                var21 = param1 - var7_int;
                ki.a(-81, var21, var27, var20, param2);
                ki.a(-93, var21, var28, var20, param2);
              }
              var10 = var10 - (var9 << 1);
            }
            var31 = vl.field_e[param3 + var7_int];
            var32 = vl.field_e[-var7_int + param3];
            var20Lifetime1 = param1 + var9;
            var21Lifetime1 = -var9 + param1;
            if (var8 <= var7_int) {
              ki.a(-86, var21Lifetime1, var31, var20Lifetime1, param2);
              ki.a(param4 ^ 75, var21Lifetime1, var32, var20Lifetime1, param2);
              continue;
            }
            if (var7_int <= var11) {
              stackIn_22_0 = var11;
            } else {
              stackIn_22_0 = jo.field_h[var7_int];
            }
            var22Lifetime1 = stackIn_22_0;
            var23Lifetime1 = param1 + var22Lifetime1;
            var24Lifetime1 = param1 - var22Lifetime1;
            ki.a(-97, var21Lifetime1, var31, var24Lifetime1, param2);
            ki.a(-111, var24Lifetime1, var31, var23Lifetime1, param0);
            ki.a(-107, var23Lifetime1, var31, var20Lifetime1, param2);
            ki.a(param4 - 68, var21Lifetime1, var32, var24Lifetime1, param2);
            ki.a(-124, var24Lifetime1, var32, var23Lifetime1, param0);
            ki.a(-125, var23Lifetime1, var32, var20Lifetime1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "cl.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int[] param4, int param5, int param6) {
        try {
          oj.field_O[param6] = param4;
          oj.field_M[param6] = param3;
          oj.field_I[param6] = param5;
          oj.field_F[param6] = param0;
          if (param2 < 77) {
            int[] var8 = (int[]) null;
            cl.a(-33, 95, (byte) -63, -17, (int[]) null, -84, 85);
          }
          oj.field_H[param6] = param1;
          oj.field_Q[param6] = true;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "cl.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_f = 0;
    }
}
