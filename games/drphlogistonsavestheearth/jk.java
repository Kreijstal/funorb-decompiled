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
        L0: {
          super.a(param0, param1, param2, param3, param4, param5);
          var7 = oh.field_b;
          if (var7 == null) {
            break L0;
          } else {
            if (!((jk) this).a(param1, param0, false, param4, param2)) {
              break L0;
            } else {
              if (((jk) this).field_u instanceof hk) {
                ((hk) (Object) ((jk) this).field_u).a((byte) 70, var7, (jk) this);
                oh.field_b = null;
                break L0;
              } else {
                if (var7.field_u instanceof hk) {
                  ((hk) (Object) var7.field_u).a((byte) 70, var7, (jk) this);
                  oh.field_b = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    final static Object a(boolean param0, byte[] param1, byte param2) {
        jc var3 = null;
        if (param2 > -120) {
            field_K = null;
        }
        if (param1 == null) {
            return null;
        }
        if ((param1.length ^ -1) < -137) {
            var3 = new jc();
            ((bh) (Object) var3).a(param1, (byte) -125);
            return (Object) (Object) var3;
        }
        if (param0) {
            return (Object) (Object) qd.a((byte) 111, param1);
        }
        return (Object) (Object) param1;
    }

    public static void j(int param0) {
        field_H = null;
        field_K = null;
        field_I = null;
        field_L = null;
        if (param0 != 7624) {
            field_H = null;
        }
    }

    final static void a(int param0, String param1) {
        jk.b((byte) 71, param1);
        nc.a(j.field_Y, false, (byte) 92);
        if (param0 != 1) {
            jk.j(-66);
        }
    }

    private jk(int param0, int param1, int param2, int param3, cg param4, fd param5, vg param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((jk) this).field_z = param6;
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_74_2 = null;
        String stackIn_86_0 = null;
        String stackIn_87_0 = null;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        String[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String stackOut_72_2 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        String stackOut_85_0 = null;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          re.field_g = param2;
          sh.field_e = true;
          if (re.field_g == 0) {
            var3 = ab.a(ol.field_h, kc.field_j, pj.field_A, uj.field_i, param0 + 14025);
            var4 = 3 - -var3;
            lg.field_a = new int[var4];
            sg.field_f = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                mi.field_g = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    sg.field_f[-3 + var4] = "";
                    sg.field_f[var4 + -2] = qa.field_N;
                    lg.field_a[var4 + -2] = 0;
                    mi.field_g[0] = 4;
                    sg.field_f[-1 + var4] = ei.field_h;
                    lg.field_a[-1 + var4] = 1;
                    mi.field_g[1] = 5;
                    break L0;
                  } else {
                    sg.field_f[var5] = pj.field_A[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                lg.field_a[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (re.field_g != 1) {
              if (2 == re.field_g) {
                var3 = ab.a(ol.field_h, a.a(5044, mk.field_b, new String[1]), pj.field_A, uj.field_i, param0 + 14025);
                var4 = -1;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3) {
                      break L4;
                    } else {
                      if ("<%0>".equals((Object) (Object) pj.field_A[var5])) {
                        var4 = var5;
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  if (-1 == var4) {
                    throw new IllegalStateException();
                  } else {
                    lk.field_i = new String[var4];
                    kg.a((Object[]) (Object) pj.field_A, 0, (Object[]) (Object) lk.field_i, 0, var4);
                    wg.field_h = new String[var3 + (-var4 + -1)];
                    kg.a((Object[]) (Object) pj.field_A, var4 - -1, (Object[]) (Object) wg.field_h, 0, var3 + -var4 - 1);
                    var4 = -1;
                    var3 = ab.a(ol.field_h, a.a(5044, dl.field_I, new String[1]), pj.field_A, uj.field_i, 14074);
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3) {
                          break L6;
                        } else {
                          if (!"<%0>".equals((Object) (Object) pj.field_A[var5])) {
                            var5++;
                            continue L5;
                          } else {
                            var4 = var5;
                            break L6;
                          }
                        }
                      }
                      if (var4 != -1) {
                        L7: {
                          ng.field_d = new String[var4];
                          kg.a((Object[]) (Object) pj.field_A, 0, (Object[]) (Object) ng.field_d, 0, var4);
                          ga.field_i = new String[var3 - var4 + -1];
                          kg.a((Object[]) (Object) pj.field_A, var4 + 1, (Object[]) (Object) ga.field_i, 0, -var4 + var3 + -1);
                          if (lk.field_i.length >= ng.field_d.length) {
                            stackOut_56_0 = lk.field_i.length;
                            stackIn_57_0 = stackOut_56_0;
                            break L7;
                          } else {
                            stackOut_55_0 = ng.field_d.length;
                            stackIn_57_0 = stackOut_55_0;
                            break L7;
                          }
                        }
                        L8: {
                          var5 = stackIn_57_0;
                          if (wg.field_h.length >= ga.field_i.length) {
                            stackOut_59_0 = wg.field_h.length;
                            stackIn_60_0 = stackOut_59_0;
                            break L8;
                          } else {
                            stackOut_58_0 = ga.field_i.length;
                            stackIn_60_0 = stackOut_58_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_60_0;
                        var7 = var6 + 7 + var5;
                        lg.field_a = new int[var7];
                        sg.field_f = new String[var7];
                        var8 = 0;
                        L9: while (true) {
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
                            L10: while (true) {
                              if (var8 >= var5) {
                                sg.field_f[var5 + 6] = null;
                                lg.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L11: while (true) {
                                  if (var6 <= var8) {
                                    aa.field_d = la.a(false);
                                    break L0;
                                  } else {
                                    L12: {
                                      stackOut_71_0 = sg.field_f;
                                      stackOut_71_1 = var5 + 7 + var8;
                                      stackIn_73_0 = stackOut_71_0;
                                      stackIn_73_1 = stackOut_71_1;
                                      stackIn_72_0 = stackOut_71_0;
                                      stackIn_72_1 = stackOut_71_1;
                                      if (ga.field_i.length > var8) {
                                        stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                        stackOut_73_1 = stackIn_73_1;
                                        stackOut_73_2 = ga.field_i[var8];
                                        stackIn_74_0 = stackOut_73_0;
                                        stackIn_74_1 = stackOut_73_1;
                                        stackIn_74_2 = stackOut_73_2;
                                        break L12;
                                      } else {
                                        stackOut_72_0 = (String[]) (Object) stackIn_72_0;
                                        stackOut_72_1 = stackIn_72_1;
                                        stackOut_72_2 = "";
                                        stackIn_74_0 = stackOut_72_0;
                                        stackIn_74_1 = stackOut_72_1;
                                        stackIn_74_2 = stackOut_72_2;
                                        break L12;
                                      }
                                    }
                                    stackIn_74_0[stackIn_74_1] = stackIn_74_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L13: {
                                  stackOut_65_0 = sg.field_f;
                                  stackOut_65_1 = 6 - -var8;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  if (0 > -var5 + (var8 - -ng.field_d.length)) {
                                    stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                    stackOut_67_1 = stackIn_67_1;
                                    stackOut_67_2 = "";
                                    stackIn_68_0 = stackOut_67_0;
                                    stackIn_68_1 = stackOut_67_1;
                                    stackIn_68_2 = stackOut_67_2;
                                    break L13;
                                  } else {
                                    stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                    stackOut_66_1 = stackIn_66_1;
                                    stackOut_66_2 = ng.field_d[ng.field_d.length + (var8 + -var5)];
                                    stackIn_68_0 = stackOut_66_0;
                                    stackIn_68_1 = stackOut_66_1;
                                    stackIn_68_2 = stackOut_66_2;
                                    break L13;
                                  }
                                }
                                stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            lg.field_a[var8] = -1;
                            var8++;
                            continue L9;
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
                  L14: {
                    if (sb.field_d.field_o) {
                      var3 = ab.a(ol.field_h, rc.field_h, pj.field_A, uj.field_i, 14074);
                      break L14;
                    } else {
                      var3 = ab.a(ol.field_h, of.field_u, pj.field_A, uj.field_i, 14074);
                      break L14;
                    }
                  }
                  var4 = var3 + 2;
                  sg.field_f = new String[var4];
                  lg.field_a = new int[var4];
                  var5 = 0;
                  L15: while (true) {
                    if (var5 >= var4) {
                      mi.field_g = new int[1];
                      var5 = 0;
                      L16: while (true) {
                        if (var3 <= var5) {
                          sg.field_f[-2 + var4] = "";
                          sg.field_f[var4 - 1] = ei.field_h;
                          lg.field_a[-1 + var4] = 0;
                          mi.field_g[0] = 5;
                          break L0;
                        } else {
                          sg.field_f[var5] = pj.field_A[var5];
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      lg.field_a[var5] = -1;
                      var5++;
                      continue L15;
                    }
                  }
                } else {
                  if (4 != re.field_g) {
                    if (-6 != (re.field_g ^ -1)) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = ab.a(ol.field_h, de.field_z, pj.field_A, uj.field_i, 14074);
                      var4 = var3 + 3;
                      lg.field_a = new int[var4];
                      sg.field_f = new String[var4];
                      var5 = 0;
                      L17: while (true) {
                        if (var5 >= var4) {
                          mi.field_g = new int[2];
                          var5 = 0;
                          L18: while (true) {
                            if (var5 >= var3) {
                              sg.field_f[var4 + -3] = "";
                              sg.field_f[var4 - 2] = hi.field_h;
                              lg.field_a[-2 + var4] = 0;
                              mi.field_g[0] = 3;
                              sg.field_f[var4 - 1] = ei.field_h;
                              lg.field_a[var4 + -1] = 1;
                              mi.field_g[1] = 5;
                              break L0;
                            } else {
                              sg.field_f[var5] = pj.field_A[var5];
                              var5++;
                              continue L18;
                            }
                          }
                        } else {
                          lg.field_a[var5] = -1;
                          var5++;
                          continue L17;
                        }
                      }
                    }
                  } else {
                    var3 = ab.a(ol.field_h, o.field_f, pj.field_A, uj.field_i, 14074);
                    var4 = var3 + 2;
                    sg.field_f = new String[var4];
                    lg.field_a = new int[var4];
                    var5 = 0;
                    L19: while (true) {
                      if (var5 >= var4) {
                        mi.field_g = new int[1];
                        var5 = 0;
                        L20: while (true) {
                          if (var3 <= var5) {
                            sg.field_f[-2 + var4] = "";
                            sg.field_f[var4 + -1] = ei.field_h;
                            lg.field_a[var4 - 1] = 0;
                            mi.field_g[0] = 5;
                            break L0;
                          } else {
                            sg.field_f[var5] = pj.field_A[var5];
                            var5++;
                            continue L20;
                          }
                        }
                      } else {
                        lg.field_a[var5] = -1;
                        var5++;
                        continue L19;
                      }
                    }
                  }
                }
              }
            } else {
              var3 = ab.a(ol.field_h, kc.field_j, pj.field_A, uj.field_i, param0 ^ 14027);
              var4 = var3 + 2;
              lg.field_a = new int[var4];
              sg.field_f = new String[var4];
              var5 = 0;
              L21: while (true) {
                if (var4 <= var5) {
                  mi.field_g = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var3) {
                      sg.field_f[var4 + -2] = "";
                      sg.field_f[var4 + -1] = ei.field_h;
                      lg.field_a[-1 + var4] = 0;
                      mi.field_g[0] = 5;
                      break L0;
                    } else {
                      sg.field_f[var5] = pj.field_A[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  lg.field_a[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        wg.field_k.field_e = mi.field_g.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= sg.field_f.length) {
            L24: {
              if (re.field_g == 2) {
                var10 = lk.field_i;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = wg.field_h;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        var13 = var11[var5];
                        var7 = u.a(var13, false, true);
                        if (var3 < var7) {
                          var3 = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    var12 = var10[var5];
                    var7 = u.a(var12, false, true);
                    if (var3 < var7) {
                      var3 = var7;
                      var5++;
                      continue L25;
                    } else {
                      var5++;
                      continue L25;
                    }
                  }
                }
              } else {
                break L24;
              }
            }
            li.field_k = -(var3 >> 1599874817) + var3 + ji.field_f;
            si.field_B = ji.field_f + -(var3 >> 1591870081);
            vi.field_e = wg.field_k.field_e * (ig.field_h + wa.field_N << -765060479);
            var4 = 0;
            L27: while (true) {
              if (var4 >= sg.field_f.length) {
                jd.field_N = sa.field_f + -(vi.field_e >> 1157044705);
                if (param0 == 49) {
                  cj.field_f = new int[sg.field_f.length][];
                  var4 = 0;
                  var5 = jd.field_N;
                  L28: while (true) {
                    if (var4 >= sg.field_f.length) {
                      L29: {
                        if ((re.field_g ^ -1) == -3) {
                          wg.field_k.a(-1, -1, param1, 49);
                          break L29;
                        } else {
                          wg.field_k.a(0, qg.a(ob.field_g, (byte) -112, ck.field_c), param1, 63);
                          break L29;
                        }
                      }
                      return;
                    } else {
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
                        var4++;
                        continue L28;
                      } else {
                        var5 = var5 + s.field_g;
                        var4++;
                        continue L28;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                L30: {
                  stackOut_105_0 = vi.field_e;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_106_0 = stackOut_105_0;
                  if (0 > lg.field_a[var4]) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = s.field_g;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L30;
                  } else {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = ni.field_p;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    break L30;
                  }
                }
                vi.field_e = stackIn_108_0 + stackIn_108_1;
                var4++;
                continue L27;
              }
            }
          } else {
            L31: {
              stackOut_85_0 = sg.field_f[var4];
              stackIn_87_0 = stackOut_85_0;
              stackIn_86_0 = stackOut_85_0;
              if ((lg.field_a[var4] ^ -1) > -1) {
                stackOut_87_0 = (String) (Object) stackIn_87_0;
                stackOut_87_1 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                break L31;
              } else {
                stackOut_86_0 = (String) (Object) stackIn_86_0;
                stackOut_86_1 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                break L31;
              }
            }
            var5 = u.a(stackIn_88_0, stackIn_88_1 != 0, true);
            if (var5 > var3) {
              var3 = var5;
              var4++;
              continue L23;
            } else {
              var4++;
              continue L23;
            }
          }
        }
    }

    final static void a(int param0, String param1, long param2, java.applet.Applet param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 0) {
                  break L0;
                } else {
                  field_J = -113;
                  break L0;
                }
              }
              L1: {
                var8 = param3.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param4 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (-1L >= (param2 ^ -1L)) {
                  var7 = var9 + "; Expires=" + bf.a(param2 * 1000L + la.a(false), (byte) -29) + "; Max-Age=" + param2;
                  break L1;
                } else {
                  var7 = var9 + "; Discard;";
                  break L1;
                }
              }
              pb.a(true, "document.cookie=\"" + var7 + "\"", param3);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(byte param0, String param1) {
        int var2 = -65 % ((-30 - param0) / 62);
        cj.field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new String[]{"Destroy at least 15 death gliders", "Destroy at least 15 assault bots", "Destroy at least 15 tanks", "Destroy at least 15 barracks", "Complete at least one stage without firing any weapons", "Receive no damage in at least one stage", "Lose no lives in at least one stage", "Collect all powerups in at least one stage", "Collect no powerups in at least one stage", "Destroy all enemies in at least one stage", "Complete Earth levels", "Complete Space levels", "Complete Alien levels", "Destroy no human structures in at least one stage", "Complete the game on Hard"};
    }
}
