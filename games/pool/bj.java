/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends ma {
    static String[] field_o;
    int field_l;
    static int field_m;
    int field_n;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
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
        var13 = Pool.field_O;
        try {
          if (param4 != 2187) {
            return;
          }
          var5_int = param3 + param2;
          var6 = param0 + param1;
          if (param3 > qh.field_b) {
            stackIn_6_0 = param3;
          } else {
            stackIn_6_0 = qh.field_b;
          }
          var7 = stackIn_6_0;
          if (param0 > qh.field_c) {
            stackIn_9_0 = param0;
          } else {
            stackIn_9_0 = qh.field_c;
          }
          var8 = stackIn_9_0;
          if (qh.field_j > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = qh.field_j;
          }
          var9 = stackIn_12_0;
          if (var6 >= qh.field_g) {
            stackIn_15_0 = qh.field_g;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (qh.field_b <= param3 &&
            param3 < qh.field_j) {
            var11 = var8 * qh.field_l + param3;
            var12 = var10 + (1 - var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              qh.field_d[var11] = 16777215;
              var11 = var11 + 2 * qh.field_l;
            }
          }
          if (param0 >= qh.field_c &&
            var6 < qh.field_g) {
            var11Lifetime1 = qh.field_l * param0 + var7;
            var12Lifetime1 = 1 + (var9 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              qh.field_d[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= qh.field_b &&
            qh.field_j > var5_int) {
            var11Lifetime2 = var5_int + qh.field_l * (var8 + (1 & -param3 + var5_int));
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              qh.field_d[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * qh.field_l;
            }
          }
          if (param0 >= qh.field_c &&
            var6 < qh.field_g) {
            var11Lifetime3 = qh.field_l * var6 + var7 + (1 & -param0 + var6);
            var12Lifetime3 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              qh.field_d[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var5), "bj.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 != 1) {
          return false;
        }
        return lk.field_o;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -4303) {
          bj.c(-44);
        }
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
        field_o = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
