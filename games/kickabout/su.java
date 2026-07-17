/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su {
    static jb field_c;
    static ut field_a;
    static gu field_b;

    final static kw a(int param0, String param1) {
        RuntimeException var2 = null;
        kw stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kw stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -3505) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            stackOut_2_0 = new kw(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("su.G(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
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
              ea.field_f.a(param1, 10, param2, var4);
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
            stackOut_6_1 = new StringBuilder().append("su.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
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
              var3 = param0;
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
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        oo.field_e[wf.field_O] = param3;
        pf.field_d[wf.field_O] = wf.field_O;
        bl.field_m[wf.field_O] = param4;
        if (kt.field_g >= param4) {
          if (er.field_k <= param4) {
            L0: {
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_44_0 = 0;
                stackIn_45_0 = stackOut_44_0;
                break L0;
              } else {
                stackOut_43_0 = param5 * 1000 / var6;
                stackIn_45_0 = stackOut_43_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_45_0;
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
            if (param1 != -106) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            L3: {
              vi.field_s = param4;
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L3;
              } else {
                stackOut_30_0 = param5 * 1000 / var6;
                stackIn_32_0 = stackOut_30_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_32_0;
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
            if (param1 != -106) {
              field_b = null;
              return;
            } else {
              return;
            }
          }
        } else {
          lm.field_V = param4;
          if (er.field_k > param4) {
            L6: {
              vi.field_s = param4;
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L6;
              } else {
                stackOut_16_0 = param5 * 1000 / var6;
                stackIn_18_0 = stackOut_16_0;
                break L6;
              }
            }
            L7: {
              var7 = stackIn_18_0;
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
            if (param1 != -106) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            L9: {
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
            if (param1 != -106) {
              field_b = null;
              return;
            } else {
              return;
            }
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
              var2_int = 79 % ((-40 - param0) / 58);
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
            stackOut_5_1 = new StringBuilder().append("su.B(").append(param0).append(44);
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
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static hd a(int param0, int param1, int param2, boolean param3, int param4, hu param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        hd var13 = null;
        RuntimeException var13_ref = null;
        hd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var13 = new hd(0L, (hd) null);
            var13.field_R = ih.a(param4, 0, param11);
            var13.field_S = ih.a(param2, 0, param9);
            var13.field_rb = ih.a(param12, 0, param1);
            var13.field_u = ih.a(param8, 0, param0);
            var13.field_tb = ih.a(param7, 0, param6);
            var13.field_X = param5;
            var13.field_y = param10;
            stackOut_2_0 = (hd) var13;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var13_ref;
            stackOut_4_1 = new StringBuilder().append("su.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
        return stackIn_3_0;
    }

    static {
    }
}
