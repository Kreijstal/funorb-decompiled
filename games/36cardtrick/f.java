/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static kc field_a;

    public static void a() {
        field_a = null;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        dl var4 = null;
        int var4_int = 0;
        Object var5_ref = null;
        int var5 = 0;
        gh var5_ref_gh = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        w var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var5_ref = null;
        var8 = Main.field_T;
        try {
          L0: {
            L1: {
              var9 = rd.field_j;
              var2 = var9.f(-98);
              var3 = var9.f(92);
              if (var2 == 0) {
                var4 = (dl) (Object) tf.field_q.a((byte) 74);
                if (var4 == null) {
                  mc.a((byte) -126);
                  return;
                } else {
                  L2: {
                    var5 = -var9.field_i + al.field_a;
                    var13 = var4.field_i;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5 <= var13.length << 2) {
                      break L2;
                    } else {
                      var5 = var13.length << 2;
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 > var7) {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.f(-126) << (bc.a(var7, 3) << 8));
                      var7++;
                      continue L3;
                    } else {
                      var4.c(106);
                      break L1;
                    }
                  }
                }
              } else {
                if (1 != var2) {
                  int discarded$1 = 92;
                  k.a((Throwable) null, (byte) 79, "LR1: " + aj.a());
                  mc.a((byte) -127);
                  break L1;
                } else {
                  var4_int = var9.b((byte) 59);
                  var5_ref_gh = (gh) (Object) sj.field_a.a((byte) 74);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_gh == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != var5_ref_gh.field_m) {
                            break L6;
                          } else {
                            if (var4_int != var5_ref_gh.field_l) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_gh = (gh) (Object) sj.field_a.b((byte) -106);
                        continue L4;
                      }
                    }
                    if (null == var5_ref_gh) {
                      mc.a((byte) -128);
                      return;
                    } else {
                      var5_ref_gh.c(98);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "f.C(" + -1 + ')');
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            if (hi.a(param0, 0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (lc.a((byte) -33, param0)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (!te.a(false, param0)) {
                  if (param2.length() == 0) {
                    stackOut_19_0 = 1;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0 != 0;
                  } else {
                    if (!gi.a(param0, -123, param2)) {
                      if (la.a(param2, (byte) -115, param0)) {
                        stackOut_27_0 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        return stackIn_28_0 != 0;
                      } else {
                        int discarded$1 = -1;
                        if (g.a(param2, param0)) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    }
                  }
                } else {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("f.A(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L1;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L1;
            }
          }
          L2: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(125).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L2;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_32_0 != 0;
    }

    static {
    }
}
