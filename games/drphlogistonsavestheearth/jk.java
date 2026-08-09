/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends si {
    static String[] field_K;
    static he field_L;
    static he[] field_I;
    static int field_J;
    static he[] field_H;

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        pi var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = oh.field_b;
              if (var7 == null) {
                break L1;
              } else {
                if (!this.a(param1, param0, false, param4, param2)) {
                  break L1;
                } else {
                  if (this.field_u instanceof hk) {
                    ((hk) ((Object) this.field_u)).a((byte) 70, var7, (jk) (this));
                    oh.field_b = null;
                    break L1;
                  } else {
                    if (var7.field_u instanceof hk) {
                      ((hk) ((Object) var7.field_u)).a((byte) 70, var7, (jk) (this));
                      oh.field_b = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("jk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static Object a(boolean param0, byte[] param1, byte param2) {
        jc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        jc stackIn_7_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
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
              if (param2 <= -120) {
                break L1;
              } else {
                field_K = (String[]) null;
                break L1;
              }
            }
            if (param1 != null) {
              if ((param1.length ^ -1) >= -137) {
                if (!param0) {
                  stackIn_12_0 = (byte[]) (param1);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = qd.a((byte) 111, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var3 = new jc();
                ((bh) ((Object) var3)).a(param1, (byte) -125);
                stackIn_7_0 = (jc) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("jk.A(").append(param0).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    public static void j(int param0) {
        field_H = null;
        field_K = null;
        field_I = null;
        field_L = null;
        if (param0 != 7624) {
            field_H = (he[]) null;
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jk.b((byte) 71, param1);
              nc.a(j.field_Y, false, (byte) 92);
              if (param0 == 1) {
                break L1;
              } else {
                jk.j(-66);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jk.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private jk(int param0, int param1, int param2, int param3, cg param4, fd param5, vg param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_z = param6;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "jk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        String stackIn_76_2 = null;
        String stackIn_89_0 = null;
        String stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              re.field_g = param2;
              sh.field_e = true;
              if (re.field_g == 0) {
                var3_int = ab.a(ol.field_h, kc.field_j, pj.field_A, uj.field_i, param0 + 14025);
                var4 = 3 - -var3_int;
                lg.field_a = new int[var4];
                sg.field_f = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    mi.field_g = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        sg.field_f[-3 + var4] = "";
                        sg.field_f[var4 + -2] = qa.field_N;
                        lg.field_a[var4 + -2] = 0;
                        mi.field_g[0] = 4;
                        sg.field_f[-1 + var4] = ei.field_h;
                        lg.field_a[-1 + var4] = 1;
                        mi.field_g[1] = 5;
                        break L1;
                      } else {
                        sg.field_f[var5] = pj.field_A[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    lg.field_a[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (re.field_g != 1) {
                  if (2 == re.field_g) {
                    var3_int = ab.a(ol.field_h, a.a(5044, mk.field_b, new String[]{"<br><%0><br>"}), pj.field_A, uj.field_i, param0 + 14025);
                    var4 = -1;
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if ("<%0>".equals(pj.field_A[var5])) {
                            var4 = var5;
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      if (-1 == var4) {
                        throw new IllegalStateException();
                      } else {
                        lk.field_i = new String[var4];
                        kg.a(pj.field_A, 0, lk.field_i, 0, var4);
                        wg.field_h = new String[var3_int + (-var4 + -1)];
                        kg.a(pj.field_A, var4 - -1, wg.field_h, 0, var3_int + -var4 - 1);
                        var4 = -1;
                        var3_int = ab.a(ol.field_h, a.a(5044, dl.field_I, new String[]{"<br><%0><br>"}), pj.field_A, uj.field_i, 14074);
                        var5 = 0;
                        L6: while (true) {
                          L7: {
                            if (var5 >= var3_int) {
                              break L7;
                            } else {
                              if (!"<%0>".equals(pj.field_A[var5])) {
                                var5++;
                                continue L6;
                              } else {
                                var4 = var5;
                                break L7;
                              }
                            }
                          }
                          if (var4 != -1) {
                            L8: {
                              ng.field_d = new String[var4];
                              kg.a(pj.field_A, 0, ng.field_d, 0, var4);
                              ga.field_i = new String[var3_int - var4 + -1];
                              kg.a(pj.field_A, var4 + 1, ga.field_i, 0, -var4 + var3_int + -1);
                              if (lk.field_i.length >= ng.field_d.length) {
                                stackIn_58_0 = lk.field_i.length;
                                break L8;
                              } else {
                                stackIn_58_0 = ng.field_d.length;
                                break L8;
                              }
                            }
                            L9: {
                              var5 = stackIn_58_0;
                              if (wg.field_h.length >= ga.field_i.length) {
                                stackIn_61_0 = wg.field_h.length;
                                break L9;
                              } else {
                                stackIn_61_0 = ga.field_i.length;
                                break L9;
                              }
                            }
                            var6 = stackIn_61_0;
                            var7 = var6 + 7 + var5;
                            lg.field_a = new int[var7];
                            sg.field_f = new String[var7];
                            var8 = 0;
                            L10: while (true) {
                              if (var7 <= var8) {
                                sg.field_f[0] = na.field_d;
                                mi.field_g = new int[2];
                                lg.field_a[1] = 0;
                                sg.field_f[1] = wk.field_h;
                                sg.field_f[4] = sl.field_B;
                                sg.field_f[2] = ph.field_d;
                                lg.field_a[3] = 1;
                                sg.field_f[3] = ff.field_K;
                                mi.field_g[0] = 5;
                                mi.field_g[1] = 2;
                                sg.field_f[5] = "";
                                var8 = 0;
                                L11: while (true) {
                                  if (var8 >= var5) {
                                    sg.field_f[var5 + 6] = null;
                                    lg.field_a[var5 + 6] = -2;
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var6 <= var8) {
                                        aa.field_d = la.a(false);
                                        break L1;
                                      } else {
                                        stackIn_73_0 = sg.field_f;
                                        stackIn_73_1 = var5 + 7 + var8;
                                        stackIn_73_2 = ga.field_i.length;
                                        stackIn_73_3 = var8;
                                        L13: {




                                          if (stackIn_73_2 > stackIn_73_3) {
                                            stackIn_73_0 = (String[]) ((Object) stackIn_73_0);

                                            stackIn_76_2 = ga.field_i[var8];
                                            break L13;
                                          } else {
                                            stackIn_73_0 = (String[]) ((Object) stackIn_73_0);

                                            stackIn_76_2 = "";
                                            break L13;
                                          }
                                        }
                                        stackIn_73_0[stackIn_73_1] = stackIn_76_2;
                                        var8++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      stackIn_68_0 = sg.field_f;

                                      stackIn_68_1 = 6 - -var8;

                                      if (0 > -var5 + (var8 - -ng.field_d.length)) {
                                        stackIn_69_0 = (String[]) ((Object) stackIn_68_0);
                                        stackIn_69_1 = stackIn_68_1;
                                        stackIn_69_2 = "";
                                        break L14;
                                      } else {
                                        stackIn_69_0 = (String[]) ((Object) stackIn_68_0);
                                        stackIn_69_1 = stackIn_68_1;
                                        stackIn_69_2 = ng.field_d[ng.field_d.length + (var8 + -var5)];
                                        break L14;
                                      }
                                    }
                                    stackIn_69_0[stackIn_69_1] = stackIn_69_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                lg.field_a[var8] = -1;
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            throw new IllegalStateException();
                          }
                        }
                      }
                    }
                  } else {
                    if ((re.field_g ^ -1) == -4) {
                      L15: {
                        if (sb.field_d.field_o) {
                          var3_int = ab.a(ol.field_h, rc.field_h, pj.field_A, uj.field_i, 14074);
                          break L15;
                        } else {
                          var3_int = ab.a(ol.field_h, of.field_u, pj.field_A, uj.field_i, 14074);
                          break L15;
                        }
                      }
                      var4 = var3_int + 2;
                      sg.field_f = new String[var4];
                      lg.field_a = new int[var4];
                      var5 = 0;
                      L16: while (true) {
                        if (var5 >= var4) {
                          mi.field_g = new int[1];
                          var5 = 0;
                          L17: while (true) {
                            if (var3_int <= var5) {
                              sg.field_f[-2 + var4] = "";
                              sg.field_f[var4 - 1] = ei.field_h;
                              lg.field_a[-1 + var4] = 0;
                              mi.field_g[0] = 5;
                              break L1;
                            } else {
                              sg.field_f[var5] = pj.field_A[var5];
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          lg.field_a[var5] = -1;
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      if (4 != re.field_g) {
                        if (-6 != (re.field_g ^ -1)) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = ab.a(ol.field_h, de.field_z, pj.field_A, uj.field_i, 14074);
                          var4 = var3_int + 3;
                          lg.field_a = new int[var4];
                          sg.field_f = new String[var4];
                          var5 = 0;
                          L18: while (true) {
                            if (var5 >= var4) {
                              mi.field_g = new int[2];
                              var5 = 0;
                              L19: while (true) {
                                if (var5 >= var3_int) {
                                  sg.field_f[var4 + -3] = "";
                                  sg.field_f[var4 - 2] = hi.field_h;
                                  lg.field_a[-2 + var4] = 0;
                                  mi.field_g[0] = 3;
                                  sg.field_f[var4 - 1] = ei.field_h;
                                  lg.field_a[var4 + -1] = 1;
                                  mi.field_g[1] = 5;
                                  break L1;
                                } else {
                                  sg.field_f[var5] = pj.field_A[var5];
                                  var5++;
                                  continue L19;
                                }
                              }
                            } else {
                              lg.field_a[var5] = -1;
                              var5++;
                              continue L18;
                            }
                          }
                        }
                      } else {
                        var3_int = ab.a(ol.field_h, o.field_f, pj.field_A, uj.field_i, 14074);
                        var4 = var3_int + 2;
                        sg.field_f = new String[var4];
                        lg.field_a = new int[var4];
                        var5 = 0;
                        L20: while (true) {
                          if (var5 >= var4) {
                            mi.field_g = new int[1];
                            var5 = 0;
                            L21: while (true) {
                              if (var3_int <= var5) {
                                sg.field_f[-2 + var4] = "";
                                sg.field_f[var4 + -1] = ei.field_h;
                                lg.field_a[var4 - 1] = 0;
                                mi.field_g[0] = 5;
                                break L1;
                              } else {
                                sg.field_f[var5] = pj.field_A[var5];
                                var5++;
                                continue L21;
                              }
                            }
                          } else {
                            lg.field_a[var5] = -1;
                            var5++;
                            continue L20;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var3_int = ab.a(ol.field_h, kc.field_j, pj.field_A, uj.field_i, param0 ^ 14027);
                  var4 = var3_int + 2;
                  lg.field_a = new int[var4];
                  sg.field_f = new String[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var4 <= var5) {
                      mi.field_g = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var5 >= var3_int) {
                          sg.field_f[var4 + -2] = "";
                          sg.field_f[var4 + -1] = ei.field_h;
                          lg.field_a[-1 + var4] = 0;
                          mi.field_g[0] = 5;
                          break L1;
                        } else {
                          sg.field_f[var5] = pj.field_A[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      lg.field_a[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            wg.field_k.field_e = mi.field_g.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= sg.field_f.length) {
                L25: {
                  if (re.field_g == 2) {
                    var10 = lk.field_i;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var4_ref_String__ = wg.field_h;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var4_ref_String__.length) {
                            break L25;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = u.a(var12, false, true);
                            if ((var3_int ^ -1) > (var7 ^ -1)) {
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
                        L28: {
                          var11 = var10[var5];
                          var7 = u.a(var11, false, true);
                          if ((var3_int ^ -1) > (var7 ^ -1)) {
                            var3_int = var7;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                li.field_k = -(var3_int >> 1599874817) + var3_int + ji.field_f;
                si.field_B = ji.field_f + -(var3_int >> 1591870081);
                vi.field_e = wg.field_k.field_e * (ig.field_h + wa.field_N << -765060479);
                var4 = 0;
                L29: while (true) {
                  if (var4 >= sg.field_f.length) {
                    jd.field_N = sa.field_f + -(vi.field_e >> 1157044705);
                    if (param0 == 49) {
                      cj.field_f = new int[sg.field_f.length][];
                      var4 = 0;
                      var5 = jd.field_N;
                      L30: while (true) {
                        if (var4 >= sg.field_f.length) {
                          L31: {
                            if ((re.field_g ^ -1) == -3) {
                              wg.field_k.a(-1, -1, param1, 49);
                              break L31;
                            } else {
                              wg.field_k.a(0, qg.a(ob.field_g, (byte) -112, ck.field_c), param1, 63);
                              break L31;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L32: {
                            var6 = lg.field_a[var4];
                            if (var6 >= 0) {
                              var7 = u.a(sg.field_f[var4], true, true);
                              var8 = -(var7 >> 1593906113) + ji.field_f;
                              var5 = var5 + ig.field_h;
                              cj.field_f[var4] = new int[4];
                              cj.field_f[var4][0] = -dg.field_d + var8;
                              cj.field_f[var4][1] = var5;
                              cj.field_f[var4][2] = var7 + (dg.field_d << 273188193);
                              var5 = var5 + (ni.field_p + (wa.field_N << -391617311) - -ig.field_h);
                              cj.field_f[var4][3] = (wa.field_N << 1505025441) + ni.field_p;
                              break L32;
                            } else {
                              var5 = var5 + s.field_g;
                              break L32;
                            }
                          }
                          var4++;
                          continue L30;
                        }
                      }
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    L33: {
                      stackIn_111_0 = vi.field_e;

                      if (0 > lg.field_a[var4]) {
                        stackIn_112_0 = stackIn_111_0;
                        stackIn_112_1 = s.field_g;
                        break L33;
                      } else {
                        stackIn_112_0 = stackIn_111_0;
                        stackIn_112_1 = ni.field_p;
                        break L33;
                      }
                    }
                    vi.field_e = stackIn_112_0 + stackIn_112_1;
                    var4++;
                    continue L29;
                  }
                }
              } else {
                L34: {
                  stackIn_89_0 = sg.field_f[var4];

                  if ((lg.field_a[var4] ^ -1) > -1) {
                    stackIn_90_0 = (String) ((Object) stackIn_89_0);
                    stackIn_90_1 = 0;
                    break L34;
                  } else {
                    stackIn_90_0 = (String) ((Object) stackIn_89_0);
                    stackIn_90_1 = 1;
                    break L34;
                  }
                }
                L35: {
                  var5 = u.a(stackIn_90_0, stackIn_90_1 != 0, true);
                  if (var5 > var3_int) {
                    var3_int = var5;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                var4++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "jk.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, String param1, long param2, java.applet.Applet param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 == 0) {
                        break L2;
                      } else {
                        field_J = -113;
                        break L2;
                      }
                    }
                    L3: {
                      var8 = param3.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      var9 = param4 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (-1L >= (param2 ^ -1L)) {
                        var7 = var9 + "; Expires=" + bf.a(param2 * 1000L + la.a(false), (byte) -29) + "; Max-Age=" + param2;
                        break L3;
                      } else {
                        var7 = var9 + "; Discard;";
                        break L3;
                      }
                    }
                    pb.a(true, "document.cookie=\"" + var7 + "\"", param3);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("jk.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(byte param0, String param1) {
        try {
            int var2_int = -65 % ((-30 - param0) / 62);
            cj.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "jk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new String[]{"Destroy at least 15 death gliders", "Destroy at least 15 assault bots", "Destroy at least 15 tanks", "Destroy at least 15 barracks", "Complete at least one stage without firing any weapons", "Receive no damage in at least one stage", "Lose no lives in at least one stage", "Collect all powerups in at least one stage", "Collect no powerups in at least one stage", "Destroy all enemies in at least one stage", "Complete Earth levels", "Complete Space levels", "Complete Alien levels", "Destroy no human structures in at least one stage", "Complete the game on Hard"};
    }
}
