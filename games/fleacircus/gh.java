/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7_int = -71 / ((48 - param5) / 49);
            if (ql.field_l == cb.field_v) {
              var8 = new ua(nb.field_a, param4);
              nb.field_a.b(var8, (byte) -35);
              if (!ti.b(10618)) {
                L1: {
                  cb.field_v = wi.field_f;
                  if (!param3) {
                    stackIn_8_0 = 0;
                    break L1;
                  } else {
                    stackIn_8_0 = 1;
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
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var7);

            stackIn_13_1 = new StringBuilder().append("gh.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
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
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_n.field_i.toLowerCase();
            var4 = param1.toLowerCase();
            var5 = -56 / ((param0 - 24) / 46);
            if (-1 != (var4.length() ^ -1)) {
              var6 = var4;
              if (o.a(false, var6)) {
                stackIn_6_0 = vh.field_k;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (fm.a(true, var6)) {
                  stackIn_10_0 = qa.field_t;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (!hg.a(var6, 1)) {
                    if (this.b(0, param1)) {
                      stackIn_17_0 = id.field_j;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (0 >= var7.length()) {
                        stackIn_32_0 = ef.field_m;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if (!hj.a(var6, var7, 0)) {
                          if (hf.a((byte) -67, var6, var7)) {
                            stackIn_25_0 = el.field_B;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (!gl.a(var7, -1, var6)) {
                              stackIn_30_0 = vh.field_k;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              stackIn_28_0 = te.field_i;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_21_0 = te.field_i;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  } else {
                    stackIn_13_0 = ge.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
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
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("gh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L1;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_28_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_30_0;
                      } else {
                        return stackIn_32_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    gh(c param0, c param1, c param2) {
        super(param0);
        try {
            this.field_o = param2;
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        qc stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = rb.field_H;
              var2 = 0;
              var3 = -21 / ((param0 - 22) / 57);
              if (2 == vc.field_a) {
                var4_long = lj.a((byte) -48) + -sd.field_h;
                var2 = (int)((10999L + -var4_long) / 1000L);
                if ((var2 ^ -1) <= -1) {
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
              if (fb.field_d.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = m.field_c[var4];
                  if (0 > var5) {
                    var6 = cm.field_j;
                    break L3;
                  } else {
                    if (var5 != bk.field_a.field_k) {
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
                  if (-3 != (vc.field_a ^ -1)) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (j.field_o.length < uk.field_a.length) {
                          stackIn_18_0 = uk.field_a.length;
                          break L5;
                        } else {
                          stackIn_18_0 = j.field_o.length;
                          break L5;
                        }
                      }
                      L6: {
                        var8 = stackIn_18_0;
                        if (oe.field_c.length < rc.field_g.length) {
                          stackIn_21_0 = rc.field_g.length;
                          break L6;
                        } else {
                          stackIn_21_0 = oe.field_c.length;
                          break L6;
                        }
                      }
                      L7: {
                        var9 = stackIn_21_0;
                        if ((var4 ^ -1) > -7) {
                          break L7;
                        } else {
                          if (var4 < var8 + 6) {
                            L8: {
                              if (-var8 + (var4 + (-6 - -j.field_o.length)) < 0) {
                                stackIn_27_0 = "";
                                break L8;
                              } else {
                                stackIn_27_0 = j.field_o[-var8 + (j.field_o.length + (var4 + -6))];
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
                      if (var4 < 7 + var8) {
                        break L4;
                      } else {
                        if (var4 < var8 + (7 - -var9)) {
                          L9: {
                            if (oe.field_c.length <= -var8 + var4 + -7) {
                              stackIn_34_0 = "";
                              break L9;
                            } else {
                              stackIn_34_0 = oe.field_c[-var8 + -7 + var4];
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
                  stackIn_39_0 = 3;

                  stackIn_39_1 = (String) (var7);

                  if ((var5 ^ -1) > -1) {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = (String) ((Object) stackIn_39_1);
                    stackIn_40_2 = 0;
                    break L11;
                  } else {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = (String) ((Object) stackIn_39_1);
                    stackIn_40_2 = 1;
                    break L11;
                  }
                }
                L12: {
                  var8 = se.a(stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                  var9 = -(var8 >> 923391425) + af.field_b;
                  if (-1 < (var5 ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      var1_int = var1_int + id.field_c;
                      if (bk.field_a.field_k == var5) {
                        stackIn_44_0 = ub.field_a;
                        break L13;
                      } else {
                        stackIn_44_0 = qg.field_b;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = stackIn_44_0;
                      if (var10 != null) {
                        var10.a(-ae.field_c + var9, 0, var8 - -(ae.field_c << -1169799039), hb.field_t + (ge.field_h << 802345473), var1_int);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + ge.field_h;
                    break L12;
                  }
                }
                L15: {
                  if ((var5 ^ -1) <= -1) {
                    lj.field_a.c(var7, var9, ta.field_y + var1_int, var6, -1);
                    var1_int = var1_int + (ge.field_h - -id.field_c - -hb.field_t);
                    break L15;
                  } else {
                    pb.field_e.c(var7, var9, var1_int + kh.field_g, var6, -1);
                    var1_int = var1_int + cm.field_f;
                    break L15;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "gh.B(" + param0 + ')');
        }
    }

    final wd a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wd stackIn_2_0 = null;
        wd stackIn_7_0 = null;
        wd stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_n.field_i.toLowerCase();
            var4 = param1.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              L1: {
                if (param0 == 160) {
                  break L1;
                } else {
                  this.field_n = (c) null;
                  break L1;
                }
              }
              if (lh.a(var4, var3, -1)) {
                if (this.b(0, param1)) {
                  stackIn_11_0 = ml.field_K;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return hm.field_b;
                }
              } else {
                stackIn_7_0 = ml.field_K;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = ml.field_K;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("gh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_o.field_i.toLowerCase();
              var4 = param1.toLowerCase();
              if (var3.length() <= param0) {
                break L1;
              } else {
                if (var4.length() > 0) {
                  var5 = var3.lastIndexOf("@");
                  if (-1 < (var5 ^ -1)) {
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
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_7_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_12_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("gh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    static {
        field_q = 0;
    }
}
