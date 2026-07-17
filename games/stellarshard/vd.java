/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_a;
    static String field_c;
    static int field_e;
    static String field_d;
    static int field_b;

    final static int a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        var7 = stellarshard.field_B;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!qh.c(55)) {
                L2: {
                  ua.field_i.a(eb.a(eb.field_a, ni.field_e, -94), eb.a(oc.field_e, di.field_b, -119), -1);
                  if (ua.field_i.c(-62)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (ua.field_i.field_f >= 0) {
                        L5: {
                          var3 = pk.field_j[ua.field_i.field_f];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (var3 == 5) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        int discarded$3 = -12128;
                        wl.l();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (2 == rb.field_s) {
                      break L3;
                    } else {
                      int discarded$4 = -12128;
                      wl.l();
                      break L3;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (rb.field_s != 2) {
                      break L6;
                    } else {
                      var4 = ih.a((byte) -98) - jj.field_p;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 >= var6) {
                        int discarded$5 = 0;
                        qc.a(5, true);
                        var3 = 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                stackOut_26_0 = var3;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                L7: {
                  ua.field_i.a(0);
                  if (ua.field_i.c(-107)) {
                    var1_int = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (gi.field_f != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "vd.A(" + -61 + 41);
        }
        return stackIn_27_0;
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        int var2 = param1 & 255;
        if (!(var2 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
            if (!(var2 >= 160)) {
                var3 = wf.field_a[var2 + -128];
                if (!(var3 != 0)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    final static void a(nj param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (gi.field_g <= var2_int) {
                    int dupTemp$4 = param0.a((byte) 90);
                    cg.field_d[dupTemp$4] = cg.field_d[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= gi.field_g) {
                        gi.field_g = var2_int;
                        int fieldTemp$5 = gi.field_g;
                        gi.field_g = gi.field_g + 1;
                        ai.field_d[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (param0.field_p == ai.field_d[var3].field_p) {
                              var4 = ai.field_d[var3].a((byte) 105);
                              if (pd.field_q >= cg.field_d[var4]) {
                                break L5;
                              } else {
                                cg.field_d[var4] = cg.field_d[var4] - 1;
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          ai.field_d[incrementValue$6] = ai.field_d[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (ai.field_d[var2_int].field_p != param0.field_p) {
                        break L6;
                      } else {
                        int dupTemp$7 = ai.field_d[var2_int].a((byte) 95);
                        cg.field_d[dupTemp$7] = cg.field_d[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                cg.field_d[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("vd.D(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + -128 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Age:";
        field_a = "OVER <%0>";
        field_e = 0;
    }
}
