/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static java.applet.Applet field_b;
    private static qk field_a;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
    }

    final static cn a(String param0, nh param1, String param2, byte param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        cn var7 = null;
        cn var8 = null;
        cn stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (!param1.b(param2, param0, (byte) -82)) {
                param2 = param2 + ".jpg";
                break L1;
              } else {
                break L1;
              }
            }
            var7 = new cn(param1.a(param0, param2, (byte) -127), (java.awt.Component) (Object) fi.d(false));
            var8 = var7;
            var5 = 0;
            L2: while (true) {
              if (var5 >= var8.field_B.length) {
                stackOut_9_0 = (cn) var8;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8.field_B[var5] = nb.a(var7.field_B[var5], 16777215);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("rc.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 71 + ')');
        }
        return stackIn_10_0;
    }

    final static void b(int param0) {
        if (param0 <= 79) {
            field_a = null;
        }
        Object var2 = null;
        gg.a((byte) -103, (String) null, "");
    }

    final static void c(int param0) {
        bh.field_M = false;
        int discarded$0 = ra.field_c.c(true);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qk var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        qk stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        qk stackOut_15_0 = null;
        qk stackOut_14_0 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var1_int = 0;
            en.field_c = -(fa.field_i >> 1) + wf.field_C;
            var2 = en.field_c;
            var3 = 0;
            L1: while (true) {
              if (uc.field_K.length <= var3) {
                break L0;
              } else {
                L2: {
                  var4 = dd.field_A[var3];
                  if (var4 < 0) {
                    var5 = ui.field_b;
                    break L2;
                  } else {
                    if (var4 == h.field_h.field_b) {
                      var5 = il.field_a;
                      break L2;
                    } else {
                      var5 = dc.field_l;
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = uc.field_K[var3];
                  stackOut_8_0 = 107;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var4 < 0) {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L3;
                  } else {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L3;
                  }
                }
                L4: {
                  var7 = rb.a((byte) stackIn_11_0, stackIn_11_1 != 0, var6);
                  var8 = -(var7 >> 1) + tm.field_e;
                  if (var4 >= 0) {
                    L5: {
                      var2 = var2 + lc.field_j;
                      if (var4 != h.field_h.field_b) {
                        stackOut_15_0 = (qk) field_a;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = ug.field_y;
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_16_0;
                      if (var9 != null) {
                        var9.a(var2, cd.field_e - -(i.field_o << 1), var7 + (an.field_w << 1), 112, var8 - an.field_w);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + i.field_o;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var4 >= 0) {
                    mp.field_a.b(var6, var8, vk.field_e + var2, var5, -1);
                    var2 = var2 + (cd.field_e + (i.field_o + lc.field_j));
                    break L7;
                  } else {
                    hc.field_e.b(var6, var8, var2 - -da.field_C, var5, -1);
                    var2 = var2 + gb.field_a;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "rc.B(" + -126 + ')');
        }
    }

    static {
    }
}
