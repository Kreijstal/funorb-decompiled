/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static int field_b;
    static vna field_a;
    static int field_c;

    public static void a(byte param0) {
        if (param0 < 8) {
          field_a = (vna) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
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
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = param3 + param0;
          var6 = param1 + param2;
          if (bea.field_b >= param0) {
            stackIn_4_0 = bea.field_b;
          } else {
            stackIn_4_0 = param0;
          }
          var7 = stackIn_4_0;
          if (param1 > bea.field_h) {
            stackIn_7_0 = param1;
          } else {
            stackIn_7_0 = bea.field_h;
          }
          var8 = stackIn_7_0;
          if (bea.field_d <= var5_int) {
            stackIn_10_0 = bea.field_d;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (param4) {
            return;
          }
          if (bea.field_k <= var6) {
            stackIn_15_0 = bea.field_k;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (param0 >= bea.field_b &&
            bea.field_d > param0) {
            var11 = param0 + var8 * bea.field_g;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              bea.field_l[var11] = 16777215;
              var11 = var11 + 2 * bea.field_g;
            }
          }
          if (bea.field_h <= param1 &&
            bea.field_k > var6) {
            var11Lifetime1 = var7 + bea.field_g * param1;
            var12Lifetime1 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              bea.field_l[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= bea.field_b &&
            var5_int < bea.field_d) {
            var11Lifetime2 = var5_int + (var8 + (-param0 + var5_int & 1)) * bea.field_g;
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              bea.field_l[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * bea.field_g;
            }
          }
          if (bea.field_h <= param1) {
            if (bea.field_k <= var6) {
              return;
            }
            var11Lifetime3 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
            var12Lifetime3 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              bea.field_l[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "nn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = 3;
        field_a = new vna();
    }
}
