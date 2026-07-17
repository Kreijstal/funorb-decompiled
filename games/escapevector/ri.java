/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String field_a;
    static hh field_b;

    final static void a(int param0, int param1, byte param2) {
        bg.field_f = param1;
        oj.field_M = param0;
    }

    final static StringBuilder a(int param0, char param1, StringBuilder param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = param2.length();
            param2.setLength(param0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= param0) {
                stackOut_4_0 = (StringBuilder) param2;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                param2.setCharAt(var5, param1);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ri.A(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 56 + 41);
        }
        return stackIn_5_0;
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        rl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        c var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = EscapeVector.field_A;
        try {
          L0: {
            var15 = om.field_g;
            var2 = var15.e(0);
            var3 = (rl) (Object) cd.field_s.a(false);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_i != var2) {
                    var3 = (rl) (Object) cd.field_s.b((byte) 70);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var15.e(0);
                  if (0 != var4) {
                    var5 = var3.field_g;
                    bl.field_l[0] = ck.field_r;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        wk.a(var4, 55, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            na.b(var5, 0);
                            var6 = new String[2][var5];
                            var19 = new int[2][var5 * 4];
                            var8 = jf.field_J;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var13 >= var8) {
                                    var3.c((byte) -100);
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = cd.field_q[var13 + var5];
                                      var6[1][var14] = bl.field_l[var11];
                                      var19[1][var14 * 4] = fl.field_k[var11];
                                      var19[1][var14 * 4 + 1] = pc.field_c[var11];
                                      var19[1][var14 * 4 - -2] = mi.field_k[var11];
                                      var19[1][3 + var14 * 4] = tm.field_fb[var11];
                                      if (!ic.a(bl.field_l[var11], (byte) 117)) {
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = cd.field_q[var9];
                                  var6[0][var10] = bl.field_l[var11];
                                  var19[0][var10 * 4] = fl.field_k[var11];
                                  var19[0][1 + 4 * var10] = pc.field_c[var11];
                                  var19[0][var10 * 4 - -2] = mi.field_k[var11];
                                  var19[0][3 + var10 * 4] = tm.field_fb[var11];
                                  if (ic.a(bl.field_l[var11], (byte) 123)) {
                                    if (tm.field_fb[var11] + pc.field_c[var11] + mi.field_k[var11] == 0) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              km.a((n) (Object) var15, 1238559653);
                              if (var6_int != 0) {
                                af.a(1, hk.field_n, wk.field_d, oc.field_u, var6_int, bk.field_s);
                                break L10;
                              } else {
                                af.a(1, hk.field_n, wk.field_d, oc.field_u, var6_int, bk.field_s);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        bl.field_l[var6_int] = var15.c(false);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.c((byte) -100);
                    break L3;
                  }
                }
                break L0;
              } else {
                nm.a(16);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ri.E(" + 113 + 41);
        }
    }

    final static void a(int param0) {
        if (!(null != df.field_d)) {
            return;
        }
        bo.a((java.awt.Canvas) (Object) df.field_d, (byte) -59);
        df.field_d.a(g.field_r, true);
        df.field_d = null;
        if (!(null == km.field_n)) {
            km.field_n.a(param0 ^ -25123);
        }
        if (param0 != -25123) {
            field_a = null;
        }
        of.field_d.requestFocus();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Email:";
    }
}
