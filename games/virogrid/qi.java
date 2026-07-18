/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static sc field_b;
    static int field_d;
    static km field_e;
    static int field_f;
    static String field_a;
    static wk field_c;

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        wg var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        wg stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        wg stackOut_43_0 = null;
        wg stackOut_42_0 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = ih.field_a;
              if (param0 == -5205) {
                break L1;
              } else {
                qi.a(87);
                break L1;
              }
            }
            L2: {
              var2 = 0;
              if (2 != p.field_d) {
                break L2;
              } else {
                var3_long = -af.field_e + hc.a(param0 + -4781);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (var2 >= 0) {
                  break L2;
                } else {
                  var2 = 0;
                  break L2;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= mn.field_c.length) {
                break L0;
              } else {
                L4: {
                  var4 = wg.field_h[var3];
                  if (0 > var4) {
                    var5 = en.field_Kb;
                    break L4;
                  } else {
                    if (var4 == co.field_k.field_d) {
                      var5 = jl.field_E;
                      break L4;
                    } else {
                      var5 = ti.field_b;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = mn.field_c[var3];
                  if (2 != p.field_d) {
                    break L5;
                  } else {
                    if (var2 != 1) {
                      break L5;
                    } else {
                      L6: {
                        if (dh.field_o.length <= rj.field_d.length) {
                          stackOut_17_0 = rj.field_d.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L6;
                        } else {
                          stackOut_16_0 = dh.field_o.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_18_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var3 < var7 + 6) {
                            L8: {
                              if (-6 + (var3 - -rj.field_d.length) + -var7 >= 0) {
                                stackOut_23_0 = rj.field_d[var3 - (6 - (rj.field_d.length + -var7))];
                                stackIn_24_0 = stackOut_23_0;
                                break L8;
                              } else {
                                stackOut_22_0 = "";
                                stackIn_24_0 = stackOut_22_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (de.field_rb.length <= eh.field_j.length) {
                          stackOut_27_0 = eh.field_j.length;
                          stackIn_28_0 = stackOut_27_0;
                          break L9;
                        } else {
                          stackOut_26_0 = de.field_rb.length;
                          stackIn_28_0 = stackOut_26_0;
                          break L9;
                        }
                      }
                      var8 = stackIn_28_0;
                      if (var3 < 7 + var7) {
                        break L5;
                      } else {
                        if (var3 >= var8 + (7 - -var7)) {
                          break L5;
                        } else {
                          L10: {
                            if (-7 + (var3 + -var7) < eh.field_j.length) {
                              stackOut_32_0 = eh.field_j[var3 - 7 - var7];
                              stackIn_33_0 = stackOut_32_0;
                              break L10;
                            } else {
                              stackOut_31_0 = "";
                              stackIn_33_0 = stackOut_31_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackOut_37_0 = 1492912648;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_38_0 = stackOut_37_0;
                  if (var4 < 0) {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    break L12;
                  } else {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    break L12;
                  }
                }
                L13: {
                  var7 = gl.a(stackIn_40_0, stackIn_40_1 != 0, var6);
                  var8 = hn.field_q - (var7 >> 1);
                  if (var4 < 0) {
                    break L13;
                  } else {
                    L14: {
                      if (co.field_k.field_d != var4) {
                        stackOut_43_0 = qg.field_l;
                        stackIn_44_0 = stackOut_43_0;
                        break L14;
                      } else {
                        stackOut_42_0 = ul.field_g;
                        stackIn_44_0 = stackOut_42_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_44_0;
                      var1_int = var1_int + oh.field_d;
                      if (var9 != null) {
                        var9.a(var8 + -eh.field_d, (bj.field_j << 1) + mi.field_c, false, var7 - -(eh.field_d << 1), var1_int);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + bj.field_j;
                    break L13;
                  }
                }
                L16: {
                  if (0 > var4) {
                    j.field_h.b(var6, var8, var1_int - -vc.field_bb, var5, -1);
                    var1_int = var1_int + re.field_m;
                    break L16;
                  } else {
                    ti.field_g.b(var6, var8, var1_int - -ag.field_e, var5, -1);
                    var1_int = var1_int + (bj.field_j - (-oh.field_d - mi.field_c));
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "qi.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 25651) {
            qi.a(-53);
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
