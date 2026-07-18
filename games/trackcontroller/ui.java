/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ui extends di {
    private lb field_q;
    static String field_n;
    static aa field_m;
    static int[] field_r;
    private lb field_o;
    static be field_p;

    final ud a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object var5 = null;
        ud stackIn_2_0 = null;
        ud stackIn_5_0 = null;
        ud stackIn_10_0 = null;
        ud stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud stackOut_11_0 = null;
        ud stackOut_9_0 = null;
        ud stackOut_4_0 = null;
        ud stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var3 = ((ui) this).field_q.field_s.toLowerCase();
            var4 = param1.toLowerCase();
            if (0 != var4.length()) {
              if (ri.a((byte) 56, var4, var3)) {
                L1: {
                  if (param0 <= -106) {
                    break L1;
                  } else {
                    var5 = null;
                    ud discarded$2 = ((ui) this).a(-122, (String) null);
                    break L1;
                  }
                }
                if (!this.b(param1, 84)) {
                  stackOut_11_0 = TrackController.field_G;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ef.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_4_0 = ef.field_b;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ef.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("ui.F(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final static void g() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (cj.field_o == null) {
            break L0;
          } else {
            var1 = (Object) (Object) cj.field_o;
            synchronized (var1) {
              L1: {
                cj.field_o = null;
                break L1;
              }
            }
            break L0;
          }
        }
    }

    public static void h(int param0) {
        if (param0 != 256) {
            boolean discarded$0 = ui.a(-68, 'ﾥ');
        }
        field_n = null;
        field_p = null;
        field_m = null;
        field_r = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!vl.a(param1, param0 ^ -3296)) {
                if (param0 == -19050) {
                  var6 = ob.field_q;
                  var2 = var6;
                  var3 = 0;
                  L1: while (true) {
                    if (var3 >= var6.length) {
                      var2 = hj.field_f;
                      var3 = 0;
                      L2: while (true) {
                        if (var3 >= var2.length) {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          var4 = var2[var3];
                          if (param1 != var4) {
                            var3++;
                            continue L2;
                          } else {
                            stackOut_19_0 = 1;
                            stackIn_20_0 = stackOut_19_0;
                            return stackIn_20_0 != 0;
                          }
                        }
                      }
                    } else {
                      var4 = var6[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L1;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2_ref, "ui.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0 != 0;
    }

    private final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 24) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            L2: {
              var8 = ((ui) this).field_o.field_s.toLowerCase();
              var4 = param0.toLowerCase();
              if (var8.length() <= 0) {
                break L2;
              } else {
                if (-1 > var4.length()) {
                  var5 = var8.lastIndexOf("@");
                  if (-1 > var5) {
                    break L2;
                  } else {
                    if (var5 < -1 + var8.length()) {
                      var6 = var8.substring(0, var5);
                      var7 = var8.substring(var5 + 1);
                      if (-1 < var4.indexOf(var6)) {
                        if (-1 > var4.indexOf(var7)) {
                          break L2;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_13_0 = stackOut_12_0;
                          return stackIn_13_0 != 0;
                        }
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ui.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              param1 = v.a('_', (byte) -31, "", param1);
              if (param2 > 77) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = rb.a(22479, param1);
                if (param0.indexOf(param1) != -1) {
                  break L3;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ui.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_30_0 = null;
        String stackOut_24_0 = null;
        String stackOut_28_0 = null;
        String stackOut_20_0 = null;
        String stackOut_16_0 = null;
        String stackOut_13_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_3_0 = null;
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
            L1: {
              if (param1 == 426) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            var6 = ((ui) this).field_q.field_s.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              int discarded$14 = -23797;
              if (ac.a(var5)) {
                stackOut_7_0 = nl.field_c;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (!sd.a(var5, (byte) 115)) {
                  int discarded$15 = 0;
                  if (!ba.a(var5)) {
                    if (!this.b(param0, 35)) {
                      if (var6.length() <= 0) {
                        stackOut_30_0 = pf.field_N;
                        stackIn_31_0 = stackOut_30_0;
                        break L0;
                      } else {
                        if (!cb.a(var6, var5, (byte) -11)) {
                          if (rh.a(param1 ^ 19012, var6, var5)) {
                            stackOut_24_0 = fe.field_J;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          } else {
                            if (ui.a(var5, var6, (byte) 103)) {
                              stackOut_28_0 = qd.field_c;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              return nl.field_c;
                            }
                          }
                        } else {
                          stackOut_20_0 = qd.field_c;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    } else {
                      stackOut_16_0 = h.field_a;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  } else {
                    stackOut_13_0 = mj.field_a;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                } else {
                  stackOut_10_0 = kh.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("ui.B(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ')');
        }
        return stackIn_31_0;
    }

    ui(lb param0, lb param1, lb param2) {
        super(param0);
        try {
            ((ui) this).field_q = param1;
            ((ui) this).field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
            ui.h(85);
        }
        return (pf.field_U & 1) != 0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Congratulations! You've completed the full game!";
        field_m = new aa(12, 0, 1, 0);
        field_r = new int[8192];
        field_p = new be(256);
    }
}
