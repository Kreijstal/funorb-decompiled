/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static boolean field_a;
    static int field_d;
    static String field_b;
    static String field_c;

    final static void a(byte param0) {
        Object var2 = null;
        if (vl.field_n != null) {
          nb.a(-2, (java.awt.Canvas) (Object) vl.field_n);
          vl.field_n.a(0, ka.field_i);
          if (param0 > -14) {
            L0: {
              var2 = null;
              jk.a((java.awt.Frame) null, 17, (d) null);
              vl.field_n = null;
              if (null != rb.field_d) {
                rb.field_d.b((byte) -101);
                break L0;
              } else {
                break L0;
              }
            }
            f.field_kb.requestFocus();
            return;
          } else {
            L1: {
              vl.field_n = null;
              if (null != rb.field_d) {
                rb.field_d.b((byte) -101);
                break L1;
              } else {
                break L1;
              }
            }
            f.field_kb.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -10848) {
            field_c = null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            mh.b();
            ok.field_g = 11;
            jf.field_b = new int[260];
            var1_int = 29;
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var6 = 256;
                var1_int = var6;
                L2: while (true) {
                  if (jf.field_b.length <= var6) {
                    break L0;
                  } else {
                    jf.field_b[var6] = 255;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var3 = 15.0;
                jf.field_b[var2] = (int)(255.0 * Math.pow((double)((float)var2 / 256.0f), var3));
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "jk.F(" + -91 + 41);
        }
    }

    final static int a(boolean param0) {
        return gh.field_P;
    }

    final static nd a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        nd stackIn_5_0 = null;
        nd stackIn_9_0 = null;
        nd stackIn_18_0 = null;
        nd stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_8_0 = null;
        nd stackOut_20_0 = null;
        nd stackOut_17_0 = null;
        nd stackOut_4_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            var2_int = param1.length();
            if (param0 == 255) {
              break L0;
            } else {
              jk.a(118);
              break L0;
            }
          }
          if (0 != var2_int) {
            if (var2_int > 63) {
              stackOut_8_0 = hk.field_x;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              var3 = 0;
              L1: while (true) {
                if (var2_int > var3) {
                  L2: {
                    var4 = param1.charAt(var3);
                    if (45 != var4) {
                      if (pk.field_q.indexOf(var4) != -1) {
                        break L2;
                      } else {
                        stackOut_20_0 = ii.field_h;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                    } else {
                      L3: {
                        if (var3 == 0) {
                          break L3;
                        } else {
                          if (var3 == -1 + var2_int) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_17_0 = ii.field_h;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                  var3++;
                  continue L1;
                } else {
                  return null;
                }
              }
            }
          } else {
            stackOut_4_0 = pj.field_f;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("jk.E(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final static void a(java.awt.Frame param0, int param1, d param2) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: while (true) {
              var3 = param2.a(param0, 0);
              L2: while (true) {
                if (var3.field_a != 0) {
                  if (var3.field_a != 1) {
                    bc.a(0, 100L);
                    continue L1;
                  } else {
                    L3: {
                      param0.setVisible(false);
                      if (param1 == 10) {
                        break L3;
                      } else {
                        field_b = null;
                        break L3;
                      }
                    }
                    param0.dispose();
                    break L0;
                  }
                } else {
                  bc.a(0, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("jk.C(");
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = false;
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = "Return to game";
    }
}
