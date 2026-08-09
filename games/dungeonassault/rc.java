/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static java.applet.Applet field_b;
    private static qk field_a;

    public static void a(byte param0) {
        if (param0 != -127) {
            field_b = (java.applet.Applet) null;
        }
        field_a = null;
        field_b = null;
    }

    final static cn a(String param0, nh param1, String param2, byte param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        cn var7 = null;
        cn var8 = null;
        cn stackIn_6_0 = null;
        cn stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            var7 = new cn(param1.a(param0, param2, (byte) -127), (java.awt.Component) ((Object) fi.d(false)));
            var8 = var7;
            if (param3 == 71) {
              var5 = 0;
              L2: while (true) {
                if (var5 >= var8.field_B.length) {
                  stackIn_11_0 = (cn) (var8);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8.field_B[var5] = nb.a(var7.field_B[var5], 16777215);
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackIn_6_0 = (cn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("rc.C(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void b(int param0) {
        if (param0 <= 79) {
            field_a = (qk) null;
        }
        String var2 = (String) null;
        gg.a((byte) -103, (String) null, "");
    }

    final static void c(int param0) {
        bh.field_M = false;
        ra.field_c.c(true);
        if (param0 != 16777215) {
            field_b = (java.applet.Applet) null;
        }
    }

    final static void a(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        qk stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qk var9 = null;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var1_int = 108 % ((0 - param0) / 52);
            en.field_c = -(fa.field_i >> 1333739777) + wf.field_C;
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
                  stackIn_10_0 = 107;

                  if (var4 < 0) {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  var7 = rb.a((byte) stackIn_11_0, stackIn_11_1 != 0, var6);
                  var8 = -(var7 >> 189617537) + tm.field_e;
                  if (var4 >= 0) {
                    L5: {
                      var2 = var2 + lc.field_j;
                      if (var4 != h.field_h.field_b) {
                        stackIn_16_0 = (qk) (field_a);
                        break L5;
                      } else {
                        stackIn_16_0 = ug.field_y;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_16_0;
                      if (var9 != null) {
                        var9.a(var2, cd.field_e - -(i.field_o << 200439425), var7 + (an.field_w << -589920415), 112, var8 - an.field_w);
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
          throw vk.a((Throwable) ((Object) var1), "rc.B(" + param0 + ')');
        }
    }

    static {
    }
}
