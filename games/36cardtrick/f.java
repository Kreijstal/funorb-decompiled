/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static kc field_a;

    public static void a(int param0) {
        field_a = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        dl var4 = null;
        int var4_int = 0;
        gh var5_ref_gh = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        w var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Main.field_T;
        try {
          L0: {
            var9 = rd.field_j;
            var2 = var9.f(-98);
            var3 = var9.f(92);
            if (var2 == 0) {
              var4 = (dl) (Object) tf.field_q.a((byte) 74);
              if (var4 == null) {
                mc.a((byte) -126);
                return;
              } else {
                L1: {
                  var5 = -var9.field_i + al.field_a;
                  var13 = var4.field_i;
                  var12 = var13;
                  var11 = var12;
                  var10 = var11;
                  var6 = var10;
                  if (var5 <= var13.length << 2) {
                    break L1;
                  } else {
                    var5 = var13.length << 2;
                    break L1;
                  }
                }
                var7 = 0;
                L2: while (true) {
                  if (var5 <= var7) {
                    var4.c(106);
                    break L0;
                  } else {
                    var6[var7 >> 2] = var6[var7 >> 2] + (var9.f(-126) << (bc.a(var7, 3) << 8));
                    var7++;
                    continue L2;
                  }
                }
              }
            } else {
              if (1 != var2) {
                k.a((Throwable) null, (byte) 79, "LR1: " + aj.a((byte) 92));
                mc.a((byte) -127);
                return;
              } else {
                var4_int = var9.b((byte) 59);
                var5_ref_gh = (gh) (Object) sj.field_a.a((byte) 74);
                L3: while (true) {
                  L4: {
                    if (var5_ref_gh == null) {
                      break L4;
                    } else {
                      L5: {
                        if (var3 != var5_ref_gh.field_m) {
                          break L5;
                        } else {
                          if (var4_int != var5_ref_gh.field_l) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5_ref_gh = (gh) (Object) sj.field_a.b((byte) -106);
                      continue L3;
                    }
                  }
                  if (var5_ref_gh == null) {
                    mc.a((byte) -128);
                    return;
                  } else {
                    var5_ref_gh.c(98);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "f.C(" + -1 + 41);
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (hi.a(param0, 0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (lc.a((byte) -33, param0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (param1 > 86) {
                  if (!te.a(false, param0)) {
                    if (param2.length() == 0) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    } else {
                      if (!gi.a(param0, -123, param2)) {
                        if (la.a(param2, (byte) -115, param0)) {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0 != 0;
                        } else {
                          if (g.a(param2, param0, -1)) {
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0 != 0;
                      }
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("f.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          L2: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param1).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_28_0 != 0;
    }

    static {
    }
}
