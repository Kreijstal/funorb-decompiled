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
        int var1 = 0;
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
        int stackIn_17_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_32_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        wg stackIn_43_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        wg stackOut_42_0 = null;
        wg stackOut_41_0 = null;
        L0: {
          var10 = Virogrid.field_F ? 1 : 0;
          var1 = ih.field_a;
          if (param0 == -5205) {
            break L0;
          } else {
            qi.a(87);
            break L0;
          }
        }
        L1: {
          var2 = 0;
          if (2 != p.field_d) {
            break L1;
          } else {
            var3_long = -af.field_e + hc.a(param0 + -4781);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if ((var2 ^ -1) <= -1) {
              break L1;
            } else {
              var2 = 0;
              break L1;
            }
          }
        }
        var3 = 0;
        L2: while (true) {
          if (var3 >= mn.field_c.length) {
            return;
          } else {
            L3: {
              var4 = wg.field_h[var3];
              if (0 > var4) {
                var5 = en.field_Kb;
                break L3;
              } else {
                if (var4 == co.field_k.field_d) {
                  var5 = jl.field_E;
                  break L3;
                } else {
                  var5 = ti.field_b;
                  break L3;
                }
              }
            }
            L4: {
              var6 = mn.field_c[var3];
              if (2 != p.field_d) {
                break L4;
              } else {
                if (var2 != 1) {
                  break L4;
                } else {
                  L5: {
                    if (dh.field_o.length <= rj.field_d.length) {
                      stackOut_16_0 = rj.field_d.length;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = dh.field_o.length;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    if (var3 < 6) {
                      break L6;
                    } else {
                      if (var3 < var7 + 6) {
                        L7: {
                          if ((-6 + (var3 - -rj.field_d.length) + -var7 ^ -1) <= -1) {
                            stackOut_22_0 = rj.field_d[var3 - (6 - (rj.field_d.length + -var7))];
                            stackIn_23_0 = stackOut_22_0;
                            break L7;
                          } else {
                            stackOut_21_0 = "";
                            stackIn_23_0 = stackOut_21_0;
                            break L7;
                          }
                        }
                        var6 = stackIn_23_0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (de.field_rb.length <= eh.field_j.length) {
                      stackOut_26_0 = eh.field_j.length;
                      stackIn_27_0 = stackOut_26_0;
                      break L8;
                    } else {
                      stackOut_25_0 = de.field_rb.length;
                      stackIn_27_0 = stackOut_25_0;
                      break L8;
                    }
                  }
                  var8 = stackIn_27_0;
                  if (var3 < 7 + var7) {
                    break L4;
                  } else {
                    if (var3 >= var8 + (7 - -var7)) {
                      break L4;
                    } else {
                      L9: {
                        if (-7 + (var3 + -var7) < eh.field_j.length) {
                          stackOut_31_0 = eh.field_j[var3 - 7 - var7];
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = "";
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var6 = stackIn_32_0;
                      break L4;
                    }
                  }
                }
              }
            }
            L10: {
              if (var4 == -2) {
                var6 = Integer.toString(var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              stackOut_36_0 = 1492912648;
              stackIn_38_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if ((var4 ^ -1) > -1) {
                stackOut_38_0 = stackIn_38_0;
                stackOut_38_1 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L11;
              } else {
                stackOut_37_0 = stackIn_37_0;
                stackOut_37_1 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                break L11;
              }
            }
            L12: {
              var7 = gl.a(stackIn_39_0, stackIn_39_1 != 0, var6);
              var8 = hn.field_q - (var7 >> -590538751);
              if (var4 < 0) {
                break L12;
              } else {
                L13: {
                  if (co.field_k.field_d != var4) {
                    stackOut_42_0 = qg.field_l;
                    stackIn_43_0 = stackOut_42_0;
                    break L13;
                  } else {
                    stackOut_41_0 = ul.field_g;
                    stackIn_43_0 = stackOut_41_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_43_0;
                  var1 = var1 + oh.field_d;
                  if (var9 != null) {
                    var9.a(var8 + -eh.field_d, (bj.field_j << 2145471137) + mi.field_c, false, var7 - -(eh.field_d << 476439009), var1);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var1 = var1 + bj.field_j;
                break L12;
              }
            }
            if (0 > var4) {
              j.field_h.b(var6, var8, var1 - -vc.field_bb, var5, -1);
              var1 = var1 + re.field_m;
              var3++;
              continue L2;
            } else {
              ti.field_g.b(var6, var8, var1 - -ag.field_e, var5, -1);
              var1 = var1 + (bj.field_j - (-oh.field_d - mi.field_c));
              var3++;
              continue L2;
            }
          }
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
