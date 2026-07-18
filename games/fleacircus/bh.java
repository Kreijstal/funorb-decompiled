/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends lh {
    static int field_l;
    int field_m;
    static String[] field_u;
    int field_r;
    int field_o;
    static String field_n;
    static long[] field_q;
    int field_v;
    int field_s;
    int field_i;
    int field_j;
    long field_k;
    static int field_t;
    int[] field_p;

    final static void a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            L2: {
              var2 = param1.getParameter("username");
              if (null == var2) {
                break L2;
              } else {
                if (uj.a((CharSequence) (Object) var2, (byte) -95) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("bh.A(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_33_0 = false;
        int stackOut_47_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param0 > 77) {
                L1: {
                  var3_int = param2.length();
                  if (1 > var3_int) {
                    break L1;
                  } else {
                    if (var3_int > 12) {
                      break L1;
                    } else {
                      L2: {
                        var4 = uk.a(12, param2);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (1 > var4.length()) {
                            break L2;
                          } else {
                            L3: {
                              if (r.a(var4.charAt(0), -108)) {
                                break L3;
                              } else {
                                if (!r.a(var4.charAt(var4.length() - 1), -77)) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    L5: {
                                      L6: {
                                        if (~var6 <= ~param2.length()) {
                                          break L6;
                                        } else {
                                          var7 = param2.charAt(var6);
                                          stackOut_33_0 = r.a((char) var7, -55);
                                          stackIn_51_0 = stackOut_33_0 ? 1 : 0;
                                          stackIn_34_0 = stackOut_33_0;
                                          if (var8 != 0) {
                                            break L5;
                                          } else {
                                            L7: {
                                              L8: {
                                                if (!stackIn_34_0) {
                                                  break L8;
                                                } else {
                                                  var5++;
                                                  if (var8 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              var5 = 0;
                                              break L7;
                                            }
                                            L9: {
                                              if (var5 < 2) {
                                                break L9;
                                              } else {
                                                if (!param1) {
                                                  stackOut_47_0 = 0;
                                                  stackIn_48_0 = stackOut_47_0;
                                                  return stackIn_48_0 != 0;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var6++;
                                            if (var8 == 0) {
                                              continue L4;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_50_0 = ~var5;
                                      stackIn_51_0 = stackOut_50_0;
                                      break L5;
                                    }
                                    if (stackIn_51_0 >= -1) {
                                      stackOut_54_0 = 1;
                                      stackIn_55_0 = stackOut_54_0;
                                      break L0;
                                    } else {
                                      stackOut_52_0 = 0;
                                      stackIn_53_0 = stackOut_52_0;
                                      return stackIn_53_0 != 0;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackOut_29_0 = 0;
                            stackIn_30_0 = stackOut_29_0;
                            return stackIn_30_0 != 0;
                          }
                        }
                      }
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0 != 0;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var3;
            stackOut_56_1 = new StringBuilder().append("bh.C(").append(param0).append(',').append(param1).append(',');
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L10;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L10;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ')');
        }
        return stackIn_55_0 != 0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -125) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            field_u = null;
            field_n = null;
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "bh.B(" + param0 + ')');
        }
    }

    bh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((bh) this).field_j = param2;
            ((bh) this).field_i = param1;
            int fieldTemp$3 = pg.field_e;
            pg.field_e = pg.field_e + 1;
            ((bh) this).field_s = 65535 & fieldTemp$3;
            ((bh) this).field_v = param4;
            ((bh) this).field_m = param5;
            ((bh) this).field_p = param6;
            ((bh) this).field_r = param3;
            ((bh) this).field_o = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param6 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[]{"Congratulations!", "You have completed", "Flea Circus!"};
        field_n = "No highscores";
        field_q = new long[32];
    }
}
