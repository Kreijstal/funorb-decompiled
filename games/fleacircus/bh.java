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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("bh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_25_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = 0;
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
                              stackIn_22_0 = 0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              if (!r.a(var4.charAt(var4.length() - 1), -77)) {
                                var5 = 0;
                                var6 = 0;
                                L3: while (true) {
                                  L4: {
                                    L5: {
                                      if (var6 >= param2.length()) {
                                        break L5;
                                      } else {
                                        var7 = param2.charAt(var6);
                                        stackOut_25_0 = r.a((char) var7, -55);
                                        stackIn_37_0 = stackOut_25_0 ? 1 : 0;
                                        stackIn_26_0 = stackOut_25_0;
                                        if (var8 != 0) {
                                          break L4;
                                        } else {
                                          L6: {
                                            L7: {
                                              if (!stackIn_26_0) {
                                                break L7;
                                              } else {
                                                var5++;
                                                if (var8 == 0) {
                                                  break L6;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            }
                                            var5 = 0;
                                            break L6;
                                          }
                                          L8: {
                                            if (-3 < (var5 ^ -1)) {
                                              break L8;
                                            } else {
                                              if (!param1) {
                                                stackIn_34_0 = 0;
                                                decompiledRegionSelector0 = 5;
                                                break L0;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L3;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    stackIn_37_0 = var5 ^ -1;
                                    break L4;
                                  }
                                  if (stackIn_37_0 >= -1) {
                                    stackIn_41_0 = 1;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  } else {
                                    stackIn_39_0 = 0;
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
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3);

            stackIn_44_1 = new StringBuilder().append("bh.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L9;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L9;
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
