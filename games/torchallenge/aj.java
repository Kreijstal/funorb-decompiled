/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static lj field_f;
    static String field_a;
    static String[] field_e;
    static boolean field_h;
    static String field_d;
    static cf field_c;
    static ka[] field_i;
    static java.applet.Applet field_g;
    static int field_b;

    final static int a(byte param0, qe param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 < -76) {
              var4 = 0;
              if (vg.a(param1.field_F, -1)) {
                L1: {
                  if (null == n.field_kb) {
                    break L1;
                  } else {
                    if (param1 == null) {
                      break L1;
                    } else {
                      if (n.field_kb[param1.field_o][param1.field_H] == null) {
                        break L1;
                      } else {
                        var3_int = 0;
                        L2: while (true) {
                          if (8 <= var3_int) {
                            stackOut_18_0 = 1;
                            stackIn_19_0 = stackOut_18_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L3: {
                              if (param2 == n.field_kb[param1.field_o][param1.field_H][var3_int]) {
                                n.field_kb[param1.field_o][param1.field_H][var3_int] = -1;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            var3_int++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_10_0 = -1;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return -1;
              }
            } else {
              stackOut_2_0 = 24;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("aj.D(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    final static vi a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        vi var5 = null;
        vi stackIn_4_0 = null;
        vi stackIn_8_0 = null;
        vi stackIn_13_0 = null;
        vi stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_7_0 = null;
        vi stackOut_14_0 = null;
        vi stackOut_12_0 = null;
        vi stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 == param0.length()) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (-1 == var2_int) {
                    stackOut_7_0 = dj.field_W;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (param1) {
                        break L2;
                      } else {
                        field_i = (ka[]) null;
                        break L2;
                      }
                    }
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int - -1);
                    var5 = re.a(var3, (byte) 104);
                    if (var5 == null) {
                      stackOut_14_0 = pl.a(var4, 96);
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_12_0 = (vi) (var5);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_3_0 = vh.field_b;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("aj.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ue var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pa var13 = null;
        int var14 = 0;
        int var15 = 0;
        pa var16 = null;
        int[][] var20 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var13 = id.field_b;
            var16 = var13;
            var2 = var16.j(-87);
            var3 = (ue) ((Object) wl.field_b.c((byte) -63));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 == var3.field_k) {
                    break L2;
                  } else {
                    var3 = (ue) ((Object) wl.field_b.c(param0 + -5697));
                    continue L1;
                  }
                }
              }
              if (var3 == null) {
                ob.b(param0 ^ -5466);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  var4 = var16.j(-90);
                  if (var4 != 0) {
                    var5 = var3.field_m;
                    mf.field_b[0] = mf.field_a;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        hh.a(param0 ^ 5425, var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            hl.a((byte) -44, var5);
                            var6 = new String[2][var5];
                            var20 = new int[2][4 * var5];
                            var8 = bb.field_c;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var8 <= var14) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = hi.field_G[var14 + var5];
                                      var6[1][var15] = mf.field_b[var11];
                                      var20[1][var15 * 4] = bg.field_Q[var11];
                                      var20[1][1 + 4 * var15] = rk.field_p[var11];
                                      var20[1][2 + var15 * 4] = ea.field_a[var11];
                                      var20[1][3 + 4 * var15] = cb.field_e[var11];
                                      if (jc.a(mf.field_b[var11], 26691)) {
                                        if (rk.field_p[var11] + (ea.field_a[var11] - -cb.field_e[var11]) == 0) {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = hi.field_G[var9];
                                  var6[0][var10] = mf.field_b[var11];
                                  var20[0][4 * var10] = bg.field_Q[var11];
                                  var20[0][var10 * 4 - -1] = rk.field_p[var11];
                                  var20[0][var10 * 4 - -2] = ea.field_a[var11];
                                  var20[0][3 + var10 * 4] = cb.field_e[var11];
                                  if (!jc.a(mf.field_b[var11], 26691)) {
                                    break L9;
                                  } else {
                                    if (ea.field_a[var11] + (rk.field_p[var11] - -cb.field_e[var11]) != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              ob.a(-33, var16);
                              if (var6_int == 0) {
                                dd.a(ia.field_j, var6_int, 27715, jf.field_sb, uc.field_U, ti.field_e);
                                break L10;
                              } else {
                                dd.a(ia.field_j, var6_int, param0 ^ 31088, jf.field_sb, uc.field_U, ti.field_e);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        mf.field_b[var6_int] = var13.b(false);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (param0 == 5427) {
                  var3.a(true);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "aj.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_i = null;
        field_f = null;
        field_g = null;
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                field_g = (java.applet.Applet) null;
                break L1;
              }
            }
            L2: {
              if (d.p(-82)) {
                break L2;
              } else {
                L3: {
                  if (li.field_N) {
                    break L3;
                  } else {
                    L4: {
                      if (null != qa.field_g) {
                        break L4;
                      } else {
                        qa.field_g = be.a(4, 31315);
                        break L4;
                      }
                    }
                    if (qa.field_g.field_i) {
                      eh.field_l = eh.field_l & (qa.field_g.field_m ^ -1);
                      jj.field_c = jj.field_c | qa.field_g.field_m;
                      qa.field_g = null;
                      li.field_N = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                if (eb.field_l == null) {
                  break L2;
                } else {
                  if (eb.field_l.field_j) {
                    L5: {
                      L6: {
                        if (!gl.field_a) {
                          break L6;
                        } else {
                          if (null == eb.field_l.field_q) {
                            break L6;
                          } else {
                            if (null != hf.field_d) {
                              L7: {
                                vl.a(eb.field_l.field_q, 10);
                                if (null != hf.field_d) {
                                  jl.a((byte) 121);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (bh.field_p) {
                                  break L8;
                                } else {
                                  if (d.p(param0 ^ -99)) {
                                    break L8;
                                  } else {
                                    wj.field_b.a(new eh(hf.field_d), -55);
                                    break L8;
                                  }
                                }
                              }
                              if (vh.field_d != null) {
                                break L5;
                              } else {
                                gl.field_a = false;
                                break L5;
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L9: {
                        if (!gl.field_a) {
                          break L9;
                        } else {
                          if (null != eb.field_l.field_q) {
                            break L9;
                          } else {
                            if (hf.field_d == null) {
                              break L9;
                            } else {
                              L10: {
                                jl.a((byte) 123);
                                if (bh.field_p) {
                                  break L10;
                                } else {
                                  if (!d.p(-86)) {
                                    wj.field_b.a(new eh(hf.field_d), -82);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (vh.field_d != null) {
                                break L5;
                              } else {
                                gl.field_a = false;
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      L11: {
                        hf.field_d = eb.field_l.field_q;
                        if (!gl.field_a) {
                          break L11;
                        } else {
                          gl.field_a = false;
                          break L11;
                        }
                      }
                      if (null != hf.field_d) {
                        jl.a((byte) 114);
                        if (vh.field_d == null) {
                          vf.b((byte) 109);
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    eb.field_l = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L12: {
              if (vh.field_d == null) {
                break L12;
              } else {
                var1_int = 0;
                L13: while (true) {
                  if (var1_int >= 3) {
                    var1_int = 1;
                    var2 = 0;
                    L14: while (true) {
                      if (-4 >= (var2 ^ -1)) {
                        if (var1_int == 0) {
                          break L12;
                        } else {
                          L15: {
                            vh.field_d = null;
                            if (eb.field_l != null) {
                              break L15;
                            } else {
                              if (gl.field_a) {
                                break L15;
                              } else {
                                vf.b((byte) 115);
                                break L12;
                              }
                            }
                          }
                          if (eb.field_l == null) {
                            gl.field_a = false;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      } else {
                        if (vh.field_d[var2] != null) {
                          var1_int = 0;
                          var2++;
                          continue L14;
                        } else {
                          var2++;
                          continue L14;
                        }
                      }
                    }
                  } else {
                    L16: {
                      if (vh.field_d[var1_int].field_i) {
                        ii.field_f[var1_int] = vh.field_d[var1_int].field_n;
                        vh.field_d[var1_int] = null;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var1_int++;
                    continue L13;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "aj.E(" + param0 + ')');
        }
    }

    static {
        field_a = "To server list";
        field_h = false;
        field_e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_d = "Connection timed out. Please try using a different server.";
    }
}
