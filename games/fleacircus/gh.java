/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class gh extends r {
    private c field_o;
    static int field_p;
    private c field_n;
    static int field_q;

    final static boolean a(String param0, int param1, String param2, boolean param3, ca param4, int param5, String param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        ua var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var7_int = -23;
            if (ql.field_l == cb.field_v) {
              var8 = new ua(nb.field_a, param4);
              nb.field_a.b((qa) (Object) var8, (byte) -35);
              if (!ti.b(10618)) {
                L1: {
                  cb.field_v = wi.field_f;
                  if (!param3) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                ed.field_b = stackIn_8_0 != 0;
                ug.field_c = param1;
                ag.field_e = param0;
                ef.field_j = param2;
                rl.field_b = null;
                oa.field_o = param6;
                return true;
              } else {
                var8.h((byte) -114);
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("gh.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(-122).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_16_0 = null;
        String stackOut_31_0 = null;
        String stackOut_24_0 = null;
        String stackOut_29_0 = null;
        String stackOut_27_0 = null;
        String stackOut_20_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            var7 = ((gh) this).field_n.field_i.toLowerCase();
            var4 = param1.toLowerCase();
            var5 = -56 / ((param0 - 24) / 46);
            if (var4.length() != 0) {
              var6 = var4;
              if (o.a(false, var6)) {
                stackOut_5_0 = vh.field_k;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (fm.a(true, var6)) {
                  stackOut_9_0 = qa.field_t;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!hg.a(var6, 1)) {
                    if (this.b(0, param1)) {
                      stackOut_16_0 = id.field_j;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (0 >= var7.length()) {
                        stackOut_31_0 = ef.field_m;
                        stackIn_32_0 = stackOut_31_0;
                        break L0;
                      } else {
                        if (!hj.a(var6, var7, 0)) {
                          if (hf.a((byte) -67, var6, var7)) {
                            stackOut_24_0 = el.field_B;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          } else {
                            if (!gl.a(var7, -1, var6)) {
                              stackOut_29_0 = vh.field_k;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            } else {
                              stackOut_27_0 = te.field_i;
                              stackIn_28_0 = stackOut_27_0;
                              return stackIn_28_0;
                            }
                          }
                        } else {
                          stackOut_20_0 = te.field_i;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    }
                  } else {
                    stackOut_12_0 = ge.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("gh.A(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L1;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    gh(c param0, c param1, c param2) {
        super(param0);
        try {
            ((gh) this).field_o = param2;
            ((gh) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        qc var10 = null;
        int var11 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        qc stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        qc stackOut_43_0 = null;
        qc stackOut_42_0 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = rb.field_H;
              var2 = 0;
              var3 = 21;
              if (2 == vc.field_a) {
                var4_long = lj.a((byte) -48) + -sd.field_h;
                var2 = (int)((10999L + -var4_long) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (~fb.field_d.length >= ~var4) {
                break L0;
              } else {
                L3: {
                  var5 = m.field_c[var4];
                  if (0 > var5) {
                    var6 = cm.field_j;
                    break L3;
                  } else {
                    if (~var5 != ~bk.field_a.field_k) {
                      var6 = fb.field_c;
                      break L3;
                    } else {
                      var6 = rg.field_n;
                      break L3;
                    }
                  }
                }
                L4: {
                  var7 = fb.field_d[var4];
                  if (vc.field_a != 2) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (j.field_o.length < uk.field_a.length) {
                          stackOut_17_0 = uk.field_a.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = j.field_o.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var8 = stackIn_18_0;
                        if (oe.field_c.length < rc.field_g.length) {
                          stackOut_20_0 = rc.field_g.length;
                          stackIn_21_0 = stackOut_20_0;
                          break L6;
                        } else {
                          stackOut_19_0 = oe.field_c.length;
                          stackIn_21_0 = stackOut_19_0;
                          break L6;
                        }
                      }
                      L7: {
                        var9 = stackIn_21_0;
                        if (var4 < 6) {
                          break L7;
                        } else {
                          if (~var4 > ~(var8 + 6)) {
                            L8: {
                              if (-var8 + (var4 + (-6 - -j.field_o.length)) < 0) {
                                stackOut_26_0 = "";
                                stackIn_27_0 = stackOut_26_0;
                                break L8;
                              } else {
                                stackOut_25_0 = j.field_o[-var8 + (j.field_o.length + (var4 + -6))];
                                stackIn_27_0 = stackOut_25_0;
                                break L8;
                              }
                            }
                            var7 = stackIn_27_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (~var4 > ~(7 + var8)) {
                        break L4;
                      } else {
                        if (~var4 > ~(var8 + (7 - -var9))) {
                          L9: {
                            if (oe.field_c.length <= -var8 + var4 + -7) {
                              stackOut_33_0 = "";
                              stackIn_34_0 = stackOut_33_0;
                              break L9;
                            } else {
                              stackOut_32_0 = oe.field_c[-var8 + -7 + var4];
                              stackIn_34_0 = stackOut_32_0;
                              break L9;
                            }
                          }
                          var7 = stackIn_34_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (-2 != var5) {
                    break L10;
                  } else {
                    var7 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackOut_37_0 = 3;
                  stackOut_37_1 = (String) var7;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  if (var5 < 0) {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    break L11;
                  } else {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_40_2 = stackOut_38_2;
                    break L11;
                  }
                }
                L12: {
                  var8 = se.a(stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                  var9 = -(var8 >> 1) + af.field_b;
                  if (var5 < 0) {
                    break L12;
                  } else {
                    L13: {
                      var1_int = var1_int + id.field_c;
                      if (~bk.field_a.field_k == ~var5) {
                        stackOut_43_0 = ub.field_a;
                        stackIn_44_0 = stackOut_43_0;
                        break L13;
                      } else {
                        stackOut_42_0 = qg.field_b;
                        stackIn_44_0 = stackOut_42_0;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = stackIn_44_0;
                      if (var10 != null) {
                        var10.a(-ae.field_c + var9, 0, var8 - -(ae.field_c << 1), hb.field_t + (ge.field_h << 1), var1_int);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + ge.field_h;
                    break L12;
                  }
                }
                if (var5 >= 0) {
                  lj.field_a.c(var7, var9, ta.field_y + var1_int, var6, -1);
                  var1_int = var1_int + (ge.field_h - -id.field_c - -hb.field_t);
                  var4++;
                  var4++;
                  continue L2;
                } else {
                  pb.field_e.c(var7, var9, var1_int + kh.field_g, var6, -1);
                  var1_int = var1_int + cm.field_f;
                  var4++;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "gh.B(" + -46 + ')');
        }
    }

    final wd a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wd stackIn_2_0 = null;
        wd stackIn_7_0 = null;
        wd stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_10_0 = null;
        wd stackOut_6_0 = null;
        wd stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var3 = ((gh) this).field_n.field_i.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              L1: {
                if (param0 == 160) {
                  break L1;
                } else {
                  ((gh) this).field_n = null;
                  break L1;
                }
              }
              if (lh.a(var4, var3, -1)) {
                if (this.b(0, param1)) {
                  stackOut_10_0 = ml.field_K;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return hm.field_b;
                }
              } else {
                stackOut_6_0 = ml.field_K;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_1_0 = ml.field_K;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("gh.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((gh) this).field_o.field_i.toLowerCase();
              var4 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L1;
              } else {
                if (var4.length() > 0) {
                  var5 = var3.lastIndexOf("@");
                  if (var5 < 0) {
                    break L1;
                  } else {
                    if (var5 >= var3.length() - 1) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 - -1);
                      if (var4.indexOf(var6) < 0) {
                        if (var4.indexOf(var7) < 0) {
                          break L1;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        }
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("gh.E(").append(0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
    }
}
