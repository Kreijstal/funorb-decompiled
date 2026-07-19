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
                field_q = (long[]) null;
                break L1;
              }
            }
            L2: {
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L2;
              } else {
                var3 = (CharSequence) ((Object) var2);
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
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("bh.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
        boolean stackIn_26_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_36_0 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_33_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 > 77) {
                L1: {
                  var3_int = param2.length();
                  if (1 > var3_int) {
                    break L1;
                  } else {
                    if ((var3_int ^ -1) < -13) {
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
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              if (!r.a(var4.charAt(var4.length() - 1), -77)) {
                                var5 = 0;
                                var6 = 0;
                                L3: while (true) {
                                  L4: {
                                    if (var6 >= param2.length()) {
                                      stackOut_36_0 = var5 ^ -1;
                                      stackIn_37_0 = stackOut_36_0;
                                      break L4;
                                    } else {
                                      var7 = param2.charAt(var6);
                                      stackOut_25_0 = r.a((char) var7, -55);
                                      stackIn_37_0 = stackOut_25_0 ? 1 : 0;
                                      stackIn_26_0 = stackOut_25_0;
                                      if (var8 != 0) {
                                        break L4;
                                      } else {
                                        L5: {
                                          L6: {
                                            if (!stackIn_26_0) {
                                              break L6;
                                            } else {
                                              var5++;
                                              if (var8 == 0) {
                                                break L5;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                          var5 = 0;
                                          break L5;
                                        }
                                        L7: {
                                          if (-3 < (var5 ^ -1)) {
                                            break L7;
                                          } else {
                                            if (!param1) {
                                              stackOut_33_0 = 0;
                                              stackIn_34_0 = stackOut_33_0;
                                              decompiledRegionSelector0 = 5;
                                              break L0;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        var6++;
                                        continue L3;
                                      }
                                    }
                                  }
                                  if (stackIn_37_0 >= -1) {
                                    stackOut_40_0 = 1;
                                    stackIn_41_0 = stackOut_40_0;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  } else {
                                    stackOut_38_0 = 0;
                                    stackIn_39_0 = stackOut_38_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
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
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var3);
            stackOut_42_1 = new StringBuilder().append("bh.C(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L8;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_39_0 != 0;
                    } else {
                      return stackIn_41_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -125) {
          field_q = (long[]) null;
          field_u = null;
          field_n = null;
          field_q = null;
          return;
        } else {
          field_u = null;
          field_n = null;
          field_q = null;
          return;
        }
    }

    bh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_j = param2;
            this.field_i = param1;
            fieldTemp$0 = pg.field_e;
            pg.field_e = pg.field_e + 1;
            this.field_s = 65535 & fieldTemp$0;
            this.field_v = param4;
            this.field_m = param5;
            this.field_p = param6;
            this.field_r = param3;
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = new String[]{"Congratulations!", "You have completed", "Flea Circus!"};
        field_n = "No highscores";
        field_q = new long[32];
    }
}
