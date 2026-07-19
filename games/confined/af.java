/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends sa {
    static mn field_cb;
    static String field_ab;
    static int field_Z;
    static String field_bb;
    static String field_U;

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (param2 >= -5) {
            return;
        }
        if (!(!this.field_N)) {
            return;
        }
        try {
            this.a(ri.field_c, this.field_S, param4, (byte) 64, param1, param0, param3, 128);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "af.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    af(hn param0, ee param1, da param2) {
        super(param0, param1, param2, 0.2, 0.03, 16.0);
        try {
            kj.a(rd.field_Hb, 96, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(byte param0) {
        field_bb = null;
        field_cb = null;
        if (param0 > -59) {
            return;
        }
        field_ab = null;
        field_U = null;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, df param4, int param5) {
        RuntimeException var6 = null;
        tl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        tl[] var10 = null;
        bc var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_28_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_24_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_33_0 = null;
        java.awt.Frame stackOut_27_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param4.c(-121)) {
              L1: {
                if (-1 == (param0 ^ -1)) {
                  var10 = hh.a(param4, 94);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_24_0 = null;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if (param3 == var10[var8].field_j) {
                          L3: {
                            if (var10[var8].field_c == param1) {
                              L4: {
                                if (param2 == 0) {
                                  break L4;
                                } else {
                                  if (param2 == var10[var8].field_k) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_h > param0) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param0 = var10[var8].field_h;
                              var7_int = 1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (param5 == 23221) {
                var11 = param4.a((byte) -101, param3, param2, param0, param1);
                L6: while (true) {
                  if (0 != var11.field_g) {
                    var7 = (java.awt.Frame) (var11.field_f);
                    if (var7 != null) {
                      if ((var11.field_g ^ -1) == -3) {
                        si.a(var7, param4, true);
                        stackOut_37_0 = null;
                        stackIn_38_0 = stackOut_37_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        return var7;
                      }
                    } else {
                      stackOut_33_0 = null;
                      stackIn_34_0 = stackOut_33_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    jd.a(1, 10L);
                    continue L6;
                  }
                }
              } else {
                stackOut_27_0 = (java.awt.Frame) null;
                stackIn_28_0 = stackOut_27_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var6);
            stackOut_39_1 = new StringBuilder().append("af.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param4 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L7;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_25_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (java.awt.Frame) ((Object) stackIn_34_0);
                } else {
                  return (java.awt.Frame) ((Object) stackIn_38_0);
                }
              }
            }
          }
        }
    }

    final void g(int param0) {
        ka discarded$7 = this.a((byte) -123, da.field_g, 1.5);
        if (param0 != 26402) {
            this.g(55);
        }
    }

    static {
        field_bb = "<col=FFFFFF>Nuclear missiles:</col> awarded after every boss.";
        field_cb = new mn();
        field_U = "Loading sound effects";
    }
}
