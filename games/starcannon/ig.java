/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static int field_h;
    int field_e;
    static int field_i;
    static String field_c;
    static int field_b;
    String[] field_a;
    String field_d;
    boolean field_f;
    boolean field_g;

    final static void a(byte param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_41_2 = null;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_47_2 = null;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        String stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        String stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        try {
          L0: {
            L1: {
              m.field_c = true;
              bh.field_a = param1;
              if (param0 >= 59) {
                break L1;
              } else {
                field_b = 5;
                break L1;
              }
            }
            L2: {
              if (0 != bh.field_a) {
                if (1 == bh.field_a) {
                  var3_int = lb.a(qa.field_c, gi.field_f, mg.field_m, rh.field_h, -128);
                  var4 = var3_int + 2;
                  uh.field_h = new String[var4];
                  eg.field_a = new int[var4];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var4) {
                      od.field_h = new int[1];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          uh.field_h[-2 + var4] = "";
                          uh.field_h[var4 + -1] = mc.field_e;
                          eg.field_a[var4 + -1] = 0;
                          od.field_h[0] = 5;
                          break L2;
                        } else {
                          uh.field_h[var5] = gi.field_f[var5];
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      eg.field_a[var5] = -1;
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  if (bh.field_a != 2) {
                    if (bh.field_a == 3) {
                      L5: {
                        if (!nb.field_e.field_n) {
                          var3_int = lb.a(qa.field_c, gi.field_f, wc.field_h, rh.field_h, -110);
                          break L5;
                        } else {
                          var3_int = lb.a(qa.field_c, gi.field_f, lc.field_fb, rh.field_h, -101);
                          break L5;
                        }
                      }
                      var4 = 2 + var3_int;
                      uh.field_h = new String[var4];
                      eg.field_a = new int[var4];
                      var5 = 0;
                      L6: while (true) {
                        if (var5 >= var4) {
                          od.field_h = new int[1];
                          var5 = 0;
                          L7: while (true) {
                            if (var5 >= var3_int) {
                              uh.field_h[var4 + -2] = "";
                              uh.field_h[-1 + var4] = mc.field_e;
                              eg.field_a[-1 + var4] = 0;
                              od.field_h[0] = 5;
                              break L2;
                            } else {
                              uh.field_h[var5] = gi.field_f[var5];
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          eg.field_a[var5] = -1;
                          var5++;
                          continue L6;
                        }
                      }
                    } else {
                      if (-5 != (bh.field_a ^ -1)) {
                        if ((bh.field_a ^ -1) != -6) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = lb.a(qa.field_c, gi.field_f, mc.field_a, rh.field_h, -105);
                          var4 = var3_int + 3;
                          uh.field_h = new String[var4];
                          eg.field_a = new int[var4];
                          var5 = 0;
                          L8: while (true) {
                            if (var5 >= var4) {
                              od.field_h = new int[2];
                              var5 = 0;
                              L9: while (true) {
                                if (var3_int <= var5) {
                                  uh.field_h[-3 + var4] = "";
                                  uh.field_h[var4 + -2] = o.field_c;
                                  eg.field_a[-2 + var4] = 0;
                                  od.field_h[0] = 3;
                                  uh.field_h[var4 + -1] = mc.field_e;
                                  eg.field_a[-1 + var4] = 1;
                                  od.field_h[1] = 5;
                                  break L2;
                                } else {
                                  uh.field_h[var5] = gi.field_f[var5];
                                  var5++;
                                  continue L9;
                                }
                              }
                            } else {
                              eg.field_a[var5] = -1;
                              var5++;
                              continue L8;
                            }
                          }
                        }
                      } else {
                        var3_int = lb.a(qa.field_c, gi.field_f, kd.field_D, rh.field_h, -62);
                        var4 = 2 - -var3_int;
                        eg.field_a = new int[var4];
                        uh.field_h = new String[var4];
                        var5 = 0;
                        L10: while (true) {
                          if (var4 <= var5) {
                            od.field_h = new int[1];
                            var5 = 0;
                            L11: while (true) {
                              if (var3_int <= var5) {
                                uh.field_h[-2 + var4] = "";
                                uh.field_h[var4 + -1] = mc.field_e;
                                eg.field_a[var4 - 1] = 0;
                                od.field_h[0] = 5;
                                break L2;
                              } else {
                                uh.field_h[var5] = gi.field_f[var5];
                                var5++;
                                continue L11;
                              }
                            }
                          } else {
                            eg.field_a[var5] = -1;
                            var5++;
                            continue L10;
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = lb.a(qa.field_c, gi.field_f, fb.a(ph.field_gb, 110, new String[]{"<br><%0><br>"}), rh.field_h, -82);
                    var4 = -1;
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var5 >= var3_int) {
                          break L13;
                        } else {
                          if (!"<%0>".equals(gi.field_f[var5])) {
                            var5++;
                            continue L12;
                          } else {
                            var4 = var5;
                            break L13;
                          }
                        }
                      }
                      if (-1 != var4) {
                        se.field_n = new String[var4];
                        ug.a(gi.field_f, 0, se.field_n, 0, var4);
                        fb.field_c = new String[-1 + var3_int - var4];
                        ug.a(gi.field_f, 1 + var4, fb.field_c, 0, -1 + (-var4 + var3_int));
                        var3_int = lb.a(qa.field_c, gi.field_f, fb.a(dg.field_j, 125, new String[]{"<br><%0><br>"}), rh.field_h, -64);
                        var4 = -1;
                        var5 = 0;
                        L14: while (true) {
                          L15: {
                            if (var5 >= var3_int) {
                              break L15;
                            } else {
                              if (!"<%0>".equals(gi.field_f[var5])) {
                                var5++;
                                continue L14;
                              } else {
                                var4 = var5;
                                break L15;
                              }
                            }
                          }
                          if (-1 == var4) {
                            throw new IllegalStateException();
                          } else {
                            L16: {
                              ri.field_b = new String[var4];
                              ug.a(gi.field_f, 0, ri.field_b, 0, var4);
                              rd.field_q = new String[var3_int + -var4 - 1];
                              ug.a(gi.field_f, 1 + var4, rd.field_q, 0, var3_int + (-var4 + -1));
                              if (se.field_n.length < ri.field_b.length) {
                                stackOut_29_0 = ri.field_b.length;
                                stackIn_30_0 = stackOut_29_0;
                                break L16;
                              } else {
                                stackOut_28_0 = se.field_n.length;
                                stackIn_30_0 = stackOut_28_0;
                                break L16;
                              }
                            }
                            L17: {
                              var5 = stackIn_30_0;
                              if (fb.field_c.length >= rd.field_q.length) {
                                stackOut_32_0 = fb.field_c.length;
                                stackIn_33_0 = stackOut_32_0;
                                break L17;
                              } else {
                                stackOut_31_0 = rd.field_q.length;
                                stackIn_33_0 = stackOut_31_0;
                                break L17;
                              }
                            }
                            var6 = stackIn_33_0;
                            var7 = var6 + (var5 + 7);
                            uh.field_h = new String[var7];
                            eg.field_a = new int[var7];
                            var8 = 0;
                            L18: while (true) {
                              if (var8 >= var7) {
                                uh.field_h[0] = fb.field_f;
                                uh.field_h[1] = ac.field_g;
                                od.field_h = new int[2];
                                eg.field_a[1] = 0;
                                uh.field_h[4] = sh.field_s;
                                od.field_h[0] = 5;
                                uh.field_h[5] = "";
                                uh.field_h[2] = og.field_e;
                                uh.field_h[3] = rj.field_m;
                                od.field_h[1] = 2;
                                eg.field_a[3] = 1;
                                var8 = 0;
                                L19: while (true) {
                                  if (var5 <= var8) {
                                    uh.field_h[var5 + 6] = null;
                                    eg.field_a[var5 + 6] = -2;
                                    var8 = 0;
                                    L20: while (true) {
                                      if (var6 <= var8) {
                                        af.field_x = dd.b(124);
                                        break L2;
                                      } else {
                                        L21: {
                                          stackOut_44_0 = uh.field_h;
                                          stackOut_44_1 = 7 + var5 + var8;
                                          stackIn_46_0 = stackOut_44_0;
                                          stackIn_46_1 = stackOut_44_1;
                                          stackIn_45_0 = stackOut_44_0;
                                          stackIn_45_1 = stackOut_44_1;
                                          if (var8 >= rd.field_q.length) {
                                            stackOut_46_0 = (String[]) ((Object) stackIn_46_0);
                                            stackOut_46_1 = stackIn_46_1;
                                            stackOut_46_2 = "";
                                            stackIn_47_0 = stackOut_46_0;
                                            stackIn_47_1 = stackOut_46_1;
                                            stackIn_47_2 = stackOut_46_2;
                                            break L21;
                                          } else {
                                            stackOut_45_0 = (String[]) ((Object) stackIn_45_0);
                                            stackOut_45_1 = stackIn_45_1;
                                            stackOut_45_2 = rd.field_q[var8];
                                            stackIn_47_0 = stackOut_45_0;
                                            stackIn_47_1 = stackOut_45_1;
                                            stackIn_47_2 = stackOut_45_2;
                                            break L21;
                                          }
                                        }
                                        stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                                        var8++;
                                        continue L20;
                                      }
                                    }
                                  } else {
                                    L22: {
                                      stackOut_38_0 = uh.field_h;
                                      stackOut_38_1 = var8 + 6;
                                      stackIn_40_0 = stackOut_38_0;
                                      stackIn_40_1 = stackOut_38_1;
                                      stackIn_39_0 = stackOut_38_0;
                                      stackIn_39_1 = stackOut_38_1;
                                      if ((var8 - -ri.field_b.length - var5 ^ -1) > -1) {
                                        stackOut_40_0 = (String[]) ((Object) stackIn_40_0);
                                        stackOut_40_1 = stackIn_40_1;
                                        stackOut_40_2 = "";
                                        stackIn_41_0 = stackOut_40_0;
                                        stackIn_41_1 = stackOut_40_1;
                                        stackIn_41_2 = stackOut_40_2;
                                        break L22;
                                      } else {
                                        stackOut_39_0 = (String[]) ((Object) stackIn_39_0);
                                        stackOut_39_1 = stackIn_39_1;
                                        stackOut_39_2 = ri.field_b[-var5 + (var8 - -ri.field_b.length)];
                                        stackIn_41_0 = stackOut_39_0;
                                        stackIn_41_1 = stackOut_39_1;
                                        stackIn_41_2 = stackOut_39_2;
                                        break L22;
                                      }
                                    }
                                    stackIn_41_0[stackIn_41_1] = stackIn_41_2;
                                    var8++;
                                    continue L19;
                                  }
                                }
                              } else {
                                eg.field_a[var8] = -1;
                                var8++;
                                continue L18;
                              }
                            }
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              } else {
                var3_int = lb.a(qa.field_c, gi.field_f, mg.field_m, rh.field_h, -80);
                var4 = 3 + var3_int;
                eg.field_a = new int[var4];
                uh.field_h = new String[var4];
                var5 = 0;
                L23: while (true) {
                  if (var4 <= var5) {
                    od.field_h = new int[2];
                    var5 = 0;
                    L24: while (true) {
                      if (var5 >= var3_int) {
                        uh.field_h[var4 + -3] = "";
                        uh.field_h[-2 + var4] = oi.field_j;
                        eg.field_a[-2 + var4] = 0;
                        od.field_h[0] = 4;
                        uh.field_h[-1 + var4] = mc.field_e;
                        eg.field_a[var4 - 1] = 1;
                        od.field_h[1] = 5;
                        break L2;
                      } else {
                        uh.field_h[var5] = gi.field_f[var5];
                        var5++;
                        continue L24;
                      }
                    }
                  } else {
                    eg.field_a[var5] = -1;
                    var5++;
                    continue L23;
                  }
                }
              }
            }
            ja.field_c.field_b = od.field_h.length;
            var3_int = 0;
            var4 = 0;
            L25: while (true) {
              if (uh.field_h.length <= var4) {
                L26: {
                  if (bh.field_a == 2) {
                    var9 = se.field_n;
                    var5 = 0;
                    L27: while (true) {
                      if (var9.length <= var5) {
                        var10 = fb.field_c;
                        var5 = 0;
                        L28: while (true) {
                          if (var10.length <= var5) {
                            break L26;
                          } else {
                            L29: {
                              var12 = var10[var5];
                              var7 = fb.a(var12, (byte) 26, false);
                              if (var3_int < var7) {
                                var3_int = var7;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            var5++;
                            continue L28;
                          }
                        }
                      } else {
                        var11 = var9[var5];
                        var7 = fb.a(var11, (byte) 26, false);
                        if (var7 > var3_int) {
                          var3_int = var7;
                          var5++;
                          continue L27;
                        } else {
                          var5++;
                          continue L27;
                        }
                      }
                    }
                  } else {
                    break L26;
                  }
                }
                kl.field_d = ee.field_b + var3_int - (var3_int >> -1119890719);
                ef.field_b = ja.field_c.field_b * (mc.field_h + kc.field_S << 368985025);
                p.field_g = -(var3_int >> 376781857) + ee.field_b;
                var4 = 0;
                L30: while (true) {
                  if (var4 >= uh.field_h.length) {
                    nd.field_m = th.field_c - (ef.field_b >> 364143713);
                    oh.field_e = new int[uh.field_h.length][];
                    var4 = 0;
                    var5 = nd.field_m;
                    L31: while (true) {
                      if (uh.field_h.length <= var4) {
                        L32: {
                          if ((bh.field_a ^ -1) != -3) {
                            ja.field_c.a(false, param2, 0, ja.a(la.field_c, pe.field_d, 95));
                            break L32;
                          } else {
                            ja.field_c.a(false, param2, -1, -1);
                            break L32;
                          }
                        }
                        break L0;
                      } else {
                        L33: {
                          var6 = eg.field_a[var4];
                          if (0 <= var6) {
                            var7 = fb.a(uh.field_h[var4], (byte) 26, true);
                            var8 = -(var7 >> -1006263007) + ee.field_b;
                            var5 = var5 + mc.field_h;
                            oh.field_e[var4] = new int[4];
                            oh.field_e[var4][0] = var8 + -rh.field_i;
                            oh.field_e[var4][1] = var5;
                            oh.field_e[var4][2] = var7 + (rh.field_i << 280045313);
                            oh.field_e[var4][3] = (kc.field_S << 727698145) + pk.field_c;
                            var5 = var5 + (pk.field_c + (mc.field_h + (kc.field_S << -148270399)));
                            break L33;
                          } else {
                            var5 = var5 + sg.field_e;
                            break L33;
                          }
                        }
                        var4++;
                        continue L31;
                      }
                    }
                  } else {
                    L34: {
                      stackOut_107_0 = ef.field_b;
                      stackIn_109_0 = stackOut_107_0;
                      stackIn_108_0 = stackOut_107_0;
                      if (eg.field_a[var4] >= 0) {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = pk.field_c;
                        stackIn_110_0 = stackOut_109_0;
                        stackIn_110_1 = stackOut_109_1;
                        break L34;
                      } else {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = sg.field_e;
                        stackIn_110_0 = stackOut_108_0;
                        stackIn_110_1 = stackOut_108_1;
                        break L34;
                      }
                    }
                    ef.field_b = stackIn_110_0 + stackIn_110_1;
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L35: {
                  stackOut_86_0 = uh.field_h[var4];
                  stackOut_86_1 = 26;
                  stackIn_88_0 = stackOut_86_0;
                  stackIn_88_1 = stackOut_86_1;
                  stackIn_87_0 = stackOut_86_0;
                  stackIn_87_1 = stackOut_86_1;
                  if ((eg.field_a[var4] ^ -1) > -1) {
                    stackOut_88_0 = (String) ((Object) stackIn_88_0);
                    stackOut_88_1 = stackIn_88_1;
                    stackOut_88_2 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    break L35;
                  } else {
                    stackOut_87_0 = (String) ((Object) stackIn_87_0);
                    stackOut_87_1 = stackIn_87_1;
                    stackOut_87_2 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    stackIn_89_2 = stackOut_87_2;
                    break L35;
                  }
                }
                var5 = fb.a(stackIn_89_0, (byte) stackIn_89_1, stackIn_89_2 != 0);
                if (var5 > var3_int) {
                  var3_int = var5;
                  var4++;
                  continue L25;
                } else {
                  var4++;
                  continue L25;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "ig.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ma b(int param0) {
        String var1 = ff.g(param0 ^ -1006262947);
        if (param0 != -1006263007) {
            field_h = -54;
        }
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        return new ma(ff.g(119), wf.d(-15200));
    }

    public static void a(int param0) {
        if (param0 != -1) {
            ig.a(-126);
        }
        field_c = null;
    }

    final static java.net.URL a(String param0, int param1, String param2, java.net.URL param3, int param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            java.net.URL stackIn_39_0 = null;
            java.net.URL stackIn_41_0 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            String stackIn_45_2 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_38_0 = null;
            java.net.URL stackOut_40_0 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            try {
              L0: {
                var5 = param3.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (var7_int < 0) {
                        break L2;
                      } else {
                        if (-1 >= (param1 ^ -1)) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 + 1);
                        if (0 <= var7_int) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          if (param0 == null) {
                            break L3;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', var6 - -1);
                      if ((var7_int ^ -1) > -1) {
                        break L6;
                      } else {
                        if (param2 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$9 = var7.append(var5.substring(0, var6));
                      if (param1 <= 0) {
                        break L8;
                      } else {
                        discarded$10 = var7.append("/l=");
                        discarded$11 = var7.append(Integer.toString(param1));
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 == null) {
                        break L9;
                      } else {
                        if (0 >= param0.length()) {
                          break L9;
                        } else {
                          discarded$12 = var7.append("/p=");
                          discarded$13 = var7.append(param0);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        if ((param2.length() ^ -1) >= -1) {
                          break L10;
                        } else {
                          discarded$14 = var7.append("/s=");
                          discarded$15 = var7.append(param2);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5.length() > var6) {
                        discarded$16 = var7.append(var5.substring(var6, var5.length()));
                        break L11;
                      } else {
                        discarded$17 = var7.append('/');
                        break L11;
                      }
                    }
                    L12: {
                      if (param4 == 1) {
                        break L12;
                      } else {
                        field_h = -40;
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackOut_38_0 = new java.net.URL(param3, var7.toString());
                        stackIn_39_0 = stackOut_38_0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_40_0 = (java.net.URL) (param3);
                      stackIn_41_0 = stackOut_40_0;
                      return stackIn_41_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_42_0 = (RuntimeException) (var5_ref);
                stackOut_42_1 = new StringBuilder().append("ig.C(");
                stackIn_44_0 = stackOut_42_0;
                stackIn_44_1 = stackOut_42_1;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                if (param0 == null) {
                  stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackOut_44_2 = "null";
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  stackIn_45_2 = stackOut_44_2;
                  break L14;
                } else {
                  stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
                  stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
                  stackOut_43_2 = "{...}";
                  stackIn_45_0 = stackOut_43_0;
                  stackIn_45_1 = stackOut_43_1;
                  stackIn_45_2 = stackOut_43_2;
                  break L14;
                }
              }
              L15: {
                stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param1).append(',');
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param2 == null) {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L15;
                } else {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L15;
                }
              }
              L16: {
                stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param3 == null) {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L16;
                } else {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L16;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param4 + ')');
            }
            return stackIn_39_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ig(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_c = "Attacking fleet destroyed<br><br>Level 2<br>Engage the Paragulan fleet<br>defending the Proxima system";
    }
}
