/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int field_a;
    static int field_b;

    final static void a(boolean param0, byte param1, jk param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
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
        int stackIn_45_0Lifetime1;
        int stackIn_45_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Bounce.field_N;
        try {
          var5_int = wb.a((byte) 100, (-param4 + param3) * 3);
          var6 = 3 * param4;
          var7 = var5_int - 10;
          jg.k(0);
          if (param1 >= -127) {
            hj.a(23);
          }
          if (param2.field_w > 0 &&
            null != param2.field_v) {
            mg.h((byte) -121);
          }
          lb.field_b = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_L)))) {
            var9 = param2.field_O[var8];
            var10 = param2.field_P[var8];
            var11 = param2.field_l[var8];
            stackOut_13_0 = param0;
            stackIn_55_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var19 == 0) {
              if (stackIn_14_0) {
                var12 = ca.field_c[var9];
                var13 = kg.field_g[var9];
                var14 = ca.field_c[var10] - var12;
                var15 = -var12 + ca.field_c[var11];
                var16 = kg.field_g[var10] - var13;
                var17 = -var13 + kg.field_g[var11];
              }
              if (!stackIn_14_0 ||
                !(0 <= -(var16 * var15) + var14 * var17)) {
                var12Lifetime1 = r.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = r.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = r.field_c[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + var13Lifetime1 + (var12Lifetime1 + var14);
                      stackIn_33_0 = ja.field_c.length;
                      stackIn_33_1 = -1;
                      if (var7 < 0) {
                        stackIn_34_2 = var15 << -var7;
                      } else {
                        stackIn_34_2 = var15 >> var7;
                      }
                      var16 = stackIn_33_0 + (stackIn_33_1 - stackIn_34_2);
                      var17 = ja.field_c[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_45_0 = -1;
                          stackIn_45_1 = ~var16;
                          if (stackIn_45_0 < stackIn_45_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ja.field_c[var16];
                          continue;
                        }
                        stackIn_45_0Lifetime1 = var16 << 4;
                        stackIn_45_1Lifetime1 = -var17;
                        var18 = stackIn_45_0Lifetime1 - stackIn_45_1Lifetime1;
                        lb.field_c[var18] = var8;
                        ja.field_c[var16] = 1 + var17;
                        if (param2.field_w > 0 &&
                          null != param2.field_v) {
                          dupTemp$0 = param2.field_v[var8];
                          oc.field_a[dupTemp$0] = oc.field_a[dupTemp$0] + 1;
                        }
                        lb.field_b = lb.field_b + 1;
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
            stackIn_55_0 = ~param2.field_w;
          }
          if (stackIn_55_0 < -1 &&
            param2.field_v != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(oc.field_a.length <= var9Lifetime1)) {
              var10Lifetime1 = oc.field_a[var9Lifetime1];
              oc.field_a[var9Lifetime1] = var8Lifetime1;
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
          stackIn_71_0 = var5;
          stackIn_71_1 = new StringBuilder().append("hj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 24777) {
            hj.$cfr$intArgs$a$d6db22f779ae(false, -24, (jk) null, 13, 72);
          }
          stackIn_4_0 = -bb.field_b + ui.field_p;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "hj.A(" + param0 + ')');
        }
    }

    static {
        field_b = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$d6db22f779ae(boolean param0, int param1, jk param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
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
        int stackIn_45_0Lifetime1;
        int stackIn_45_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Bounce.field_N;
        try {
          var5_int = wb.a((byte) 100, (-param4 + param3) * 3);
          var6 = 3 * param4;
          var7 = var5_int - 10;
          jg.k(0);
          if (param1 >= -127) {
            hj.a(23);
          }
          if (param2.field_w > 0 &&
            null != param2.field_v) {
            mg.h((byte) -121);
          }
          lb.field_b = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_L)))) {
            var9 = param2.field_O[var8];
            var10 = param2.field_P[var8];
            var11 = param2.field_l[var8];
            stackOut_13_0 = param0;
            stackIn_55_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var19 == 0) {
              if (stackIn_14_0) {
                var12 = ca.field_c[var9];
                var13 = kg.field_g[var9];
                var14 = ca.field_c[var10] - var12;
                var15 = -var12 + ca.field_c[var11];
                var16 = kg.field_g[var10] - var13;
                var17 = -var13 + kg.field_g[var11];
              }
              if (!stackIn_14_0 ||
                !(0 <= -(var16 * var15) + var14 * var17)) {
                var12Lifetime1 = r.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = r.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = r.field_c[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + var13Lifetime1 + (var12Lifetime1 + var14);
                      stackIn_33_0 = ja.field_c.length;
                      stackIn_33_1 = -1;
                      if (var7 < 0) {
                        stackIn_34_2 = var15 << -var7;
                      } else {
                        stackIn_34_2 = var15 >> var7;
                      }
                      var16 = stackIn_33_0 + (stackIn_33_1 - stackIn_34_2);
                      var17 = ja.field_c[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_45_0 = -1;
                          stackIn_45_1 = ~var16;
                          if (stackIn_45_0 < stackIn_45_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ja.field_c[var16];
                          continue;
                        }
                        stackIn_45_0Lifetime1 = var16 << 4;
                        stackIn_45_1Lifetime1 = -var17;
                        var18 = stackIn_45_0Lifetime1 - stackIn_45_1Lifetime1;
                        lb.field_c[var18] = var8;
                        ja.field_c[var16] = 1 + var17;
                        if (param2.field_w > 0 &&
                          null != param2.field_v) {
                          dupTemp$0 = param2.field_v[var8];
                          oc.field_a[dupTemp$0] = oc.field_a[dupTemp$0] + 1;
                        }
                        lb.field_b = lb.field_b + 1;
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
            stackIn_55_0 = ~param2.field_w;
          }
          if (stackIn_55_0 < -1 &&
            param2.field_v != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(oc.field_a.length <= var9Lifetime1)) {
              var10Lifetime1 = oc.field_a[var9Lifetime1];
              oc.field_a[var9Lifetime1] = var8Lifetime1;
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
          stackIn_71_0 = var5;
          stackIn_71_1 = new StringBuilder().append("hj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }
}
