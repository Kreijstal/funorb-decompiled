/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su {
    static jb field_c;
    static ut field_a;
    static gu field_b;

    final static kw a(int param0, String param1) {
        RuntimeException var2 = null;
        kw stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        kw stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new kw(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("su.G(").append(-3505).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
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
              L1: {
                var4 = param3.getGraphics();
                if (param0 == 27744) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              ea.field_f.a(0, 10, 0, var4);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("su.C(").append(param0).append(',').append(0).append(',').append(0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        var9 = Kickabout.field_G;
        if (param1 > 0L) {
          if (param1 < 6582952005840035281L) {
            if (0L == param1 % 37L) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (param1 == 0L) {
                      return var6.reverse().toString();
                    } else {
                      var7 = param1;
                      param1 = param1 / 37L;
                      StringBuilder discarded$1 = var6.append(gu.field_yb[(int)(var7 - param1 * 37L)]);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        oo.field_e[wf.field_O] = param3;
        pf.field_d[wf.field_O] = wf.field_O;
        bl.field_m[wf.field_O] = param4;
        if (kt.field_g >= param4) {
          if (er.field_k > param4) {
            L0: {
              vi.field_s = param4;
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                stackOut_35_0 = param5 * 1000 / var6;
                stackIn_37_0 = stackOut_35_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_37_0;
              w.field_a[wf.field_O] = var7;
              wf.field_O = wf.field_O + 1;
              if (vi.field_s > var7) {
                vi.field_s = var7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var7 > lm.field_V) {
                lm.field_V = var7;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                break L3;
              } else {
                stackOut_25_0 = param5 * 1000 / var6;
                stackIn_27_0 = stackOut_25_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_27_0;
              w.field_a[wf.field_O] = var7;
              wf.field_O = wf.field_O + 1;
              if (vi.field_s > var7) {
                vi.field_s = var7;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var7 > lm.field_V) {
                lm.field_V = var7;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        } else {
          lm.field_V = param4;
          if (er.field_k <= param4) {
            L6: {
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L6;
              } else {
                stackOut_13_0 = param5 * 1000 / var6;
                stackIn_15_0 = stackOut_13_0;
                break L6;
              }
            }
            L7: {
              var7 = stackIn_15_0;
              w.field_a[wf.field_O] = var7;
              wf.field_O = wf.field_O + 1;
              if (vi.field_s > var7) {
                vi.field_s = var7;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (var7 > lm.field_V) {
                lm.field_V = var7;
                break L8;
              } else {
                break L8;
              }
            }
            return;
          } else {
            L9: {
              vi.field_s = param4;
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L9;
              } else {
                stackOut_3_0 = param5 * 1000 / var6;
                stackIn_5_0 = stackOut_3_0;
                break L9;
              }
            }
            L10: {
              var7 = stackIn_5_0;
              w.field_a[wf.field_O] = var7;
              wf.field_O = wf.field_O + 1;
              if (vi.field_s > var7) {
                vi.field_s = var7;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (var7 > lm.field_V) {
                lm.field_V = var7;
                break L11;
              } else {
                break L11;
              }
            }
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        int var1 = 0;
    }

    final static int a(byte param0, up param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var3 = (gp.a(param1, -576054046) << 1) / 3;
              if (var3 < 10) {
                var3 = 10;
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("su.B(").append(-107).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static hd a(int param0, int param1, int param2, boolean param3, int param4, hu param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        hd var13 = null;
        RuntimeException var13_ref = null;
        hd stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var13 = new hd(0L, (hd) null);
            var13.field_R = ih.a(param4, 0, param11);
            var13.field_S = ih.a(param2, 0, param9);
            var13.field_rb = ih.a(param12, 0, param1);
            var13.field_u = ih.a(param8, 0, param0);
            var13.field_tb = ih.a(param7, 0, param6);
            var13.field_X = param5;
            var13.field_y = param10;
            stackOut_0_0 = (hd) var13;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var13_ref;
            stackOut_2_1 = new StringBuilder().append("su.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(true).append(',').append(param4).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param5 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_1_0;
    }

    static {
    }
}
