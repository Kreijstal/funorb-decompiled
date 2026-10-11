/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static tl field_c;
    static int[] field_a;
    static String field_d;
    static int[] field_b;

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
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
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = param2 + param0;
          var6 = param3 + param4;
          if (param2 <= ul.field_i) {
            stackIn_4_0 = ul.field_i;
          } else {
            stackIn_4_0 = param2;
          }
          var7 = stackIn_4_0;
          if (param4 <= ul.field_d) {
            stackIn_7_0 = ul.field_d;
          } else {
            stackIn_7_0 = param4;
          }
          var8 = stackIn_7_0;
          if (ul.field_e <= var5_int) {
            stackIn_10_0 = ul.field_e;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (var6 < ul.field_a) {
            stackIn_13_0 = var6;
          } else {
            stackIn_13_0 = ul.field_a;
          }
          var10 = stackIn_13_0;
          if (ul.field_i <= param2 &&
            param2 < ul.field_e) {
            var11 = param2 + var8 * ul.field_f;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              ul.field_b[var11] = 16777215;
              var11 = var11 + 2 * ul.field_f;
            }
          }
          if (param1) {
            return;
          }
          if (ul.field_d <= param4 &&
            ul.field_a > var6) {
            var11Lifetime1 = var7 + param4 * ul.field_f;
            var12Lifetime1 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              ul.field_b[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= ul.field_i &&
            var5_int < ul.field_e) {
            var11Lifetime2 = ((var5_int - param2 & 1) + var8) * ul.field_f + var5_int;
            var12Lifetime2 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              ul.field_b[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + ul.field_f * 2;
            }
          }
          if (ul.field_d <= param4) {
            if (var6 >= ul.field_a) {
              return;
            }
            var11Lifetime3 = ul.field_f * var6 + (var7 + (1 & var6 - param4));
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              ul.field_b[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var5), "wh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        int var1 = 0 % ((param0 + 53) / 61);
        field_c = null;
    }

    static {
        field_d = "start free game";
        field_a = new int[]{8, 5, 8, 10, 8, 8, 8, 10, 12, 8, 8, 6};
        field_c = new tl();
    }
}
