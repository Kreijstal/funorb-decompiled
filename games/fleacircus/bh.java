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
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              if (var2 == null) {
                break L2;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (uj.a(var3, (byte) -95) != 0L) {
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
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("bh.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
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
                            if (r.a(var4.charAt(0), -108)) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              return stackIn_22_0 != 0;
                            } else {
                              if (!r.a(var4.charAt(var4.length() - 1), -77)) {
                                var5 = 0;
                                var6 = 0;
                                L3: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (var5 <= 0) {
                                      stackOut_37_0 = 1;
                                      stackIn_38_0 = stackOut_37_0;
                                      break L0;
                                    } else {
                                      stackOut_35_0 = 0;
                                      stackIn_36_0 = stackOut_35_0;
                                      return stackIn_36_0 != 0;
                                    }
                                  } else {
                                    L4: {
                                      var7 = param2.charAt(var6);
                                      if (!r.a((char) var7, -55)) {
                                        var5 = 0;
                                        break L4;
                                      } else {
                                        var5++;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      if (var5 < 2) {
                                        break L5;
                                      } else {
                                        if (!param1) {
                                          stackOut_31_0 = 0;
                                          stackIn_32_0 = stackOut_31_0;
                                          return stackIn_32_0 != 0;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L3;
                                  }
                                }
                              } else {
                                return false;
                              }
                            }
                          }
                        }
                      }
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("bh.C(").append(param0).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L6;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L6;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return stackIn_38_0 != 0;
    }

    public static void a(int param0) {
        if (param0 > -125) {
            field_q = null;
        }
        field_u = null;
        field_n = null;
        field_q = null;
    }

    bh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((bh) this).field_j = param2;
            ((bh) this).field_i = param1;
            int fieldTemp$0 = pg.field_e;
            pg.field_e = pg.field_e + 1;
            ((bh) this).field_s = 65535 & fieldTemp$0;
            ((bh) this).field_v = param4;
            ((bh) this).field_m = param5;
            ((bh) this).field_p = param6;
            ((bh) this).field_r = param3;
            ((bh) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bh.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
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
