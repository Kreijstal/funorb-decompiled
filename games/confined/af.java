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
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_26_0 = null;
        java.awt.Frame stackIn_29_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tl[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        tl[] var10 = null;
        bc var11 = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param4.c(-121)) {
              L1: {
                if (-1 == (param0 ^ -1)) {
                  var10 = hh.a(param4, 94);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_26_0 = null;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if ((param3 ^ -1) == (var10[var8].field_j ^ -1)) {
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
                    stackIn_8_0 = null;
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
                        stackIn_39_0 = null;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        return var7;
                      }
                    } else {
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    jd.a(1, 10L);
                    continue L6;
                  }
                }
              } else {
                stackIn_29_0 = (java.awt.Frame) null;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var6_ref);

            stackIn_42_1 = new StringBuilder().append("af.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L7;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_26_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (java.awt.Frame) ((Object) stackIn_35_0);
                } else {
                  return (java.awt.Frame) ((Object) stackIn_39_0);
                }
              }
            }
          }
        }
    }

    final void g(int param0) {
        this.a((byte) -123, da.field_g, 1.5);
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
