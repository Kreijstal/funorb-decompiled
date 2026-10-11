/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_c;
    static pb[] field_a;
    static pa field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 > -61) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rh.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, n param1, byte param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_43_0Lifetime1;
        int stackIn_43_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = stellarshard.field_B;
        try {
          if (param2 != -115) {
            rh.a(true, (n) null, (byte) 64, 68, 93);
          }
          var5_int = ug.a((param4 - param3) * 3, 4);
          var6 = 3 * param3;
          var7 = -10 + var5_int;
          al.b(false);
          if (0 < param1.field_N &&
            null != param1.field_g) {
            nh.c(-83);
          }
          ld.field_A = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param1.field_C)))) {
            var9 = param1.field_l[var8];
            var10 = param1.field_z[var8];
            var11 = param1.field_m[var8];
            stackOut_12_0 = param0;
            stackIn_52_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = nh.field_d[var9];
                var13 = od.field_s[var9];
                var14 = nh.field_d[var10] - var12;
                var15 = nh.field_d[var11] - var12;
                var16 = -var13 + od.field_s[var10];
                var17 = -var13 + od.field_s[var11];
              }
              if (!stackIn_13_0 ||
                !(var17 * var14 - var16 * var15 >= 0)) {
                var12Lifetime1 = wl.field_P[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = wl.field_P[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = wl.field_P[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + (var14 + var12Lifetime1) + var13Lifetime1;
                      stackIn_32_0 = gg.field_h.length;
                      stackIn_32_1 = 1;
                      if (var7 < 0) {
                        stackIn_33_2 = var15 << -var7;
                      } else {
                        stackIn_33_2 = var15 >> var7;
                      }
                      var16 = stackIn_32_0 - (stackIn_32_1 + stackIn_33_2);
                      var17 = gg.field_h[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_43_0 = -1;
                          stackIn_43_1 = ~var16;
                          if (stackIn_43_0 < stackIn_43_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = gg.field_h[var16];
                          continue;
                        }
                        stackIn_43_0Lifetime1 = var16 << 4;
                        stackIn_43_1Lifetime1 = var17;
                        var18 = stackIn_43_0Lifetime1 + stackIn_43_1Lifetime1;
                        ki.field_z[var18] = var8;
                        gg.field_h[var16] = var17 + 1;
                        if (0 < param1.field_N &&
                          param1.field_g != null) {
                          dupTemp$0 = param1.field_g[var8];
                          tg.field_a[dupTemp$0] = tg.field_a[dupTemp$0] + 1;
                        }
                        ld.field_A = ld.field_A + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_52_0 = 0;
          }
          if (stackIn_52_0 < param1.field_N &&
            param1.field_g != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(tg.field_a.length <= var9Lifetime1)) {
              var10Lifetime1 = tg.field_a[var9Lifetime1];
              tg.field_a[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_68_0 = var5;
          stackIn_68_1 = new StringBuilder().append("rh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 != -72) {
            field_b = (pa) null;
          }
          ee.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "rh.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Name is available";
    }
}
