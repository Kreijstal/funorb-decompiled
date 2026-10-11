/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf {
    static pj field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, boolean param3, sj param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
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
        int stackIn_41_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var5_int = nf.a(3 * (-param2 + param0), true);
          var6 = 3 * param2;
          var7 = var5_int + param1;
          dc.a((byte) 114);
          if (0 < param4.field_D &&
            param4.field_N != null) {
            df.h(-22);
          }
          s.field_R = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_k > var8)))) {
            var9 = param4.field_u[var8];
            var10 = param4.field_L[var8];
            var11 = param4.field_C[var8];
            stackOut_9_0 = param3;
            stackIn_50_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = bg.field_L[var9];
                var13 = sb.field_l[var9];
                var14 = -var12 + bg.field_L[var10];
                var15 = -var12 + bg.field_L[var11];
                var16 = sb.field_l[var10] - var13;
                var17 = sb.field_l[var11] - var13;
              }
              if (!stackIn_10_0 ||
                !(var17 * var14 - var16 * var15 >= 0)) {
                var12Lifetime1 = ah.field_i[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = ah.field_i[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = ah.field_i[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + (var14 + var12Lifetime1) + var13Lifetime1;
                      stackIn_29_0 = hb.field_l.length - 1;
                      if (var7 < 0) {
                        stackIn_30_1 = var15 << -var7;
                      } else {
                        stackIn_30_1 = var15 >> var7;
                      }
                      var16 = stackIn_29_0 - stackIn_30_1;
                      var17 = hb.field_l[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_41_0 = var16;
                          if (stackIn_41_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = hb.field_l[var16];
                          continue;
                        }
                        stackIn_41_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_41_0Lifetime1;
                        dj.field_c[var18] = var8;
                        hb.field_l[var16] = 1 + var17;
                        if (param4.field_D > 0 &&
                          param4.field_N != null) {
                          dupTemp$0 = param4.field_N[var8];
                          cl.field_g[dupTemp$0] = cl.field_g[dupTemp$0] + 1;
                        }
                        s.field_R = s.field_R + 1;
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
            stackIn_50_0 = 0;
          }
          if (stackIn_50_0 < param4.field_D &&
            null != param4.field_N) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(cl.field_g.length <= var9Lifetime1)) {
              var10Lifetime1 = cl.field_g[var9Lifetime1];
              cl.field_g[var9Lifetime1] = var8Lifetime1;
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
          stackIn_64_0 = var5;
          stackIn_64_1 = new StringBuilder().append("rf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        try {
          field_b = null;
          field_a = null;
          if (!param0) {
            rf.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "rf.J(" + param0 + ')');
        }
    }

    abstract wd a(byte param0);

    abstract byte[] b(int param0, int param1);

    abstract int a(int param0, int param1);

    static {
        field_b = "Type your email address again to make sure it's correct";
        field_a = new pj();
    }
}
