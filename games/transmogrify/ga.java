/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static volatile int field_b;
    static rj field_a;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 3336) {
                break L1;
              } else {
                field_a = (rj) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param0.length() <= var2_int) {
                    break L4;
                  } else {
                    var3 = param0.charAt(var2_int);
                    stackOut_5_0 = k.a((char) var3, -37);
                    stackIn_13_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0) {
                          break L5;
                        } else {
                          if (!dj.a((char) var3, true)) {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("ga.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static kh a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        kh[] var3 = null;
        int var4 = 0;
        kh var5 = null;
        int var6 = 0;
        kh stackIn_3_0 = null;
        kh stackIn_7_0 = null;
        kh stackIn_11_0 = null;
        kh stackIn_14_0 = null;
        kh stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_6_0 = null;
        kh stackOut_10_0 = null;
        kh stackOut_13_0 = null;
        kh stackOut_16_0 = null;
        kh stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 > 58) {
              var2 = lj.a(true, "jagex-last-login-method", param1);
              if (var2 == null) {
                stackOut_6_0 = qe.field_x;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = hd.b((byte) 87);
                var4 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3.length <= var4) {
                        break L3;
                      } else {
                        var5 = var3[var4];
                        stackOut_10_0 = (kh) (var5);
                        stackIn_17_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (((kh) (Object) stackIn_11_0).a(var2, 0)) {
                            stackOut_13_0 = (kh) (var5);
                            stackIn_14_0 = stackOut_13_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            var4++;
                            if (var6 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_16_0 = qe.field_x;
                    stackIn_17_0 = stackOut_16_0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = (kh) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2_ref);
            stackOut_18_1 = new StringBuilder().append("ga.B(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = -87;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        kh discarded$3 = null;
        kh discarded$4 = null;
        kh discarded$5 = null;
        java.applet.Applet var2 = null;
        if (si.field_l != 0 + -tf.field_a) {
          if (si.field_l != 250 - tf.field_a) {
            if (param0 != 94) {
              var2 = (java.applet.Applet) null;
              discarded$3 = ga.a(49, (java.applet.Applet) null);
              si.field_l = si.field_l + 1;
              return;
            } else {
              si.field_l = si.field_l + 1;
              return;
            }
          } else {
            if (param0 != 94) {
              var2 = (java.applet.Applet) null;
              discarded$4 = ga.a(49, (java.applet.Applet) null);
              si.field_l = si.field_l + 1;
              return;
            } else {
              si.field_l = si.field_l + 1;
              return;
            }
          }
        } else {
          if (param0 != 94) {
            var2 = (java.applet.Applet) null;
            discarded$5 = ga.a(49, (java.applet.Applet) null);
            si.field_l = si.field_l + 1;
            return;
          } else {
            si.field_l = si.field_l + 1;
            return;
          }
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -35) {
            field_a = (rj) null;
            if (!(param0 != 16711935)) {
                return 0;
            }
            return ((param0 & 240) >> 626342052) + ((61440 & param0) >> -1249371256);
        }
        if (!(param0 != 16711935)) {
            return 0;
        }
        return ((param0 & 240) >> 626342052) + ((61440 & param0) >> -1249371256);
    }

    static {
        field_b = 0;
    }
}
