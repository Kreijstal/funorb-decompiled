/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static boolean field_c;
    static mn field_a;
    static String field_b;

    public static void a(byte param0) {
        try {
          field_b = null;
          field_a = null;
          if (param0 <= 11) {
            ih.a(-113);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ih.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, gk param1, int param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
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
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = mr.a((-param4 + param3) * 3, (byte) -115);
          var6 = 3 * param4;
          var7 = -10 + var5_int;
          aw.C(-114);
          if (0 < param1.field_E &&
            null != param1.field_a) {
            ad.c((byte) 71);
          }
          sv.field_b = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param1.field_n > var8)))) {
            var9 = param1.field_A[var8];
            var10 = param1.field_b[var8];
            var11 = param1.field_l[var8];
            stackOut_9_0 = param0;
            stackIn_52_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = we.field_z[var9];
                var13 = hp.field_o[var9];
                var14 = we.field_z[var10] - var12;
                var15 = we.field_z[var11] - var12;
                var16 = hp.field_o[var10] - var13;
                var17 = hp.field_o[var11] - var13;
              }
              if (!stackIn_10_0 ||
                !(var14 * var17 - var16 * var15 >= 0)) {
                var12Lifetime1 = gi.field_k[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = gi.field_k[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = gi.field_k[var11];
                    if (var14 != -2147483648) {
                      var15 = var12Lifetime1 + var13Lifetime1 - (-var14 + var6);
                      stackIn_32_0 = -1;
                      stackIn_32_1 = rg.field_C.length;
                      if (0 > var7) {
                        stackIn_33_2 = var15 << -var7;
                      } else {
                        stackIn_33_2 = var15 >> var7;
                      }
                      var16 = stackIn_32_0 + (stackIn_32_1 - stackIn_33_2);
                      var17 = rg.field_C[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_43_0 = 0;
                          stackIn_43_1 = var16;
                          if (stackIn_43_0 > stackIn_43_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = rg.field_C[var16];
                          continue;
                        }
                        stackIn_43_0Lifetime1 = var16 << 4;
                        stackIn_43_1Lifetime1 = -var17;
                        var18 = stackIn_43_0Lifetime1 - stackIn_43_1Lifetime1;
                        Sumoblitz.field_G[var18] = var8;
                        rg.field_C[var16] = var17 + 1;
                        if (param1.field_E > 0 &&
                          null != param1.field_a) {
                          dupTemp$0 = param1.field_a[var8];
                          cv.field_G[dupTemp$0] = cv.field_G[dupTemp$0] + 1;
                        }
                        sv.field_b = sv.field_b + 1;
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
            stackIn_52_0 = param2;
          }
          if (stackIn_52_0 != -1) {
            field_a = (mn) null;
          }
          if (0 < param1.field_E &&
            param1.field_a != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(cv.field_G.length <= var9Lifetime1)) {
              var10Lifetime1 = cv.field_G[var9Lifetime1];
              cv.field_G[var9Lifetime1] = var8Lifetime1;
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
          stackIn_69_0 = var5;
          stackIn_69_1 = new StringBuilder().append("ih.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        try {
          hc.field_f = wt.field_h[2];
          iv.field_i = wt.field_h[1];
          ki.field_f = wt.field_h[0];
          int var1_int = -21 / ((param0 + 59) / 40);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ih.C(" + param0 + ')');
        }
    }

    static {
        field_c = false;
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
