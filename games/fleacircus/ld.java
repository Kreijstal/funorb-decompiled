/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_a;
    static String field_c;

    public static void a(byte param0) {
        int discarded$0 = 0;
        field_b = null;
        if (param0 > -85) {
            discarded$0 = ld.a(40);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static int a(int param0) {
        gf.field_e.a(-23608);
        if (!(td.field_k.b((byte) 66))) {
            return ij.a(125);
        }
        if (param0 <= 37) {
            return 24;
        }
        return 0;
    }

    final static boolean a(int param0, String param1) {
        Process discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        Exception var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = -89 % ((73 - param0) / 41);
            try {
              L1: {
                if (!ce.field_d.startsWith("win")) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param1.startsWith("https://")) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var4 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var4 >= param1.length()) {
                          break L5;
                        } else {
                          stackOut_13_0 = 0;
                          stackIn_19_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (stackIn_14_0 != (var3.indexOf((int) param1.charAt(var4)) ^ -1)) {
                              var4++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            } else {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              decompiledRegionSelector0 = 3;
                              break L1;
                            }
                          }
                        }
                      }
                      discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      break L4;
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("ld.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final static mk a(boolean param0, byte param1) {
        mk var2 = null;
        mk stackIn_1_0 = null;
        mk stackIn_2_0 = null;
        mk stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        mk stackOut_0_0 = null;
        mk stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        mk stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = new mk(true);
          stackOut_0_0 = (mk) (var2);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (mk) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (mk) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_g = stackIn_3_1 != 0;
        if (param1 != 42) {
          field_c = (String) null;
          return var2;
        } else {
          return var2;
        }
    }

    ld(java.awt.Component param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ld.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ld.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "<%0>Spikes:<%1> Skewers fleas, so avoid them.";
        field_c = "Reload game";
    }
}
