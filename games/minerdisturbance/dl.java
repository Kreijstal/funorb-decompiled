/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static bg field_e;
    static String field_b;
    static int field_c;
    static ea[] field_d;
    static String field_f;
    static String field_a;

    final static void a(boolean param0, wh param1) {
        try {
            nj.field_e.a(false, param1, !param0 ? true : false, 1000000, 1048576, 256);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "dl.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + -32532 + 44 + 1048576 + 44 + 256 + 41);
        }
    }

    final static String b() {
        int discarded$0 = 1;
        return bi.a(sj.field_d);
    }

    final static String a(sb param0) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              var3_int = param0.b(true);
              if (var3_int <= 80) {
                break L0;
              } else {
                var3_int = 80;
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param0.field_o = param0.field_o + hf.field_q.a(param0.field_o, 0, var3_int, param0.field_u, var4, 256);
            var5 = ph.a((byte) 54, var3_int, var4, 0);
            stackOut_2_0 = (String) var5;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_4_0 = "Cabbage";
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("dl.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 80 + 44 + -27898 + 41);
        }
    }

    final static vm a(bj param0, int param1, int param2, byte param3, bj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        vm stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        vm stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (cn.a(param1, 258, param2, param4)) {
              var5_int = -1;
              stackOut_3_0 = bh.a((byte) 104, param0.a(false, param2, param1));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vm) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("dl.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44).append(param2).append(44).append(122).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final static int b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!mm.b((byte) 102)) {
                L2: {
                  pn.field_a.a(sj.a(nk.field_w, (byte) 126, gb.field_e), sj.a(wi.field_w, (byte) 124, m.field_e), -1);
                  if (pn.field_a.b(true)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (pn.field_a.field_e < 0) {
                        break L4;
                      } else {
                        var3 = wf.field_P[pn.field_a.field_e];
                        if (var3 == 2) {
                          om.a(-22126);
                          break L3;
                        } else {
                          if (var3 == 5) {
                            om.a(-22126);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (2 != ti.field_M) {
                      om.a(-22126);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var3 != 0) {
                    break L5;
                  } else {
                    if (ti.field_M == 2) {
                      var4 = -tl.field_o + sf.a((byte) -57);
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (var6 > 0) {
                        break L5;
                      } else {
                        var3 = 2;
                        qd.a(-63, true, 5);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_26_0 = var3;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                L6: {
                  pn.field_a.b((byte) 117);
                  if (!pn.field_a.b(true)) {
                    break L6;
                  } else {
                    var1_int = 1;
                    break L6;
                  }
                }
                if (13 != lj.field_t) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "dl.B(" + -123 + 41);
        }
        return stackIn_27_0;
    }

    final static void a(java.awt.Component param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          param0.addMouseListener((java.awt.event.MouseListener) (Object) lb.field_y);
          param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lb.field_y);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) lb.field_y);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("dl.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 73 + 41);
        }
    }

    final static boolean a(int param0) {
        return gd.field_B;
    }

    public static void a() {
        field_f = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new bg(12, 0, 1, 0);
        field_b = "Ranking: Macho Miner";
        field_d = new ea[2];
        field_f = "Achieved";
        field_a = "Email address is unavailable";
    }
}
