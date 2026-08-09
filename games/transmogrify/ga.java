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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
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
                            stackIn_10_0 = 1;
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
                stackIn_13_0 = 0;
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
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("ga.E(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
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
        kh stackIn_14_0 = null;
        kh stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 > 58) {
              var2 = lj.a(true, "jagex-last-login-method", param1);
              if (var2 == null) {
                stackIn_7_0 = qe.field_x;
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
                        stackIn_17_0 = (kh) (var5);

                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (((kh) (Object) stackIn_17_0).a(var2, 0)) {
                            stackIn_14_0 = (kh) (var5);
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
                    stackIn_17_0 = qe.field_x;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = (kh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2_ref);

            stackIn_20_1 = new StringBuilder().append("ga.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
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
        java.applet.Applet var2;
        if (si.field_l != 0 + -tf.field_a) {
          if (si.field_l != 250 - tf.field_a) {
            if (param0 != 94) {
              var2 = (java.applet.Applet) null;
              ga.a(49, (java.applet.Applet) null);
              si.field_l = si.field_l + 1;
              return;
            } else {
              si.field_l = si.field_l + 1;
              return;
            }
          } else {
            if (param0 != 94) {
              var2 = (java.applet.Applet) null;
              ga.a(49, (java.applet.Applet) null);
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
            ga.a(49, (java.applet.Applet) null);
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
