/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static o field_d;
    static ok field_c;
    static java.awt.Image field_b;
    static int field_a;

    final static String a(CharSequence param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_34_0 = null;
        String stackOut_29_0 = null;
        String stackOut_20_0 = null;
        String stackOut_15_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = kc.field_J;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = ta.a(-76, param0);
                      if (param1 <= -33) {
                        break L2;
                      } else {
                        hg.a(123, (byte) 15);
                        break L2;
                      }
                    }
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (-2 < (var4.length() ^ -1)) {
                          break L3;
                        } else {
                          L4: {
                            if (d.a(true, var4.charAt(0))) {
                              break L4;
                            } else {
                              if (d.a(true, var4.charAt(var4.length() - 1))) {
                                break L4;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (var6 >= param0.length()) {
                                    if ((var5 ^ -1) < -1) {
                                      stackOut_34_0 = lg.field_c;
                                      stackIn_35_0 = stackOut_34_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param0.charAt(var6);
                                      if (d.a(true, (char) var7)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-3 < (var5 ^ -1)) {
                                        break L7;
                                      } else {
                                        if (param2) {
                                          break L7;
                                        } else {
                                          stackOut_29_0 = ll.field_g;
                                          stackIn_30_0 = stackOut_29_0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_20_0 = lg.field_c;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackOut_15_0 = kc.field_J;
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = kc.field_J;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("hg.C(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  return stackIn_35_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            hg.a(0, (byte) -66);
        }
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static int b(int param0, byte param1) {
        if (param1 != -89) {
            field_a = 68;
        }
        return cj.field_e[2047 & param0];
    }

    final static void a(int param0, byte param1) {
        mg var2 = n.field_b;
        var2.c((byte) -70, param0);
        var2.b((byte) 11, 1);
        if (param1 != 106) {
            hg.a(-86, (byte) 34);
        }
        var2.b((byte) 11, 2);
    }

    static {
        field_c = new ok();
    }
}
